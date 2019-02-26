package cn.luozc.oa.system.dao;

import cn.luozc.oa.system.model.SysMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuDao extends JpaRepository<SysMenu, Integer> {

}
