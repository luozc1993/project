package cn.luozc.web.system.model;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

@TableName("sys_form")
public class SysForm {

  @TableId
  private long id;
  private long flowId;
  private long stepId;
  private String key;
  private String type;
  private String label;
  private String tips;
  private String value;
  private long col;
  private long offset;
  private long power;
  private int sort;

  public int getSort() {
    return sort;
  }

  public void setSort(int sort) {
    this.sort = sort;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getFlowId() {
    return flowId;
  }

  public void setFlowId(long flowId) {
    this.flowId = flowId;
  }


  public long getStepId() {
    return stepId;
  }

  public void setStepId(long stepId) {
    this.stepId = stepId;
  }


  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  public String getTips() {
    return tips;
  }

  public void setTips(String tips) {
    this.tips = tips;
  }


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public long getCol() {
    return col;
  }

  public void setCol(long col) {
    this.col = col;
  }


  public long getOffset() {
    return offset;
  }

  public void setOffset(long offset) {
    this.offset = offset;
  }


  public long getPower() {
    return power;
  }

  public void setPower(long power) {
    this.power = power;
  }

  @Override
  public String toString() {
    return "SysForm{" +
            "id=" + id +
            ", flowId=" + flowId +
            ", stepId=" + stepId +
            ", key='" + key + '\'' +
            ", type='" + type + '\'' +
            ", label='" + label + '\'' +
            ", tips='" + tips + '\'' +
            ", value='" + value + '\'' +
            ", col=" + col +
            ", offset=" + offset +
            ", power=" + power +
            ", sort=" + sort +
            '}';
  }
}
