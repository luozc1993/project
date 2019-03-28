-- 当存储过程`p1`存在时，删除。
drop procedure if exists p1;

-- 创建存储过程`p1`
create procedure p1()
begin
  declare row_num int;
  select count(*) into row_num from `sys_user`;
  if row_num = 0 then
    INSERT INTO `sys_user`(`id`,`uname`, `password`,`phone`,`nickname`,`email`)
    VALUES ('857602ea-ac0f-414a-bb95-1e1355aff261','admin', 'e10adc3949ba59abbe56e057f20f883e','15260199084','超级管理员','1079648153@qq.com');
  end if;
end;

-- 调用存储过程`p1`
call p1();
drop procedure if exists p1;