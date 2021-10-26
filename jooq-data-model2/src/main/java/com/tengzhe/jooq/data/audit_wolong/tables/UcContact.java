/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_wolong.tables;


import com.tengzhe.jooq.data.audit_wolong.AuditWolong;
import com.tengzhe.jooq.data.audit_wolong.Keys;
import com.tengzhe.jooq.data.audit_wolong.tables.records.UcContactRecord;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row18;
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
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.15.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UcContact extends TableImpl<UcContactRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>audit_wolong.uc_contact</code>
     */
    public static final UcContact UC_CONTACT = new UcContact();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UcContactRecord> getRecordType() {
        return UcContactRecord.class;
    }

    /**
     * The column <code>audit_wolong.uc_contact.userid</code>.
     */
    public final TableField<UcContactRecord, Long> USERID = createField(DSL.name("userid"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>audit_wolong.uc_contact.user_name</code>.
     */
    public final TableField<UcContactRecord, String> USER_NAME = createField(DSL.name("user_name"), SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_wolong.uc_contact.company_name</code>.
     */
    public final TableField<UcContactRecord, String> COMPANY_NAME = createField(DSL.name("company_name"), SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_wolong.uc_contact.site_name</code>.
     */
    public final TableField<UcContactRecord, String> SITE_NAME = createField(DSL.name("site_name"), SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_wolong.uc_contact.site_url</code>.
     */
    public final TableField<UcContactRecord, String> SITE_URL = createField(DSL.name("site_url"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>audit_wolong.uc_contact.contact_name</code>.
     */
    public final TableField<UcContactRecord, String> CONTACT_NAME = createField(DSL.name("contact_name"), SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_wolong.uc_contact.contact_phone</code>.
     */
    public final TableField<UcContactRecord, String> CONTACT_PHONE = createField(DSL.name("contact_phone"), SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_wolong.uc_contact.mobile</code>.
     */
    public final TableField<UcContactRecord, String> MOBILE = createField(DSL.name("mobile"), SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_wolong.uc_contact.contact_email</code>.
     */
    public final TableField<UcContactRecord, String> CONTACT_EMAIL = createField(DSL.name("contact_email"), SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_wolong.uc_contact.qq</code>.
     */
    public final TableField<UcContactRecord, String> QQ = createField(DSL.name("qq"), SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_wolong.uc_contact.fax</code>.
     */
    public final TableField<UcContactRecord, String> FAX = createField(DSL.name("fax"), SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_wolong.uc_contact.province</code>.
     */
    public final TableField<UcContactRecord, String> PROVINCE = createField(DSL.name("province"), SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_wolong.uc_contact.city</code>.
     */
    public final TableField<UcContactRecord, String> CITY = createField(DSL.name("city"), SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_wolong.uc_contact.address</code>.
     */
    public final TableField<UcContactRecord, String> ADDRESS = createField(DSL.name("address"), SQLDataType.VARCHAR(1024).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_wolong.uc_contact.zip_code</code>.
     */
    public final TableField<UcContactRecord, String> ZIP_CODE = createField(DSL.name("zip_code"), SQLDataType.VARCHAR(8).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_wolong.uc_contact.create_time</code>.
     */
    public final TableField<UcContactRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("'1970-01-01 08:00:01'", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>audit_wolong.uc_contact.modify_time</code>.
     */
    public final TableField<UcContactRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>audit_wolong.uc_contact.deleted</code>.
     */
    public final TableField<UcContactRecord, Integer> DELETED = createField(DSL.name("deleted"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'0'", SQLDataType.INTEGER)), this, "");

    private UcContact(Name alias, Table<UcContactRecord> aliased) {
        this(alias, aliased, null);
    }

    private UcContact(Name alias, Table<UcContactRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>audit_wolong.uc_contact</code> table reference
     */
    public UcContact(String alias) {
        this(DSL.name(alias), UC_CONTACT);
    }

    /**
     * Create an aliased <code>audit_wolong.uc_contact</code> table reference
     */
    public UcContact(Name alias) {
        this(alias, UC_CONTACT);
    }

    /**
     * Create a <code>audit_wolong.uc_contact</code> table reference
     */
    public UcContact() {
        this(DSL.name("uc_contact"), null);
    }

    public <O extends Record> UcContact(Table<O> child, ForeignKey<O, UcContactRecord> key) {
        super(child, key, UC_CONTACT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : AuditWolong.AUDIT_WOLONG;
    }

    @Override
    public UniqueKey<UcContactRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_C;
    }

    @Override
    public UcContact as(String alias) {
        return new UcContact(DSL.name(alias), this);
    }

    @Override
    public UcContact as(Name alias) {
        return new UcContact(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UcContact rename(String name) {
        return new UcContact(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UcContact rename(Name name) {
        return new UcContact(name, null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<Long, String, String, String, String, String, String, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, Integer> fieldsRow() {
        return (Row18) super.fieldsRow();
    }
}
