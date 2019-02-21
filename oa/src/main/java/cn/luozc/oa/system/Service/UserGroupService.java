package cn.luozc.oa.system.Service;

import cn.luozc.oa.system.model.Menu;
import cn.luozc.oa.system.model.UserGroup;

import java.util.List;

public interface UserGroupService {

    //查询所有数据
    List<UserGroup> findAll();

    int count();

    void insert(UserGroup userGroup);
}
