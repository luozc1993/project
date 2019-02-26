package cn.luozc.oa.system.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity //声明一个实体，用的是Java规范下的注解
@Table(name = "sys_user_group") //映射的表名称
public class UserGroup {

    @Id
    private String groupId;

    @Column
    private String name;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "groupId='" + groupId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
