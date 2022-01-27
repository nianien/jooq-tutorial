/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_dict.tables.records;


import com.tengzhe.jooq.data.audit_dict.tables.AuditTypeRiskTagConfig;

import java.util.Date;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuditTypeRiskTagConfigRecord extends UpdatableRecordImpl<AuditTypeRiskTagConfigRecord> implements Record5<Long, Integer, String, Date, Date> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>audit_dict.audit_type_risk_tag_config.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>audit_dict.audit_type_risk_tag_config.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>audit_dict.audit_type_risk_tag_config.type</code>.
     */
    public void setType(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>audit_dict.audit_type_risk_tag_config.type</code>.
     */
    public Integer getType() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>audit_dict.audit_type_risk_tag_config.code</code>.
     */
    public void setCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>audit_dict.audit_type_risk_tag_config.code</code>.
     */
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>audit_dict.audit_type_risk_tag_config.create_time</code>.
     */
    public void setCreateTime(Date value) {
        set(3, value);
    }

    /**
     * Getter for <code>audit_dict.audit_type_risk_tag_config.create_time</code>.
     */
    public Date getCreateTime() {
        return (Date) get(3);
    }

    /**
     * Setter for <code>audit_dict.audit_type_risk_tag_config.modify_time</code>.
     */
    public void setModifyTime(Date value) {
        set(4, value);
    }

    /**
     * Getter for <code>audit_dict.audit_type_risk_tag_config.modify_time</code>.
     */
    public Date getModifyTime() {
        return (Date) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Integer, String, Date, Date> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, Integer, String, Date, Date> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AuditTypeRiskTagConfig.AUDIT_TYPE_RISK_TAG_CONFIG.ID;
    }

    @Override
    public Field<Integer> field2() {
        return AuditTypeRiskTagConfig.AUDIT_TYPE_RISK_TAG_CONFIG.TYPE;
    }

    @Override
    public Field<String> field3() {
        return AuditTypeRiskTagConfig.AUDIT_TYPE_RISK_TAG_CONFIG.CODE;
    }

    @Override
    public Field<Date> field4() {
        return AuditTypeRiskTagConfig.AUDIT_TYPE_RISK_TAG_CONFIG.CREATE_TIME;
    }

    @Override
    public Field<Date> field5() {
        return AuditTypeRiskTagConfig.AUDIT_TYPE_RISK_TAG_CONFIG.MODIFY_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getType();
    }

    @Override
    public String component3() {
        return getCode();
    }

    @Override
    public Date component4() {
        return getCreateTime();
    }

    @Override
    public Date component5() {
        return getModifyTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getType();
    }

    @Override
    public String value3() {
        return getCode();
    }

    @Override
    public Date value4() {
        return getCreateTime();
    }

    @Override
    public Date value5() {
        return getModifyTime();
    }

    @Override
    public AuditTypeRiskTagConfigRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AuditTypeRiskTagConfigRecord value2(Integer value) {
        setType(value);
        return this;
    }

    @Override
    public AuditTypeRiskTagConfigRecord value3(String value) {
        setCode(value);
        return this;
    }

    @Override
    public AuditTypeRiskTagConfigRecord value4(Date value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AuditTypeRiskTagConfigRecord value5(Date value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public AuditTypeRiskTagConfigRecord values(Long value1, Integer value2, String value3, Date value4, Date value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuditTypeRiskTagConfigRecord
     */
    public AuditTypeRiskTagConfigRecord() {
        super(AuditTypeRiskTagConfig.AUDIT_TYPE_RISK_TAG_CONFIG);
    }

    /**
     * Create a detached, initialised AuditTypeRiskTagConfigRecord
     */
    public AuditTypeRiskTagConfigRecord(Long id, Integer type, String code, Date createTime, Date modifyTime) {
        super(AuditTypeRiskTagConfig.AUDIT_TYPE_RISK_TAG_CONFIG);

        setId(id);
        setType(type);
        setCode(code);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
    }
}
