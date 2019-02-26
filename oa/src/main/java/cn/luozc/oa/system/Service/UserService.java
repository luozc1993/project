package cn.luozc.oa.system.Service;

import cn.luozc.oa.system.model.SysMenu;
import cn.luozc.oa.system.model.SysUser;
import cn.luozc.oa.system.model.UserGroup;

import java.util.List;

public interface UserService {

    //查询所有数据
    List<UserGroup> findAll();

    long count();

    UserGroup insert(UserGroup userGroup);

    UserGroup update(UserGroup userGroup);

    void delete(String id);

    SysUser insert(SysUser user);

    SysUser update(SysUser user);

    List<SysUser> findPage(int page,int limit);

}
