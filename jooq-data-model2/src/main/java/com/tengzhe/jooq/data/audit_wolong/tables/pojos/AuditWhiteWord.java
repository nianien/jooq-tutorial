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
public class AuditWhiteWord implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private String        word;
    private Integer       wordType;
    private Integer       logicState;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;
    private Long          riskTag;

    public AuditWhiteWord() {}

    public AuditWhiteWord(AuditWhiteWord value) {
        this.id = value.id;
        this.word = value.word;
        this.wordType = value.wordType;
        this.logicState = value.logicState;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
        this.riskTag = value.riskTag;
    }

    public AuditWhiteWord(
        Long          id,
        String        word,
        Integer       wordType,
        Integer       logicState,
        LocalDateTime createTime,
        LocalDateTime modifyTime,
        Long          riskTag
    ) {
        this.id = id;
        this.word = word;
        this.wordType = wordType;
        this.logicState = logicState;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.riskTag = riskTag;
    }

    /**
     * Getter for <code>audit_wolong.audit_white_word.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>audit_wolong.audit_white_word.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>audit_wolong.audit_white_word.word</code>.
     */
    public String getWord() {
        return this.word;
    }

    /**
     * Setter for <code>audit_wolong.audit_white_word.word</code>.
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * Getter for <code>audit_wolong.audit_white_word.word_type</code>.
     */
    public Integer getWordType() {
        return this.wordType;
    }

    /**
     * Setter for <code>audit_wolong.audit_white_word.word_type</code>.
     */
    public void setWordType(Integer wordType) {
        this.wordType = wordType;
    }

    /**
     * Getter for <code>audit_wolong.audit_white_word.logic_state</code>.
     */
    public Integer getLogicState() {
        return this.logicState;
    }

    /**
     * Setter for <code>audit_wolong.audit_white_word.logic_state</code>.
     */
    public void setLogicState(Integer logicState) {
        this.logicState = logicState;
    }

    /**
     * Getter for <code>audit_wolong.audit_white_word.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>audit_wolong.audit_white_word.create_time</code>.
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>audit_wolong.audit_white_word.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>audit_wolong.audit_white_word.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>audit_wolong.audit_white_word.risk_tag</code>.
     */
    public Long getRiskTag() {
        return this.riskTag;
    }

    /**
     * Setter for <code>audit_wolong.audit_white_word.risk_tag</code>.
     */
    public void setRiskTag(Long riskTag) {
        this.riskTag = riskTag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AuditWhiteWord (");

        sb.append(id);
        sb.append(", ").append(word);
        sb.append(", ").append(wordType);
        sb.append(", ").append(logicState);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyTime);
        sb.append(", ").append(riskTag);

        sb.append(")");
        return sb.toString();
    }
}
