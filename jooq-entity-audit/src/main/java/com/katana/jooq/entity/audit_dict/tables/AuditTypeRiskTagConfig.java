/*
 * This file is generated by jOOQ.
 */
package com.katana.jooq.entity.audit_dict.tables;


import com.katana.jooq.entity.audit_dict.AuditDict;
import com.katana.jooq.entity.audit_dict.Keys;
import com.katana.jooq.entity.audit_dict.tables.records.AuditTypeRiskTagConfigRecord;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import com.cudrania.jooq.converter.LocalDateTimeConverter;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuditTypeRiskTagConfig extends TableImpl<AuditTypeRiskTagConfigRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>audit_dict.audit_type_risk_tag_config</code>
     */
    public static final AuditTypeRiskTagConfig AUDIT_TYPE_RISK_TAG_CONFIG = new AuditTypeRiskTagConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuditTypeRiskTagConfigRecord> getRecordType() {
        return AuditTypeRiskTagConfigRecord.class;
    }

    /**
     * The column <code>audit_dict.audit_type_risk_tag_config.id</code>.
     */
    public final TableField<AuditTypeRiskTagConfigRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>audit_dict.audit_type_risk_tag_config.type</code>.
     */
    public final TableField<AuditTypeRiskTagConfigRecord, Integer> TYPE = createField(DSL.name("type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'0'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>audit_dict.audit_type_risk_tag_config.code</code>.
     */
    public final TableField<AuditTypeRiskTagConfigRecord, String> CODE = createField(DSL.name("code"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit_dict.audit_type_risk_tag_config.create_time</code>.
     */
    public final TableField<AuditTypeRiskTagConfigRecord, Date> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "", new LocalDateTimeConverter());

    /**
     * The column <code>audit_dict.audit_type_risk_tag_config.modify_time</code>.
     */
    public final TableField<AuditTypeRiskTagConfigRecord, Date> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "", new LocalDateTimeConverter());

    private AuditTypeRiskTagConfig(Name alias, Table<AuditTypeRiskTagConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuditTypeRiskTagConfig(Name alias, Table<AuditTypeRiskTagConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>audit_dict.audit_type_risk_tag_config</code> table reference
     */
    public AuditTypeRiskTagConfig(String alias) {
        this(DSL.name(alias), AUDIT_TYPE_RISK_TAG_CONFIG);
    }

    /**
     * Create an aliased <code>audit_dict.audit_type_risk_tag_config</code> table reference
     */
    public AuditTypeRiskTagConfig(Name alias) {
        this(alias, AUDIT_TYPE_RISK_TAG_CONFIG);
    }

    /**
     * Create a <code>audit_dict.audit_type_risk_tag_config</code> table reference
     */
    public AuditTypeRiskTagConfig() {
        this(DSL.name("audit_type_risk_tag_config"), null);
    }

    public <O extends Record> AuditTypeRiskTagConfig(Table<O> child, ForeignKey<O, AuditTypeRiskTagConfigRecord> key) {
        super(child, key, AUDIT_TYPE_RISK_TAG_CONFIG);
    }

    @Override
    public Schema getSchema() {
        return AuditDict.AUDIT_DICT;
    }

    @Override
    public Identity<AuditTypeRiskTagConfigRecord, Long> getIdentity() {
        return (Identity<AuditTypeRiskTagConfigRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<AuditTypeRiskTagConfigRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_9;
    }

    @Override
    public List<UniqueKey<AuditTypeRiskTagConfigRecord>> getKeys() {
        return Arrays.<UniqueKey<AuditTypeRiskTagConfigRecord>>asList(Keys.CONSTRAINT_9);
    }

    @Override
    public AuditTypeRiskTagConfig as(String alias) {
        return new AuditTypeRiskTagConfig(DSL.name(alias), this);
    }

    @Override
    public AuditTypeRiskTagConfig as(Name alias) {
        return new AuditTypeRiskTagConfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditTypeRiskTagConfig rename(String name) {
        return new AuditTypeRiskTagConfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditTypeRiskTagConfig rename(Name name) {
        return new AuditTypeRiskTagConfig(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Integer, String, Date, Date> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
