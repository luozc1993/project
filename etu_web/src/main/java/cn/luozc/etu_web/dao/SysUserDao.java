package cn.luozc.etu_web.dao;

import cn.luozc.etu_web.model.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserDao extends JpaRepository<SysUser, String> {


    SysUser findByUnameAndPassword(String uname,String password);
}
