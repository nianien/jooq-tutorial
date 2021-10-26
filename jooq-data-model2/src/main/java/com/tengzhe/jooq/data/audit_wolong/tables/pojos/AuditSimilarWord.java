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
public class AuditSimilarWord implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private Long          operatorid;
    private String        similarWord;
    private String        originalWord;
    private String        remark;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;

    public AuditSimilarWord() {}

    public AuditSimilarWord(AuditSimilarWord value) {
        this.id = value.id;
        this.operatorid = value.operatorid;
        this.similarWord = value.similarWord;
        this.originalWord = value.originalWord;
        this.remark = value.remark;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
    }

    public AuditSimilarWord(
        Long          id,
        Long          operatorid,
        String        similarWord,
        String        originalWord,
        String        remark,
        LocalDateTime createTime,
        LocalDateTime modifyTime
    ) {
        this.id = id;
        this.operatorid = operatorid;
        this.similarWord = similarWord;
        this.originalWord = originalWord;
        this.remark = remark;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>audit_wolong.audit_similar_word.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>audit_wolong.audit_similar_word.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>audit_wolong.audit_similar_word.operatorid</code>.
     */
    public Long getOperatorid() {
        return this.operatorid;
    }

    /**
     * Setter for <code>audit_wolong.audit_similar_word.operatorid</code>.
     */
    public void setOperatorid(Long operatorid) {
        this.operatorid = operatorid;
    }

    /**
     * Getter for <code>audit_wolong.audit_similar_word.similar_word</code>.
     */
    public String getSimilarWord() {
        return this.similarWord;
    }

    /**
     * Setter for <code>audit_wolong.audit_similar_word.similar_word</code>.
     */
    public void setSimilarWord(String similarWord) {
        this.similarWord = similarWord;
    }

    /**
     * Getter for <code>audit_wolong.audit_similar_word.original_word</code>.
     */
    public String getOriginalWord() {
        return this.originalWord;
    }

    /**
     * Setter for <code>audit_wolong.audit_similar_word.original_word</code>.
     */
    public void setOriginalWord(String originalWord) {
        this.originalWord = originalWord;
    }

    /**
     * Getter for <code>audit_wolong.audit_similar_word.remark</code>.
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * Setter for <code>audit_wolong.audit_similar_word.remark</code>.
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * Getter for <code>audit_wolong.audit_similar_word.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>audit_wolong.audit_similar_word.create_time</code>.
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>audit_wolong.audit_similar_word.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>audit_wolong.audit_similar_word.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AuditSimilarWord (");

        sb.append(id);
        sb.append(", ").append(operatorid);
        sb.append(", ").append(similarWord);
        sb.append(", ").append(originalWord);
        sb.append(", ").append(remark);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyTime);

        sb.append(")");
        return sb.toString();
    }
}
