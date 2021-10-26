/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_wolong.tables.records;


import com.tengzhe.jooq.data.audit_wolong.tables.AuditImgWhitelist;

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
public class AuditImgWhitelistRecord extends UpdatableRecordImpl<AuditImgWhitelistRecord> implements Record6<Long, String, Long, Integer, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>audit_wolong.audit_img_whitelist.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_img_whitelist.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>audit_wolong.audit_img_whitelist.img_url</code>.
     */
    public void setImgUrl(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_img_whitelist.img_url</code>.
     */
    public String getImgUrl() {
        return (String) get(1);
    }

    /**
     * Setter for <code>audit_wolong.audit_img_whitelist.user_id</code>.
     */
    public void setUserId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_img_whitelist.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>audit_wolong.audit_img_whitelist.logic_state</code>.
     */
    public void setLogicState(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_img_whitelist.logic_state</code>.
     */
    public Integer getLogicState() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>audit_wolong.audit_img_whitelist.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_img_whitelist.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>audit_wolong.audit_img_whitelist.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>audit_wolong.audit_img_whitelist.modify_time</code>.
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
    public Row6<Long, String, Long, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, String, Long, Integer, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AuditImgWhitelist.AUDIT_IMG_WHITELIST.ID;
    }

    @Override
    public Field<String> field2() {
        return AuditImgWhitelist.AUDIT_IMG_WHITELIST.IMG_URL;
    }

    @Override
    public Field<Long> field3() {
        return AuditImgWhitelist.AUDIT_IMG_WHITELIST.USER_ID;
    }

    @Override
    public Field<Integer> field4() {
        return AuditImgWhitelist.AUDIT_IMG_WHITELIST.LOGIC_STATE;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return AuditImgWhitelist.AUDIT_IMG_WHITELIST.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return AuditImgWhitelist.AUDIT_IMG_WHITELIST.MODIFY_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getImgUrl();
    }

    @Override
    public Long component3() {
        return getUserId();
    }

    @Override
    public Integer component4() {
        return getLogicState();
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
        return getImgUrl();
    }

    @Override
    public Long value3() {
        return getUserId();
    }

    @Override
    public Integer value4() {
        return getLogicState();
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
    public AuditImgWhitelistRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AuditImgWhitelistRecord value2(String value) {
        setImgUrl(value);
        return this;
    }

    @Override
    public AuditImgWhitelistRecord value3(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public AuditImgWhitelistRecord value4(Integer value) {
        setLogicState(value);
        return this;
    }

    @Override
    public AuditImgWhitelistRecord value5(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AuditImgWhitelistRecord value6(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public AuditImgWhitelistRecord values(Long value1, String value2, Long value3, Integer value4, LocalDateTime value5, LocalDateTime value6) {
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
     * Create a detached AuditImgWhitelistRecord
     */
    public AuditImgWhitelistRecord() {
        super(AuditImgWhitelist.AUDIT_IMG_WHITELIST);
    }

    /**
     * Create a detached, initialised AuditImgWhitelistRecord
     */
    public AuditImgWhitelistRecord(Long id, String imgUrl, Long userId, Integer logicState, LocalDateTime createTime, LocalDateTime modifyTime) {
        super(AuditImgWhitelist.AUDIT_IMG_WHITELIST);

        setId(id);
        setImgUrl(imgUrl);
        setUserId(userId);
        setLogicState(logicState);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
    }

    /**
     * Create a detached, initialised AuditImgWhitelistRecord
     */
    public AuditImgWhitelistRecord(com.tengzhe.jooq.data.audit_wolong.tables.pojos.AuditImgWhitelist value) {
        super(AuditImgWhitelist.AUDIT_IMG_WHITELIST);

        if (value != null) {
            setId(value.getId());
            setImgUrl(value.getImgUrl());
            setUserId(value.getUserId());
            setLogicState(value.getLogicState());
            setCreateTime(value.getCreateTime());
            setModifyTime(value.getModifyTime());
        }
    }
}
