package cn.luozc.oa.system.controller;

import cn.luozc.oa.system.Service.UserGroupService;
import cn.luozc.oa.system.model.UserGroup;
import cn.luozc.utils.JsonData;
import net.sf.json.JSONObject;
import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.Group;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource private IdentityService identityService;
    @Resource private UserGroupService userGroupService;


    @RequestMapping(value = "/groupList",method = RequestMethod.GET)
    public String groupList(){
        return "user/group-list";
    }

    @RequestMapping(value = "/groupListData")
    @ResponseBody
    public Object groupListData(int page,int limit ){
        List<Group> list = identityService.createGroupQuery().listPage((page-1)*limit,limit);
        long count = identityService.createGroupQuery().count();
        JSONObject json = new JSONObject();
        json.put("code",0);
        json.put("msg","");
        json.put("count",count);
        json.put("data",list);
        return json;
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
        userGroup.setId(groupId);
        userGroup.setName(name);
        userGroupService.insert(userGroup);


        return JsonData.success(name,"保存成功");
    }
    /**
     * 添加用户组
     * @param id  //组名称
     * @return      提示
     */
    @RequestMapping(value = "/updateGroup")
    @ResponseBody
    public JsonData updateGroup(String id,String name){
        Group group = identityService.createGroupQuery().groupId(id).singleResult();
        group.setName(name);
        identityService.saveGroup(group);
        return JsonData.success(name,"保存成功");
    }

    /**
     * 删除组
     * @param id
     * @return
     */
    @RequestMapping(value = "/delGroup")
    @ResponseBody
    public JsonData delGroup(String id){
        identityService.deleteGroup(id);
        return JsonData.success("","删除成功");
    }


}
