package cn.luozc.oa.controller;

import cn.luozc.utils.HttpUtils;
import cn.luozc.utils.JsonData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/quartz")
public class QuartzController {

    @RequestMapping("/calcRunTime")
    @ResponseBody
    public JsonData calcRunTime(String cron){
        Map<String,Object> map = new HashMap<>();
        map.put("CronExpression","0 * * * * ? ");
        String s = HttpUtils.doPost("http://cron.qqe2.com/CalcRunTime.ashx", map);
        return JsonData.success(s);
    }
}
