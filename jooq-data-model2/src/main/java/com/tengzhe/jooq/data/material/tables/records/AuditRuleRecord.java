/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables.records;


import com.tengzhe.jooq.data.material.tables.AuditRule;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


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
public class AuditRuleRecord extends UpdatableRecordImpl<AuditRuleRecord> implements Record10<Long, Integer, Integer, String, String, Integer, String, Integer, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>material.audit_rule.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>material.audit_rule.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>material.audit_rule.entity_type</code>.
     */
    public void setEntityType(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>material.audit_rule.entity_type</code>.
     */
    public Integer getEntityType() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>material.audit_rule.audit_type</code>.
     */
    public void setAuditType(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>material.audit_rule.audit_type</code>.
     */
    public Integer getAuditType() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>material.audit_rule.title</code>.
     */
    public void setTitle(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>material.audit_rule.title</code>.
     */
    public String getTitle() {
        return (String) get(3);
    }

    /**
     * Setter for <code>material.audit_rule.description</code>.
     */
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>material.audit_rule.description</code>.
     */
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>material.audit_rule.state</code>.
     */
    public void setState(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>material.audit_rule.state</code>.
     */
    public Integer getState() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>material.audit_rule.expression</code>.
     */
    public void setExpression(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>material.audit_rule.expression</code>.
     */
    public String getExpression() {
        return (String) get(6);
    }

    /**
     * Setter for <code>material.audit_rule.priority</code>.
     */
    public void setPriority(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>material.audit_rule.priority</code>.
     */
    public Integer getPriority() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>material.audit_rule.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>material.audit_rule.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>material.audit_rule.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>material.audit_rule.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, Integer, Integer, String, String, Integer, String, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Long, Integer, Integer, String, String, Integer, String, Integer, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AuditRule.AUDIT_RULE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return AuditRule.AUDIT_RULE.ENTITY_TYPE;
    }

    @Override
    public Field<Integer> field3() {
        return AuditRule.AUDIT_RULE.AUDIT_TYPE;
    }

    @Override
    public Field<String> field4() {
        return AuditRule.AUDIT_RULE.TITLE;
    }

    @Override
    public Field<String> field5() {
        return AuditRule.AUDIT_RULE.DESCRIPTION;
    }

    @Override
    public Field<Integer> field6() {
        return AuditRule.AUDIT_RULE.STATE;
    }

    @Override
    public Field<String> field7() {
        return AuditRule.AUDIT_RULE.EXPRESSION;
    }

    @Override
    public Field<Integer> field8() {
        return AuditRule.AUDIT_RULE.PRIORITY;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return AuditRule.AUDIT_RULE.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return AuditRule.AUDIT_RULE.MODIFY_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getEntityType();
    }

    @Override
    public Integer component3() {
        return getAuditType();
    }

    @Override
    public String component4() {
        return getTitle();
    }

    @Override
    public String component5() {
        return getDescription();
    }

    @Override
    public Integer component6() {
        return getState();
    }

    @Override
    public String component7() {
        return getExpression();
    }

    @Override
    public Integer component8() {
        return getPriority();
    }

    @Override
    public LocalDateTime component9() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component10() {
        return getModifyTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getEntityType();
    }

    @Override
    public Integer value3() {
        return getAuditType();
    }

    @Override
    public String value4() {
        return getTitle();
    }

    @Override
    public String value5() {
        return getDescription();
    }

    @Override
    public Integer value6() {
        return getState();
    }

    @Override
    public String value7() {
        return getExpression();
    }

    @Override
    public Integer value8() {
        return getPriority();
    }

    @Override
    public LocalDateTime value9() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value10() {
        return getModifyTime();
    }

    @Override
    public AuditRuleRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AuditRuleRecord value2(Integer value) {
        setEntityType(value);
        return this;
    }

    @Override
    public AuditRuleRecord value3(Integer value) {
        setAuditType(value);
        return this;
    }

    @Override
    public AuditRuleRecord value4(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public AuditRuleRecord value5(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public AuditRuleRecord value6(Integer value) {
        setState(value);
        return this;
    }

    @Override
    public AuditRuleRecord value7(String value) {
        setExpression(value);
        return this;
    }

    @Override
    public AuditRuleRecord value8(Integer value) {
        setPriority(value);
        return this;
    }

    @Override
    public AuditRuleRecord value9(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AuditRuleRecord value10(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public AuditRuleRecord values(Long value1, Integer value2, Integer value3, String value4, String value5, Integer value6, String value7, Integer value8, LocalDateTime value9, LocalDateTime value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuditRuleRecord
     */
    public AuditRuleRecord() {
        super(AuditRule.AUDIT_RULE);
    }

    /**
     * Create a detached, initialised AuditRuleRecord
     */
    public AuditRuleRecord(Long id, Integer entityType, Integer auditType, String title, String description, Integer state, String expression, Integer priority, LocalDateTime createTime, LocalDateTime modifyTime) {
        super(AuditRule.AUDIT_RULE);

        setId(id);
        setEntityType(entityType);
        setAuditType(auditType);
        setTitle(title);
        setDescription(description);
        setState(state);
        setExpression(expression);
        setPriority(priority);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
    }

    /**
     * Create a detached, initialised AuditRuleRecord
     */
    public AuditRuleRecord(com.tengzhe.jooq.data.material.tables.pojos.AuditRule value) {
        super(AuditRule.AUDIT_RULE);

        if (value != null) {
            setId(value.getId());
            setEntityType(value.getEntityType());
            setAuditType(value.getAuditType());
            setTitle(value.getTitle());
            setDescription(value.getDescription());
            setState(value.getState());
            setExpression(value.getExpression());
            setPriority(value.getPriority());
            setCreateTime(value.getCreateTime());
            setModifyTime(value.getModifyTime());
        }
    }
}