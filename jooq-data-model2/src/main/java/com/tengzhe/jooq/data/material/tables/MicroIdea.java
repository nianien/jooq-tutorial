/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables;


import com.tengzhe.jooq.data.material.Keys;
import com.tengzhe.jooq.data.material.Material;
import com.tengzhe.jooq.data.material.tables.records.MicroIdeaRecord;

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
public class MicroIdea extends TableImpl<MicroIdeaRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>material.micro_idea</code>
     */
    public static final MicroIdea MICRO_IDEA = new MicroIdea();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MicroIdeaRecord> getRecordType() {
        return MicroIdeaRecord.class;
    }

    /**
     * The column <code>material.micro_idea.id</code>.
     */
    public final TableField<MicroIdeaRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>material.micro_idea.user_id</code>.
     */
    public final TableField<MicroIdeaRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>material.micro_idea.type</code>.
     */
    public final TableField<MicroIdeaRecord, Integer> TYPE = createField(DSL.name("type"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>material.micro_idea.ad_style_id</code>.
     */
    public final TableField<MicroIdeaRecord, Integer> AD_STYLE_ID = createField(DSL.name("ad_style_id"), SQLDataType.INTEGER.defaultValue(DSL.field("NULL", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.micro_idea.content</code>.
     */
    public final TableField<MicroIdeaRecord, String> CONTENT = createField(DSL.name("content"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>material.micro_idea.libs</code>.
     */
    public final TableField<MicroIdeaRecord, String> LIBS = createField(DSL.name("libs"), SQLDataType.VARCHAR(1024).nullable(false).defaultValue(DSL.field("'[]'", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>material.micro_idea.platform</code>.
     */
    public final TableField<MicroIdeaRecord, Integer> PLATFORM = createField(DSL.name("platform"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("1", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.micro_idea.logic_state</code>.
     */
    public final TableField<MicroIdeaRecord, Integer> LOGIC_STATE = createField(DSL.name("logic_state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'0'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.micro_idea.version</code>.
     */
    public final TableField<MicroIdeaRecord, Long> VERSION = createField(DSL.name("version"), SQLDataType.BIGINT.defaultValue(DSL.field("NULL", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>material.micro_idea.submit_time</code>.
     */
    public final TableField<MicroIdeaRecord, LocalDateTime> SUBMIT_TIME = createField(DSL.name("submit_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>material.micro_idea.expired_time</code>.
     */
    public final TableField<MicroIdeaRecord, LocalDateTime> EXPIRED_TIME = createField(DSL.name("expired_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>material.micro_idea.state</code>.
     */
    public final TableField<MicroIdeaRecord, Integer> STATE = createField(DSL.name("state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.micro_idea.state_detail</code>.
     */
    public final TableField<MicroIdeaRecord, Integer> STATE_DETAIL = createField(DSL.name("state_detail"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.micro_idea.create_time</code>.
     */
    public final TableField<MicroIdeaRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>material.micro_idea.modify_time</code>.
     */
    public final TableField<MicroIdeaRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private MicroIdea(Name alias, Table<MicroIdeaRecord> aliased) {
        this(alias, aliased, null);
    }

    private MicroIdea(Name alias, Table<MicroIdeaRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>material.micro_idea</code> table reference
     */
    public MicroIdea(String alias) {
        this(DSL.name(alias), MICRO_IDEA);
    }

    /**
     * Create an aliased <code>material.micro_idea</code> table reference
     */
    public MicroIdea(Name alias) {
        this(alias, MICRO_IDEA);
    }

    /**
     * Create a <code>material.micro_idea</code> table reference
     */
    public MicroIdea() {
        this(DSL.name("micro_idea"), null);
    }

    public <O extends Record> MicroIdea(Table<O> child, ForeignKey<O, MicroIdeaRecord> key) {
        super(child, key, MICRO_IDEA);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Material.MATERIAL;
    }

    @Override
    public Identity<MicroIdeaRecord, Long> getIdentity() {
        return (Identity<MicroIdeaRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<MicroIdeaRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_50C;
    }

    @Override
    public MicroIdea as(String alias) {
        return new MicroIdea(DSL.name(alias), this);
    }

    @Override
    public MicroIdea as(Name alias) {
        return new MicroIdea(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MicroIdea rename(String name) {
        return new MicroIdea(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MicroIdea rename(Name name) {
        return new MicroIdea(name, null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<Long, Long, Integer, Integer, String, String, Integer, Integer, Long, LocalDateTime, LocalDateTime, Integer, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row15) super.fieldsRow();
    }
}
