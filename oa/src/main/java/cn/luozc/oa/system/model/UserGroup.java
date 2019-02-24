package cn.luozc.oa.system.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

@TableName("sys_user_group")
public class UserGroup {

    @TableId
    private String groupId;
    @TableField
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
