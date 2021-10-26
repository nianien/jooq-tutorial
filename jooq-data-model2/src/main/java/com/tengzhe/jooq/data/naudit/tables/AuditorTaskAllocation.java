/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.naudit.tables;


import com.tengzhe.jooq.data.naudit.Keys;
import com.tengzhe.jooq.data.naudit.Naudit;
import com.tengzhe.jooq.data.naudit.tables.records.AuditorTaskAllocationRecord;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
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
public class AuditorTaskAllocation extends TableImpl<AuditorTaskAllocationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>naudit.auditor_task_allocation</code>
     */
    public static final AuditorTaskAllocation AUDITOR_TASK_ALLOCATION = new AuditorTaskAllocation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuditorTaskAllocationRecord> getRecordType() {
        return AuditorTaskAllocationRecord.class;
    }

    /**
     * The column <code>naudit.auditor_task_allocation.id</code>.
     */
    public final TableField<AuditorTaskAllocationRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>naudit.auditor_task_allocation.type</code>.
     */
    public final TableField<AuditorTaskAllocationRecord, Integer> TYPE = createField(DSL.name("type"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>naudit.auditor_task_allocation.biz_type</code>.
     */
    public final TableField<AuditorTaskAllocationRecord, Integer> BIZ_TYPE = createField(DSL.name("biz_type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>naudit.auditor_task_allocation.source</code>.
     */
    public final TableField<AuditorTaskAllocationRecord, Integer> SOURCE = createField(DSL.name("source"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("-1", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>naudit.auditor_task_allocation.status</code>.
     */
    public final TableField<AuditorTaskAllocationRecord, Integer> STATUS = createField(DSL.name("status"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>naudit.auditor_task_allocation.auditor_id</code>.
     */
    public final TableField<AuditorTaskAllocationRecord, String> AUDITOR_ID = createField(DSL.name("auditor_id"), SQLDataType.VARCHAR(4096).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>naudit.auditor_task_allocation.begin_date</code>.
     */
    public final TableField<AuditorTaskAllocationRecord, LocalDate> BEGIN_DATE = createField(DSL.name("begin_date"), SQLDataType.LOCALDATE.defaultValue(DSL.field("NULL", SQLDataType.LOCALDATE)), this, "");

    /**
     * The column <code>naudit.auditor_task_allocation.end_date</code>.
     */
    public final TableField<AuditorTaskAllocationRecord, LocalDate> END_DATE = createField(DSL.name("end_date"), SQLDataType.LOCALDATE.defaultValue(DSL.field("NULL", SQLDataType.LOCALDATE)), this, "");

    /**
     * The column <code>naudit.auditor_task_allocation.logic_state</code>.
     */
    public final TableField<AuditorTaskAllocationRecord, Integer> LOGIC_STATE = createField(DSL.name("logic_state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>naudit.auditor_task_allocation.create_time</code>.
     */
    public final TableField<AuditorTaskAllocationRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>naudit.auditor_task_allocation.modify_time</code>.
     */
    public final TableField<AuditorTaskAllocationRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private AuditorTaskAllocation(Name alias, Table<AuditorTaskAllocationRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuditorTaskAllocation(Name alias, Table<AuditorTaskAllocationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>naudit.auditor_task_allocation</code> table
     * reference
     */
    public AuditorTaskAllocation(String alias) {
        this(DSL.name(alias), AUDITOR_TASK_ALLOCATION);
    }

    /**
     * Create an aliased <code>naudit.auditor_task_allocation</code> table
     * reference
     */
    public AuditorTaskAllocation(Name alias) {
        this(alias, AUDITOR_TASK_ALLOCATION);
    }

    /**
     * Create a <code>naudit.auditor_task_allocation</code> table reference
     */
    public AuditorTaskAllocation() {
        this(DSL.name("auditor_task_allocation"), null);
    }

    public <O extends Record> AuditorTaskAllocation(Table<O> child, ForeignKey<O, AuditorTaskAllocationRecord> key) {
        super(child, key, AUDITOR_TASK_ALLOCATION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Naudit.NAUDIT;
    }

    @Override
    public Identity<AuditorTaskAllocationRecord, Long> getIdentity() {
        return (Identity<AuditorTaskAllocationRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<AuditorTaskAllocationRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_9B;
    }

    @Override
    public AuditorTaskAllocation as(String alias) {
        return new AuditorTaskAllocation(DSL.name(alias), this);
    }

    @Override
    public AuditorTaskAllocation as(Name alias) {
        return new AuditorTaskAllocation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditorTaskAllocation rename(String name) {
        return new AuditorTaskAllocation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditorTaskAllocation rename(Name name) {
        return new AuditorTaskAllocation(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, Integer, Integer, Integer, Integer, String, LocalDate, LocalDate, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}