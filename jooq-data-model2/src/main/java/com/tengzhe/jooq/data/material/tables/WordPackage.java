/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables;


import com.tengzhe.jooq.data.material.Keys;
import com.tengzhe.jooq.data.material.Material;
import com.tengzhe.jooq.data.material.tables.records.WordPackageRecord;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
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
public class WordPackage extends TableImpl<WordPackageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>material.word_package</code>
     */
    public static final WordPackage WORD_PACKAGE = new WordPackage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WordPackageRecord> getRecordType() {
        return WordPackageRecord.class;
    }

    /**
     * The column <code>material.word_package.id</code>.
     */
    public final TableField<WordPackageRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>material.word_package.uc_id</code>.
     */
    public final TableField<WordPackageRecord, Long> UC_ID = createField(DSL.name("uc_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>material.word_package.user_id</code>.
     */
    public final TableField<WordPackageRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>material.word_package.package_name</code>.
     */
    public final TableField<WordPackageRecord, String> PACKAGE_NAME = createField(DSL.name("package_name"), SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column <code>material.word_package.package_type</code>.
     */
    public final TableField<WordPackageRecord, Integer> PACKAGE_TYPE = createField(DSL.name("package_type"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.word_package.default_word</code>.
     */
    public final TableField<WordPackageRecord, String> DEFAULT_WORD = createField(DSL.name("default_word"), SQLDataType.VARCHAR(256).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>material.word_package.version</code>.
     */
    public final TableField<WordPackageRecord, Long> VERSION = createField(DSL.name("version"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>material.word_package.state</code>.
     */
    public final TableField<WordPackageRecord, Integer> STATE = createField(DSL.name("state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.word_package.state_detail</code>.
     */
    public final TableField<WordPackageRecord, Integer> STATE_DETAIL = createField(DSL.name("state_detail"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.word_package.pair_state</code>.
     */
    public final TableField<WordPackageRecord, Integer> PAIR_STATE = createField(DSL.name("pair_state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("'0'", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.word_package.logic_state</code>.
     */
    public final TableField<WordPackageRecord, Integer> LOGIC_STATE = createField(DSL.name("logic_state"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>material.word_package.create_time</code>.
     */
    public final TableField<WordPackageRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>material.word_package.modify_time</code>.
     */
    public final TableField<WordPackageRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private WordPackage(Name alias, Table<WordPackageRecord> aliased) {
        this(alias, aliased, null);
    }

    private WordPackage(Name alias, Table<WordPackageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>material.word_package</code> table reference
     */
    public WordPackage(String alias) {
        this(DSL.name(alias), WORD_PACKAGE);
    }

    /**
     * Create an aliased <code>material.word_package</code> table reference
     */
    public WordPackage(Name alias) {
        this(alias, WORD_PACKAGE);
    }

    /**
     * Create a <code>material.word_package</code> table reference
     */
    public WordPackage() {
        this(DSL.name("word_package"), null);
    }

    public <O extends Record> WordPackage(Table<O> child, ForeignKey<O, WordPackageRecord> key) {
        super(child, key, WORD_PACKAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Material.MATERIAL;
    }

    @Override
    public Identity<WordPackageRecord, Long> getIdentity() {
        return (Identity<WordPackageRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<WordPackageRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_3;
    }

    @Override
    public WordPackage as(String alias) {
        return new WordPackage(DSL.name(alias), this);
    }

    @Override
    public WordPackage as(Name alias) {
        return new WordPackage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WordPackage rename(String name) {
        return new WordPackage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WordPackage rename(Name name) {
        return new WordPackage(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, Long, Long, String, Integer, String, Long, Integer, Integer, Integer, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
