/*
 * This file is generated by jOOQ.
 */
package com.katana.jooq.entity.audit_dict.tables.pojos;


import java.io.Serializable;
import java.util.Date;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SystemProperty implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long    id;
    private Long    name;
    private String  value;
    private String  label;
    private String  group;
    private Integer enable;
    private String  remark;
    private Date    createTime;
    private Date    modifyTime;

    public SystemProperty() {}

    public SystemProperty(SystemProperty value) {
        this.id = value.id;
        this.name = value.name;
        this.value = value.value;
        this.label = value.label;
        this.group = value.group;
        this.enable = value.enable;
        this.remark = value.remark;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
    }

    public SystemProperty(
        Long    id,
        Long    name,
        String  value,
        String  label,
        String  group,
        Integer enable,
        String  remark,
        Date    createTime,
        Date    modifyTime
    ) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.label = label;
        this.group = group;
        this.enable = enable;
        this.remark = remark;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>audit_dict.system_property.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>audit_dict.system_property.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>audit_dict.system_property.name</code>.
     */
    public Long getName() {
        return this.name;
    }

    /**
     * Setter for <code>audit_dict.system_property.name</code>.
     */
    public void setName(Long name) {
        this.name = name;
    }

    /**
     * Getter for <code>audit_dict.system_property.value</code>.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Setter for <code>audit_dict.system_property.value</code>.
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Getter for <code>audit_dict.system_property.label</code>.
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Setter for <code>audit_dict.system_property.label</code>.
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Getter for <code>audit_dict.system_property.group</code>.
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * Setter for <code>audit_dict.system_property.group</code>.
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Getter for <code>audit_dict.system_property.enable</code>.
     */
    public Integer getEnable() {
        return this.enable;
    }

    /**
     * Setter for <code>audit_dict.system_property.enable</code>.
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /**
     * Getter for <code>audit_dict.system_property.remark</code>.
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * Setter for <code>audit_dict.system_property.remark</code>.
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * Getter for <code>audit_dict.system_property.create_time</code>.
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>audit_dict.system_property.create_time</code>.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>audit_dict.system_property.modify_time</code>.
     */
    public Date getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>audit_dict.system_property.modify_time</code>.
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SystemProperty (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(value);
        sb.append(", ").append(label);
        sb.append(", ").append(group);
        sb.append(", ").append(enable);
        sb.append(", ").append(remark);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyTime);

        sb.append(")");
        return sb.toString();
    }
}
