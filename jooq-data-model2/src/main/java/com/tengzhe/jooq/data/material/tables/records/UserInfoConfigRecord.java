/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables.records;


import com.tengzhe.jooq.data.material.tables.UserInfoConfig;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class UserInfoConfigRecord extends UpdatableRecordImpl<UserInfoConfigRecord> implements Record5<Long, Long, LocalDateTime, LocalDateTime, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>material.user_info_config.user_id</code>.
     */
    public void setUserId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>material.user_info_config.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>material.user_info_config.priority</code>.
     */
    public void setPriority(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>material.user_info_config.priority</code>.
     */
    public Long getPriority() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>material.user_info_config.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>material.user_info_config.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>material.user_info_config.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>material.user_info_config.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>material.user_info_config.auditor_id</code>.
     */
    public void setAuditorId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>material.user_info_config.auditor_id</code>.
     */
    public Long getAuditorId() {
        return (Long) get(4);
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
    public Row5<Long, Long, LocalDateTime, LocalDateTime, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, Long, LocalDateTime, LocalDateTime, Long> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return UserInfoConfig.USER_INFO_CONFIG.USER_ID;
    }

    @Override
    public Field<Long> field2() {
        return UserInfoConfig.USER_INFO_CONFIG.PRIORITY;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return UserInfoConfig.USER_INFO_CONFIG.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return UserInfoConfig.USER_INFO_CONFIG.MODIFY_TIME;
    }

    @Override
    public Field<Long> field5() {
        return UserInfoConfig.USER_INFO_CONFIG.AUDITOR_ID;
    }

    @Override
    public Long component1() {
        return getUserId();
    }

    @Override
    public Long component2() {
        return getPriority();
    }

    @Override
    public LocalDateTime component3() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component4() {
        return getModifyTime();
    }

    @Override
    public Long component5() {
        return getAuditorId();
    }

    @Override
    public Long value1() {
        return getUserId();
    }

    @Override
    public Long value2() {
        return getPriority();
    }

    @Override
    public LocalDateTime value3() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value4() {
        return getModifyTime();
    }

    @Override
    public Long value5() {
        return getAuditorId();
    }

    @Override
    public UserInfoConfigRecord value1(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public UserInfoConfigRecord value2(Long value) {
        setPriority(value);
        return this;
    }

    @Override
    public UserInfoConfigRecord value3(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public UserInfoConfigRecord value4(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public UserInfoConfigRecord value5(Long value) {
        setAuditorId(value);
        return this;
    }

    @Override
    public UserInfoConfigRecord values(Long value1, Long value2, LocalDateTime value3, LocalDateTime value4, Long value5) {
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
     * Create a detached UserInfoConfigRecord
     */
    public UserInfoConfigRecord() {
        super(UserInfoConfig.USER_INFO_CONFIG);
    }

    /**
     * Create a detached, initialised UserInfoConfigRecord
     */
    public UserInfoConfigRecord(Long userId, Long priority, LocalDateTime createTime, LocalDateTime modifyTime, Long auditorId) {
        super(UserInfoConfig.USER_INFO_CONFIG);

        setUserId(userId);
        setPriority(priority);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
        setAuditorId(auditorId);
    }

    /**
     * Create a detached, initialised UserInfoConfigRecord
     */
    public UserInfoConfigRecord(com.tengzhe.jooq.data.material.tables.pojos.UserInfoConfig value) {
        super(UserInfoConfig.USER_INFO_CONFIG);

        if (value != null) {
            setUserId(value.getUserId());
            setPriority(value.getPriority());
            setCreateTime(value.getCreateTime());
            setModifyTime(value.getModifyTime());
            setAuditorId(value.getAuditorId());
        }
    }
}
