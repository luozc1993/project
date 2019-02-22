package cn.luozc.oa.system.Service.impl;

import cn.luozc.oa.system.Service.UserGroupService;
import cn.luozc.oa.system.dao.MenuDao;
import cn.luozc.oa.system.dao.UserGroupDao;
import cn.luozc.oa.system.model.UserGroup;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserGroupServiceImpl implements UserGroupService {


    @Resource
    private UserGroupDao userGroupDao;

    @Override
    public List<UserGroup> findAll() {
        Wrapper wrapper = new EntityWrapper();
        return userGroupDao.selectMaps(wrapper);
    }

    @Override
    public int count() {
        return userGroupDao.selectCount(new EntityWrapper());
    }

    @Override
    public void insert(UserGroup userGroup) {
        Integer insert = userGroupDao.insertAllColumn(userGroup);
        System.err.println(insert);
    }
}
