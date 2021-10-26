/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables;


import com.tengzhe.jooq.data.material.Keys;
import com.tengzhe.jooq.data.material.Material;
import com.tengzhe.jooq.data.material.tables.records.AuditEntityDetailLogRecord;

import java.time.LocalDateTime;
import java.util.Date;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
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
public class AuditEntityDetailLog extends TableImpl<AuditEntityDetailLogRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>material.audit_entity_detail_log</code>
     */
    public static final AuditEntityDetailLog AUDIT_ENTITY_DETAIL_LOG = new AuditEntityDetailLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuditEntityDetailLogRecord> getRecordType() {
        return AuditEntityDetailLogRecord.class;
    }

    /**
     * The column <code>material.audit_entity_detail_log.id</code>.
     */
    public final TableField<AuditEntityDetailLogRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>material.audit_entity_detail_log.dt</code>.
     */
    public final TableField<AuditEntityDetailLogRecord, Integer> DT = createField(DSL.name("dt"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.audit_entity_detail_log.entity_type</code>.
     */
    public final TableField<AuditEntityDetailLogRecord, Integer> ENTITY_TYPE = createField(DSL.name("entity_type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.audit_entity_detail_log.entity_id</code>.
     */
    public final TableField<AuditEntityDetailLogRecord, Long> ENTITY_ID = createField(DSL.name("entity_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.audit_entity_detail_log.audit_type</code>.
     */
    public final TableField<AuditEntityDetailLogRecord, Integer> AUDIT_TYPE = createField(DSL.name("audit_type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.audit_entity_detail_log.user_id</code>.
     */
    public final TableField<AuditEntityDetailLogRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.audit_entity_detail_log.sme</code>.
     */
    public final TableField<AuditEntityDetailLogRecord, Integer> SME = createField(DSL.name("sme"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.audit_entity_detail_log.industry1</code>.
     */
    public final TableField<AuditEntityDetailLogRecord, Integer> INDUSTRY1 = createField(DSL.name("industry1"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.audit_entity_detail_log.audit_state</code>.
     */
    public final TableField<AuditEntityDetailLogRecord, Integer> AUDIT_STATE = createField(DSL.name("audit_state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.audit_entity_detail_log.auditor_id</code>.
     */
    public final TableField<AuditEntityDetailLogRecord, Long> AUDITOR_ID = createField(DSL.name("auditor_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column
     * <code>material.audit_entity_detail_log.audit_start_time</code>.
     */
    public final TableField<AuditEntityDetailLogRecord, Date> AUDIT_START_TIME = createField(DSL.name("audit_start_time"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "", org.jooq.Converter.ofNullable(
                            Long.class, Date.class,
                            Date::new, Date::getTime));

    /**
     * The column <code>material.audit_entity_detail_log.audit_end_time</code>.
     */
    public final TableField<AuditEntityDetailLogRecord, Date> AUDIT_END_TIME = createField(DSL.name("audit_end_time"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "", org.jooq.Converter.ofNullable(
                            Long.class, Date.class,
                            Date::new, Date::getTime));

    /**
     * The column <code>material.audit_entity_detail_log.create_time</code>.
     */
    public final TableField<AuditEntityDetailLogRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private AuditEntityDetailLog(Name alias, Table<AuditEntityDetailLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuditEntityDetailLog(Name alias, Table<AuditEntityDetailLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>material.audit_entity_detail_log</code> table
     * reference
     */
    public AuditEntityDetailLog(String alias) {
        this(DSL.name(alias), AUDIT_ENTITY_DETAIL_LOG);
    }

    /**
     * Create an aliased <code>material.audit_entity_detail_log</code> table
     * reference
     */
    public AuditEntityDetailLog(Name alias) {
        this(alias, AUDIT_ENTITY_DETAIL_LOG);
    }

    /**
     * Create a <code>material.audit_entity_detail_log</code> table reference
     */
    public AuditEntityDetailLog() {
        this(DSL.name("audit_entity_detail_log"), null);
    }

    public <O extends Record> AuditEntityDetailLog(Table<O> child, ForeignKey<O, AuditEntityDetailLogRecord> key) {
        super(child, key, AUDIT_ENTITY_DETAIL_LOG);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Material.MATERIAL;
    }

    @Override
    public Identity<AuditEntityDetailLogRecord, Long> getIdentity() {
        return (Identity<AuditEntityDetailLogRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<AuditEntityDetailLogRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_7;
    }

    @Override
    public AuditEntityDetailLog as(String alias) {
        return new AuditEntityDetailLog(DSL.name(alias), this);
    }

    @Override
    public AuditEntityDetailLog as(Name alias) {
        return new AuditEntityDetailLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditEntityDetailLog rename(String name) {
        return new AuditEntityDetailLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditEntityDetailLog rename(Name name) {
        return new AuditEntityDetailLog(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, Integer, Integer, Long, Integer, Long, Integer, Integer, Integer, Long, Date, Date, LocalDateTime> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}