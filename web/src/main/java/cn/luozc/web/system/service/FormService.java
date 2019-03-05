package cn.luozc.web.system.service;

import cn.luozc.web.common.PageResult;
import cn.luozc.web.system.model.Flow;
import cn.luozc.web.system.model.SysForm;

import java.util.List;

public interface FormService {

    List<SysForm> list(int flowId,int stepId);

}
