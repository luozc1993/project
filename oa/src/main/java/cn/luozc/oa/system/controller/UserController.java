package cn.luozc.oa.system.controller;

import cn.luozc.oa.system.Service.UserService;
import cn.luozc.oa.system.model.SysUser;
import cn.luozc.oa.system.model.UserGroup;
import cn.luozc.utils.JsonData;
import cn.luozc.utils.LayuiTableResult;
import cn.luozc.utils.MD5Util;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import net.sf.json.JSONObject;
import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.swing.plaf.LayerUI;
import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/user")
@Transactional
public class UserController {

    @Resource private IdentityService identityService;
    @Resource private UserService userService;


    @RequestMapping(value = "/groupList",method = RequestMethod.GET)
    public String groupList(){
        return "user/group-list";
    }

    /**
     * 获取列表数据
     * @param page  页数
     * @param limit 每页显示数量
     * @return  返回组列表
     */
    @RequestMapping(value = "/groupListData")
    @ResponseBody
    public LayuiTableResult groupListData(int page,int limit ){
        List<Group> list = identityService.createGroupQuery().listPage((page-1)*limit,limit);
        long count = identityService.createGroupQuery().count();
        return new LayuiTableResult(0,"",count,list);
    }

    /**
     * 添加用户组
     * @param name  //组名称
     * @return      提示
     */
    @RequestMapping(value = "/addGroup")
    @ResponseBody
    public JsonData addGroup(String name){
        String groupId = UUID.randomUUID().toString();
        Group group = identityService.newGroup(groupId);
        group.setName(name);
        group.setType("oa");
        identityService.saveGroup(group);
        UserGroup userGroup = new UserGroup();
        userGroup.setGroupId(groupId);
        userGroup.setName(name);
        userService.insert(userGroup);

        return JsonData.success(name,"保存成功");
    }
    /**
     * 修改用户组
     * @param id  //组名称
     * @return      提示
     */
    @RequestMapping(value = "/updateGroup")
    @ResponseBody
    public JsonData updateGroup(String id,String name){
        Group group = identityService.createGroupQuery().groupId(id).singleResult();
        group.setName(name);
        identityService.saveGroup(group);
        UserGroup userGroup = new UserGroup();
        userGroup.setGroupId(id);
        userGroup.setName(name);
        userService.update(userGroup);
        return JsonData.success(name,"保存成功");
    }

    /**
     * 删除组
     * @param id    组id
     * @return  ss
     */
    @RequestMapping(value = "/delGroup")
    @ResponseBody
    public JsonData delGroup(String id){
        identityService.deleteGroup(id);
        userService.delete(id);
        return JsonData.success("","删除成功");
    }



    /**
     * 获取列表数据
     * @param page  页数
     * @param limit 每页显示数量
     * @return  返回组列表
     */
    @RequestMapping(value = "/userListData")
    @ResponseBody
    public LayuiTableResult userListData(int page,int limit ){
        long count = identityService.createUserQuery().count();
        List<SysUser> list = userService.findPage((page - 1) * limit, limit);
        return new LayuiTableResult(0,"",count,list);
    }

    /**
     * 添加用户组
     * @return      提示
     */
    @RequestMapping(value = "/addUser")
    @ResponseBody
    public JsonData addUser(SysUser sysUser){
        String userId = UUID.randomUUID().toString();
        sysUser.setPassword(MD5Util.getMD5Str("123456"));
        //添加activiti用户表
        User user = identityService.newUser(userId);
        user.setLastName(sysUser.getLastName());
        user.setPassword(sysUser.getPassword());
        user.setEmail(sysUser.getEmail());
        user.setFirstName(sysUser.getFirstName());
        identityService.saveUser(user);
        //添加到系统表
        sysUser.setUserId(userId);
        userService.insert(sysUser);
        return JsonData.success(sysUser,"保存成功");
    }

    /**
     * 添加用户组
     * @return      提示
     */
    @RequestMapping(value = "/updateUser")
    @ResponseBody
    public JsonData updateUser(SysUser sysUser){
        //添加activiti用户表
        User user = identityService.createUserQuery().userId(sysUser.getUserId()).singleResult();
        user.setLastName(sysUser.getLastName());
        user.setEmail(sysUser.getEmail());
        user.setFirstName(sysUser.getFirstName());
        identityService.saveUser(user);
        //添加到系统表
        return JsonData.success(userService.update(sysUser),"保存成功");
    }

}
