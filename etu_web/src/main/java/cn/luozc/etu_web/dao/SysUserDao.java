package cn.luozc.etu_web.dao;

import cn.luozc.etu_web.model.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserDao extends JpaRepository<SysUser, String> {


    /**
     * 通过账号密码查询用户
     * @param uname     账号
     * @param password  MD5加密后的密码
     * @return SysUser
     */
    SysUser findByUnameAndPassword(String uname,String password);

    /**
     * 通过手机号查询用户
     * @param phone 手机号
     * @return SysUser
     */
    SysUser findByPhone(String phone);

    /**
     * 通过账号查询用户
     * @param uname     账号
     * @return   SysUser
     */
    SysUser findByUname(String uname);


}
