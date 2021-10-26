/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.naudit.tables;


import com.tengzhe.jooq.data.naudit.Keys;
import com.tengzhe.jooq.data.naudit.Naudit;
import com.tengzhe.jooq.data.naudit.tables.records.ExceptionLogRecord;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

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
public class ExceptionLog extends TableImpl<ExceptionLogRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>naudit.exception_log</code>
     */
    public static final ExceptionLog EXCEPTION_LOG = new ExceptionLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExceptionLogRecord> getRecordType() {
        return ExceptionLogRecord.class;
    }

    /**
     * The column <code>naudit.exception_log.id</code>.
     */
    public final TableField<ExceptionLogRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>naudit.exception_log.type</code>.
     */
    public final TableField<ExceptionLogRecord, String> TYPE = createField(DSL.name("type"), SQLDataType.VARCHAR(1024).nullable(false), this, "");

    /**
     * The column <code>naudit.exception_log.class_name</code>.
     */
    public final TableField<ExceptionLogRecord, String> CLASS_NAME = createField(DSL.name("class_name"), SQLDataType.VARCHAR(1024).nullable(false), this, "");

    /**
     * The column <code>naudit.exception_log.method_name</code>.
     */
    public final TableField<ExceptionLogRecord, String> METHOD_NAME = createField(DSL.name("method_name"), SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column <code>naudit.exception_log.exception</code>.
     */
    public final TableField<ExceptionLogRecord, String> EXCEPTION = createField(DSL.name("exception"), SQLDataType.VARCHAR(1024).nullable(false), this, "");

    /**
     * The column <code>naudit.exception_log.request</code>.
     */
    public final TableField<ExceptionLogRecord, String> REQUEST = createField(DSL.name("request"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>naudit.exception_log.state</code>.
     */
    public final TableField<ExceptionLogRecord, Integer> STATE = createField(DSL.name("state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>naudit.exception_log.create_time</code>.
     */
    public final TableField<ExceptionLogRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>naudit.exception_log.modify_time</code>.
     */
    public final TableField<ExceptionLogRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private ExceptionLog(Name alias, Table<ExceptionLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private ExceptionLog(Name alias, Table<ExceptionLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>naudit.exception_log</code> table reference
     */
    public ExceptionLog(String alias) {
        this(DSL.name(alias), EXCEPTION_LOG);
    }

    /**
     * Create an aliased <code>naudit.exception_log</code> table reference
     */
    public ExceptionLog(Name alias) {
        this(alias, EXCEPTION_LOG);
    }

    /**
     * Create a <code>naudit.exception_log</code> table reference
     */
    public ExceptionLog() {
        this(DSL.name("exception_log"), null);
    }

    public <O extends Record> ExceptionLog(Table<O> child, ForeignKey<O, ExceptionLogRecord> key) {
        super(child, key, EXCEPTION_LOG);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Naudit.NAUDIT;
    }

    @Override
    public Identity<ExceptionLogRecord, Long> getIdentity() {
        return (Identity<ExceptionLogRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<ExceptionLogRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_10;
    }

    @Override
    public ExceptionLog as(String alias) {
        return new ExceptionLog(DSL.name(alias), this);
    }

    @Override
    public ExceptionLog as(Name alias) {
        return new ExceptionLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ExceptionLog rename(String name) {
        return new ExceptionLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ExceptionLog rename(Name name) {
        return new ExceptionLog(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, String, String, String, String, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
