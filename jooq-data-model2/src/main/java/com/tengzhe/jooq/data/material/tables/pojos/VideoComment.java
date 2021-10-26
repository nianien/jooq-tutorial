/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.material.tables.pojos;


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
public class VideoComment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private Long          targetId;
    private String        content;
    private LocalDateTime expireTime;
    private Integer       enabled;
    private Long          creator;
    private Long          operator;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;

    public VideoComment() {}

    public VideoComment(VideoComment value) {
        this.id = value.id;
        this.targetId = value.targetId;
        this.content = value.content;
        this.expireTime = value.expireTime;
        this.enabled = value.enabled;
        this.creator = value.creator;
        this.operator = value.operator;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
    }

    public VideoComment(
        Long          id,
        Long          targetId,
        String        content,
        LocalDateTime expireTime,
        Integer       enabled,
        Long          creator,
        Long          operator,
        LocalDateTime createTime,
        LocalDateTime modifyTime
    ) {
        this.id = id;
        this.targetId = targetId;
        this.content = content;
        this.expireTime = expireTime;
        this.enabled = enabled;
        this.creator = creator;
        this.operator = operator;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    /**
     * Getter for <code>material.video_comment.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>material.video_comment.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>material.video_comment.target_id</code>.
     */
    public Long getTargetId() {
        return this.targetId;
    }

    /**
     * Setter for <code>material.video_comment.target_id</code>.
     */
    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    /**
     * Getter for <code>material.video_comment.content</code>.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Setter for <code>material.video_comment.content</code>.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Getter for <code>material.video_comment.expire_time</code>.
     */
    public LocalDateTime getExpireTime() {
        return this.expireTime;
    }

    /**
     * Setter for <code>material.video_comment.expire_time</code>.
     */
    public void setExpireTime(LocalDateTime expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * Getter for <code>material.video_comment.enabled</code>.
     */
    public Integer getEnabled() {
        return this.enabled;
    }

    /**
     * Setter for <code>material.video_comment.enabled</code>.
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * Getter for <code>material.video_comment.creator</code>.
     */
    public Long getCreator() {
        return this.creator;
    }

    /**
     * Setter for <code>material.video_comment.creator</code>.
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * Getter for <code>material.video_comment.operator</code>.
     */
    public Long getOperator() {
        return this.operator;
    }

    /**
     * Setter for <code>material.video_comment.operator</code>.
     */
    public void setOperator(Long operator) {
        this.operator = operator;
    }

    /**
     * Getter for <code>material.video_comment.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>material.video_comment.create_time</code>.
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for <code>material.video_comment.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Setter for <code>material.video_comment.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VideoComment (");

        sb.append(id);
        sb.append(", ").append(targetId);
        sb.append(", ").append(content);
        sb.append(", ").append(expireTime);
        sb.append(", ").append(enabled);
        sb.append(", ").append(creator);
        sb.append(", ").append(operator);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyTime);

        sb.append(")");
        return sb.toString();
    }
}