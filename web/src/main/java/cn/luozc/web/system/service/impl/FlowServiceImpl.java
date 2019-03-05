package cn.luozc.web.system.service.impl;

import cn.luozc.web.common.PageResult;
import cn.luozc.web.common.utils.StringUtil;
import cn.luozc.web.system.dao.FlowMapper;
import cn.luozc.web.system.dao.RoleMapper;
import cn.luozc.web.system.model.Flow;
import cn.luozc.web.system.model.User;
import cn.luozc.web.system.service.FlowService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FlowServiceImpl implements FlowService {
    @Resource
    private FlowMapper flowMapper;

    @Override
    public PageResult<Flow> list(int pageNum, int pageSize, String searchValue) {
        Wrapper<Flow> wrapper = new EntityWrapper<>();
        Page<Flow> userPage = new Page<>(pageNum, pageSize);
        List<Flow> userList = flowMapper.selectPage(userPage, wrapper);
        return new PageResult<Flow>(userPage.getTotal(), userList);
    }

    @Override
    public Flow findById(int id) {
        return flowMapper.selectById(id);
    }
}
