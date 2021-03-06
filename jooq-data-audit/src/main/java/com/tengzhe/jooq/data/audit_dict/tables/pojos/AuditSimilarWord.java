/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.audit_dict.tables.pojos;


import java.io.Serializable;
import java.util.Date;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuditSimilarWord implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long    id;
    private Long    operatorId;
    private Integer source;
    private String  originalWord;
    private String  similarWord;
    private Integer status;
    private String  remark;
    private String  extraData;
    private Date    createTime;
    private Date    modifyTime;

    public AuditSimilarWord() {}

    public AuditSimilarWord(AuditSimilarWord value) {
        this.id = value.id;
        this.operatorId = value.operatorId;
        this.source = value.source;
        this.originalWord = value.originalWord;
        this.similarWord = value.similarWord;
        this.status = value.status;
        this.remark = value.remark;
        this.extraData = value.extraData;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
    }

    public AuditSimilarWord(
        Long    id,
        Long    operatorId,
        Integer source,
        String  originalWord,
        String  similarWord,
        Integer status,
        String  remark,
        String  extraData,
        Date    createTime,
        Date    modifyTime
    ) {
        this.id = id;
        this.operatorId = operatorId;
        this.source = source;
        this.originalWord = originalWord;
        this.similarWord = similarWord;
        this.status = status;
        this.remark = remark;
        this.extraData = extraData;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>audit_dict.audit_similar_word.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>audit_dict.audit_similar_word.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>audit_dict.audit_similar_word.operator_id</code>.
     */
    public Long getOperatorId() {
        return this.operatorId;
    }

    /**
     * Setter for <code>audit_dict.audit_similar_word.operator_id</code>.
     */
    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * Getter for <code>audit_dict.audit_similar_word.source</code>.
     */
    public Integer getSource() {
        return this.source;
    }

    /**
     * Setter for <code>audit_dict.audit_similar_word.source</code>.
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * Getter for <code>audit_dict.audit_similar_word.original_word</code>.
     */
    public String getOriginalWord() {
        return this.originalWord;
    }

    /**
     * Setter for <code>audit_dict.audit_similar_word.original_word</code>.
     */
    public void setOriginalWord(String originalWord) {
        this.originalWord = originalWord;
    }

    /**
     * Getter for <code>audit_dict.audit_similar_word.similar_word</code>.
     */
    public String getSimilarWord() {
        return this.similarWord;
    }

    /**
     * Setter for <code>audit_dict.audit_similar_word.similar_word</code>.
     */
    public void setSimilarWord(String similarWord) {
        this.similarWord = similarWord;
    }

    /**
     * Getter for <code>audit_dict.audit_similar_word.status</code>.
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>audit_dict.audit_similar_word.status</code>.
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Getter for <code>audit_dict.audit_similar_word.remark</code>.
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * Setter for <code>audit_dict.audit_similar_word.remark</code>.
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * Getter for <code>audit_dict.audit_similar_word.extra_data</code>.
     */
    public String getExtraData() {
        return this.extraData;
    }

    /**
     * Setter for <code>audit_dict.audit_similar_word.extra_data</code>.
     */
    public void setExtraData(String extraData) {
        this.extraData = extraData;
    }

    /**
     * Getter for <code>audit_dict.audit_similar_word.create_time</code>.
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>audit_dict.audit_similar_word.create_time</code>.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>audit_dict.audit_similar_word.modify_time</code>.
     */
    public Date getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>audit_dict.audit_similar_word.modify_time</code>.
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AuditSimilarWord (");

        sb.append(id);
        sb.append(", ").append(operatorId);
        sb.append(", ").append(source);
        sb.append(", ").append(originalWord);
        sb.append(", ").append(similarWord);
        sb.append(", ").append(status);
        sb.append(", ").append(remark);
        sb.append(", ").append(extraData);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyTime);

        sb.append(")");
        return sb.toString();
    }
}
