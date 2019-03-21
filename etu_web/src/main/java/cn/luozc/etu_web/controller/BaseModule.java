package cn.luozc.etu_web.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class BaseModule {

    @RequestMapping("/page")
    public String page(String m,String a){
        return String.format("%s/%s.html",m,a);
    }
}
