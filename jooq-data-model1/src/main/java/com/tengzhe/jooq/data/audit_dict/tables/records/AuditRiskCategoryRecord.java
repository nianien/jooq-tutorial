/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_dict.tables.records;


import com.tengzhe.jooq.data.audit_dict.tables.AuditRiskCategory;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class AuditRiskCategoryRecord extends UpdatableRecordImpl<AuditRiskCategoryRecord> implements Record6<Long, String, String, Long, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>audit_dict.audit_risk_category.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>audit_dict.audit_risk_category.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>audit_dict.audit_risk_category.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>audit_dict.audit_risk_category.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>audit_dict.audit_risk_category.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>audit_dict.audit_risk_category.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>audit_dict.audit_risk_category.parent_id</code>.
     */
    public void setParentId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>audit_dict.audit_risk_category.parent_id</code>.
     */
    public Long getParentId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>audit_dict.audit_risk_category.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>audit_dict.audit_risk_category.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>audit_dict.audit_risk_category.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>audit_dict.audit_risk_category.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, String, Long, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, String, String, Long, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AuditRiskCategory.AUDIT_RISK_CATEGORY.ID;
    }

    @Override
    public Field<String> field2() {
        return AuditRiskCategory.AUDIT_RISK_CATEGORY.CODE;
    }

    @Override
    public Field<String> field3() {
        return AuditRiskCategory.AUDIT_RISK_CATEGORY.NAME;
    }

    @Override
    public Field<Long> field4() {
        return AuditRiskCategory.AUDIT_RISK_CATEGORY.PARENT_ID;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return AuditRiskCategory.AUDIT_RISK_CATEGORY.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return AuditRiskCategory.AUDIT_RISK_CATEGORY.MODIFY_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCode();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public Long component4() {
        return getParentId();
    }

    @Override
    public LocalDateTime component5() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component6() {
        return getModifyTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCode();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public Long value4() {
        return getParentId();
    }

    @Override
    public LocalDateTime value5() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value6() {
        return getModifyTime();
    }

    @Override
    public AuditRiskCategoryRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AuditRiskCategoryRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public AuditRiskCategoryRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public AuditRiskCategoryRecord value4(Long value) {
        setParentId(value);
        return this;
    }

    @Override
    public AuditRiskCategoryRecord value5(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AuditRiskCategoryRecord value6(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public AuditRiskCategoryRecord values(Long value1, String value2, String value3, Long value4, LocalDateTime value5, LocalDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuditRiskCategoryRecord
     */
    public AuditRiskCategoryRecord() {
        super(AuditRiskCategory.AUDIT_RISK_CATEGORY);
    }

    /**
     * Create a detached, initialised AuditRiskCategoryRecord
     */
    public AuditRiskCategoryRecord(Long id, String code, String name, Long parentId, LocalDateTime createTime, LocalDateTime modifyTime) {
        super(AuditRiskCategory.AUDIT_RISK_CATEGORY);

        setId(id);
        setCode(code);
        setName(name);
        setParentId(parentId);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
    }

    /**
     * Create a detached, initialised AuditRiskCategoryRecord
     */
    public AuditRiskCategoryRecord(com.tengzhe.jooq.data.audit_dict.tables.pojos.AuditRiskCategory value) {
        super(AuditRiskCategory.AUDIT_RISK_CATEGORY);

        if (value != null) {
            setId(value.getId());
            setCode(value.getCode());
            setName(value.getName());
            setParentId(value.getParentId());
            setCreateTime(value.getCreateTime());
            setModifyTime(value.getModifyTime());
        }
    }
}
