/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_wolong.tables;


import com.tengzhe.jooq.data.audit_wolong.AuditWolong;
import com.tengzhe.jooq.data.audit_wolong.Keys;
import com.tengzhe.jooq.data.audit_wolong.tables.records.AuditMaterialListStateRecord;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
public class AuditMaterialListState extends TableImpl<AuditMaterialListStateRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>audit_wolong.audit_material_list_state</code>
     */
    public static final AuditMaterialListState AUDIT_MATERIAL_LIST_STATE = new AuditMaterialListState();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuditMaterialListStateRecord> getRecordType() {
        return AuditMaterialListStateRecord.class;
    }

    /**
     * The column <code>audit_wolong.audit_material_list_state.userid</code>.
     */
    public final TableField<AuditMaterialListStateRecord, Long> USERID = createField(DSL.name("userid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>audit_wolong.audit_material_list_state.source</code>.
     */
    public final TableField<AuditMaterialListStateRecord, Integer> SOURCE = createField(DSL.name("source"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>audit_wolong.audit_material_list_state.suspend_status</code>.
     */
    public final TableField<AuditMaterialListStateRecord, Integer> SUSPEND_STATUS = createField(DSL.name("suspend_status"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>audit_wolong.audit_material_list_state.suspend_time</code>.
     */
    public final TableField<AuditMaterialListStateRecord, LocalDateTime> SUSPEND_TIME = createField(DSL.name("suspend_time"), SQLDataType.LOCALDATETIME(6).defaultValue(DSL.field("NULL", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column
     * <code>audit_wolong.audit_material_list_state.create_time</code>.
     */
    public final TableField<AuditMaterialListStateRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("'0000-00-00 00:00:00'", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column
     * <code>audit_wolong.audit_material_list_state.modify_time</code>.
     */
    public final TableField<AuditMaterialListStateRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private AuditMaterialListState(Name alias, Table<AuditMaterialListStateRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuditMaterialListState(Name alias, Table<AuditMaterialListStateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>audit_wolong.audit_material_list_state</code>
     * table reference
     */
    public AuditMaterialListState(String alias) {
        this(DSL.name(alias), AUDIT_MATERIAL_LIST_STATE);
    }

    /**
     * Create an aliased <code>audit_wolong.audit_material_list_state</code>
     * table reference
     */
    public AuditMaterialListState(Name alias) {
        this(alias, AUDIT_MATERIAL_LIST_STATE);
    }

    /**
     * Create a <code>audit_wolong.audit_material_list_state</code> table
     * reference
     */
    public AuditMaterialListState() {
        this(DSL.name("audit_material_list_state"), null);
    }

    public <O extends Record> AuditMaterialListState(Table<O> child, ForeignKey<O, AuditMaterialListStateRecord> key) {
        super(child, key, AUDIT_MATERIAL_LIST_STATE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : AuditWolong.AUDIT_WOLONG;
    }

    @Override
    public UniqueKey<AuditMaterialListStateRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_5;
    }

    @Override
    public AuditMaterialListState as(String alias) {
        return new AuditMaterialListState(DSL.name(alias), this);
    }

    @Override
    public AuditMaterialListState as(Name alias) {
        return new AuditMaterialListState(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditMaterialListState rename(String name) {
        return new AuditMaterialListState(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditMaterialListState rename(Name name) {
        return new AuditMaterialListState(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, Integer, Integer, LocalDateTime, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
