package cn.luozc.oa.system.Service.impl;

import cn.luozc.oa.system.Service.UserService;
import cn.luozc.oa.system.dao.MenuDao;
import cn.luozc.oa.system.dao.UserDao;
import cn.luozc.oa.system.dao.UserGroupDao;
import cn.luozc.oa.system.model.SysUser;
import cn.luozc.oa.system.model.UserGroup;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserGroupServiceImpl implements UserService {


    @Resource
    private UserGroupDao userGroupDao;

    @Override
    public List<UserGroup> findAll() {
        return userGroupDao.findAll();
    }

    @Override
    public long count() {
        return userGroupDao.count();
    }

    @Override
    public UserGroup insert(UserGroup userGroup) {
        return userGroupDao.save(userGroup);
    }

    @Override
    public UserGroup update(UserGroup userGroup) {
        return userGroupDao.save(userGroup);
    }

    @Override
    public void deleteGroup(String id) {
        UserGroup userGroup = new UserGroup();
        userGroup.setGroupId(id);
        userGroupDao.delete(userGroup);
    }



    @Resource private UserDao userDao;

    @Override
    public SysUser insert(SysUser user) {
        return userDao.save(user);
    }

    @Override
    public SysUser update(SysUser user) {
        return userDao.save(user);
    }

    @Override
    public List<SysUser> findPage(int page, int limit) {
        PageRequest pageable = PageRequest.of(page, limit);
        return userDao.findAll(pageable).getContent();
    }

    @Override
    public void deleteUser(String id) {
        SysUser user = new SysUser();
        user.setUserId(id);
        userDao.delete(user);
    }
}
