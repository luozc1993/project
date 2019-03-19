package cn.luozc.shudao.controller;

import cn.luozc.shudao.util.HttpUtil;
import cn.luozc.shudao.util.JsonData;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/weike")
public class WeikeController {

    @RequestMapping("/list")
    @ResponseBody
    public JSONObject list(int pageNo){
        Map<String,Object> map = new HashMap<>();
        map.put("pageNo",pageNo);
        JSONObject json = HttpUtil.Post("http://show.shinedu.com/shineduapp/app/hand!index.action?pageNo="+pageNo ,map);
        return json;
    }

    @RequestMapping("/getActive")
    @ResponseBody
    public JSONObject getActive(){
        Map<String,Object> map = new HashMap<>();
        map.put("courseId","0b01517963679661016372adf1db003d");
        JSONObject data = HttpUtil.Post("http://show.shinedu.com/shineduapp/app/hand!look.action?courseId=0b01517963679661016372adf1db003d", map);
        return data;
    }
}
