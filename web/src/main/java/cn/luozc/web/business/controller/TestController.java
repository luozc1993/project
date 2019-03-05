package cn.luozc.web.business.controller;

import org.activiti.engine.FormService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.form.FormProperty;
import org.activiti.engine.form.TaskFormData;
import org.activiti.engine.impl.persistence.entity.ExecutionEntity;
import org.activiti.engine.repository.Model;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.activiti.engine.task.TaskQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/business/test")
public class TestController {

    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;

    @Autowired
    private FormService formService;
    @Autowired
    private RepositoryService repositoryService;

    @RequestMapping("list")
    @ResponseBody
    public Object list(){
        List<Model> list = repositoryService.createModelQuery().list();
        System.err.println(list.size());
        return list;
    }

    @RequestMapping("/start")
    @ResponseBody
    public void start(){
        System.out.println("method startActivityDemo begin....");
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("userId","12");
        //流程启动
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("Vacation",map);


        List<Task> list = taskService.createTaskQuery().processInstanceId(processInstance.getProcessInstanceId()).list();
//        System.out.println("流程实例id"+processInstance.getId());//流程实例id
//        System.out.println("流程定义ID"+processInstance.getProcessDefinitionId());//流程定义ID
//        List<Task> list = taskService.createTaskQuery().taskCandidateOrAssigned("12").list();
        if (list!=null&&list.size()>0) {
            for (Task task : list) {
                System.out.println("任务ID"+task.getId());
                System.out.println("任务名称"+task.getName());
                System.out.println("任务创建时间"+task.getCreateTime());
                System.out.println("任务的办理人"+task.getAssignee());
                System.out.println("流程实例id:"+task.getProcessInstanceId());
                System.out.println("执行对象id:"+task.getExecutionId());
                System.out.println("流程定义id:"+task.getProcessDefinitionId());
                TaskFormData taskFormData = formService.getTaskFormData(task.getId());
                List<FormProperty> formProperties = taskFormData.getFormProperties();
                System.err.println();
                for (FormProperty formProperty:formProperties) {
                    String name = formProperty.getName();
                    System.err.println(name);
                }
                // taskService.complete(task.getId(),map);

            }
        }
    }

}
