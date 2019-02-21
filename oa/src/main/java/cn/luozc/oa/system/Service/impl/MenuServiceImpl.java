package cn.luozc.oa.system.Service.impl;

import cn.luozc.oa.system.Service.MenuService;
import cn.luozc.oa.system.dao.MenuDao;
import cn.luozc.oa.system.model.Menu;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MenuServiceImpl implements MenuService {


    @Resource
    private MenuDao menuDao;

    @Override
    public List<Menu> selectMenus() {
        Wrapper wrapper = new EntityWrapper();
        return menuDao.selectMaps(wrapper);
    }
}
