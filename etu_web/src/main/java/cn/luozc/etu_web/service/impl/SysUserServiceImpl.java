package cn.luozc.etu_web.service.impl;

import cn.luozc.etu_web.dao.SysUserDao;
import cn.luozc.etu_web.model.SysUser;
import cn.luozc.etu_web.service.SysUserService;
import cn.luozc.utils.JsonData;
import cn.luozc.utils.LayuiTableResult;
import cn.luozc.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao userDao;


    @Override
    public JsonData login(String username, String password, HttpSession session) {
        SysUser sysUser = userDao.findByUnameAndPassword(username, MD5Util.getMD5Str(password));
        if(sysUser==null){
            return JsonData.fail("账号或密码错误");
        }
        session.setAttribute("sysUser",sysUser);
        return JsonData.success();

    }

    @Override
    public LayuiTableResult list(String value,int page,int size) {
        Pageable pageable = PageRequest.of((page-1)*size,size,Sort.Direction.ASC,"id");
        ///要匹配的实例对象
        SysUser sysUser = new SysUser();
        sysUser.setPhone(value);
        sysUser.setEmail(value);
        sysUser.setUname(value);

        ///定义匹配规则 匹配"vendorId"这个属性 exact 精准匹配
        ExampleMatcher exampleMatcher = ExampleMatcher
                .matching()
                .withMatcher("phone", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("email",ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("uname",ExampleMatcher.GenericPropertyMatchers.contains());
        Example<SysUser> example = Example.of(sysUser,exampleMatcher);
        Page<SysUser> sysUsers = userDao.findAll(example, pageable);
        return new LayuiTableResult(0,"",sysUsers.getTotalElements(),sysUsers.getContent());
    }

    @Override
    public JsonData add(SysUser sysUser) {
        if(userDao.findByPhone(sysUser.getPhone())!=null){
            return JsonData.fail("该手机号已被注册");
        }
        if(userDao.findByUname(sysUser.getUname())!=null){
            return JsonData.fail("该账号已被注册");
        }

        //设置id
        sysUser.setId(UUID.randomUUID().toString());
        //默认密码（123456）
        sysUser.setPassword(MD5Util.getMD5Str("123456"));
        //时间
        sysUser.setCreateTime(new Date());
        sysUser = userDao.save(sysUser);
        if(sysUser==null){
            return JsonData.fail("添加失败");
        }
        return JsonData.success(sysUser,"添加成功 默认密码(123456)");
    }

    @Override
    public SysUser findById(String id) {
        return userDao.findById(id).get();
    }


}
