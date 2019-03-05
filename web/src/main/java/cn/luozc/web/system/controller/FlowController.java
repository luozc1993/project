package cn.luozc.web.system.controller;

import cn.luozc.web.common.PageResult;
import cn.luozc.web.system.model.Flow;
import cn.luozc.web.system.model.Role;
import cn.luozc.web.system.model.SysForm;
import cn.luozc.web.system.service.FlowService;
import cn.luozc.web.system.service.FormService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/system/flow")
public class FlowController {

    @Autowired
    private FlowService flowService;
    @Autowired
    private FormService formService;

    @RequiresPermissions("flow:view")
    @RequestMapping("/flow")
    public String flow(Model model) {
        List<SysForm> list = formService.list(2, 1);
        String s = JSONArray.toJSONString(list);
        model.addAttribute("forms", s);

        return "system/flow/flow.html";
    }
    @RequiresPermissions("flow:list")
    @RequestMapping("/flowlist")
    @ResponseBody
    public PageResult<Flow> flowlist(int page, int limit) {
        return flowService.list(page,limit,"");
    }

    @RequestMapping("/editForm")
    public String addUser(Model model,int id) {
        List<SysForm> list = formService.list(2, 1);
        if(id!=0){
            Flow flow = flowService.findById(id);
            JSONObject json = JSONObject.parseObject(JSONObject.toJSONString(flow));
            for (SysForm sysForm:list) {
                String key = sysForm.getKey();
                sysForm.setValue(json.getString(key));
            }
        }




        String s = JSONArray.toJSONString(list);
        model.addAttribute("forms", s);
        return "system/flow/form.html";
    }
}
