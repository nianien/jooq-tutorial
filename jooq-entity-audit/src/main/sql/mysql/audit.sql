-- noinspection SqlNoDataSourceInspectionForFile


USE `audit`;
CREATE TABLE `huichuan_idea_key_frame` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `user_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '用户id',
    `idea_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '用户id',
    `video_url` VARCHAR(256) NOT NULL DEFAULT '' COMMENT '视频地址',
    `content` TEXT NOT NULL COMMENT '关键帧内容, JSON格式数据',
    PRIMARY KEY (`id`),
    KEY `idx_userid_ideaid` (`user_id`,`idea_id`),
    KEY `idx_video_url` (`video_url`(128))
) DEFAULT CHARSET=utf8 COMMENT='汇川物料视频关键帧';

CREATE TABLE `audit_huichuan_download_url_detail`(
    `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '物料id',
    `user_id` bigint(20) NOT NULL DEFAULT -1 COMMENT '用户id',
    `download_url` varchar(1024) NOT NULL DEFAULT '' COMMENT '下载链接',
    `app_name` varchar(1024) NOT NULL DEFAULT '' COMMENT 'APP名称',
    `package_name` varchar(1024) NOT NULL DEFAULT '' COMMENT '应用包名',
    `auditor_id` bigint(20) NOT NULL DEFAULT -1 COMMENT '审核员id',
    `audit_state` tinyint(4) NOT NULL DEFAULT 1 COMMENT '审核状态,0:审核通过,1审核中,2:审核拒绝',
    `reason`varchar(4096) NOT NULL DEFAULT ''  COMMENT '拒绝理由, JSON数据',
    `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    KEY `idx_userid` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='汇川下载链接审核';
