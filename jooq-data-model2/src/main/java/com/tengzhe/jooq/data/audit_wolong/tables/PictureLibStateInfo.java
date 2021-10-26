/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_wolong.tables;


import com.tengzhe.jooq.data.audit_wolong.AuditWolong;
import com.tengzhe.jooq.data.audit_wolong.Keys;
import com.tengzhe.jooq.data.audit_wolong.tables.records.PictureLibStateInfoRecord;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class PictureLibStateInfo extends TableImpl<PictureLibStateInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>audit_wolong.picture_lib_state_info</code>
     */
    public static final PictureLibStateInfo PICTURE_LIB_STATE_INFO = new PictureLibStateInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PictureLibStateInfoRecord> getRecordType() {
        return PictureLibStateInfoRecord.class;
    }

    /**
     * The column <code>audit_wolong.picture_lib_state_info.id</code>.
     */
    public final TableField<PictureLibStateInfoRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>audit_wolong.picture_lib_state_info.userid</code>.
     */
    public final TableField<PictureLibStateInfoRecord, Long> USERID = createField(DSL.name("userid"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>audit_wolong.picture_lib_state_info.version</code>.
     */
    public final TableField<PictureLibStateInfoRecord, Long> VERSION = createField(DSL.name("version"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>audit_wolong.picture_lib_state_info.state</code>.
     */
    public final TableField<PictureLibStateInfoRecord, Integer> STATE = createField(DSL.name("state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>audit_wolong.picture_lib_state_info.auto_state</code>.
     */
    public final TableField<PictureLibStateInfoRecord, Integer> AUTO_STATE = createField(DSL.name("auto_state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>audit_wolong.picture_lib_state_info.auto_version</code>.
     */
    public final TableField<PictureLibStateInfoRecord, Long> AUTO_VERSION = createField(DSL.name("auto_version"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>audit_wolong.picture_lib_state_info.auto_reason</code>.
     */
    public final TableField<PictureLibStateInfoRecord, String> AUTO_REASON = createField(DSL.name("auto_reason"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>audit_wolong.picture_lib_state_info.manual_state</code>.
     */
    public final TableField<PictureLibStateInfoRecord, Integer> MANUAL_STATE = createField(DSL.name("manual_state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>audit_wolong.picture_lib_state_info.manual_version</code>.
     */
    public final TableField<PictureLibStateInfoRecord, Long> MANUAL_VERSION = createField(DSL.name("manual_version"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column
     * <code>audit_wolong.picture_lib_state_info.manual_reason</code>.
     */
    public final TableField<PictureLibStateInfoRecord, String> MANUAL_REASON = createField(DSL.name("manual_reason"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>audit_wolong.picture_lib_state_info.auditor_id</code>.
     */
    public final TableField<PictureLibStateInfoRecord, Long> AUDITOR_ID = createField(DSL.name("auditor_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>audit_wolong.picture_lib_state_info.audit_time</code>.
     */
    public final TableField<PictureLibStateInfoRecord, LocalDateTime> AUDIT_TIME = createField(DSL.name("audit_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("'1999-01-01 00:00:00'", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>audit_wolong.picture_lib_state_info.create_time</code>.
     */
    public final TableField<PictureLibStateInfoRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>audit_wolong.picture_lib_state_info.modify_time</code>.
     */
    public final TableField<PictureLibStateInfoRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column
     * <code>audit_wolong.picture_lib_state_info.manual_auditor_id</code>.
     */
    public final TableField<PictureLibStateInfoRecord, Long> MANUAL_AUDITOR_ID = createField(DSL.name("manual_auditor_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column
     * <code>audit_wolong.picture_lib_state_info.manual_audit_time</code>.
     */
    public final TableField<PictureLibStateInfoRecord, LocalDateTime> MANUAL_AUDIT_TIME = createField(DSL.name("manual_audit_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("'1999-01-01 00:00:00'", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column
     * <code>audit_wolong.picture_lib_state_info.auto_auditor_id</code>.
     */
    public final TableField<PictureLibStateInfoRecord, Long> AUTO_AUDITOR_ID = createField(DSL.name("auto_auditor_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column
     * <code>audit_wolong.picture_lib_state_info.auto_audit_time</code>.
     */
    public final TableField<PictureLibStateInfoRecord, LocalDateTime> AUTO_AUDIT_TIME = createField(DSL.name("auto_audit_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("'1999-01-01 00:00:00'", SQLDataType.LOCALDATETIME)), this, "");

    private PictureLibStateInfo(Name alias, Table<PictureLibStateInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private PictureLibStateInfo(Name alias, Table<PictureLibStateInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>audit_wolong.picture_lib_state_info</code> table
     * reference
     */
    public PictureLibStateInfo(String alias) {
        this(DSL.name(alias), PICTURE_LIB_STATE_INFO);
    }

    /**
     * Create an aliased <code>audit_wolong.picture_lib_state_info</code> table
     * reference
     */
    public PictureLibStateInfo(Name alias) {
        this(alias, PICTURE_LIB_STATE_INFO);
    }

    /**
     * Create a <code>audit_wolong.picture_lib_state_info</code> table reference
     */
    public PictureLibStateInfo() {
        this(DSL.name("picture_lib_state_info"), null);
    }

    public <O extends Record> PictureLibStateInfo(Table<O> child, ForeignKey<O, PictureLibStateInfoRecord> key) {
        super(child, key, PICTURE_LIB_STATE_INFO);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : AuditWolong.AUDIT_WOLONG;
    }

    @Override
    public Identity<PictureLibStateInfoRecord, Long> getIdentity() {
        return (Identity<PictureLibStateInfoRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<PictureLibStateInfoRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_25;
    }

    @Override
    public PictureLibStateInfo as(String alias) {
        return new PictureLibStateInfo(DSL.name(alias), this);
    }

    @Override
    public PictureLibStateInfo as(Name alias) {
        return new PictureLibStateInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PictureLibStateInfo rename(String name) {
        return new PictureLibStateInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PictureLibStateInfo rename(Name name) {
        return new PictureLibStateInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<Long, Long, Long, Integer, Integer, Long, String, Integer, Long, String, Long, LocalDateTime, LocalDateTime, LocalDateTime, Long, LocalDateTime, Long, LocalDateTime> fieldsRow() {
        return (Row18) super.fieldsRow();
    }
}