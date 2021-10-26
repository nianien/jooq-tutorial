/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.naudit.tables;


import com.tengzhe.jooq.data.naudit.Keys;
import com.tengzhe.jooq.data.naudit.Naudit;
import com.tengzhe.jooq.data.naudit.tables.records.AuditInfoLogRecord;

import java.time.LocalDateTime;
import java.util.Date;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row16;
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
public class AuditInfoLog extends TableImpl<AuditInfoLogRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>naudit.audit_info_log</code>
     */
    public static final AuditInfoLog AUDIT_INFO_LOG = new AuditInfoLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuditInfoLogRecord> getRecordType() {
        return AuditInfoLogRecord.class;
    }

    /**
     * The column <code>naudit.audit_info_log.id</code>.
     */
    public final TableField<AuditInfoLogRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>naudit.audit_info_log.date</code>.
     */
    public final TableField<AuditInfoLogRecord, Integer> DATE = createField(DSL.name("date"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>naudit.audit_info_log.type</code>.
     */
    public final TableField<AuditInfoLogRecord, Integer> TYPE = createField(DSL.name("type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("1", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>naudit.audit_info_log.entity_id</code>.
     */
    public final TableField<AuditInfoLogRecord, Long> ENTITY_ID = createField(DSL.name("entity_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>naudit.audit_info_log.biz_type</code>.
     */
    public final TableField<AuditInfoLogRecord, String> BIZ_TYPE = createField(DSL.name("biz_type"), SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>naudit.audit_info_log.source</code>.
     */
    public final TableField<AuditInfoLogRecord, Integer> SOURCE = createField(DSL.name("source"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>naudit.audit_info_log.company_name</code>.
     */
    public final TableField<AuditInfoLogRecord, String> COMPANY_NAME = createField(DSL.name("company_name"), SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>naudit.audit_info_log.agent_id</code>.
     */
    public final TableField<AuditInfoLogRecord, Long> AGENT_ID = createField(DSL.name("agent_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>naudit.audit_info_log.industry1</code>.
     */
    public final TableField<AuditInfoLogRecord, Integer> INDUSTRY1 = createField(DSL.name("industry1"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>naudit.audit_info_log.industry2</code>.
     */
    public final TableField<AuditInfoLogRecord, Integer> INDUSTRY2 = createField(DSL.name("industry2"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>naudit.audit_info_log.industry3</code>.
     */
    public final TableField<AuditInfoLogRecord, Integer> INDUSTRY3 = createField(DSL.name("industry3"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>naudit.audit_info_log.audit_result</code>.
     */
    public final TableField<AuditInfoLogRecord, String> AUDIT_RESULT = createField(DSL.name("audit_result"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>naudit.audit_info_log.auditor_id</code>.
     */
    public final TableField<AuditInfoLogRecord, Long> AUDITOR_ID = createField(DSL.name("auditor_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>naudit.audit_info_log.reason_code</code>.
     */
    public final TableField<AuditInfoLogRecord, String> REASON_CODE = createField(DSL.name("reason_code"), SQLDataType.VARCHAR(4096).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>naudit.audit_info_log.audit_cost_time</code>.
     */
    public final TableField<AuditInfoLogRecord, Date> AUDIT_COST_TIME = createField(DSL.name("audit_cost_time"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("0", SQLDataType.BIGINT)), this, "", org.jooq.Converter.ofNullable(
                            Long.class, Date.class,
                            Date::new, Date::getTime));

    /**
     * The column <code>naudit.audit_info_log.create_time</code>.
     */
    public final TableField<AuditInfoLogRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private AuditInfoLog(Name alias, Table<AuditInfoLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuditInfoLog(Name alias, Table<AuditInfoLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>naudit.audit_info_log</code> table reference
     */
    public AuditInfoLog(String alias) {
        this(DSL.name(alias), AUDIT_INFO_LOG);
    }

    /**
     * Create an aliased <code>naudit.audit_info_log</code> table reference
     */
    public AuditInfoLog(Name alias) {
        this(alias, AUDIT_INFO_LOG);
    }

    /**
     * Create a <code>naudit.audit_info_log</code> table reference
     */
    public AuditInfoLog() {
        this(DSL.name("audit_info_log"), null);
    }

    public <O extends Record> AuditInfoLog(Table<O> child, ForeignKey<O, AuditInfoLogRecord> key) {
        super(child, key, AUDIT_INFO_LOG);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Naudit.NAUDIT;
    }

    @Override
    public Identity<AuditInfoLogRecord, Long> getIdentity() {
        return (Identity<AuditInfoLogRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<AuditInfoLogRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_6B;
    }

    @Override
    public AuditInfoLog as(String alias) {
        return new AuditInfoLog(DSL.name(alias), this);
    }

    @Override
    public AuditInfoLog as(Name alias) {
        return new AuditInfoLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditInfoLog rename(String name) {
        return new AuditInfoLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditInfoLog rename(Name name) {
        return new AuditInfoLog(name, null);
    }

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row16<Long, Integer, Integer, Long, String, Integer, String, Long, Integer, Integer, Integer, String, Long, String, Date, LocalDateTime> fieldsRow() {
        return (Row16) super.fieldsRow();
    }
}
