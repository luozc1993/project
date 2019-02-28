package cn.luozc.web.system.service;

import com.baomidou.mybatisplus.service.IService;
import cn.luozc.web.common.PageResult;
import cn.luozc.web.common.exception.BusinessException;
import cn.luozc.web.common.exception.ParameterException;
import cn.luozc.web.system.model.User;

public interface UserService extends IService<User> {

    User getByUsername(String username);

    PageResult<User> list(int pageNum, int pageSize, boolean showDelete, String searchKey, String searchValue);

    User getById(Integer userId);

    boolean add(User user) throws BusinessException;

    boolean update(User user);

    boolean updateState(Integer userId, int state) throws ParameterException;

    boolean updatePsw(Integer userId, String username, String newPsw);

    boolean delete(Integer userId);

    boolean deleteUser(Integer userId);

}
