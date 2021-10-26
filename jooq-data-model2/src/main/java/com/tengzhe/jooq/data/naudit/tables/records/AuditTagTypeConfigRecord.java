/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.naudit.tables.records;


import com.tengzhe.jooq.data.naudit.tables.AuditTagTypeConfig;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class AuditTagTypeConfigRecord extends UpdatableRecordImpl<AuditTagTypeConfigRecord> implements Record6<Long, String, String, Integer, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>naudit.audit_tag_type_config.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>naudit.audit_tag_type_config.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>naudit.audit_tag_type_config.category</code>.
     */
    public void setCategory(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>naudit.audit_tag_type_config.category</code>.
     */
    public String getCategory() {
        return (String) get(1);
    }

    /**
     * Setter for <code>naudit.audit_tag_type_config.desc</code>.
     */
    public void setDesc(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>naudit.audit_tag_type_config.desc</code>.
     */
    public String getDesc() {
        return (String) get(2);
    }

    /**
     * Setter for <code>naudit.audit_tag_type_config.repeated</code>.
     */
    public void setRepeated(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>naudit.audit_tag_type_config.repeated</code>.
     */
    public Integer getRepeated() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>naudit.audit_tag_type_config.delivery</code>.
     */
    public void setDelivery(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>naudit.audit_tag_type_config.delivery</code>.
     */
    public Integer getDelivery() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>naudit.audit_tag_type_config.remark</code>.
     */
    public void setRemark(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>naudit.audit_tag_type_config.remark</code>.
     */
    public String getRemark() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, String, Integer, Integer, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, String, String, Integer, Integer, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AuditTagTypeConfig.AUDIT_TAG_TYPE_CONFIG.ID;
    }

    @Override
    public Field<String> field2() {
        return AuditTagTypeConfig.AUDIT_TAG_TYPE_CONFIG.CATEGORY;
    }

    @Override
    public Field<String> field3() {
        return AuditTagTypeConfig.AUDIT_TAG_TYPE_CONFIG.DESC;
    }

    @Override
    public Field<Integer> field4() {
        return AuditTagTypeConfig.AUDIT_TAG_TYPE_CONFIG.REPEATED;
    }

    @Override
    public Field<Integer> field5() {
        return AuditTagTypeConfig.AUDIT_TAG_TYPE_CONFIG.DELIVERY;
    }

    @Override
    public Field<String> field6() {
        return AuditTagTypeConfig.AUDIT_TAG_TYPE_CONFIG.REMARK;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCategory();
    }

    @Override
    public String component3() {
        return getDesc();
    }

    @Override
    public Integer component4() {
        return getRepeated();
    }

    @Override
    public Integer component5() {
        return getDelivery();
    }

    @Override
    public String component6() {
        return getRemark();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCategory();
    }

    @Override
    public String value3() {
        return getDesc();
    }

    @Override
    public Integer value4() {
        return getRepeated();
    }

    @Override
    public Integer value5() {
        return getDelivery();
    }

    @Override
    public String value6() {
        return getRemark();
    }

    @Override
    public AuditTagTypeConfigRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AuditTagTypeConfigRecord value2(String value) {
        setCategory(value);
        return this;
    }

    @Override
    public AuditTagTypeConfigRecord value3(String value) {
        setDesc(value);
        return this;
    }

    @Override
    public AuditTagTypeConfigRecord value4(Integer value) {
        setRepeated(value);
        return this;
    }

    @Override
    public AuditTagTypeConfigRecord value5(Integer value) {
        setDelivery(value);
        return this;
    }

    @Override
    public AuditTagTypeConfigRecord value6(String value) {
        setRemark(value);
        return this;
    }

    @Override
    public AuditTagTypeConfigRecord values(Long value1, String value2, String value3, Integer value4, Integer value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuditTagTypeConfigRecord
     */
    public AuditTagTypeConfigRecord() {
        super(AuditTagTypeConfig.AUDIT_TAG_TYPE_CONFIG);
    }

    /**
     * Create a detached, initialised AuditTagTypeConfigRecord
     */
    public AuditTagTypeConfigRecord(Long id, String category, String desc, Integer repeated, Integer delivery, String remark) {
        super(AuditTagTypeConfig.AUDIT_TAG_TYPE_CONFIG);

        setId(id);
        setCategory(category);
        setDesc(desc);
        setRepeated(repeated);
        setDelivery(delivery);
        setRemark(remark);
    }

    /**
     * Create a detached, initialised AuditTagTypeConfigRecord
     */
    public AuditTagTypeConfigRecord(com.tengzhe.jooq.data.naudit.tables.pojos.AuditTagTypeConfig value) {
        super(AuditTagTypeConfig.AUDIT_TAG_TYPE_CONFIG);

        if (value != null) {
            setId(value.getId());
            setCategory(value.getCategory());
            setDesc(value.getDesc());
            setRepeated(value.getRepeated());
            setDelivery(value.getDelivery());
            setRemark(value.getRemark());
        }
    }
}