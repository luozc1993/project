package cn.luozc.oa.system.dao;

import cn.luozc.oa.system.model.Menu;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuDao extends BaseMapper<Menu> {

    List<Menu> findMenus();
}
