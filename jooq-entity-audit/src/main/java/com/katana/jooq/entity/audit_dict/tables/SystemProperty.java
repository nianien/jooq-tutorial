/*
 * This file is generated by jOOQ.
 */
package com.katana.jooq.entity.audit_dict.tables;


import com.katana.jooq.entity.audit_dict.AuditDict;
import com.katana.jooq.entity.audit_dict.Keys;
import com.katana.jooq.entity.audit_dict.tables.records.SystemPropertyRecord;

import java.util.Date;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.plus.converter.LocalDateTimeConverter;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SystemProperty extends TableImpl<SystemPropertyRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>audit_dict.system_property</code>
     */
    public static final SystemProperty SYSTEM_PROPERTY = new SystemProperty();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SystemPropertyRecord> getRecordType() {
        return SystemPropertyRecord.class;
    }

    /**
     * The column <code>audit_dict.system_property.id</code>.
     */
    public final TableField<SystemPropertyRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>audit_dict.system_property.name</code>.
     */
    public final TableField<SystemPropertyRecord, Long> NAME = createField(DSL.name("name"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>audit_dict.system_property.value</code>.
     */
    public final TableField<SystemPropertyRecord, String> VALUE = createField(DSL.name("value"), SQLDataType.VARCHAR(1024).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_dict.system_property.label</code>.
     */
    public final TableField<SystemPropertyRecord, String> LABEL = createField(DSL.name("label"), SQLDataType.VARCHAR(256).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_dict.system_property.group</code>.
     */
    public final TableField<SystemPropertyRecord, String> GROUP = createField(DSL.name("group"), SQLDataType.VARCHAR(256).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_dict.system_property.enable</code>.
     */
    public final TableField<SystemPropertyRecord, Integer> ENABLE = createField(DSL.name("enable"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("1", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>audit_dict.system_property.remark</code>.
     */
    public final TableField<SystemPropertyRecord, String> REMARK = createField(DSL.name("remark"), SQLDataType.VARCHAR(1024).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_dict.system_property.create_time</code>.
     */
    public final TableField<SystemPropertyRecord, Date> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "", new LocalDateTimeConverter());

    /**
     * The column <code>audit_dict.system_property.modify_time</code>.
     */
    public final TableField<SystemPropertyRecord, Date> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "", new LocalDateTimeConverter());

    private SystemProperty(Name alias, Table<SystemPropertyRecord> aliased) {
        this(alias, aliased, null);
    }

    private SystemProperty(Name alias, Table<SystemPropertyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>audit_dict.system_property</code> table reference
     */
    public SystemProperty(String alias) {
        this(DSL.name(alias), SYSTEM_PROPERTY);
    }

    /**
     * Create an aliased <code>audit_dict.system_property</code> table reference
     */
    public SystemProperty(Name alias) {
        this(alias, SYSTEM_PROPERTY);
    }

    /**
     * Create a <code>audit_dict.system_property</code> table reference
     */
    public SystemProperty() {
        this(DSL.name("system_property"), null);
    }

    public <O extends Record> SystemProperty(Table<O> child, ForeignKey<O, SystemPropertyRecord> key) {
        super(child, key, SYSTEM_PROPERTY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : AuditDict.AUDIT_DICT;
    }

    @Override
    public Identity<SystemPropertyRecord, Long> getIdentity() {
        return (Identity<SystemPropertyRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<SystemPropertyRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_4;
    }

    @Override
    public SystemProperty as(String alias) {
        return new SystemProperty(DSL.name(alias), this);
    }

    @Override
    public SystemProperty as(Name alias) {
        return new SystemProperty(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemProperty rename(String name) {
        return new SystemProperty(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemProperty rename(Name name) {
        return new SystemProperty(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, String, String, String, Integer, String, Date, Date> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
