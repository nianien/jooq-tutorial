/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.naudit.tables.records;


import com.tengzhe.jooq.data.naudit.tables.ExceptionLog;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class ExceptionLogRecord extends UpdatableRecordImpl<ExceptionLogRecord> implements Record9<Long, String, String, String, String, String, Integer, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>naudit.exception_log.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>naudit.exception_log.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>naudit.exception_log.type</code>.
     */
    public void setType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>naudit.exception_log.type</code>.
     */
    public String getType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>naudit.exception_log.class_name</code>.
     */
    public void setClassName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>naudit.exception_log.class_name</code>.
     */
    public String getClassName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>naudit.exception_log.method_name</code>.
     */
    public void setMethodName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>naudit.exception_log.method_name</code>.
     */
    public String getMethodName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>naudit.exception_log.exception</code>.
     */
    public void setException(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>naudit.exception_log.exception</code>.
     */
    public String getException() {
        return (String) get(4);
    }

    /**
     * Setter for <code>naudit.exception_log.request</code>.
     */
    public void setRequest(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>naudit.exception_log.request</code>.
     */
    public String getRequest() {
        return (String) get(5);
    }

    /**
     * Setter for <code>naudit.exception_log.state</code>.
     */
    public void setState(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>naudit.exception_log.state</code>.
     */
    public Integer getState() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>naudit.exception_log.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>naudit.exception_log.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>naudit.exception_log.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>naudit.exception_log.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, String, String, String, String, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, String, String, String, String, String, Integer, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ExceptionLog.EXCEPTION_LOG.ID;
    }

    @Override
    public Field<String> field2() {
        return ExceptionLog.EXCEPTION_LOG.TYPE;
    }

    @Override
    public Field<String> field3() {
        return ExceptionLog.EXCEPTION_LOG.CLASS_NAME;
    }

    @Override
    public Field<String> field4() {
        return ExceptionLog.EXCEPTION_LOG.METHOD_NAME;
    }

    @Override
    public Field<String> field5() {
        return ExceptionLog.EXCEPTION_LOG.EXCEPTION;
    }

    @Override
    public Field<String> field6() {
        return ExceptionLog.EXCEPTION_LOG.REQUEST;
    }

    @Override
    public Field<Integer> field7() {
        return ExceptionLog.EXCEPTION_LOG.STATE;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return ExceptionLog.EXCEPTION_LOG.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return ExceptionLog.EXCEPTION_LOG.MODIFY_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getType();
    }

    @Override
    public String component3() {
        return getClassName();
    }

    @Override
    public String component4() {
        return getMethodName();
    }

    @Override
    public String component5() {
        return getException();
    }

    @Override
    public String component6() {
        return getRequest();
    }

    @Override
    public Integer component7() {
        return getState();
    }

    @Override
    public LocalDateTime component8() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component9() {
        return getModifyTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getType();
    }

    @Override
    public String value3() {
        return getClassName();
    }

    @Override
    public String value4() {
        return getMethodName();
    }

    @Override
    public String value5() {
        return getException();
    }

    @Override
    public String value6() {
        return getRequest();
    }

    @Override
    public Integer value7() {
        return getState();
    }

    @Override
    public LocalDateTime value8() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value9() {
        return getModifyTime();
    }

    @Override
    public ExceptionLogRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public ExceptionLogRecord value2(String value) {
        setType(value);
        return this;
    }

    @Override
    public ExceptionLogRecord value3(String value) {
        setClassName(value);
        return this;
    }

    @Override
    public ExceptionLogRecord value4(String value) {
        setMethodName(value);
        return this;
    }

    @Override
    public ExceptionLogRecord value5(String value) {
        setException(value);
        return this;
    }

    @Override
    public ExceptionLogRecord value6(String value) {
        setRequest(value);
        return this;
    }

    @Override
    public ExceptionLogRecord value7(Integer value) {
        setState(value);
        return this;
    }

    @Override
    public ExceptionLogRecord value8(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public ExceptionLogRecord value9(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public ExceptionLogRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, Integer value7, LocalDateTime value8, LocalDateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ExceptionLogRecord
     */
    public ExceptionLogRecord() {
        super(ExceptionLog.EXCEPTION_LOG);
    }

    /**
     * Create a detached, initialised ExceptionLogRecord
     */
    public ExceptionLogRecord(Long id, String type, String className, String methodName, String exception, String request, Integer state, LocalDateTime createTime, LocalDateTime modifyTime) {
        super(ExceptionLog.EXCEPTION_LOG);

        setId(id);
        setType(type);
        setClassName(className);
        setMethodName(methodName);
        setException(exception);
        setRequest(request);
        setState(state);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
    }

    /**
     * Create a detached, initialised ExceptionLogRecord
     */
    public ExceptionLogRecord(com.tengzhe.jooq.data.naudit.tables.pojos.ExceptionLog value) {
        super(ExceptionLog.EXCEPTION_LOG);

        if (value != null) {
            setId(value.getId());
            setType(value.getType());
            setClassName(value.getClassName());
            setMethodName(value.getMethodName());
            setException(value.getException());
            setRequest(value.getRequest());
            setState(value.getState());
            setCreateTime(value.getCreateTime());
            setModifyTime(value.getModifyTime());
        }
    }
}