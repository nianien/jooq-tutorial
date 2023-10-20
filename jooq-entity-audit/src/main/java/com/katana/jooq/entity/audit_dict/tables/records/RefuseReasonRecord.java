/*
 * This file is generated by jOOQ.
 */
package com.katana.jooq.entity.audit_dict.tables.records;


import com.katana.jooq.entity.audit_dict.tables.RefuseReason;

import java.util.Date;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RefuseReasonRecord extends UpdatableRecordImpl<RefuseReasonRecord> implements Record12<Integer, String, String, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Date> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>audit_dict.refuse_reason.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>audit_dict.refuse_reason.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>audit_dict.refuse_reason.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>audit_dict.refuse_reason.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>audit_dict.refuse_reason.reason</code>.
     */
    public void setReason(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>audit_dict.refuse_reason.reason</code>.
     */
    public String getReason() {
        return (String) get(2);
    }

    /**
     * Setter for <code>audit_dict.refuse_reason.reason_detail</code>.
     */
    public void setReasonDetail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>audit_dict.refuse_reason.reason_detail</code>.
     */
    public String getReasonDetail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>audit_dict.refuse_reason.audit_type</code>.
     */
    public void setAuditType(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>audit_dict.refuse_reason.audit_type</code>.
     */
    public Integer getAuditType() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>audit_dict.refuse_reason.order_id</code>.
     */
    public void setOrderId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>audit_dict.refuse_reason.order_id</code>.
     */
    public Integer getOrderId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>audit_dict.refuse_reason.app_id</code>.
     */
    public void setAppId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>audit_dict.refuse_reason.app_id</code>.
     */
    public Integer getAppId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>audit_dict.refuse_reason.additionable</code>.
     */
    public void setAdditionable(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>audit_dict.refuse_reason.additionable</code>.
     */
    public Integer getAdditionable() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>audit_dict.refuse_reason.level</code>.
     */
    public void setLevel(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>audit_dict.refuse_reason.level</code>.
     */
    public Integer getLevel() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>audit_dict.refuse_reason.parent_id</code>.
     */
    public void setParentId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>audit_dict.refuse_reason.parent_id</code>.
     */
    public Integer getParentId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>audit_dict.refuse_reason.show_status</code>.
     */
    public void setShowStatus(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>audit_dict.refuse_reason.show_status</code>.
     */
    public Integer getShowStatus() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>audit_dict.refuse_reason.create_time</code>.
     */
    public void setCreateTime(Date value) {
        set(11, value);
    }

    /**
     * Getter for <code>audit_dict.refuse_reason.create_time</code>.
     */
    public Date getCreateTime() {
        return (Date) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, String, String, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Date> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Integer, String, String, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Date> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return RefuseReason.REFUSE_REASON.ID;
    }

    @Override
    public Field<String> field2() {
        return RefuseReason.REFUSE_REASON.CODE;
    }

    @Override
    public Field<String> field3() {
        return RefuseReason.REFUSE_REASON.REASON;
    }

    @Override
    public Field<String> field4() {
        return RefuseReason.REFUSE_REASON.REASON_DETAIL;
    }

    @Override
    public Field<Integer> field5() {
        return RefuseReason.REFUSE_REASON.AUDIT_TYPE;
    }

    @Override
    public Field<Integer> field6() {
        return RefuseReason.REFUSE_REASON.ORDER_ID;
    }

    @Override
    public Field<Integer> field7() {
        return RefuseReason.REFUSE_REASON.APP_ID;
    }

    @Override
    public Field<Integer> field8() {
        return RefuseReason.REFUSE_REASON.ADDITIONABLE;
    }

    @Override
    public Field<Integer> field9() {
        return RefuseReason.REFUSE_REASON.LEVEL;
    }

    @Override
    public Field<Integer> field10() {
        return RefuseReason.REFUSE_REASON.PARENT_ID;
    }

    @Override
    public Field<Integer> field11() {
        return RefuseReason.REFUSE_REASON.SHOW_STATUS;
    }

    @Override
    public Field<Date> field12() {
        return RefuseReason.REFUSE_REASON.CREATE_TIME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCode();
    }

    @Override
    public String component3() {
        return getReason();
    }

    @Override
    public String component4() {
        return getReasonDetail();
    }

    @Override
    public Integer component5() {
        return getAuditType();
    }

    @Override
    public Integer component6() {
        return getOrderId();
    }

    @Override
    public Integer component7() {
        return getAppId();
    }

    @Override
    public Integer component8() {
        return getAdditionable();
    }

    @Override
    public Integer component9() {
        return getLevel();
    }

    @Override
    public Integer component10() {
        return getParentId();
    }

    @Override
    public Integer component11() {
        return getShowStatus();
    }

    @Override
    public Date component12() {
        return getCreateTime();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCode();
    }

    @Override
    public String value3() {
        return getReason();
    }

    @Override
    public String value4() {
        return getReasonDetail();
    }

    @Override
    public Integer value5() {
        return getAuditType();
    }

    @Override
    public Integer value6() {
        return getOrderId();
    }

    @Override
    public Integer value7() {
        return getAppId();
    }

    @Override
    public Integer value8() {
        return getAdditionable();
    }

    @Override
    public Integer value9() {
        return getLevel();
    }

    @Override
    public Integer value10() {
        return getParentId();
    }

    @Override
    public Integer value11() {
        return getShowStatus();
    }

    @Override
    public Date value12() {
        return getCreateTime();
    }

    @Override
    public RefuseReasonRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public RefuseReasonRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public RefuseReasonRecord value3(String value) {
        setReason(value);
        return this;
    }

    @Override
    public RefuseReasonRecord value4(String value) {
        setReasonDetail(value);
        return this;
    }

    @Override
    public RefuseReasonRecord value5(Integer value) {
        setAuditType(value);
        return this;
    }

    @Override
    public RefuseReasonRecord value6(Integer value) {
        setOrderId(value);
        return this;
    }

    @Override
    public RefuseReasonRecord value7(Integer value) {
        setAppId(value);
        return this;
    }

    @Override
    public RefuseReasonRecord value8(Integer value) {
        setAdditionable(value);
        return this;
    }

    @Override
    public RefuseReasonRecord value9(Integer value) {
        setLevel(value);
        return this;
    }

    @Override
    public RefuseReasonRecord value10(Integer value) {
        setParentId(value);
        return this;
    }

    @Override
    public RefuseReasonRecord value11(Integer value) {
        setShowStatus(value);
        return this;
    }

    @Override
    public RefuseReasonRecord value12(Date value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public RefuseReasonRecord values(Integer value1, String value2, String value3, String value4, Integer value5, Integer value6, Integer value7, Integer value8, Integer value9, Integer value10, Integer value11, Date value12) {
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
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RefuseReasonRecord
     */
    public RefuseReasonRecord() {
        super(RefuseReason.REFUSE_REASON);
    }

    /**
     * Create a detached, initialised RefuseReasonRecord
     */
    public RefuseReasonRecord(Integer id, String code, String reason, String reasonDetail, Integer auditType, Integer orderId, Integer appId, Integer additionable, Integer level, Integer parentId, Integer showStatus, Date createTime) {
        super(RefuseReason.REFUSE_REASON);

        setId(id);
        setCode(code);
        setReason(reason);
        setReasonDetail(reasonDetail);
        setAuditType(auditType);
        setOrderId(orderId);
        setAppId(appId);
        setAdditionable(additionable);
        setLevel(level);
        setParentId(parentId);
        setShowStatus(showStatus);
        setCreateTime(createTime);
    }
}
