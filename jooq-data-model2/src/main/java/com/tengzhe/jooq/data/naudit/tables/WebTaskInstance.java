/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.naudit.tables;


import com.tengzhe.jooq.data.naudit.Keys;
import com.tengzhe.jooq.data.naudit.Naudit;
import com.tengzhe.jooq.data.naudit.tables.records.WebTaskInstanceRecord;

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
public class WebTaskInstance extends TableImpl<WebTaskInstanceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>naudit.web_task_instance</code>
     */
    public static final WebTaskInstance WEB_TASK_INSTANCE = new WebTaskInstance();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WebTaskInstanceRecord> getRecordType() {
        return WebTaskInstanceRecord.class;
    }

    /**
     * The column <code>naudit.web_task_instance.id</code>.
     */
    public final TableField<WebTaskInstanceRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>naudit.web_task_instance.user_id</code>.
     */
    public final TableField<WebTaskInstanceRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>naudit.web_task_instance.task_id</code>.
     */
    public final TableField<WebTaskInstanceRecord, String> TASK_ID = createField(DSL.name("task_id"), SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>naudit.web_task_instance.param</code>.
     */
    public final TableField<WebTaskInstanceRecord, String> PARAM = createField(DSL.name("param"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>naudit.web_task_instance.result</code>.
     */
    public final TableField<WebTaskInstanceRecord, String> RESULT = createField(DSL.name("result"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>naudit.web_task_instance.state</code>.
     */
    public final TableField<WebTaskInstanceRecord, Integer> STATE = createField(DSL.name("state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>naudit.web_task_instance.submit_time</code>.
     */
    public final TableField<WebTaskInstanceRecord, LocalDateTime> SUBMIT_TIME = createField(DSL.name("submit_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>naudit.web_task_instance.begin_time</code>.
     */
    public final TableField<WebTaskInstanceRecord, LocalDateTime> BEGIN_TIME = createField(DSL.name("begin_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("'9999-12-31 23:59:59'", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>naudit.web_task_instance.end_time</code>.
     */
    public final TableField<WebTaskInstanceRecord, LocalDateTime> END_TIME = createField(DSL.name("end_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("'9999-12-31 23:59:59'", SQLDataType.LOCALDATETIME)), this, "");

    private WebTaskInstance(Name alias, Table<WebTaskInstanceRecord> aliased) {
        this(alias, aliased, null);
    }

    private WebTaskInstance(Name alias, Table<WebTaskInstanceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>naudit.web_task_instance</code> table reference
     */
    public WebTaskInstance(String alias) {
        this(DSL.name(alias), WEB_TASK_INSTANCE);
    }

    /**
     * Create an aliased <code>naudit.web_task_instance</code> table reference
     */
    public WebTaskInstance(Name alias) {
        this(alias, WEB_TASK_INSTANCE);
    }

    /**
     * Create a <code>naudit.web_task_instance</code> table reference
     */
    public WebTaskInstance() {
        this(DSL.name("web_task_instance"), null);
    }

    public <O extends Record> WebTaskInstance(Table<O> child, ForeignKey<O, WebTaskInstanceRecord> key) {
        super(child, key, WEB_TASK_INSTANCE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Naudit.NAUDIT;
    }

    @Override
    public Identity<WebTaskInstanceRecord, Long> getIdentity() {
        return (Identity<WebTaskInstanceRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<WebTaskInstanceRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_D6;
    }

    @Override
    public WebTaskInstance as(String alias) {
        return new WebTaskInstance(DSL.name(alias), this);
    }

    @Override
    public WebTaskInstance as(Name alias) {
        return new WebTaskInstance(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WebTaskInstance rename(String name) {
        return new WebTaskInstance(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WebTaskInstance rename(Name name) {
        return new WebTaskInstance(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, String, String, String, Integer, LocalDateTime, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
