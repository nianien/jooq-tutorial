/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit.tables;


import com.jooq.predefine.converter.LocalDateTime2DateConverter;
import com.tengzhe.jooq.data.audit.Audit;
import com.tengzhe.jooq.data.audit.Keys;
import com.tengzhe.jooq.data.audit.tables.records.UserInfoConfigRecord;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserInfoConfig extends TableImpl<UserInfoConfigRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>audit.user_info_config</code>
     */
    public static final UserInfoConfig USER_INFO_CONFIG = new UserInfoConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserInfoConfigRecord> getRecordType() {
        return UserInfoConfigRecord.class;
    }

    /**
     * The column <code>audit.user_info_config.id</code>.
     */
    public final TableField<UserInfoConfigRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>audit.user_info_config.userid</code>.
     */
    public final TableField<UserInfoConfigRecord, Long> USERID = createField(DSL.name("userid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>audit.user_info_config.priority</code>.
     */
    public final TableField<UserInfoConfigRecord, Long> PRIORITY = createField(DSL.name("priority"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'0'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>audit.user_info_config.max_version</code>.
     */
    public final TableField<UserInfoConfigRecord, Long> MAX_VERSION = createField(DSL.name("max_version"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'0'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>audit.user_info_config.min_version</code>.
     */
    public final TableField<UserInfoConfigRecord, Long> MIN_VERSION = createField(DSL.name("min_version"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'0'", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>audit.user_info_config.create_time</code>.
     */
    public final TableField<UserInfoConfigRecord, Date> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("'2010-01-01 00:00:00'", SQLDataType.LOCALDATETIME)), this, "", new LocalDateTime2DateConverter());

    /**
     * The column <code>audit.user_info_config.modify_time</code>.
     */
    public final TableField<UserInfoConfigRecord, Date> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "", new LocalDateTime2DateConverter());

    /**
     * The column <code>audit.user_info_config.auditor_id</code>.
     */
    public final TableField<UserInfoConfigRecord, Long> AUDITOR_ID = createField(DSL.name("auditor_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("'-1'", SQLDataType.BIGINT)), this, "");

    private UserInfoConfig(Name alias, Table<UserInfoConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserInfoConfig(Name alias, Table<UserInfoConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>audit.user_info_config</code> table reference
     */
    public UserInfoConfig(String alias) {
        this(DSL.name(alias), USER_INFO_CONFIG);
    }

    /**
     * Create an aliased <code>audit.user_info_config</code> table reference
     */
    public UserInfoConfig(Name alias) {
        this(alias, USER_INFO_CONFIG);
    }

    /**
     * Create a <code>audit.user_info_config</code> table reference
     */
    public UserInfoConfig() {
        this(DSL.name("user_info_config"), null);
    }

    public <O extends Record> UserInfoConfig(Table<O> child, ForeignKey<O, UserInfoConfigRecord> key) {
        super(child, key, USER_INFO_CONFIG);
    }

    @Override
    public Schema getSchema() {
        return Audit.AUDIT;
    }

    @Override
    public Identity<UserInfoConfigRecord, Long> getIdentity() {
        return (Identity<UserInfoConfigRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<UserInfoConfigRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_1A;
    }

    @Override
    public List<UniqueKey<UserInfoConfigRecord>> getKeys() {
        return Arrays.<UniqueKey<UserInfoConfigRecord>>asList(Keys.CONSTRAINT_1A);
    }

    @Override
    public UserInfoConfig as(String alias) {
        return new UserInfoConfig(DSL.name(alias), this);
    }

    @Override
    public UserInfoConfig as(Name alias) {
        return new UserInfoConfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserInfoConfig rename(String name) {
        return new UserInfoConfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserInfoConfig rename(Name name) {
        return new UserInfoConfig(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, Long, Long, Long, Long, Date, Date, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
