package cn.luozc.etu_web.service;


import cn.luozc.etu_web.model.SysUser;
import cn.luozc.etu_web.util.JsonData;

import javax.servlet.http.HttpSession;

public interface SysUserService {

    JsonData login(String username, String password, HttpSession session);

}
