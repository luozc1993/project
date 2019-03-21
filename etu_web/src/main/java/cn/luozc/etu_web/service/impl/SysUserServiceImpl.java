package cn.luozc.etu_web.service.impl;

import cn.luozc.etu_web.dao.SysUserDao;
import cn.luozc.etu_web.model.SysUser;
import cn.luozc.etu_web.service.SysUserService;
import cn.luozc.etu_web.util.JsonData;
import cn.luozc.etu_web.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao userDao;


    @Override
    public JsonData login(String username, String password, HttpSession session) {
        SysUser sysUser = userDao.findByUnameAndPassword(username, MD5Util.getMD5Str(password));
        if(sysUser==null){
            return JsonData.fail("账号或密码错误");
        }
        session.setAttribute("sysUser",sysUser);
        return JsonData.success();

    }
}
