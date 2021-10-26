/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit.tables;


import com.tengzhe.jooq.data.audit.Audit;
import com.tengzhe.jooq.data.audit.Keys;
import com.tengzhe.jooq.data.audit.tables.records.HuichuanIdeaKeyFrameRecord;

import java.math.BigDecimal;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class HuichuanIdeaKeyFrame extends TableImpl<HuichuanIdeaKeyFrameRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>audit.huichuan_idea_key_frame</code>
     */
    public static final HuichuanIdeaKeyFrame HUICHUAN_IDEA_KEY_FRAME = new HuichuanIdeaKeyFrame();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HuichuanIdeaKeyFrameRecord> getRecordType() {
        return HuichuanIdeaKeyFrameRecord.class;
    }

    /**
     * The column <code>audit.huichuan_idea_key_frame.id</code>.
     */
    public final TableField<HuichuanIdeaKeyFrameRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>audit.huichuan_idea_key_frame.user_id</code>.
     */
    public final TableField<HuichuanIdeaKeyFrameRecord, BigDecimal> USER_ID = createField(DSL.name("user_id"), SQLDataType.DECIMAL.nullable(false).defaultValue(DSL.field("-1", SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>audit.huichuan_idea_key_frame.idea_id</code>.
     */
    public final TableField<HuichuanIdeaKeyFrameRecord, Long> IDEA_ID = createField(DSL.name("idea_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("-1", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>audit.huichuan_idea_key_frame.video_url</code>.
     */
    public final TableField<HuichuanIdeaKeyFrameRecord, String> VIDEO_URL = createField(DSL.name("video_url"), SQLDataType.VARCHAR(256).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>audit.huichuan_idea_key_frame.content</code>.
     */
    public final TableField<HuichuanIdeaKeyFrameRecord, String> CONTENT = createField(DSL.name("content"), SQLDataType.CLOB.nullable(false), this, "");

    private HuichuanIdeaKeyFrame(Name alias, Table<HuichuanIdeaKeyFrameRecord> aliased) {
        this(alias, aliased, null);
    }

    private HuichuanIdeaKeyFrame(Name alias, Table<HuichuanIdeaKeyFrameRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>audit.huichuan_idea_key_frame</code> table
     * reference
     */
    public HuichuanIdeaKeyFrame(String alias) {
        this(DSL.name(alias), HUICHUAN_IDEA_KEY_FRAME);
    }

    /**
     * Create an aliased <code>audit.huichuan_idea_key_frame</code> table
     * reference
     */
    public HuichuanIdeaKeyFrame(Name alias) {
        this(alias, HUICHUAN_IDEA_KEY_FRAME);
    }

    /**
     * Create a <code>audit.huichuan_idea_key_frame</code> table reference
     */
    public HuichuanIdeaKeyFrame() {
        this(DSL.name("huichuan_idea_key_frame"), null);
    }

    public <O extends Record> HuichuanIdeaKeyFrame(Table<O> child, ForeignKey<O, HuichuanIdeaKeyFrameRecord> key) {
        super(child, key, HUICHUAN_IDEA_KEY_FRAME);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Audit.AUDIT;
    }

    @Override
    public Identity<HuichuanIdeaKeyFrameRecord, Long> getIdentity() {
        return (Identity<HuichuanIdeaKeyFrameRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<HuichuanIdeaKeyFrameRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_1;
    }

    @Override
    public HuichuanIdeaKeyFrame as(String alias) {
        return new HuichuanIdeaKeyFrame(DSL.name(alias), this);
    }

    @Override
    public HuichuanIdeaKeyFrame as(Name alias) {
        return new HuichuanIdeaKeyFrame(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HuichuanIdeaKeyFrame rename(String name) {
        return new HuichuanIdeaKeyFrame(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HuichuanIdeaKeyFrame rename(Name name) {
        return new HuichuanIdeaKeyFrame(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, BigDecimal, Long, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
