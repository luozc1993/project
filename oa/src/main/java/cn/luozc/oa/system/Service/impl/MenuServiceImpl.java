package cn.luozc.oa.system.Service.impl;

import cn.luozc.oa.system.Service.MenuService;
import cn.luozc.oa.system.dao.MenuDao;
import cn.luozc.oa.system.model.SysMenu;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MenuServiceImpl implements MenuService {


    @Resource
    private MenuDao menuDao;

    @Override
    public List<SysMenu> selectMenus() {
        return menuDao.findAll();
    }
}
