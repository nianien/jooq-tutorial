/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_dict.tables.records;


import com.tengzhe.jooq.data.audit_dict.tables.AuditWhitelistConfig;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class AuditWhitelistConfigRecord extends UpdatableRecordImpl<AuditWhitelistConfigRecord> implements Record11<Long, Long, String, Long, String, Integer, Integer, Long, Integer, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>audit_dict.audit_whitelist_config.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>audit_dict.audit_whitelist_config.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>audit_dict.audit_whitelist_config.cid</code>.
     */
    public void setCid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>audit_dict.audit_whitelist_config.cid</code>.
     */
    public Long getCid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>audit_dict.audit_whitelist_config.site_url</code>.
     */
    public void setSiteUrl(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>audit_dict.audit_whitelist_config.site_url</code>.
     */
    public String getSiteUrl() {
        return (String) get(2);
    }

    /**
     * Setter for <code>audit_dict.audit_whitelist_config.uc_id</code>.
     */
    public void setUcId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>audit_dict.audit_whitelist_config.uc_id</code>.
     */
    public Long getUcId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>audit_dict.audit_whitelist_config.biz_types</code>.
     */
    public void setBizTypes(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>audit_dict.audit_whitelist_config.biz_types</code>.
     */
    public String getBizTypes() {
        return (String) get(4);
    }

    /**
     * Setter for <code>audit_dict.audit_whitelist_config.target_type</code>.
     */
    public void setTargetType(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>audit_dict.audit_whitelist_config.target_type</code>.
     */
    public Integer getTargetType() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>audit_dict.audit_whitelist_config.dimension</code>.
     */
    public void setDimension(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>audit_dict.audit_whitelist_config.dimension</code>.
     */
    public Integer getDimension() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>audit_dict.audit_whitelist_config.auditor_id</code>.
     */
    public void setAuditorId(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>audit_dict.audit_whitelist_config.auditor_id</code>.
     */
    public Long getAuditorId() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>audit_dict.audit_whitelist_config.status</code>.
     */
    public void setStatus(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>audit_dict.audit_whitelist_config.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>audit_dict.audit_whitelist_config.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>audit_dict.audit_whitelist_config.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>audit_dict.audit_whitelist_config.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>audit_dict.audit_whitelist_config.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, Long, String, Long, String, Integer, Integer, Long, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Long, Long, String, Long, String, Integer, Integer, Long, Integer, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AuditWhitelistConfig.AUDIT_WHITELIST_CONFIG.ID;
    }

    @Override
    public Field<Long> field2() {
        return AuditWhitelistConfig.AUDIT_WHITELIST_CONFIG.CID;
    }

    @Override
    public Field<String> field3() {
        return AuditWhitelistConfig.AUDIT_WHITELIST_CONFIG.SITE_URL;
    }

    @Override
    public Field<Long> field4() {
        return AuditWhitelistConfig.AUDIT_WHITELIST_CONFIG.UC_ID;
    }

    @Override
    public Field<String> field5() {
        return AuditWhitelistConfig.AUDIT_WHITELIST_CONFIG.BIZ_TYPES;
    }

    @Override
    public Field<Integer> field6() {
        return AuditWhitelistConfig.AUDIT_WHITELIST_CONFIG.TARGET_TYPE;
    }

    @Override
    public Field<Integer> field7() {
        return AuditWhitelistConfig.AUDIT_WHITELIST_CONFIG.DIMENSION;
    }

    @Override
    public Field<Long> field8() {
        return AuditWhitelistConfig.AUDIT_WHITELIST_CONFIG.AUDITOR_ID;
    }

    @Override
    public Field<Integer> field9() {
        return AuditWhitelistConfig.AUDIT_WHITELIST_CONFIG.STATUS;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return AuditWhitelistConfig.AUDIT_WHITELIST_CONFIG.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return AuditWhitelistConfig.AUDIT_WHITELIST_CONFIG.MODIFY_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getCid();
    }

    @Override
    public String component3() {
        return getSiteUrl();
    }

    @Override
    public Long component4() {
        return getUcId();
    }

    @Override
    public String component5() {
        return getBizTypes();
    }

    @Override
    public Integer component6() {
        return getTargetType();
    }

    @Override
    public Integer component7() {
        return getDimension();
    }

    @Override
    public Long component8() {
        return getAuditorId();
    }

    @Override
    public Integer component9() {
        return getStatus();
    }

    @Override
    public LocalDateTime component10() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component11() {
        return getModifyTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getCid();
    }

    @Override
    public String value3() {
        return getSiteUrl();
    }

    @Override
    public Long value4() {
        return getUcId();
    }

    @Override
    public String value5() {
        return getBizTypes();
    }

    @Override
    public Integer value6() {
        return getTargetType();
    }

    @Override
    public Integer value7() {
        return getDimension();
    }

    @Override
    public Long value8() {
        return getAuditorId();
    }

    @Override
    public Integer value9() {
        return getStatus();
    }

    @Override
    public LocalDateTime value10() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value11() {
        return getModifyTime();
    }

    @Override
    public AuditWhitelistConfigRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AuditWhitelistConfigRecord value2(Long value) {
        setCid(value);
        return this;
    }

    @Override
    public AuditWhitelistConfigRecord value3(String value) {
        setSiteUrl(value);
        return this;
    }

    @Override
    public AuditWhitelistConfigRecord value4(Long value) {
        setUcId(value);
        return this;
    }

    @Override
    public AuditWhitelistConfigRecord value5(String value) {
        setBizTypes(value);
        return this;
    }

    @Override
    public AuditWhitelistConfigRecord value6(Integer value) {
        setTargetType(value);
        return this;
    }

    @Override
    public AuditWhitelistConfigRecord value7(Integer value) {
        setDimension(value);
        return this;
    }

    @Override
    public AuditWhitelistConfigRecord value8(Long value) {
        setAuditorId(value);
        return this;
    }

    @Override
    public AuditWhitelistConfigRecord value9(Integer value) {
        setStatus(value);
        return this;
    }

    @Override
    public AuditWhitelistConfigRecord value10(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AuditWhitelistConfigRecord value11(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public AuditWhitelistConfigRecord values(Long value1, Long value2, String value3, Long value4, String value5, Integer value6, Integer value7, Long value8, Integer value9, LocalDateTime value10, LocalDateTime value11) {
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
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuditWhitelistConfigRecord
     */
    public AuditWhitelistConfigRecord() {
        super(AuditWhitelistConfig.AUDIT_WHITELIST_CONFIG);
    }

    /**
     * Create a detached, initialised AuditWhitelistConfigRecord
     */
    public AuditWhitelistConfigRecord(Long id, Long cid, String siteUrl, Long ucId, String bizTypes, Integer targetType, Integer dimension, Long auditorId, Integer status, LocalDateTime createTime, LocalDateTime modifyTime) {
        super(AuditWhitelistConfig.AUDIT_WHITELIST_CONFIG);

        setId(id);
        setCid(cid);
        setSiteUrl(siteUrl);
        setUcId(ucId);
        setBizTypes(bizTypes);
        setTargetType(targetType);
        setDimension(dimension);
        setAuditorId(auditorId);
        setStatus(status);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
    }

    /**
     * Create a detached, initialised AuditWhitelistConfigRecord
     */
    public AuditWhitelistConfigRecord(com.tengzhe.jooq.data.audit_dict.tables.pojos.AuditWhitelistConfig value) {
        super(AuditWhitelistConfig.AUDIT_WHITELIST_CONFIG);

        if (value != null) {
            setId(value.getId());
            setCid(value.getCid());
            setSiteUrl(value.getSiteUrl());
            setUcId(value.getUcId());
            setBizTypes(value.getBizTypes());
            setTargetType(value.getTargetType());
            setDimension(value.getDimension());
            setAuditorId(value.getAuditorId());
            setStatus(value.getStatus());
            setCreateTime(value.getCreateTime());
            setModifyTime(value.getModifyTime());
        }
    }
}
