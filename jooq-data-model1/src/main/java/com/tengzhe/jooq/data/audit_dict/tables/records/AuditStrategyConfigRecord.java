/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_dict.tables.records;


import com.tengzhe.jooq.data.audit_dict.tables.AuditStrategyConfig;

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
public class AuditStrategyConfigRecord extends UpdatableRecordImpl<AuditStrategyConfigRecord> implements Record6<Long, String, String, Integer, LocalDateTime, LocalDateTime> {

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
    public void setCreateTime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>audit_dict.audit_strategy_config.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>audit_dict.audit_strategy_config.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>audit_dict.audit_strategy_config.modify_time</code>.
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
    public Row6<Long, String, String, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, String, String, Integer, LocalDateTime, LocalDateTime> valuesRow() {
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
    public Field<LocalDateTime> field5() {
        return AuditStrategyConfig.AUDIT_STRATEGY_CONFIG.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field6() {
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
    public LocalDateTime value5() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value6() {
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
    public AuditStrategyConfigRecord value5(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AuditStrategyConfigRecord value6(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public AuditStrategyConfigRecord values(Long value1, String value2, String value3, Integer value4, LocalDateTime value5, LocalDateTime value6) {
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
    public AuditStrategyConfigRecord(Long id, String name, String type, Integer enabled, LocalDateTime createTime, LocalDateTime modifyTime) {
        super(AuditStrategyConfig.AUDIT_STRATEGY_CONFIG);

        setId(id);
        setName(name);
        setType(type);
        setEnabled(enabled);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
    }

    /**
     * Create a detached, initialised AuditStrategyConfigRecord
     */
    public AuditStrategyConfigRecord(com.tengzhe.jooq.data.audit_dict.tables.pojos.AuditStrategyConfig value) {
        super(AuditStrategyConfig.AUDIT_STRATEGY_CONFIG);

        if (value != null) {
            setId(value.getId());
            setName(value.getName());
            setType(value.getType());
            setEnabled(value.getEnabled());
            setCreateTime(value.getCreateTime());
            setModifyTime(value.getModifyTime());
        }
    }
}
