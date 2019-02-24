package cn.luozc.oa.system.Service;

import cn.luozc.oa.system.model.Menu;
import cn.luozc.oa.system.model.UserGroup;

import java.util.List;

public interface UserGroupService {

    //查询所有数据
    List<UserGroup> findAll();

    int count();

    int insert(UserGroup userGroup);

    int update(UserGroup userGroup);

    int delete(String id);
}
