-- noinspection SqlNoDataSourceInspectionForFile

USE `audit_dict`;


alter table `audit_word_rule` add column `grade` tinyint(4) NOT NULL DEFAULT 1 COMMENT '等级 1:低,2:高' after `industries`,
add column `extra_data` VARCHAR (1024) NOT NULL DEFAULT '' COMMENT '附加数据';

alter table `audit_similar_word` add column `source` int(11) NOT NULL DEFAULT 0 COMMENT '数据来源,1:卧龙,2:汇川,4:应用分发' after `operator_id`,
add column `extra_data` VARCHAR (1024) NOT NULL DEFAULT '' COMMENT '附加数据';

alter table `audit_word_rule` modify column `exclude_users` mediumtext COMMENT '非限用户ID,以","分隔';

CREATE TABLE `system_property` (
    `id` BIGINT (20) NOT NULL AUTO_INCREMENT,
    `name` BIGINT (20) NOT NULL DEFAULT '-1' COMMENT '属性名',
    `value` VARCHAR (1024) NOT NULL DEFAULT '' COMMENT '属性值',
    `label` VARCHAR (256) NOT NULL DEFAULT '' COMMENT '属性描述',
    `group` VARCHAR (256) DEFAULT '' COMMENT '分组,默认为: 表名.字段端',
    `enable` TINYINT NOT NULL DEFAULT 1 COMMENT '是否启用,1:启用, 2:不启用',
    `remark` VARCHAR (1024) NOT NULL DEFAULT '' COMMENT '备注',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    INDEX `idx_name` (`name`),
    INDEX `idx_group_name` (`group`,`name`)
) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='系统属性表';


CREATE TABLE `audit_whitelist_config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cid` bigint(20) NOT NULL DEFAULT 0 COMMENT '客户ID',
  `site_url` varchar(1024) NOT NULL DEFAULT '' COMMENT '网站Url',
  `uc_id` bigint(20) NOT NULL DEFAULT 0 COMMENT '用户ID',
  `biz_types` VARCHAR(128) NOT NULL DEFAULT '' COMMENT '产品线 1-卧龙 2-汇川 4-分发 5-导航 6-其他，逗号分隔',
  `target_type` int(11) NOT NULL DEFAULT -1 COMMENT '免审类型 1-订单免审,2-物料免审',
  `dimension` tinyint(4) NOT NULL COMMENT '免审维度 1-cid,2-url,3-userid',
  `auditor_id` bigint(20) NOT NULL DEFAULT -1 COMMENT '审核员id',
  `status` tinyint(4) NOT NULL DEFAULT 0 COMMENT '0-免审 1-解除免审',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `idx_cid` (`cid`),
  KEY `idx_target_type_dimension_status` (`target_type`,`dimension`,`status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='审核白名单配置';

CREATE TABLE `audit_risk_category` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `code` VARCHAR(16) NOT NULL DEFAULT -1 COMMENT '编码，约定的业务编码',
  `name` VARCHAR(32) NOT NULL COMMENT '名称',
  `parent_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '父级id，与id构建树结构',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_code` (`code`),
  UNIQUE KEY `idx_parent_id_name` (`parent_id`, `name`),
) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='拒绝理由风险类别';

CREATE TABLE `audit_risk_tag` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) NOT NULL DEFAULT '' COMMENT '拒绝理由风险编码',
  `target` int(11) NOT NULL DEFAULT '1' COMMENT '对象：1-文字、2-图片、4-推广来源、8-落地页、16-物料等',
  `reason_detail` varchar(255) NOT NULL DEFAULT '' COMMENT '详细话术',
  `additional` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否可以附加，通常显示文本框',
  `strategy_flag` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否策略标记: 0-否，1-是',
  `enabled` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否生效，1-生效中，0-不生效',
  `remark` VARCHAR (1024) NOT NULL DEFAULT '' COMMENT '备注',
  `operator_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '操作人id',
  `seq` int(11) NOT NULL DEFAULT '1' COMMENT '排序号，从1开始',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_code` (`code`),
  KEY `idx_seq` (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='拒绝理由风险配置';

CREATE TABLE `audit_type_risk_tag_config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `type` int(11) NOT NULL DEFAULT '0' COMMENT '审核类型，对应实体类型AuditEntityType',
  `code` varchar(255) NOT NULL DEFAULT '' COMMENT '拒绝理由风险编码',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_code` (`code`,`type`),
  KEY `idx_type` (`type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='审核类型及拒绝理由风险配置关系';

CREATE TABLE `audit_strategy_config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL DEFAULT '' COMMENT '策略名称',
  `type` varchar(255) NOT NULL DEFAULT '' COMMENT '策略类型信息',
  `enabled` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否生效，1-生效中，0-不生效',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='审核策略配置表';

CREATE TABLE `rule_evaluate_detail` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
  `eval_id` BIGINT NOT NULL COMMENT '评估批次',
  `rule_id` BIGINT NOT NULL DEFAULT -1 COMMENT '规则id',
  `user_id` BIGINT NOT NULL DEFAULT -1 COMMENT '用户id',
  `idea_id` BIGINT NOT NULL DEFAULT -1 COMMENT '物料id',
  `content` TEXT COMMENT '物料内容',
  `word` TEXT COMMENT '配对词列表',
  `consume` BIGINT NOT NULL DEFAULT 0 COMMENT '影响消费',
  `biz_type` BIGINT NOT NULL DEFAULT 0 COMMENT '产品线',
  `eval_date` VARCHAR(128) NOT NULL DEFAULT '' COMMENT '评估日期',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`),
  INDEX `idx_rule_id` (`rule_id`)
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '词表规则评估';

CREATE TABLE `sync_word_rule` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `sync_type` tinyint(4) NOT NULL DEFAULT -1 COMMENT '同步类型（1：用户，2：客户）',
  `word_type` varchar(128) NOT NULL DEFAULT '' COMMENT '词表类型,逗号分隔,1:黑名单，2：商标词，3：竞品词，4：敏感词',
  `source_id` varchar(256) NOT NULL COMMENT '原id',
  `target_id` TEXT COMMENT '目标id,逗号分隔',
  `status` tinyint(4) NOT NULL DEFAULT 0 COMMENT '状态(0: 未操作,1:操作正在进行, 2:操作已完成)',
  `operator_id` bigint(20) NOT NULL DEFAULT -1 COMMENT '操作人id',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT = '词表规则同步';