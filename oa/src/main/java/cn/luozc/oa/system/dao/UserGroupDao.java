package cn.luozc.oa.system.dao;

import cn.luozc.oa.system.model.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGroupDao extends JpaRepository<UserGroup, Integer> {

}
