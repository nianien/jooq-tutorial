/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables;


import com.tengzhe.jooq.data.material.Keys;
import com.tengzhe.jooq.data.material.Material;
import com.tengzhe.jooq.data.material.tables.records.MaterialAllocationHistoryRecord;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
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
public class MaterialAllocationHistory extends TableImpl<MaterialAllocationHistoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>material.material_allocation_history</code>
     */
    public static final MaterialAllocationHistory MATERIAL_ALLOCATION_HISTORY = new MaterialAllocationHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MaterialAllocationHistoryRecord> getRecordType() {
        return MaterialAllocationHistoryRecord.class;
    }

    /**
     * The column <code>material.material_allocation_history.id</code>.
     */
    public final TableField<MaterialAllocationHistoryRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>material.material_allocation_history.type</code>.
     */
    public final TableField<MaterialAllocationHistoryRecord, Integer> TYPE = createField(DSL.name("type"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>material.material_allocation_history.entity_id</code>.
     */
    public final TableField<MaterialAllocationHistoryRecord, Long> ENTITY_ID = createField(DSL.name("entity_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>material.material_allocation_history.auditor_id</code>.
     */
    public final TableField<MaterialAllocationHistoryRecord, Long> AUDITOR_ID = createField(DSL.name("auditor_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>material.material_allocation_history.allocation_time</code>.
     */
    public final TableField<MaterialAllocationHistoryRecord, LocalDateTime> ALLOCATION_TIME = createField(DSL.name("allocation_time"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>material.material_allocation_history.create_time</code>.
     */
    public final TableField<MaterialAllocationHistoryRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>material.material_allocation_history.modify_time</code>.
     */
    public final TableField<MaterialAllocationHistoryRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private MaterialAllocationHistory(Name alias, Table<MaterialAllocationHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private MaterialAllocationHistory(Name alias, Table<MaterialAllocationHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>material.material_allocation_history</code> table
     * reference
     */
    public MaterialAllocationHistory(String alias) {
        this(DSL.name(alias), MATERIAL_ALLOCATION_HISTORY);
    }

    /**
     * Create an aliased <code>material.material_allocation_history</code> table
     * reference
     */
    public MaterialAllocationHistory(Name alias) {
        this(alias, MATERIAL_ALLOCATION_HISTORY);
    }

    /**
     * Create a <code>material.material_allocation_history</code> table
     * reference
     */
    public MaterialAllocationHistory() {
        this(DSL.name("material_allocation_history"), null);
    }

    public <O extends Record> MaterialAllocationHistory(Table<O> child, ForeignKey<O, MaterialAllocationHistoryRecord> key) {
        super(child, key, MATERIAL_ALLOCATION_HISTORY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Material.MATERIAL;
    }

    @Override
    public Identity<MaterialAllocationHistoryRecord, Long> getIdentity() {
        return (Identity<MaterialAllocationHistoryRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<MaterialAllocationHistoryRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_C3;
    }

    @Override
    public MaterialAllocationHistory as(String alias) {
        return new MaterialAllocationHistory(DSL.name(alias), this);
    }

    @Override
    public MaterialAllocationHistory as(Name alias) {
        return new MaterialAllocationHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MaterialAllocationHistory rename(String name) {
        return new MaterialAllocationHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MaterialAllocationHistory rename(Name name) {
        return new MaterialAllocationHistory(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, Integer, Long, Long, LocalDateTime, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}