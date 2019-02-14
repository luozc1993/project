package cn.luozc.web.system.dao;

import cn.luozc.web.system.model.Role;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

public interface RoleMapper extends BaseMapper<Role> {

    List<Role> selectByUserId(Integer userId);
}
