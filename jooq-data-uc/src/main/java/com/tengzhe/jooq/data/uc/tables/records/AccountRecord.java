/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.uc.tables.records;


import com.tengzhe.jooq.data.uc.tables.Account;

import java.util.Date;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccountRecord extends UpdatableRecordImpl<AccountRecord> implements Record8<Long, String, String, String, String, Date, Date, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>uc.account.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>uc.account.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>uc.account.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>uc.account.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>uc.account.contact</code>.
     */
    public void setContact(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>uc.account.contact</code>.
     */
    public String getContact() {
        return (String) get(2);
    }

    /**
     * Setter for <code>uc.account.phone</code>.
     */
    public void setPhone(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>uc.account.phone</code>.
     */
    public String getPhone() {
        return (String) get(3);
    }

    /**
     * Setter for <code>uc.account.email</code>.
     */
    public void setEmail(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>uc.account.email</code>.
     */
    public String getEmail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>uc.account.create_time</code>.
     */
    public void setCreateTime(Date value) {
        set(5, value);
    }

    /**
     * Getter for <code>uc.account.create_time</code>.
     */
    public Date getCreateTime() {
        return (Date) get(5);
    }

    /**
     * Setter for <code>uc.account.update_time</code>.
     */
    public void setUpdateTime(Date value) {
        set(6, value);
    }

    /**
     * Getter for <code>uc.account.update_time</code>.
     */
    public Date getUpdateTime() {
        return (Date) get(6);
    }

    /**
     * Setter for <code>uc.account.tenant_code</code>.
     */
    public void setTenantCode(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>uc.account.tenant_code</code>.
     */
    public String getTenantCode() {
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
    public Row8<Long, String, String, String, String, Date, Date, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Long, String, String, String, String, Date, Date, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Account.ACCOUNT.ID;
    }

    @Override
    public Field<String> field2() {
        return Account.ACCOUNT.NAME;
    }

    @Override
    public Field<String> field3() {
        return Account.ACCOUNT.CONTACT;
    }

    @Override
    public Field<String> field4() {
        return Account.ACCOUNT.PHONE;
    }

    @Override
    public Field<String> field5() {
        return Account.ACCOUNT.EMAIL;
    }

    @Override
    public Field<Date> field6() {
        return Account.ACCOUNT.CREATE_TIME;
    }

    @Override
    public Field<Date> field7() {
        return Account.ACCOUNT.UPDATE_TIME;
    }

    @Override
    public Field<String> field8() {
        return Account.ACCOUNT.TENANT_CODE;
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
        return getContact();
    }

    @Override
    public String component4() {
        return getPhone();
    }

    @Override
    public String component5() {
        return getEmail();
    }

    @Override
    public Date component6() {
        return getCreateTime();
    }

    @Override
    public Date component7() {
        return getUpdateTime();
    }

    @Override
    public String component8() {
        return getTenantCode();
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
        return getContact();
    }

    @Override
    public String value4() {
        return getPhone();
    }

    @Override
    public String value5() {
        return getEmail();
    }

    @Override
    public Date value6() {
        return getCreateTime();
    }

    @Override
    public Date value7() {
        return getUpdateTime();
    }

    @Override
    public String value8() {
        return getTenantCode();
    }

    @Override
    public AccountRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AccountRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public AccountRecord value3(String value) {
        setContact(value);
        return this;
    }

    @Override
    public AccountRecord value4(String value) {
        setPhone(value);
        return this;
    }

    @Override
    public AccountRecord value5(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public AccountRecord value6(Date value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AccountRecord value7(Date value) {
        setUpdateTime(value);
        return this;
    }

    @Override
    public AccountRecord value8(String value) {
        setTenantCode(value);
        return this;
    }

    @Override
    public AccountRecord values(Long value1, String value2, String value3, String value4, String value5, Date value6, Date value7, String value8) {
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
     * Create a detached AccountRecord
     */
    public AccountRecord() {
        super(Account.ACCOUNT);
    }

    /**
     * Create a detached, initialised AccountRecord
     */
    public AccountRecord(Long id, String name, String contact, String phone, String email, Date createTime, Date updateTime, String tenantCode) {
        super(Account.ACCOUNT);

        setId(id);
        setName(name);
        setContact(contact);
        setPhone(phone);
        setEmail(email);
        setCreateTime(createTime);
        setUpdateTime(updateTime);
        setTenantCode(tenantCode);
    }
}
