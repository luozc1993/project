package cn.luozc.web.system.service;

import cn.luozc.web.common.PageResult;
import cn.luozc.web.system.model.Flow;

public interface FlowService {

    PageResult<Flow> list(int pageNum, int pageSize, String searchValue);

}
