package cn.luozc.web.system.service.impl;

import cn.luozc.web.system.dao.LoginRecordMapper;
import cn.luozc.web.system.service.UserService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.luozc.web.common.PageResult;
import cn.luozc.web.common.exception.BusinessException;
import cn.luozc.web.common.exception.ParameterException;
import cn.luozc.web.common.shiro.EndecryptUtil;
import cn.luozc.web.common.utils.StringUtil;
import cn.luozc.web.system.dao.UserMapper;
import cn.luozc.web.system.dao.UserRoleMapper;
import cn.luozc.web.system.model.Role;
import cn.luozc.web.system.model.User;
import cn.luozc.web.system.model.UserRole;
import org.activiti.engine.IdentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    private UserRoleMapper userRoleMapper;

    @Resource
    private LoginRecordMapper loginRecordMapper;

    @Autowired private IdentityService identityService;

    @Override
    public User getByUsername(String username) {
        return baseMapper.selectByUsername(username);
    }

    @Override
    public PageResult<User> list(int pageNum, int pageSize, boolean showDelete, String column, String value) {
        Wrapper<User> wrapper = new EntityWrapper<>();
        if (StringUtil.isNotBlank(column)) {
            wrapper.like(column, value);
        }
        if (!showDelete) {  // 不显示锁定的用户
            wrapper.eq("state", 0);
        }
        Page<User> userPage = new Page<>(pageNum, pageSize);
        List<User> userList = baseMapper.selectPage(userPage, wrapper.orderBy("create_time", true));
        if (userList != null && userList.size() > 0) {
            // 查询user的角色
            List<UserRole> userRoles = userRoleMapper.selectByUserIds(getUserIds(userList));
            for (User one : userList) {
                List<Role> tempURs = new ArrayList<>();
                for (UserRole ur : userRoles) {
                    if (one.getUserId().equals(ur.getUserId())) {
                        tempURs.add(new Role(ur.getRoleId(), ur.getRoleName()));

                    }
                }
                one.setRoles(tempURs);
            }
        }
        return new PageResult<>(userPage.getTotal(), userList);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean add(User user) throws BusinessException {
        if (baseMapper.selectByUsername(user.getUsername()) != null) {
            throw new BusinessException("账号已经存在");
        }
        user.setPassword(EndecryptUtil.encrytMd5(user.getPassword(), user.getUsername(), 3));
        user.setState(0);
        user.setCreateTime(new Date());
        boolean rs = baseMapper.insert(user) > 0;
        if (rs) {

            saveActivitiUser(user);

            List<Integer> roleIds = getRoleIds(user.getRoles());
            if (userRoleMapper.insertBatch(user.getUserId(), roleIds) < roleIds.size()) {
                throw new BusinessException("添加失败，请重试");
            }
            //添加到activiti关联
            for (Integer roleId:roleIds) {
                identityService.createMembership(user.getUserId()+"",roleId+"");
            }

        }
        return rs;
    }

    private void saveActivitiUser(User user){
        org.activiti.engine.identity.User activitiUser = identityService.newUser(user.getUserId() + "");
        activitiUser.setFirstName(user.getUsername());
        activitiUser.setLastName(user.getNickName());
        activitiUser.setEmail(user.getEmail());
        activitiUser.setPassword(user.getPassword());
        identityService.saveUser(activitiUser);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean update(User user) {
        user.setUsername(null);
        boolean rs = baseMapper.updateById(user) > 0;
        if (rs) {
            updateActivitiUser(user);
            userRoleMapper.delete(new EntityWrapper().eq("user_id", user.getUserId()));
            List<Integer> roleIds = getRoleIds(user.getRoles());
            if (userRoleMapper.insertBatch(user.getUserId(), roleIds) < roleIds.size()) {
                throw new BusinessException("修改失败，请重试");
            }
        }
        return rs;
    }

    private void updateActivitiUser(User user){
        org.activiti.engine.identity.User activitiUser = identityService.createUserQuery().userId(user.getUserId()+"").singleResult();
        activitiUser.setFirstName(user.getUsername());
        activitiUser.setLastName(user.getNickName());
        activitiUser.setEmail(user.getEmail());
        activitiUser.setPassword(user.getPassword());
        identityService.saveUser(activitiUser);
    }

    /**
     * 添加用户角色
     */
    private List<Integer> getRoleIds(List<Role> roles) {
        List<Integer> rs = new ArrayList<>();
        if (roles != null && roles.size() > 0) {
            for (Role role : roles) {
                rs.add(role.getRoleId());
            }
        }
        return rs;
    }

    @Override
    public boolean updateState(Integer userId, int state) throws ParameterException {
        if (state != 0 && state != 1) {
            throw new ParameterException("state值需要在[0,1]中");
        }
        User user = new User();
        user.setUserId(userId);
        user.setState(state);
        return baseMapper.updateById(user) > 0;
    }

    @Override
    public boolean updatePsw(Integer userId, String username, String password) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(EndecryptUtil.encrytMd5(password, username, 3));
        return baseMapper.updateById(user) > 0;
    }

    @Override
    public User getById(Integer userId) {
        return baseMapper.selectById(userId);
    }

    @Override
    public boolean delete(Integer userId) {
        return baseMapper.deleteById(userId) > 0;
    }

    @Override
    public boolean deleteUser(Integer userId) {
        //删除角色关联数据
        userRoleMapper.deleteByUserId(userId);
        //删除登录记录
        loginRecordMapper.delete(userId);
        //删除用户数据
        baseMapper.deleteById(userId);
        //删除用户和角色关联
        identityService.deleteUser(userId+"");
        List<Integer> list = new ArrayList<>();
        list.add(userId);
        List<UserRole> userRoles = userRoleMapper.selectByUserIds(list);
        for (UserRole userRole:userRoles) {
            identityService.deleteMembership(userId+"",userRole.getRoleId()+"");
        }
        return true;
    }

    private List<Integer> getUserIds(List<User> userList) {
        List<Integer> userIds = new ArrayList<>();
        for (User one : userList) {
            userIds.add(one.getUserId());
        }
        return userIds;
    }
}
