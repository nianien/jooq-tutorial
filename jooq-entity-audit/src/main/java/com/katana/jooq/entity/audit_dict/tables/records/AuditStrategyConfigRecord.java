/*
 * This file is generated by jOOQ.
 */
package com.katana.jooq.entity.audit_dict.tables.records;


import com.katana.jooq.entity.audit_dict.tables.AuditStrategyConfig;

import java.util.Date;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuditStrategyConfigRecord extends UpdatableRecordImpl<AuditStrategyConfigRecord> implements Record6<Long, String, String, Integer, Date, Date> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>audit_dict.audit_strategy_config.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>audit_dict.audit_strategy_config.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>audit_dict.audit_strategy_config.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>audit_dict.audit_strategy_config.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>audit_dict.audit_strategy_config.type</code>.
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>audit_dict.audit_strategy_config.type</code>.
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>audit_dict.audit_strategy_config.enabled</code>.
     */
    public void setEnabled(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>audit_dict.audit_strategy_config.enabled</code>.
     */
    public Integer getEnabled() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>audit_dict.audit_strategy_config.create_time</code>.
     */
    public void setCreateTime(Date value) {
        set(4, value);
    }

    /**
     * Getter for <code>audit_dict.audit_strategy_config.create_time</code>.
     */
    public Date getCreateTime() {
        return (Date) get(4);
    }

    /**
     * Setter for <code>audit_dict.audit_strategy_config.modify_time</code>.
     */
    public void setModifyTime(Date value) {
        set(5, value);
    }

    /**
     * Getter for <code>audit_dict.audit_strategy_config.modify_time</code>.
     */
    public Date getModifyTime() {
        return (Date) get(5);
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
    public Row6<Long, String, String, Integer, Date, Date> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, String, String, Integer, Date, Date> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AuditStrategyConfig.AUDIT_STRATEGY_CONFIG.ID;
    }

    @Override
    public Field<String> field2() {
        return AuditStrategyConfig.AUDIT_STRATEGY_CONFIG.NAME;
    }

    @Override
    public Field<String> field3() {
        return AuditStrategyConfig.AUDIT_STRATEGY_CONFIG.TYPE;
    }

    @Override
    public Field<Integer> field4() {
        return AuditStrategyConfig.AUDIT_STRATEGY_CONFIG.ENABLED;
    }

    @Override
    public Field<Date> field5() {
        return AuditStrategyConfig.AUDIT_STRATEGY_CONFIG.CREATE_TIME;
    }

    @Override
    public Field<Date> field6() {
        return AuditStrategyConfig.AUDIT_STRATEGY_CONFIG.MODIFY_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getType();
    }

    @Override
    public Integer component4() {
        return getEnabled();
    }

    @Override
    public Date component5() {
        return getCreateTime();
    }

    @Override
    public Date component6() {
        return getModifyTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getType();
    }

    @Override
    public Integer value4() {
        return getEnabled();
    }

    @Override
    public Date value5() {
        return getCreateTime();
    }

    @Override
    public Date value6() {
        return getModifyTime();
    }

    @Override
    public AuditStrategyConfigRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AuditStrategyConfigRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public AuditStrategyConfigRecord value3(String value) {
        setType(value);
        return this;
    }

    @Override
    public AuditStrategyConfigRecord value4(Integer value) {
        setEnabled(value);
        return this;
    }

    @Override
    public AuditStrategyConfigRecord value5(Date value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AuditStrategyConfigRecord value6(Date value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public AuditStrategyConfigRecord values(Long value1, String value2, String value3, Integer value4, Date value5, Date value6) {
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
     * Create a detached AuditStrategyConfigRecord
     */
    public AuditStrategyConfigRecord() {
        super(AuditStrategyConfig.AUDIT_STRATEGY_CONFIG);
    }

    /**
     * Create a detached, initialised AuditStrategyConfigRecord
     */
    public AuditStrategyConfigRecord(Long id, String name, String type, Integer enabled, Date createTime, Date modifyTime) {
        super(AuditStrategyConfig.AUDIT_STRATEGY_CONFIG);

        setId(id);
        setName(name);
        setType(type);
        setEnabled(enabled);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
    }
}
