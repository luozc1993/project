package cn.luozc.oa.system.dao;

import cn.luozc.oa.system.model.SysUser;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<SysUser, Integer> {

}
