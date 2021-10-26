/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables;


import com.tengzhe.jooq.data.material.Keys;
import com.tengzhe.jooq.data.material.Material;
import com.tengzhe.jooq.data.material.tables.records.AuditVideoExchangeOrderRecord;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row15;
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
public class AuditVideoExchangeOrder extends TableImpl<AuditVideoExchangeOrderRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>material.audit_video_exchange_order</code>
     */
    public static final AuditVideoExchangeOrder AUDIT_VIDEO_EXCHANGE_ORDER = new AuditVideoExchangeOrder();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuditVideoExchangeOrderRecord> getRecordType() {
        return AuditVideoExchangeOrderRecord.class;
    }

    /**
     * The column <code>material.audit_video_exchange_order.id</code>.
     */
    public final TableField<AuditVideoExchangeOrderRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>material.audit_video_exchange_order.entity_id</code>.
     */
    public final TableField<AuditVideoExchangeOrderRecord, Long> ENTITY_ID = createField(DSL.name("entity_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.audit_video_exchange_order.version</code>.
     */
    public final TableField<AuditVideoExchangeOrderRecord, Long> VERSION = createField(DSL.name("version"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.audit_video_exchange_order.audit_type</code>.
     */
    public final TableField<AuditVideoExchangeOrderRecord, Integer> AUDIT_TYPE = createField(DSL.name("audit_type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.audit_video_exchange_order.user_id</code>.
     */
    public final TableField<AuditVideoExchangeOrderRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.audit_video_exchange_order.audit_state</code>.
     */
    public final TableField<AuditVideoExchangeOrderRecord, Integer> AUDIT_STATE = createField(DSL.name("audit_state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.audit_video_exchange_order.auditor_id</code>.
     */
    public final TableField<AuditVideoExchangeOrderRecord, Long> AUDITOR_ID = createField(DSL.name("auditor_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.audit_video_exchange_order.reason_code</code>.
     */
    public final TableField<AuditVideoExchangeOrderRecord, String> REASON_CODE = createField(DSL.name("reason_code"), SQLDataType.VARCHAR(4096).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>material.audit_video_exchange_order.reason</code>.
     */
    public final TableField<AuditVideoExchangeOrderRecord, String> REASON = createField(DSL.name("reason"), SQLDataType.VARCHAR(4096).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>material.audit_video_exchange_order.audit_start_time</code>.
     */
    public final TableField<AuditVideoExchangeOrderRecord, LocalDateTime> AUDIT_START_TIME = createField(DSL.name("audit_start_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column
     * <code>material.audit_video_exchange_order.audit_end_time</code>.
     */
    public final TableField<AuditVideoExchangeOrderRecord, LocalDateTime> AUDIT_END_TIME = createField(DSL.name("audit_end_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("'2000-01-01 00:00:00'", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>material.audit_video_exchange_order.extend</code>.
     */
    public final TableField<AuditVideoExchangeOrderRecord, String> EXTEND = createField(DSL.name("extend"), SQLDataType.VARCHAR(4096).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>material.audit_video_exchange_order.modify_time</code>.
     */
    public final TableField<AuditVideoExchangeOrderRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column
     * <code>material.audit_video_exchange_order.modify_day_tag</code>.
     */
    public final TableField<AuditVideoExchangeOrderRecord, Integer> MODIFY_DAY_TAG = createField(DSL.name("modify_day_tag"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.audit_video_exchange_order.create_time</code>.
     */
    public final TableField<AuditVideoExchangeOrderRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private AuditVideoExchangeOrder(Name alias, Table<AuditVideoExchangeOrderRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuditVideoExchangeOrder(Name alias, Table<AuditVideoExchangeOrderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>material.audit_video_exchange_order</code> table
     * reference
     */
    public AuditVideoExchangeOrder(String alias) {
        this(DSL.name(alias), AUDIT_VIDEO_EXCHANGE_ORDER);
    }

    /**
     * Create an aliased <code>material.audit_video_exchange_order</code> table
     * reference
     */
    public AuditVideoExchangeOrder(Name alias) {
        this(alias, AUDIT_VIDEO_EXCHANGE_ORDER);
    }

    /**
     * Create a <code>material.audit_video_exchange_order</code> table reference
     */
    public AuditVideoExchangeOrder() {
        this(DSL.name("audit_video_exchange_order"), null);
    }

    public <O extends Record> AuditVideoExchangeOrder(Table<O> child, ForeignKey<O, AuditVideoExchangeOrderRecord> key) {
        super(child, key, AUDIT_VIDEO_EXCHANGE_ORDER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Material.MATERIAL;
    }

    @Override
    public Identity<AuditVideoExchangeOrderRecord, Long> getIdentity() {
        return (Identity<AuditVideoExchangeOrderRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<AuditVideoExchangeOrderRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_78;
    }

    @Override
    public AuditVideoExchangeOrder as(String alias) {
        return new AuditVideoExchangeOrder(DSL.name(alias), this);
    }

    @Override
    public AuditVideoExchangeOrder as(Name alias) {
        return new AuditVideoExchangeOrder(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditVideoExchangeOrder rename(String name) {
        return new AuditVideoExchangeOrder(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditVideoExchangeOrder rename(Name name) {
        return new AuditVideoExchangeOrder(name, null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<Long, Long, Long, Integer, Long, Integer, Long, String, String, LocalDateTime, LocalDateTime, String, LocalDateTime, Integer, LocalDateTime> fieldsRow() {
        return (Row15) super.fieldsRow();
    }
}
