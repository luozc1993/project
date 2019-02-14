package cn.luozc.web.system.service;

import cn.luozc.web.common.PageResult;
import cn.luozc.web.system.model.LoginRecord;

public interface LoginRecordService {

    boolean add(LoginRecord loginRecord);

    PageResult<LoginRecord> list(int pageNum, int pageSize, String startDate, String endDate, String account);
}
