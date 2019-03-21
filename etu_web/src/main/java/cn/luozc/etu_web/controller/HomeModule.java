package cn.luozc.etu_web.controller;

import cn.luozc.etu_web.model.SysUser;
import cn.luozc.etu_web.service.SysUserService;
import cn.luozc.etu_web.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class HomeModule {

    @Autowired
    private SysUserService sysUserService;

    //首页
    @RequestMapping({"/","/index"})
    public String index(HttpSession session){
        Object sysUser = session.getAttribute("sysUser");
        if(sysUser==null){
            return "login.html";
        }
        return "index.html";
    }

    //登录
    @GetMapping("/login")
    public String login(HttpSession session){
        Object sysUser = session.getAttribute("sysUser");
        if(sysUser!=null){
            return "index.html";
        }
        return "login.html";
    }

    //登录
    @PostMapping("/login")
    @ResponseBody
    public JsonData login(String username, String password, HttpSession session){

        return sysUserService.login(username, password,session);
    }
}
