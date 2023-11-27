/*
 * This file is generated by jOOQ.
 */
package com.katana.jooq.entity.audit.tables.records;


import com.katana.jooq.entity.audit.tables.UserInfo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserInfoRecord extends UpdatableRecordImpl<UserInfoRecord> implements Record8<Long, String, Long, Integer, Long, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>audit.user_info.userid</code>.
     */
    public void setUserid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>audit.user_info.userid</code>.
     */
    public Long getUserid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>audit.user_info.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>audit.user_info.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>audit.user_info.ad_resource</code>.
     */
    public void setAdResource(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>audit.user_info.ad_resource</code>.
     */
    public Long getAdResource() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>audit.user_info.audit_state</code>.
     */
    public void setAuditState(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>audit.user_info.audit_state</code>.
     */
    public Integer getAuditState() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>audit.user_info.auditor_id</code>.
     */
    public void setAuditorId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>audit.user_info.auditor_id</code>.
     */
    public Long getAuditorId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>audit.user_info.reason_code</code>.
     */
    public void setReasonCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>audit.user_info.reason_code</code>.
     */
    public String getReasonCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>audit.user_info.refuse_reason</code>.
     */
    public void setRefuseReason(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>audit.user_info.refuse_reason</code>.
     */
    public String getRefuseReason() {
        return (String) get(6);
    }

    /**
     * Setter for <code>audit.user_info.env</code>.
     */
    public void setEnv(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>audit.user_info.env</code>.
     */
    public String getEnv() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, Long, Integer, Long, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Long, String, Long, Integer, Long, String, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return UserInfo.USER_INFO.USERID;
    }

    @Override
    public Field<String> field2() {
        return UserInfo.USER_INFO.NAME;
    }

    @Override
    public Field<Long> field3() {
        return UserInfo.USER_INFO.AD_RESOURCE;
    }

    @Override
    public Field<Integer> field4() {
        return UserInfo.USER_INFO.AUDIT_STATE;
    }

    @Override
    public Field<Long> field5() {
        return UserInfo.USER_INFO.AUDITOR_ID;
    }

    @Override
    public Field<String> field6() {
        return UserInfo.USER_INFO.REASON_CODE;
    }

    @Override
    public Field<String> field7() {
        return UserInfo.USER_INFO.REFUSE_REASON;
    }

    @Override
    public Field<String> field8() {
        return UserInfo.USER_INFO.ENV;
    }

    @Override
    public Long component1() {
        return getUserid();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Long component3() {
        return getAdResource();
    }

    @Override
    public Integer component4() {
        return getAuditState();
    }

    @Override
    public Long component5() {
        return getAuditorId();
    }

    @Override
    public String component6() {
        return getReasonCode();
    }

    @Override
    public String component7() {
        return getRefuseReason();
    }

    @Override
    public String component8() {
        return getEnv();
    }

    @Override
    public Long value1() {
        return getUserid();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Long value3() {
        return getAdResource();
    }

    @Override
    public Integer value4() {
        return getAuditState();
    }

    @Override
    public Long value5() {
        return getAuditorId();
    }

    @Override
    public String value6() {
        return getReasonCode();
    }

    @Override
    public String value7() {
        return getRefuseReason();
    }

    @Override
    public String value8() {
        return getEnv();
    }

    @Override
    public UserInfoRecord value1(Long value) {
        setUserid(value);
        return this;
    }

    @Override
    public UserInfoRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public UserInfoRecord value3(Long value) {
        setAdResource(value);
        return this;
    }

    @Override
    public UserInfoRecord value4(Integer value) {
        setAuditState(value);
        return this;
    }

    @Override
    public UserInfoRecord value5(Long value) {
        setAuditorId(value);
        return this;
    }

    @Override
    public UserInfoRecord value6(String value) {
        setReasonCode(value);
        return this;
    }

    @Override
    public UserInfoRecord value7(String value) {
        setRefuseReason(value);
        return this;
    }

    @Override
    public UserInfoRecord value8(String value) {
        setEnv(value);
        return this;
    }

    @Override
    public UserInfoRecord values(Long value1, String value2, Long value3, Integer value4, Long value5, String value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserInfoRecord
     */
    public UserInfoRecord() {
        super(UserInfo.USER_INFO);
    }

    /**
     * Create a detached, initialised UserInfoRecord
     */
    public UserInfoRecord(Long userid, String name, Long adResource, Integer auditState, Long auditorId, String reasonCode, String refuseReason, String env) {
        super(UserInfo.USER_INFO);

        setUserid(userid);
        setName(name);
        setAdResource(adResource);
        setAuditState(auditState);
        setAuditorId(auditorId);
        setReasonCode(reasonCode);
        setRefuseReason(refuseReason);
        setEnv(env);
    }

    /**
     * Create a detached, initialised UserInfoRecord
     */
    public UserInfoRecord(com.katana.jooq.entity.audit.tables.pojos.UserInfo value) {
        super(UserInfo.USER_INFO);

        if (value != null) {
            setUserid(value.getUserid());
            setName(value.getName());
            setAdResource(value.getAdResource());
            setAuditState(value.getAuditState());
            setAuditorId(value.getAuditorId());
            setReasonCode(value.getReasonCode());
            setRefuseReason(value.getRefuseReason());
            setEnv(value.getEnv());
        }
    }
}
