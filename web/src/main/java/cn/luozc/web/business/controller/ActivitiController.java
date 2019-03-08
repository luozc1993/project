package cn.luozc.web.business.controller;

import cn.luozc.web.common.JsonResult;
import cn.luozc.web.common.PageResult;
import cn.luozc.web.common.utils.CommUtil;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/business/activiti")
public class ActivitiController {
    @Autowired
    private RepositoryService repositoryService;

    @Autowired
    private TaskService taskService;

    @RequiresPermissions("activiti:view")
    @RequestMapping("/task_view")
    public String flow(Model model) {

        return "business/activiti/tasks.html";
    }

    @RequestMapping("tasks")
    @ResponseBody
    public Object task(){
        List<Map<String, Object>> listMap = new ArrayList<>();
        List<Task> list = taskService.createTaskQuery().list();
        // 循环
        String[] ps = { "id", "name","assignee","owner","delegationState"};
        for (Task task:list) {

            listMap.add(CommUtil.obj2map(task,ps));
        }
        return  new PageResult<>(listMap.size(),listMap);
    }

    @RequestMapping("del")
    @ResponseBody
    public Object del(String id){
        System.err.println(id);
        taskService.deleteTask(id,true);

        return JsonResult.ok();
    }
}
