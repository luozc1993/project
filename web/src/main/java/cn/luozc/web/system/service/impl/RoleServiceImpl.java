package cn.luozc.web.system.service.impl;

import cn.luozc.web.system.dao.UserRoleMapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import cn.luozc.web.common.exception.ParameterException;
import cn.luozc.web.system.dao.RoleAuthoritiesMapper;
import cn.luozc.web.system.dao.RoleMapper;
import cn.luozc.web.system.model.Role;
import cn.luozc.web.system.service.RoleService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.GroupQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private RoleAuthoritiesMapper roleAuthoritiesMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private IdentityService identityService;

    @Override
    public List<Role> getByUserId(Integer userId) {
        return roleMapper.selectByUserId(userId);
    }

    @Override
    public List<Role> list(boolean showDelete) {
        Wrapper wrapper = new EntityWrapper();
        if (!showDelete) {
            wrapper.eq("is_delete", 0);
        }
        return roleMapper.selectList(wrapper.orderBy("create_time", true));
    }

    @Override
    public boolean add(Role role) {
        role.setCreateTime(new Date());
        Integer insert = roleMapper.insert(role);
        Group group = identityService.newGroup(role.getRoleId() + "");
        group.setName(role.getRoleName());
        group.setType("oa");
        identityService.saveGroup(group);
        return insert > 0;
    }

    @Override
    public boolean update(Role role) {
        Integer integer = roleMapper.updateById(role);
        Group group = identityService.createGroupQuery().groupId(role.getRoleId() + "").singleResult();
        group.setName(role.getRoleName());
        identityService.saveGroup(group);
        return integer> 0;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateState(Integer roleId, int isDelete) {
        if (isDelete != 0 && isDelete != 1) {
            throw new ParameterException("isDelete值需要在[0,1]中");
        }
        Role role = new Role();
        role.setRoleId(roleId);
        role.setIsDelete(isDelete);
        boolean rs = roleMapper.updateById(role) > 0;
        if (rs) {
            identityService.deleteGroup(roleId+"");

            //删除角色的权限
            roleAuthoritiesMapper.delete(new EntityWrapper().eq("role_id", roleId));
        }
        return rs;
    }

    @Override
    public Role getById(Integer roleId) {
        return roleMapper.selectById(roleId);
    }

    @Override
    public boolean delete(Integer roleId) {
        userRoleMapper.deleteByRoleId(roleId);
        Integer integer = roleMapper.deleteById(roleId);
        if(integer>0){
            identityService.deleteGroup(roleId+"");

            //删除角色的权限
            roleAuthoritiesMapper.delete(new EntityWrapper().eq("role_id", roleId));
            return true;
        }

        return false;
    }
}
