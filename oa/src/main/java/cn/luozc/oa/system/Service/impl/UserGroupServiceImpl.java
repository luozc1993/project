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
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserGroupServiceImpl implements UserService {


    @Resource
    private UserGroupDao userGroupDao;

    @Override
    public List<UserGroup> findAll() {
        Wrapper wrapper = new EntityWrapper();
        return userGroupDao.selectMaps(wrapper);
    }

    @Override
    public int count() {
        return userGroupDao.selectCount(new EntityWrapper<UserGroup>());
    }

    @Override
    public int insert(UserGroup userGroup) {
        return userGroupDao.insertAllColumn(userGroup);
    }

    @Override
    public int update(UserGroup userGroup) {
        return userGroupDao.updateAllColumnById(userGroup);
    }

    @Override
    public int delete(String id) {
        return  userGroupDao.deleteById(id);
    }



    @Resource private UserDao userDao;

    @Override
    public int insert(SysUser user) {
        return userDao.insert(user);
    }

    @Override
    public List<SysUser> findPage(int page, int limit) {
        RowBounds rowBounds = new RowBounds(page,limit);

        return userDao.selectPage(rowBounds,new EntityWrapper<>());
    }
}
