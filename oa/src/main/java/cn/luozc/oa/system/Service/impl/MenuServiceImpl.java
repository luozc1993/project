package cn.luozc.oa.system.Service.impl;

import cn.luozc.oa.system.Service.MenuService;
import cn.luozc.oa.system.dao.MenuDao;
import cn.luozc.oa.system.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service(value = "menuService")
public class MenuServiceImpl implements MenuService {


    @Resource
    private MenuDao menuDao;

    @Override
    public List<Menu> selectMenus() {
        return menuDao.selectMenus();
    }
}
