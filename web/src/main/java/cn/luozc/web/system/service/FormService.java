package cn.luozc.web.system.service;

import java.util.List;

public interface FormService {

    List<SysForm> list(int flowId,int stepId);

    SysForm findById(int id);

}
