package cn.luozc.web.system.service.impl;

import cn.luozc.web.system.dao.FormMapper;
import cn.luozc.web.system.service.FormService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FormServiceImpl implements FormService {
    @Resource
    private FormMapper formMapper;


    @Override
    public List<SysForm> list(int flowId, int stepId) {
        Wrapper<SysForm> wrapper = new EntityWrapper<>();
        wrapper.eq("flow_id",flowId);
        wrapper.eq("step_id",stepId);
        wrapper.orderBy("sort",false);
        return formMapper.selectList(wrapper);
    }

    @Override
    public SysForm findById(int id) {
        return formMapper.selectById(id);
    }
}
