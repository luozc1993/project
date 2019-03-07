package cn.luozc.web.business.controller;

import cn.luozc.web.common.JsonResult;
import cn.luozc.web.common.PageResult;
import cn.luozc.web.common.utils.CommUtil;
import cn.luozc.web.system.model.SysForm;
import cn.luozc.web.system.service.FormService;
import com.alibaba.fastjson.JSONArray;
import org.activiti.engine.IdentityService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.identity.Group;
import org.activiti.engine.repository.DeploymentBuilder;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/business/activiti")
public class ActivitiController {
    @Autowired
    private RepositoryService repositoryService;

    @Autowired
    private FormService formService;
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private IdentityService identityService;

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

    @RequestMapping("add")
    @ResponseBody
    public Object add(String id){
        System.err.println(id);
        taskService.deleteTask(id,true);

        return JsonResult.ok();
    }



    @RequestMapping("page")
    public String page(Model model) {
        List<SysForm> list = formService.list(3, 1);
        String s = JSONArray.toJSONString(list);
        model.addAttribute("forms", s);
        return "system/flow/flow.html";
    }

    @RequestMapping("/start")
    public void start(){
        //启动流程实例，字符串"vacation"是BPMN模型文件里process元素的id
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("vacation");
        //流程实例启动后，流程会跳转到请假申请节点
        Task vacationApply = taskService.createTaskQuery().processInstanceId(processInstance.getId()).singleResult();
        //设置请假申请任务的执行人
        taskService.setAssignee(vacationApply.getId(), "1");

        //设置流程参数：请假天数和表单ID
        //流程引擎会根据请假天数days>3判断流程走向
        //formId是用来将流程数据和表单数据关联起来
        Map<String, Object> args = new HashMap<>();
        args.put("days", 6);
        args.put("formId", "1");

        //完成请假申请任务
        taskService.complete(vacationApply.getId(), args);
    }

    @RequestMapping("/list")
    public void list(){
        //查出当前登录用户所在的用户组
        List<Group> groups = identityService.createGroupQuery()
                .groupMember(String.valueOf("1")).list();
        List<String> groupNames = groups.stream()
                .map(group -> group.getName()).collect(Collectors.toList());

        //查询用户组的待审批请假流程列表
        List<Task> tasks = taskService.createTaskQuery()
                .processDefinitionKey("vacation")
                .taskCandidateGroupIn(groupNames)
                .list();

        //根据流程实例ID查询请假申请表单数据
        List<String> processInstanceIds = tasks.stream()
                .map(task -> task.getProcessInstanceId())
                .collect(Collectors.toList());
        /*List<VacationApplyBasicPO> vacationApplyList =
                vacationRepository.getVacationApplyList(processInstanceIds);*/
    }
}
