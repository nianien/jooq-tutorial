/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.naudit.tables.pojos;


import java.io.Serializable;

import javax.annotation.processing.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.15.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuditTag implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long    id;
    private Integer tagType;
    private String  tag;
    private Integer display;
    private String  remark;
    private Integer source;
    private Integer state;

    public AuditTag() {}

    public AuditTag(AuditTag value) {
        this.id = value.id;
        this.tagType = value.tagType;
        this.tag = value.tag;
        this.display = value.display;
        this.remark = value.remark;
        this.source = value.source;
        this.state = value.state;
    }

    public AuditTag(
        Long    id,
        Integer tagType,
        String  tag,
        Integer display,
        String  remark,
        Integer source,
        Integer state
    ) {
        this.id = id;
        this.tagType = tagType;
        this.tag = tag;
        this.display = display;
        this.remark = remark;
        this.source = source;
        this.state = state;
    }

    /**
     * Getter for <code>naudit.audit_tag.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>naudit.audit_tag.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>naudit.audit_tag.tag_type</code>.
     */
    public Integer getTagType() {
        return this.tagType;
    }

    /**
     * Setter for <code>naudit.audit_tag.tag_type</code>.
     */
    public void setTagType(Integer tagType) {
        this.tagType = tagType;
    }

    /**
     * Getter for <code>naudit.audit_tag.tag</code>.
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * Setter for <code>naudit.audit_tag.tag</code>.
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * Getter for <code>naudit.audit_tag.display</code>.
     */
    public Integer getDisplay() {
        return this.display;
    }

    /**
     * Setter for <code>naudit.audit_tag.display</code>.
     */
    public void setDisplay(Integer display) {
        this.display = display;
    }

    /**
     * Getter for <code>naudit.audit_tag.remark</code>.
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * Setter for <code>naudit.audit_tag.remark</code>.
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * Getter for <code>naudit.audit_tag.source</code>.
     */
    public Integer getSource() {
        return this.source;
    }

    /**
     * Setter for <code>naudit.audit_tag.source</code>.
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * Getter for <code>naudit.audit_tag.state</code>.
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * Setter for <code>naudit.audit_tag.state</code>.
     */
    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AuditTag (");

        sb.append(id);
        sb.append(", ").append(tagType);
        sb.append(", ").append(tag);
        sb.append(", ").append(display);
        sb.append(", ").append(remark);
        sb.append(", ").append(source);
        sb.append(", ").append(state);

        sb.append(")");
        return sb.toString();
    }
}