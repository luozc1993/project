package cn.luozc.etu_web.controller;

import cn.luozc.etu_web.model.SysUser;
import cn.luozc.etu_web.service.SysUserService;
import cn.luozc.utils.JsonData;
import cn.luozc.utils.LayuiTableResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/sysUser")
@Controller
public class SysUserController extends BaseModule{

    @Autowired
    private SysUserService sysUserService;

    /**
     * 列表页面
     * @return 页面
     */
    @RequestMapping("/list.page")
    public String page(){
        return "sysUser/user_list.html";
    }
    /**
     * 添加页面
     * @return 页面
     */
    @RequestMapping("/add.page")
    public String addPage(){
        return "sysUser/user_add.html";
    }
    /**
     * 编辑页面
     * @return 页面
     */
    @RequestMapping("/edit.page")
    public String editPage(String id, Model model){
        SysUser sysUser = sysUserService.findById(id);
        model.addAttribute("sysUser",sysUser);
        return "sysUser/user_edit.html";
    }

    @RequestMapping("/list")
    @ResponseBody
    public LayuiTableResult list(int page,int limit){
        return sysUserService.list("",page,limit);
    }

    @RequestMapping("/add")
    @ResponseBody
    public JsonData add(SysUser sysUser){
        return sysUserService.add(sysUser);
    }


}
