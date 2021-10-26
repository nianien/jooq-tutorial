/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables;


import com.tengzhe.jooq.data.material.Keys;
import com.tengzhe.jooq.data.material.Material;
import com.tengzhe.jooq.data.material.tables.records.PendingVideoMaterialRecord;

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
public class PendingVideoMaterial extends TableImpl<PendingVideoMaterialRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>material.pending_video_material</code>
     */
    public static final PendingVideoMaterial PENDING_VIDEO_MATERIAL = new PendingVideoMaterial();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PendingVideoMaterialRecord> getRecordType() {
        return PendingVideoMaterialRecord.class;
    }

    /**
     * The column <code>material.pending_video_material.id</code>.
     */
    public final TableField<PendingVideoMaterialRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>material.pending_video_material.user_id</code>.
     */
    public final TableField<PendingVideoMaterialRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("0", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.pending_video_material.entity_id</code>.
     */
    public final TableField<PendingVideoMaterialRecord, Long> ENTITY_ID = createField(DSL.name("entity_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("0", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.pending_video_material.route</code>.
     */
    public final TableField<PendingVideoMaterialRecord, Integer> ROUTE = createField(DSL.name("route"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.pending_video_material.auditor_id</code>.
     */
    public final TableField<PendingVideoMaterialRecord, Long> AUDITOR_ID = createField(DSL.name("auditor_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.pending_video_material.video_time</code>.
     */
    public final TableField<PendingVideoMaterialRecord, LocalDateTime> VIDEO_TIME = createField(DSL.name("video_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>material.pending_video_material.state</code>.
     */
    public final TableField<PendingVideoMaterialRecord, Integer> STATE = createField(DSL.name("state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("1", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.pending_video_material.create_time</code>.
     */
    public final TableField<PendingVideoMaterialRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>material.pending_video_material.modify_time</code>.
     */
    public final TableField<PendingVideoMaterialRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private PendingVideoMaterial(Name alias, Table<PendingVideoMaterialRecord> aliased) {
        this(alias, aliased, null);
    }

    private PendingVideoMaterial(Name alias, Table<PendingVideoMaterialRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>material.pending_video_material</code> table
     * reference
     */
    public PendingVideoMaterial(String alias) {
        this(DSL.name(alias), PENDING_VIDEO_MATERIAL);
    }

    /**
     * Create an aliased <code>material.pending_video_material</code> table
     * reference
     */
    public PendingVideoMaterial(Name alias) {
        this(alias, PENDING_VIDEO_MATERIAL);
    }

    /**
     * Create a <code>material.pending_video_material</code> table reference
     */
    public PendingVideoMaterial() {
        this(DSL.name("pending_video_material"), null);
    }

    public <O extends Record> PendingVideoMaterial(Table<O> child, ForeignKey<O, PendingVideoMaterialRecord> key) {
        super(child, key, PENDING_VIDEO_MATERIAL);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Material.MATERIAL;
    }

    @Override
    public Identity<PendingVideoMaterialRecord, Long> getIdentity() {
        return (Identity<PendingVideoMaterialRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<PendingVideoMaterialRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_C68B;
    }

    @Override
    public PendingVideoMaterial as(String alias) {
        return new PendingVideoMaterial(DSL.name(alias), this);
    }

    @Override
    public PendingVideoMaterial as(Name alias) {
        return new PendingVideoMaterial(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PendingVideoMaterial rename(String name) {
        return new PendingVideoMaterial(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PendingVideoMaterial rename(Name name) {
        return new PendingVideoMaterial(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, Long, Integer, Long, LocalDateTime, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
