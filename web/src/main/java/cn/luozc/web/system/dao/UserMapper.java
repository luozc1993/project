package cn.luozc.web.system.dao;

import cn.luozc.web.system.model.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;

public interface UserMapper extends BaseMapper<User> {

    User selectByUsername(String username);


}
