package cn.luozc.web.system.dao;

import cn.luozc.web.system.model.UserRole;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserRoleMapper extends BaseMapper<UserRole> {

    List<UserRole> selectByUserIds(@Param("userIds") List<Integer> userIds);

    int insertBatch(@Param("userId") Integer userId, @Param("roleIds") List<Integer> roleIds);

    int deleteByUserId(@Param("userId")Integer userId);

    int deleteByRoleId(@Param("roleId")Integer roleId);
}
