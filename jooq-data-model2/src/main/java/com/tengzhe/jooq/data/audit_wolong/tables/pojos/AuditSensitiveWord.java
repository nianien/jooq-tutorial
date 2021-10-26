/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_wolong.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.processing.Generated;


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
public class AuditSensitiveWord implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private Long          operatorid;
    private String        keyword;
    private Integer       creativeConfine;
    private Integer       creativeConfineType;
    private Integer       keywordConfine;
    private Integer       keywordConfineType;
    private String        addReason;
    private String        remark;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;
    private String        indusIds;
    private Integer       status;
    private Long          refId;
    private Long          cityHash;
    private LocalDateTime effectiveTime;
    private LocalDateTime ineffectiveTime;

    public AuditSensitiveWord() {}

    public AuditSensitiveWord(AuditSensitiveWord value) {
        this.id = value.id;
        this.operatorid = value.operatorid;
        this.keyword = value.keyword;
        this.creativeConfine = value.creativeConfine;
        this.creativeConfineType = value.creativeConfineType;
        this.keywordConfine = value.keywordConfine;
        this.keywordConfineType = value.keywordConfineType;
        this.addReason = value.addReason;
        this.remark = value.remark;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
        this.indusIds = value.indusIds;
        this.status = value.status;
        this.refId = value.refId;
        this.cityHash = value.cityHash;
        this.effectiveTime = value.effectiveTime;
        this.ineffectiveTime = value.ineffectiveTime;
    }

    public AuditSensitiveWord(
        Long          id,
        Long          operatorid,
        String        keyword,
        Integer       creativeConfine,
        Integer       creativeConfineType,
        Integer       keywordConfine,
        Integer       keywordConfineType,
        String        addReason,
        String        remark,
        LocalDateTime createTime,
        LocalDateTime modifyTime,
        String        indusIds,
        Integer       status,
        Long          refId,
        Long          cityHash,
        LocalDateTime effectiveTime,
        LocalDateTime ineffectiveTime
    ) {
        this.id = id;
        this.operatorid = operatorid;
        this.keyword = keyword;
        this.creativeConfine = creativeConfine;
        this.creativeConfineType = creativeConfineType;
        this.keywordConfine = keywordConfine;
        this.keywordConfineType = keywordConfineType;
        this.addReason = addReason;
        this.remark = remark;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.indusIds = indusIds;
        this.status = status;
        this.refId = refId;
        this.cityHash = cityHash;
        this.effectiveTime = effectiveTime;
        this.ineffectiveTime = ineffectiveTime;
    }

    /**
     * Getter for <code>audit_wolong.audit_sensitive_word.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>audit_wolong.audit_sensitive_word.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>audit_wolong.audit_sensitive_word.operatorid</code>.
     */
    public Long getOperatorid() {
        return this.operatorid;
    }

    /**
     * Setter for <code>audit_wolong.audit_sensitive_word.operatorid</code>.
     */
    public void setOperatorid(Long operatorid) {
        this.operatorid = operatorid;
    }

    /**
     * Getter for <code>audit_wolong.audit_sensitive_word.keyword</code>.
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * Setter for <code>audit_wolong.audit_sensitive_word.keyword</code>.
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * Getter for
     * <code>audit_wolong.audit_sensitive_word.creative_confine</code>.
     */
    public Integer getCreativeConfine() {
        return this.creativeConfine;
    }

    /**
     * Setter for
     * <code>audit_wolong.audit_sensitive_word.creative_confine</code>.
     */
    public void setCreativeConfine(Integer creativeConfine) {
        this.creativeConfine = creativeConfine;
    }

    /**
     * Getter for
     * <code>audit_wolong.audit_sensitive_word.creative_confine_type</code>.
     */
    public Integer getCreativeConfineType() {
        return this.creativeConfineType;
    }

    /**
     * Setter for
     * <code>audit_wolong.audit_sensitive_word.creative_confine_type</code>.
     */
    public void setCreativeConfineType(Integer creativeConfineType) {
        this.creativeConfineType = creativeConfineType;
    }

    /**
     * Getter for
     * <code>audit_wolong.audit_sensitive_word.keyword_confine</code>.
     */
    public Integer getKeywordConfine() {
        return this.keywordConfine;
    }

    /**
     * Setter for
     * <code>audit_wolong.audit_sensitive_word.keyword_confine</code>.
     */
    public void setKeywordConfine(Integer keywordConfine) {
        this.keywordConfine = keywordConfine;
    }

    /**
     * Getter for
     * <code>audit_wolong.audit_sensitive_word.keyword_confine_type</code>.
     */
    public Integer getKeywordConfineType() {
        return this.keywordConfineType;
    }

    /**
     * Setter for
     * <code>audit_wolong.audit_sensitive_word.keyword_confine_type</code>.
     */
    public void setKeywordConfineType(Integer keywordConfineType) {
        this.keywordConfineType = keywordConfineType;
    }

    /**
     * Getter for <code>audit_wolong.audit_sensitive_word.add_reason</code>.
     */
    public String getAddReason() {
        return this.addReason;
    }

    /**
     * Setter for <code>audit_wolong.audit_sensitive_word.add_reason</code>.
     */
    public void setAddReason(String addReason) {
        this.addReason = addReason;
    }

    /**
     * Getter for <code>audit_wolong.audit_sensitive_word.remark</code>.
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * Setter for <code>audit_wolong.audit_sensitive_word.remark</code>.
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * Getter for <code>audit_wolong.audit_sensitive_word.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>audit_wolong.audit_sensitive_word.create_time</code>.
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>audit_wolong.audit_sensitive_word.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>audit_wolong.audit_sensitive_word.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>audit_wolong.audit_sensitive_word.indus_ids</code>.
     */
    public String getIndusIds() {
        return this.indusIds;
    }

    /**
     * Setter for <code>audit_wolong.audit_sensitive_word.indus_ids</code>.
     */
    public void setIndusIds(String indusIds) {
        this.indusIds = indusIds;
    }

    /**
     * Getter for <code>audit_wolong.audit_sensitive_word.status</code>.
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>audit_wolong.audit_sensitive_word.status</code>.
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Getter for <code>audit_wolong.audit_sensitive_word.ref_id</code>.
     */
    public Long getRefId() {
        return this.refId;
    }

    /**
     * Setter for <code>audit_wolong.audit_sensitive_word.ref_id</code>.
     */
    public void setRefId(Long refId) {
        this.refId = refId;
    }

    /**
     * Getter for <code>audit_wolong.audit_sensitive_word.city_hash</code>.
     */
    public Long getCityHash() {
        return this.cityHash;
    }

    /**
     * Setter for <code>audit_wolong.audit_sensitive_word.city_hash</code>.
     */
    public void setCityHash(Long cityHash) {
        this.cityHash = cityHash;
    }

    /**
     * Getter for <code>audit_wolong.audit_sensitive_word.effective_time</code>.
     */
    public LocalDateTime getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * Setter for <code>audit_wolong.audit_sensitive_word.effective_time</code>.
     */
    public void setEffectiveTime(LocalDateTime effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    /**
     * Getter for
     * <code>audit_wolong.audit_sensitive_word.ineffective_time</code>.
     */
    public LocalDateTime getIneffectiveTime() {
        return this.ineffectiveTime;
    }

    /**
     * Setter for
     * <code>audit_wolong.audit_sensitive_word.ineffective_time</code>.
     */
    public void setIneffectiveTime(LocalDateTime ineffectiveTime) {
        this.ineffectiveTime = ineffectiveTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AuditSensitiveWord (");

        sb.append(id);
        sb.append(", ").append(operatorid);
        sb.append(", ").append(keyword);
        sb.append(", ").append(creativeConfine);
        sb.append(", ").append(creativeConfineType);
        sb.append(", ").append(keywordConfine);
        sb.append(", ").append(keywordConfineType);
        sb.append(", ").append(addReason);
        sb.append(", ").append(remark);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyTime);
        sb.append(", ").append(indusIds);
        sb.append(", ").append(status);
        sb.append(", ").append(refId);
        sb.append(", ").append(cityHash);
        sb.append(", ").append(effectiveTime);
        sb.append(", ").append(ineffectiveTime);

        sb.append(")");
        return sb.toString();
    }
}
