-- noinspection SqlNoDataSourceInspectionForFile


CREATE SCHEMA `audit`;
SET SCHEMA `audit`;


CREATE TABLE `user_info` (
  `userid` bigint(20) NOT NULL COMMENT '唯一的用户ID',
  `name` varchar(64) NOT NULL COMMENT '用户名',
  `ad_resource` bigint(20) NOT NULL DEFAULT '-1' COMMENT '推广资源id，值从流量管理同步',
  `audit_state` int(10) NOT NULL DEFAULT '5' COMMENT '审核状态，0表示审核通过，1表示审核中，2表示审核拒绝，5待提交至审核(搁置)',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `reason_code` varchar(256) DEFAULT NULL COMMENT '拒绝理由',
  `refuse_reason` varchar(1024) DEFAULT NULL COMMENT '拒绝原因',
  `env`       varchar(8) NOT NULL DEFAULT '' COMMENT '<环境>',
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

