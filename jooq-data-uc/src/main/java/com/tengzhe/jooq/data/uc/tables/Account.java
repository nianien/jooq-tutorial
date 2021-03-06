/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.uc.tables;


import com.jooq.predefine.converter.EncryptConverter;
import com.jooq.predefine.converter.LocalDateTimeConverter;
import com.tengzhe.jooq.data.uc.Keys;
import com.tengzhe.jooq.data.uc.Uc;
import com.tengzhe.jooq.data.uc.tables.records.AccountRecord;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row20;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Account extends TableImpl<AccountRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>uc.account</code>
     */
    public static final Account ACCOUNT = new Account();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AccountRecord> getRecordType() {
        return AccountRecord.class;
    }

    /**
     * The column <code>uc.account.id</code>.
     */
    public final TableField<AccountRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>uc.account.name</code>.
     */
    public final TableField<AccountRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>uc.account.user_id</code>.
     */
    public final TableField<AccountRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>uc.account.short_name</code>.
     */
    public final TableField<AccountRecord, String> SHORT_NAME = createField(DSL.name("short_name"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>uc.account.app_id</code>.
     */
    public final TableField<AccountRecord, Integer> APP_ID = createField(DSL.name("app_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("-1", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>uc.account.create_source</code>.
     */
    public final TableField<AccountRecord, Integer> CREATE_SOURCE = createField(DSL.name("create_source"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("-1", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>uc.account.product_name</code>.
     */
    public final TableField<AccountRecord, String> PRODUCT_NAME = createField(DSL.name("product_name"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>uc.account.web_site</code>.
     */
    public final TableField<AccountRecord, String> WEB_SITE = createField(DSL.name("web_site"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>uc.account.license_type</code>.
     */
    public final TableField<AccountRecord, Integer> LICENSE_TYPE = createField(DSL.name("license_type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("1", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>uc.account.contact</code>.
     */
    public final TableField<AccountRecord, String> CONTACT = createField(DSL.name("contact"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>uc.account.phone</code>.
     */
    public final TableField<AccountRecord, String> PHONE = createField(DSL.name("phone"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "", new EncryptConverter());

    /**
     * The column <code>uc.account.email</code>.
     */
    public final TableField<AccountRecord, String> EMAIL = createField(DSL.name("email"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "", new EncryptConverter());

    /**
     * The column <code>uc.account.corp_id</code>.
     */
    public final TableField<AccountRecord, Long> CORP_ID = createField(DSL.name("corp_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>uc.account.sign_corp_id</code>.
     */
    public final TableField<AccountRecord, Long> SIGN_CORP_ID = createField(DSL.name("sign_corp_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>uc.account.ad_corp_id</code>.
     */
    public final TableField<AccountRecord, Long> AD_CORP_ID = createField(DSL.name("ad_corp_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>uc.account.status</code>.
     */
    public final TableField<AccountRecord, Integer> STATUS = createField(DSL.name("status"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("-1", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>uc.account.agent_id</code>.
     */
    public final TableField<AccountRecord, Long> AGENT_ID = createField(DSL.name("agent_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>uc.account.shop_user_id</code>.
     */
    public final TableField<AccountRecord, Long> SHOP_USER_ID = createField(DSL.name("shop_user_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>uc.account.create_time</code>.
     */
    public final TableField<AccountRecord, Date> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "", new LocalDateTimeConverter());

    /**
     * The column <code>uc.account.update_time</code>.
     */
    public final TableField<AccountRecord, Date> UPDATE_TIME = createField(DSL.name("update_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "", new LocalDateTimeConverter());

    private Account(Name alias, Table<AccountRecord> aliased) {
        this(alias, aliased, null);
    }

    private Account(Name alias, Table<AccountRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>uc.account</code> table reference
     */
    public Account(String alias) {
        this(DSL.name(alias), ACCOUNT);
    }

    /**
     * Create an aliased <code>uc.account</code> table reference
     */
    public Account(Name alias) {
        this(alias, ACCOUNT);
    }

    /**
     * Create a <code>uc.account</code> table reference
     */
    public Account() {
        this(DSL.name("account"), null);
    }

    public <O extends Record> Account(Table<O> child, ForeignKey<O, AccountRecord> key) {
        super(child, key, ACCOUNT);
    }

    @Override
    public Schema getSchema() {
        return Uc.UC;
    }

    @Override
    public Identity<AccountRecord, Long> getIdentity() {
        return (Identity<AccountRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<AccountRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_B;
    }

    @Override
    public List<UniqueKey<AccountRecord>> getKeys() {
        return Arrays.<UniqueKey<AccountRecord>>asList(Keys.CONSTRAINT_B);
    }

    @Override
    public Account as(String alias) {
        return new Account(DSL.name(alias), this);
    }

    @Override
    public Account as(Name alias) {
        return new Account(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Account rename(String name) {
        return new Account(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Account rename(Name name) {
        return new Account(name, null);
    }

    // -------------------------------------------------------------------------
    // Row20 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row20<Long, String, Long, String, Integer, Integer, String, String, Integer, String, String, String, Long, Long, Long, Integer, Long, Long, Date, Date> fieldsRow() {
        return (Row20) super.fieldsRow();
    }
}
