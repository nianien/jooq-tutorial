-- noinspection SqlNoDataSourceInspectionForFile


CREATE SCHEMA `audit`;
SET SCHEMA `audit`;

CREATE TABLE `huichuan_idea_key_frame` (
    `id` BIGINT(20)  NOT NULL AUTO_INCREMENT COMMENT '主键',
    `user_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '用户id',
    `idea_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '用户id',
    `video_url` VARCHAR(256) NOT NULL DEFAULT '' COMMENT '视频地址',
    `content` TEXT NOT NULL COMMENT '关键帧内容, JSON格式数据',
    PRIMARY KEY (`id`)/*,
    KEY `idx_userid_ideaid` (`user_id`,`idea_id`),
    KEY `idx_video_url` (`video_url`(128))*/
);/* DEFAULT CHARSET=utf8 COMMENT='汇川物料视频关键帧';*/

CREATE TABLE `user_info` (
  `userid` bigint(20) NOT NULL COMMENT '唯一的用户ID',
  `name` varchar(64) NOT NULL COMMENT '用户名',
  `ad_resource` bigint(20) NOT NULL DEFAULT '-1' COMMENT '推广资源id，值从流量管理同步',
  `audit_state` int(10) NOT NULL DEFAULT '5' COMMENT '审核状态，0表示审核通过，1表示审核中，2表示审核拒绝，5待提交至审核(搁置)',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `reason_code` varchar(256) DEFAULT NULL COMMENT '拒绝理由',
  `refuse_reason` varchar(1024) DEFAULT NULL COMMENT '拒绝原因',
  `version` timestamp NOT NULL DEFAULT '2010-01-01 00:00:00' COMMENT '数据版本号',
  `balance` bigint(20) NOT NULL COMMENT '账户余额，单位千分之一分',
  `finance_state` int(10) NOT NULL DEFAULT '0' COMMENT '财务状态.0为正常，1为预算撞线，2为余额花光，3是1与2同时发生',
  `company_name` varchar(128) NOT NULL COMMENT '公司名称',
  `site_name` varchar(128) NOT NULL COMMENT '网站名称',
  `site_url` text NOT NULL COMMENT '网站地址',
  `industry1` int(10) NOT NULL COMMENT '一级行业',
  `industry2` int(10) NOT NULL COMMENT '二级行业',
  `industry3` int(10) NOT NULL COMMENT '三级行业',
  `telephone` varchar(32) NOT NULL COMMENT '座机',
  `create_time` timestamp NOT NULL DEFAULT '1980-01-01 00:00:00' COMMENT '创建时间',
  `modify_user` bigint(20) NOT NULL DEFAULT '-1' COMMENT '修改用户id',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `audit_start_time` timestamp NULL DEFAULT NULL COMMENT '送审时间',
  `audit_end_time` timestamp NULL DEFAULT NULL COMMENT '审核完成时间',
  `province` varchar(32) NOT NULL COMMENT '所在省',
  `city` varchar(64) NOT NULL COMMENT '所在市',
  `address` varchar(1024) NOT NULL COMMENT '联系地址',
  `regist_url` varchar(1024) DEFAULT NULL COMMENT '注册域名',
  `open_url` text COMMENT '开放域名',
  `source` tinyint(2) DEFAULT '0' COMMENT '账户来源,0:无，7：中小子账户，9：KA子账户，11：换量投放账户',
  PRIMARY KEY (`userid`)/*,
  KEY `idx_state` (`audit_state`),
  KEY `idx_audit_start_time` (`audit_start_time`)*/
); /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户基础信息表'*/


CREATE TABLE `user_info_config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `priority` bigint(20) NOT NULL DEFAULT '0' COMMENT '优先级：-1表示搁置、0正常、>0表示优审，优审账户的物料会被优先领取（priority desc）',
  `max_version` bigint(20) NOT NULL DEFAULT '0' COMMENT '最大版本号',
  `min_version` bigint(20) NOT NULL DEFAULT '0' COMMENT '最小版本，主要是在领单时用，min_version越小表示需要优先领取',
  `create_time` timestamp NOT NULL DEFAULT '2010-01-01 00:00:00' COMMENT '创建时间',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id:-1表示未被任何审核员修改优先级，>0表示最后修改优先级的审核员id',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `userid` (`userid`) USING BTREE,
  KEY `priority` (`priority`,`min_version`) USING BTREE*/
);/* ENGINE=InnoDB  DEFAULT CHARSET=utf8*/


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
    PRIMARY KEY (`id`)/*,
    KEY `idx_userid_ideaid` (`user_id`,`idea_id`)*/
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='汇川下载链接审核'*/;