package cn.luozc.etu_web.service;


import cn.luozc.etu_web.model.SysUser;
import cn.luozc.utils.JsonData;
import cn.luozc.utils.LayuiTableResult;

import javax.servlet.http.HttpSession;

public interface SysUserService {

    /**
     * 用户登录
     * @param username  账号
     * @param password  密码
     * @param session   回话
     * @return  JsonData
     */
    JsonData login(String username, String password, HttpSession session);

    /**
     * 获取用户列表
     * @param value 搜索框内容
     * @param page  页数
     * @param size  每页显示数量
     * @return  LayuiTableResult
     */
    LayuiTableResult list(String value, int page, int size);

    /**
     * 添加用户
     * @param sysUser 用户信息
     * @return sysUser
     */
    JsonData add(SysUser sysUser);


    /**
     * 通过id查询用户
     * @param id    用户id
     * @return  SysUser
     */
    SysUser findById(String id);

}
