-- noinspection SqlNoDataSourceInspectionForFile


CREATE SCHEMA `material`;
SET SCHEMA `material`;

CREATE TABLE `campaign` (
  `id` BIGINT(20) NOT NULL COMMENT '推广计划id',
  `name` VARCHAR(128) NOT NULL COMMENT '计划名称',
  `uc_id` BIGINT(20) NOT NULL COMMENT '用户id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `group_id` BIGINT(20) NOT NULL COMMENT '推广组id',
  `type` SMALLINT(6) NOT NULL DEFAULT '0' COMMENT '标的物类型，1:落地页，2:APP iOS，4:APP Android, 8:商品',
  `ad_resource_id` INT(10) NOT NULL DEFAULT '-1' COMMENT '投放位置：2147483647优选广告位 1信息流 2正文页 3信息流&正文页',
  `platform` INT(10) NOT NULL DEFAULT '0' COMMENT '平台描述',
  `site_id` BIGINT(20) NOT NULL DEFAULT '0' COMMENT '移动建站站点id',
  `target_url` varchar(1024) DEFAULT NULL COMMENT '落地页url',
  `download_url` varchar(1024) DEFAULT NULL COMMENT '下载url',
  `content` TEXT NOT NULL COMMENT 'JSON数据',
  `paused` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '0启用 1暂停',
  `logic_state` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '逻辑状态:0-有效,1-无效',
  `version` bigint(20) DEFAULT NULL COMMENT '送审时间戳',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)/*,
  KEY `idx_user_id_state_logic_state` (`user_id`,`state`,`logic_state`)*/
) /*ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='推广计划表'*/;

CREATE TABLE `download_url_detail`(
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '推广计划id',
  `uc_id` BIGINT(20) NOT NULL COMMENT '用户id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `download_url` varchar(1024) NOT NULL DEFAULT '' COMMENT '下载链接',
  `app_name` varchar(1024) NOT NULL DEFAULT '' COMMENT 'APP名称',
  `package_name` varchar(1024) NOT NULL DEFAULT '' COMMENT '应用包名',
  `logic_state` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '逻辑状态:0-有效,1-无效',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `audit_state` tinyint(4) NOT NULL DEFAULT '1' COMMENT '审核状态,0:审核通过,1审核中,2:审核拒绝',
  `reason_code` varchar(4096) NOT NULL DEFAULT '' COMMENT '拒绝理由code，多个逗号分隔',
  `reason` varchar(4096) NOT NULL DEFAULT '' COMMENT '其他拒绝理由',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `row_key` varchar(128) NOT NULL DEFAULT '' COMMENT '行键',
  PRIMARY KEY (`id`)/*,
  KEY `idx_user_id_audit_state_logic_state` (`user_id`,`audit_state`,`logic_state`)*/
) /*ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='计划下载应用审核'*/;

CREATE TABLE `audit_campaign` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `entity_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '实体id',
  `version` bigint(20) NOT NULL DEFAULT '-1' COMMENT '物料版本号',
  `audit_type` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核类型',
  `user_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '账户id',
  `campaign_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '计划id',
  `audit_state` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核状态（0:通过，1:待审，2:拒绝）',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `reason_code` varchar(4096) NOT NULL DEFAULT '' COMMENT '拒绝理由code，多个逗号分隔',
  `reason` varchar(4096) NOT NULL DEFAULT '' COMMENT '其他拒绝理由',
  `audit_start_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '开始审核时间',
  `audit_end_time` DATETIME NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '审核完成时间',
  `extend` varchar(4096) DEFAULT '' COMMENT '扩展字段',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `modify_day_tag` int (10) NOT NULL DEFAULT '-1' COMMENT '修改时间(单位天 用于统计索引)',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `idx_entity_id_audit_type` (`entity_id`,`audit_type`),
  KEY `idx_user_id_campaign_id` (`user_id`,`campaign_id`),
  KEY `idx_user_id_audit_type_state` (`user_id`,`audit_type`,`audit_state`),
  KEY `idx_modify_day_tag` (`modify_day_tag`)*/
) /*ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='推广计划审核表'*/;

CREATE TABLE `creative` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '创意id',
  `uc_id` BIGINT(20) NOT NULL COMMENT '用户id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `group_id` BIGINT(20) NOT NULL COMMENT '推广组id',
  `campaign_id` BIGINT(20) NOT NULL COMMENT '推广计划id',
  `type` SMALLINT(6) NOT NULL DEFAULT '0' COMMENT '创意类型：0普通创意 1动态组合',
  `style` INT(10) NOT NULL DEFAULT '0' COMMENT 'Bitmap，创意样式：1大图 2小图 4三图 8GIF 16视频',
  `feature` INT(10) NOT NULL DEFAULT '0' COMMENT 'Bitmap，创意工具使用：1动态词包 2程序化创意 4版权库 8建站',
  `title` text NOT NULL COMMENT '创意标题',
  `description` text NOT NULL COMMENT '创意描述',
  `source` varchar(128) DEFAULT NULL COMMENT '来源',
  `target_url` varchar(1024) DEFAULT NULL COMMENT '落地页url',
  `content` TEXT NOT NULL COMMENT 'JSON数据，物料数据',
  `wildcard_ids` VARCHAR(255) DEFAULT '' COMMENT '以逗号分割的词包id',
  `download_type` int(10) NOT NULL DEFAULT '0' COMMENT '创意下载类型，0表示其他，1表示apk，2表示appstore，3表示all',
  `paused` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '0启用 1暂停',
  `ad_style_id` int(10) DEFAULT NULL COMMENT '广告样式',
  `ad_style_type` int(10) NOT NULL DEFAULT '1' COMMENT '样式类型:0-旧样式 1-芳华样式',
  `logic_state` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '逻辑状态:0-有效,1-无效',
  `version` bigint(20) DEFAULT NULL COMMENT '物料版本号',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `pair_state` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '是否配对 0:未配对 1:配对中 2:已配对',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `video_id` bigint(20) NOT NULL DEFAULT '0'  COMMENT '视频id',
  PRIMARY KEY (`id`)/*,
  KEY `idx_user_id_state_logic_state` (`user_id`,`state`,`logic_state`)
  KEY `idx_user_id_campaign_id_state_logic_state` (`user_id`,`campaign_id`,`state`,`logic_state`),
  KEY `idx_campaign_id` (`campaign_id`)*/
) /*ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='创意表'*/;


CREATE TABLE `audit_creative` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `entity_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '实体id',
  `version` bigint(20) NOT NULL DEFAULT '-1' COMMENT '物料版本号',
  `audit_type` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核类型',
  `user_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '账户id',
  `campaign_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '计划id',
  `audit_state` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核状态（0:通过，1:待审，2:拒绝）',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `reason_code` varchar(4096) NOT NULL DEFAULT '' COMMENT '拒绝理由code，多个逗号分隔',
  `reason` varchar(4096) NOT NULL DEFAULT '' COMMENT '其他拒绝理由',
  `audit_start_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '开始审核时间',
  `audit_end_time` DATETIME NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '审核完成时间',
  `extend` varchar(4096) DEFAULT '' COMMENT '扩展字段',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `modify_day_tag` int (10) NOT NULL DEFAULT '-1' COMMENT '修改时间(单位天 用于统计索引)',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `idx_entity_id_audit_type` (`entity_id`,`audit_type`),
  KEY `idx_user_id_campaign_id` (`user_id`,`campaign_id`),
  KEY `idx_user_id_audit_type_state` (`user_id`,`audit_type`,`audit_state`),
  KEY `idx_modify_day_tag` (`modify_day_tag`)*/
) /*ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='创意审核表'*/;


CREATE TABLE `attach_creative` (
  `id` BIGINT(20) NOT NULL COMMENT 'id',
  `uc_id` BIGINT(20) NOT NULL COMMENT '用户id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `group_id` BIGINT(20) NOT NULL COMMENT '推广组id',
  `campaign_id` BIGINT(20) NOT NULL COMMENT '推广计划id',
  `description` TEXT NOT NULL COMMENT '创意描述',
  `extra_style_id` INT(10) DEFAULT '-1' COMMENT '-1没有附加样式, 1电话，2表单 3立即下载',
  `component_id` BIGINT(20) DEFAULT '0' COMMENT '组件id',
  `content` TEXT NOT NULL COMMENT 'JSON数据',
  `logic_state` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '逻辑状态:0-有效,1-无效',
  `version` bigint(20) DEFAULT NULL COMMENT '物料版本号',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)/*,
  KEY `idx_user_id_state_logic_state` (`user_id`,`state`,`logic_state`)
  KEY `idx_user_id_campaign_id_state_logic_state` (`user_id`,`campaign_id`,`state`,`logic_state`),
  KEY `idx_campaign_id` (`campaign_id`)*/
) /*ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='附加创意表'*/;


CREATE TABLE `audit_attach_creative` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `entity_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '实体id',
  `version` bigint(20) NOT NULL DEFAULT '-1' COMMENT '物料版本号',
  `audit_type` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核类型',
  `user_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '账户id',
  `campaign_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '计划id',
  `audit_state` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核状态（0:通过，1:待审，2:拒绝）',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `reason_code` varchar(4096) NOT NULL DEFAULT '' COMMENT '拒绝理由code，多个逗号分隔',
  `reason` varchar(4096) NOT NULL DEFAULT '' COMMENT '其他拒绝理由',
  `audit_start_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '开始审核时间',
  `audit_end_time` DATETIME NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '审核完成时间',
  `extend` varchar(4096) DEFAULT '' COMMENT '扩展字段',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `modify_day_tag` int (10) NOT NULL DEFAULT '-1' COMMENT '修改时间(单位天 用于统计索引)',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `idx_entity_id_audit_type` (`entity_id`,`audit_type`),
  KEY `idx_user_id_campaign_id` (`user_id`,`campaign_id`),
  KEY `idx_user_id_audit_type_state` (`user_id`,`audit_type`,`audit_state`),
  KEY `idx_modify_day_tag` (`modify_day_tag`)*/
) /*ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='附加创意审核表'*/;


CREATE TABLE `word_package` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `uc_id` BIGINT(20) NOT NULL COMMENT '用户id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `package_name` varchar(256) NOT NULL COMMENT '词包名',
  `package_type` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '词包类型，1：公有词包，2：自有词包',
  `default_word` varchar(256) NOT NULL DEFAULT '' COMMENT '词包的默认词',
  `version` bigint(20) NOT NULL COMMENT '词包版本号',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `pair_state` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '是否配对 0:未配对 1:配对中 2:已配对',
  `logic_state` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '逻辑状态:0-有效,1-无效',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)/*,
  KEY `idx_user_id_state_logic_state` (`user_id`,`state`,`logic_state`)
  KEY `idx_package_type` (`package_type`)*/
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='词包表'*/;

CREATE TABLE `audit_word_package` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `entity_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '实体id',
  `version` bigint(20) NOT NULL DEFAULT '-1' COMMENT '物料版本号',
  `audit_type` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核类型',
  `user_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '账户id',
  `campaign_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '计划id',
  `audit_state` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核状态（0:通过，1:待审，2:拒绝）',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `reason_code` varchar(4096) NOT NULL DEFAULT '' COMMENT '拒绝理由code，多个逗号分隔',
  `reason` varchar(4096) NOT NULL DEFAULT '' COMMENT '其他拒绝理由',
  `audit_start_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '开始审核时间',
  `audit_end_time` DATETIME NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '审核完成时间',
  `extend` varchar(4096) DEFAULT '' COMMENT '扩展字段',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `modify_day_tag` int (10) NOT NULL DEFAULT '-1' COMMENT '修改时间(单位天 用于统计索引)',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `idx_entity_id_audit_type` (`entity_id`,`audit_type`),
  KEY `idx_user_id_campaign_id` (`user_id`,`campaign_id`),
  KEY `idx_user_id_audit_type_state` (`user_id`,`audit_type`,`audit_state`),
  KEY `idx_modify_day_tag` (`modify_day_tag`)*/
)/* ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='词包审核表'*/;


 CREATE TABLE `word_package_detail` (
  `id` bigint(20) AUTO_INCREMENT COMMENT '主键',
  `package_id` bigint(20) NOT NULL COMMENT '词包id',
  `audit_state` tinyint(4) NOT NULL DEFAULT '1' COMMENT '审核状态 0:通过 1:待审 2:拒绝',
  `word` varchar(256) NOT NULL DEFAULT '' COMMENT '词面',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `reason_code` varchar(4096) NOT NULL DEFAULT '' COMMENT '拒绝理由code，多个逗号分隔',
  `reason` varchar(4096) NOT NULL DEFAULT '' COMMENT '其他拒绝理由',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)/*,
  KEY `idx_package_id_audit_state` (`package_id`,`audit_state`)*/
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='词包详情表'*/;


CREATE TABLE `audit_pair` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `entity_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '实体id',
  `entity_type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '实体类型, 1:creative 3:package',
  `version` bigint(20) NOT NULL DEFAULT '0' COMMENT '实体版本号',
  `target_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '被配对对象id',
  `word` varchar(256) NOT NULL DEFAULT '' COMMENT '配对命中的词',
  `reason` text COMMENT '配对拒绝理由',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)/*,
  KEY `idx_entity_id_type_version` (`entity_id`,`entity_type`,`version`)*/
)/* ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='配对审核表'*/;

CREATE TABLE `audit_campaign_material` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL DEFAULT 0 COMMENT '用户ID',
  `user_source` int(11) NOT NULL DEFAULT '0' COMMENT '用户来源',
  `campaign_id` bigint(20) NOT NULL DEFAULT 0 COMMENT '计划ID',
  `auditor_id` bigint(20) NOT NULL DEFAULT -1 COMMENT '审核员ID',
  `campaign_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '计划更新时间',
  `ad_resource_id` INT(10) NOT NULL DEFAULT '-1' COMMENT '投放位置：2147483647优选广告位 1信息流 2正文页 3信息流&正文页',
  `feature` INT(10) NOT NULL DEFAULT '0' COMMENT 'Bitmap，创意工具使用：1动态词包 2程序化创意 4版权库 8建站',
  `site_id` BIGINT(20) NOT NULL DEFAULT '0' COMMENT '移动建站站点id',
  `state` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '计划创意配对状态:0-有待审配对,该状态进待审列表页,1-无配对有待审,2-无配对无待审',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `uk_user_id_campaign_id` (`user_id`,`campaign_id`)*/
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='审核计划物料信息'*/;

CREATE TABLE `user_info_config` (
  `user_id` bigint(20) NOT NULL COMMENT '主键 用户id',
  `priority` bigint(20) NOT NULL DEFAULT '0' COMMENT '优先级：-1表示搁置、0正常、>0表示优审，优审账户的物料会被优先领取（priority desc）',
  `create_time` timestamp NOT NULL DEFAULT '2010-01-01 00:00:00' COMMENT '创建时间',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id:-1表示未被任何审核员修改优先级，>0表示最后修改优先级的审核员id',
  PRIMARY KEY (`user_id`)/*,
  KEY `idx_priority` (`priority`)*/
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户配置表'*/;


CREATE TABLE `quality_check` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `sample_date` DATETIME NOT NULL COMMENT '抽样日期',
  `user_id` BIGINT(20) NOT NULL DEFAULT '-1' COMMENT '账户id',
  `user_name` VARCHAR(128) NOT NULL DEFAULT '' COMMENT '用户名',
  `check_state` TINYINT(4) NOT NULL DEFAULT '-1' COMMENT '质检状态（0:未质检，1:已质检）',
  `last_checker_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '最近质检人ID',
  `last_checker_name` VARCHAR(128) NOT NULL DEFAULT '' COMMENT '最近质检人名称',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `idx_sample_date_user_id` (`sample_date`,`user_id`),
  KEY `idx_user_name` (`user_name`)*/
) /*ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='质检主表'*/;

CREATE TABLE `quality_check_audit_campaign` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `quality_check_id` BIGINT(20) NOT NULL DEFAULT '-1' COMMENT '质检表id',
  `audit_campaign_id` BIGINT(20) NOT NULL COMMENT '推广计划审核id',
  `campaign_id` BIGINT(20) NOT NULL DEFAULT '-1' COMMENT '计划id',
  `audit_type` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核类型',
  `audit_state` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核状态（0:通过，2:拒绝）',
  `auditor_id` VARCHAR(256) NOT NULL DEFAULT '-1' COMMENT '审核员ID',
  `auditor_name` VARCHAR(256) NOT NULL DEFAULT '' COMMENT '审核员名称',
  `audit_reason` varchar(4096) NOT NULL DEFAULT '' COMMENT '审核拒绝理由',
  `audit_end_time` DATETIME NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '审核完成时间',
  `check_state` TINYINT(4) NOT NULL DEFAULT '-1' COMMENT '质检状态（0:未质检，1:已质检）',
  `checker_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '质检人ID',
  `checker_name` VARCHAR(128) NOT NULL DEFAULT '' COMMENT '质检人名称',
  `check_result` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '质检结果（0:通过，2:拒绝）',
  `reason_code` VARCHAR(4096) NOT NULL DEFAULT '' COMMENT '拒绝理由code，多个逗号分隔',
  `reason` VARCHAR(4096) NOT NULL DEFAULT '' COMMENT '质检拒绝理由',
  `check_time` DATETIME NULL COMMENT '质检时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `idx_qc_id_ac_id` (`quality_check_id`,`audit_campaign_id`)*/
) /*ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='质检明细审核推广计划表'*/;

CREATE TABLE `quality_check_audit_creative` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `quality_check_id` BIGINT(20) NOT NULL DEFAULT '-1' COMMENT '质检表id',
  `audit_creative_id` BIGINT(20) NOT NULL COMMENT '创意审核id',
  `creative_id` BIGINT(20) NOT NULL COMMENT '创意id',
  `campaign_id` BIGINT(20) NOT NULL DEFAULT '-1' COMMENT '计划id',
  `audit_type` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核类型',
  `audit_state` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核状态（0:通过，2:拒绝）',
  `auditor_id` VARCHAR(256) NOT NULL DEFAULT '-1' COMMENT '审核员ID',
  `auditor_name` VARCHAR(256) NOT NULL DEFAULT '' COMMENT '审核员名称',
  `audit_reason` varchar(4096) NOT NULL DEFAULT '' COMMENT '审核拒绝理由',
  `audit_end_time` DATETIME NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '审核完成时间',
  `check_state` TINYINT(4) NOT NULL DEFAULT '-1' COMMENT '质检状态（0:未质检，1:已质检）',
  `checker_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '质检人ID',
  `checker_name` VARCHAR(128) NOT NULL DEFAULT '' COMMENT '质检人名称',
  `check_result` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '质检结果（0:通过，2:拒绝）',
  `reason_code` VARCHAR(4096) NOT NULL DEFAULT '' COMMENT '拒绝理由code，多个逗号分隔',
  `reason` VARCHAR(4096) NOT NULL DEFAULT '' COMMENT '质检拒绝理由',
  `check_time` DATETIME NULL COMMENT '质检时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `idx_qc_id_ac_id` (`quality_check_id`,`audit_creative_id`)*/
) /*ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='质检明细审核创意表'*/;

CREATE TABLE `quality_check_campaign_snapshot` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `quality_check_id` BIGINT(20) NOT NULL DEFAULT '-1' COMMENT '质检表id',
  `campaign_id` BIGINT(20) NOT NULL COMMENT '推广计划id',
  `name` VARCHAR(128) NOT NULL COMMENT '计划名称',
  `uc_id` BIGINT(20) NOT NULL COMMENT '用户id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `group_id` BIGINT(20) NOT NULL COMMENT '推广组id',
  `type` SMALLINT(6) NOT NULL DEFAULT '0' COMMENT '标的物类型，1:落地页，2:APP iOS，4:APP Android, 8:商品',
  `ad_resource_id` INT(10) NOT NULL DEFAULT '-1' COMMENT '投放位置：2147483647优选广告位 1信息流 2正文页 3信息流&正文页',
  `platform` INT(10) NOT NULL DEFAULT '0' COMMENT '平台描述',
  `site_id` BIGINT(20) NOT NULL DEFAULT '0' COMMENT '移动建站站点id',
  `target_url` varchar(1024) DEFAULT NULL COMMENT '落地页url',
  `download_url` varchar(1024) DEFAULT NULL COMMENT '下载url',
  `content` TEXT NOT NULL COMMENT 'JSON数据',
  `paused` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '0启用 1暂停',
  `logic_state` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '逻辑状态:0-有效,1-无效',
  `version` bigint(20) DEFAULT NULL COMMENT '送审时间戳',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `idx_qc_id_campaign_id` (`quality_check_id`,`campaign_id`)*/
)/* ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='质检推广计划快照表'*/;

CREATE TABLE `quality_check_creative_snapshot` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `quality_check_id` BIGINT(20) NOT NULL DEFAULT '-1' COMMENT '质检表id',
  `creative_id` BIGINT(20) NOT NULL COMMENT '创意id',
  `uc_id` BIGINT(20) NOT NULL COMMENT '用户id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `group_id` BIGINT(20) NOT NULL COMMENT '推广组id',
  `campaign_id` BIGINT(20) NOT NULL COMMENT '推广计划id',
  `type` SMALLINT(6) NOT NULL DEFAULT '0' COMMENT '创意类型：0普通创意 1动态组合',
  `style` INT(10) NOT NULL DEFAULT '0' COMMENT 'Bitmap，创意样式：1大图 2小图 4三图 8GIF 16视频',
  `feature` INT(10) NOT NULL DEFAULT '0' COMMENT 'Bitmap，创意工具使用：1动态词包 2程序化创意 4版权库 8建站',
  `title` text NOT NULL COMMENT '创意标题',
  `description` text NOT NULL COMMENT '创意描述',
  `source` varchar(128) DEFAULT NULL COMMENT '来源',
  `target_url` varchar(1024) DEFAULT NULL COMMENT '落地页url',
  `content` TEXT NOT NULL COMMENT 'JSON数据，物料数据',
  `wildcard_ids` VARCHAR(255) DEFAULT '' COMMENT '以逗号分割的词包id',
  `download_type` int(10) NOT NULL DEFAULT '0' COMMENT '创意下载类型，0表示其他，1表示apk，2表示appstore，3表示all',
  `paused` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '0启用 1暂停',
  `ad_style_id` int(10) DEFAULT NULL COMMENT '广告样式',
  `ad_style_type` int(10) NOT NULL DEFAULT '1' COMMENT '样式类型:0-旧样式 1-芳华样式',
  `logic_state` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '逻辑状态:0-有效,1-无效',
  `version` bigint(20) DEFAULT NULL COMMENT '物料版本号',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `pair_state` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '是否配对 0:未配对 1:配对中 2:已配对',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `idx_qc_id_creative_id` (`quality_check_id`,`creative_id`)*/
) /*ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='质检创意快照表'*/;

CREATE TABLE `material_allocation_history` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `type` TINYINT(4) NOT NULL COMMENT '类型 1:汇川普通创意',
  `entity_id` BIGINT(20) NOT NULL COMMENT '分配id',
  `auditor_id` BIGINT(20) NOT NULL COMMENT '审核员id',
  `allocation_time`  DATETIME NOT NULL COMMENT '分配时间',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `idx_type_id` (`type`,`entity_id`)*/
)/* ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='物料分配历史表'*/;

create table `audit_rule_set` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `entity_type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '实体类型(0：汇川计划，1：汇川创意，2：汇川附件创意，3：汇川词包)',
  `audit_type` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核类型(0：人工审核，1：自动审核，2：URL审核，3：模型审核)',
  `version` bigint(20) NOT NULL COMMENT '版本号',
  `state` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否生效，0：新建，1：生效中，2：已失效，相同的entity_type audit_type只有一个生效中',
  `rule` text NOT NULL COMMENT 'audit_rule.id 多个，用,分隔',
  `default_audit_state` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '兜底审核状态(0:通过，1:待审，2:拒绝，3:发人工)',
  `description` varchar(512) NOT NULL COMMENT '规则描述',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `start_time` datetime NULL COMMENT '生效时间 state=1，2时有效',
  `end_time` datetime NULL COMMENT '失效时间，state=2时有效',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `idx_entity_audit_type` (`entity_type`,`audit_type`,`version`)*/
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='规则集-决策节点表'*/;

create table `audit_rule` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `entity_type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '实体类型(0：汇川计划，1：汇川创意，2：汇川附件创意，3：汇川词包)',
  `audit_type` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核类型(0：人工审核，1：自动审核，2：URL审核，3：模型审核)',
  `title` varchar(128) NOT NULL COMMENT '规则名称',
  `description` varchar(512) NOT NULL COMMENT '规则描述',
  `state` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否生效，0：不生效，1：生效',
  `expression` varchar(1024) NOT NULL COMMENT '规则 json',
  `priority` int(10) NOT NULL DEFAULT 0 COMMENT '优先级',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
)/* ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='规则表'*/;

CREATE TABLE `audit_rule_meta` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `entity_type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '实体类型(0：汇川计划，1：汇川创意，2：汇川附件创意，3：汇川词包)',
  `field` varchar(128) NOT NULL COMMENT 'field 如userId, riskId, code, value',
  `name` varchar(128) NOT NULL COMMENT 'field 名称 用于前端展示',
  `fact_field` varchar(128) NOT NULL COMMENT 'fact中field，如，user.type user.industry1, 多个用,分隔',
  `fact_multiple` tinyint(4) NOT NULL DEFAULT '0' COMMENT 'fact中该field是否是数组，0:单值, 1:数组',
  `field_type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '字段值类型，0：string，1：long，2：double',
  `state` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否生效，0：不生效，1：生效',
  `operator` varchar(128) NOT NULL COMMENT '可以使用的操作符，多个用,分隔',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='规则模板表'*/;

CREATE TABLE `audit_entity_detail_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `dt` int(10) NOT NULL DEFAULT '-1' COMMENT '日期(单位天，yyyyMMdd)',
  `entity_type` int(11) NOT NULL DEFAULT '1' COMMENT '实体类型（0：汇川计划，1：汇川创意，2：汇川附件创意，3：汇川词包）',
  `entity_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '实体id',
  `audit_type` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核类型（0：人工一审，1：自动审核，2：URL审核，3：模型审核，100：人工二审）',
  `user_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '账户id',
  `sme` tinyint(4) NOT NULL DEFAULT 0 COMMENT  '是否中小（0：否，1：是）',
  `industry1` int(11) NOT NULL DEFAULT 0 COMMENT '一级行业',
  `audit_state` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核状态（0:审核通过，1:审核中，2:审核拒绝，3：人工审核中）',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `audit_start_time` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核开始时间',
  `audit_end_time` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核完成时间',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) /*ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='审核实体 - 明细日志表'*/;

CREATE TABLE `audit_campaign_log_history` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `campaign_id` BIGINT(20) NOT NULL COMMENT '推广计划id',
  `campaign_name` VARCHAR(128) NOT NULL COMMENT '计划名称',
  `uc_id` BIGINT(20) NOT NULL COMMENT '用户id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `group_id` BIGINT(20) NOT NULL COMMENT '推广组id',
  `type` SMALLINT(6) NOT NULL DEFAULT '0' COMMENT '标的物类型，1:落地页，2:APP iOS，4:APP Android, 8:商品',
  `ad_resource_id` INT(10) NOT NULL DEFAULT '-1' COMMENT '投放位置：2147483647优选广告位 1信息流 2正文页 3信息流&正文页',
  `platform` INT(10) NOT NULL DEFAULT '0' COMMENT '平台描述',
  `site_id` BIGINT(20) NOT NULL DEFAULT '0' COMMENT '移动建站站点id',
  `target_url` varchar(1024) DEFAULT NULL COMMENT '落地页url',
  `download_url` varchar(1024) DEFAULT NULL COMMENT '下载url',
  `content` TEXT NOT NULL COMMENT 'JSON数据',
  `paused` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '0启用 1暂停',
  `logic_state` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '逻辑状态:0-有效,1-无效',
  `version` bigint(20) DEFAULT NULL COMMENT '送审时间戳',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `audit_type` VARCHAR (128) NOT NULL DEFAULT '' COMMENT '审核类型，逗号分隔',
  `audit_detail` TEXT NOT NULL COMMENT '审核记录',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)/*,
  KEY `idx_campaign_id` (`campaign_id`),
  KEY `idx_user_id` (`user_id`)*/
)/* ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='推广计划审核历史表'*/;

CREATE TABLE `audit_creative_log_history` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `creative_id` BIGINT(20) NOT NULL COMMENT '创意id',
  `uc_id` BIGINT(20) NOT NULL COMMENT '用户id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `group_id` BIGINT(20) NOT NULL COMMENT '推广组id',
  `campaign_id` BIGINT(20) NOT NULL COMMENT '推广计划id',
  `type` SMALLINT(6) NOT NULL DEFAULT '0' COMMENT '创意类型：0普通创意 1动态组合',
  `style` INT(10) NOT NULL DEFAULT '0' COMMENT 'Bitmap，创意样式：1大图 2小图 4三图 8GIF 16视频',
  `feature` INT(10) NOT NULL DEFAULT '0' COMMENT 'Bitmap，创意工具使用：1动态词包 2程序化创意 4版权库 8建站',
  `title` text NOT NULL COMMENT '创意标题',
  `description` text NOT NULL COMMENT '创意描述',
  `source` varchar(128) DEFAULT NULL COMMENT '来源',
  `target_url` varchar(1024) DEFAULT NULL COMMENT '落地页url',
  `content` TEXT NOT NULL COMMENT 'JSON数据，物料数据',
  `wildcard_ids` VARCHAR(255) DEFAULT '' COMMENT '以逗号分割的词包id',
  `download_type` int(10) NOT NULL DEFAULT '0' COMMENT '创意下载类型，0表示其他，1表示apk，2表示appstore，3表示all',
  `paused` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '0启用 1暂停',
  `ad_style_id` int(10) DEFAULT NULL COMMENT '广告样式',
  `ad_style_type` int(10) NOT NULL DEFAULT '1' COMMENT '样式类型:0-旧样式 1-芳华样式',
  `logic_state` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '逻辑状态:0-有效,1-无效',
  `version` bigint(20) DEFAULT NULL COMMENT '物料版本号',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `audit_type` VARCHAR (128) NOT NULL DEFAULT '' COMMENT '审核类型，逗号分隔',
  `audit_detail` TEXT NOT NULL COMMENT '审核记录',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)/*,
  KEY `idx_creative_id` (`creative_id`),
  KEY `idx_user_id` (`user_id`)*/
) /*ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='创意审核历史表'*/;


CREATE TABLE `audit_attach_creative_log_history` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `attach_creative_id` BIGINT(20) NOT NULL COMMENT '附加创意ID',
  `uc_id` BIGINT(20) NOT NULL COMMENT '用户id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `group_id` BIGINT(20) NOT NULL COMMENT '推广组id',
  `campaign_id` BIGINT(20) NOT NULL COMMENT '推广计划id',
  `description` TEXT NOT NULL COMMENT '创意描述',
  `extra_style_id` INT(10) DEFAULT '-1' COMMENT '-1没有附加样式, 1电话，2表单 3立即下载',
  `component_id` BIGINT(20) DEFAULT '0' COMMENT '组件id',
  `content` TEXT NOT NULL COMMENT 'JSON数据',
  `logic_state` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '逻辑状态:0-有效,1-无效',
  `version` bigint(20) DEFAULT NULL COMMENT '物料版本号',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `audit_type` VARCHAR (128) NOT NULL DEFAULT '' COMMENT '审核类型，逗号分隔',
  `audit_detail` TEXT NOT NULL COMMENT '审核记录',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)/*,
  KEY `idx_attach_creative_id` (`attach_creative_id`),
  KEY `idx_user_id` (`user_id`)*/
) /*ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='附加创意审核历史表'*/;


CREATE TABLE `audit_word_package_log_history` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `package_id` bigint(20) NOT NULL COMMENT '词包id',
  `uc_id` BIGINT(20) NOT NULL COMMENT '用户id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `package_name` varchar(256) NOT NULL COMMENT '词包名',
  `package_type` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '词包类型，1：公有词包，2：自有词包',
  `version` bigint(20) NOT NULL COMMENT '词包版本号',
  `word` varchar(256) NOT NULL DEFAULT '' COMMENT '词面',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `audit_type` VARCHAR (128) NOT NULL DEFAULT '' COMMENT '审核类型，逗号分隔',
  `audit_detail` TEXT NOT NULL COMMENT '审核记录',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)/*,
  KEY `idx_package_id` (`package_id`),
  KEY `idx_user_id` (`user_id`)*/
) /*ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='词包审核历史表'*/;

CREATE TABLE `audit_patrol_campaign` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `patrol_type` int(11) NOT NULL COMMENT '巡查类型，1：策略推送，2：落地页内容审核，4：网民举报，8：落地页篡改',
  `campaign_id` BIGINT(20) NOT NULL COMMENT '计划id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `target_url` varchar(1024) DEFAULT NULL COMMENT '落地页url',
  `effect_url` varchar(1024) DEFAULT NULL COMMENT '风险url',
  `hit_words` varchar(2048) DEFAULT NULL COMMENT '落地页命中的风险词，{"1":"低俗","2":"医疗"}',
  `risk_type` varchar(2048) NOT NULL COMMENT '风险类型，逗号分隔的风险标签',
  `risk_rate` varchar(255) DEFAULT NULL COMMENT '风险值：{"1":0.5,"2":0.3}',
  `url_snapshot` varchar(255) DEFAULT NULL COMMENT '页面截图地址',
  `operate` tinyint(6) NOT NULL DEFAULT '-1' COMMENT '操作类型 1：有风险，0：无风险，-1：未操作',
  `audit_tag` varchar(2048) NOT NULL DEFAULT '' COMMENT '风险类型，逗号分隔的风险标签',
  `auditor_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '审核员id',
  `audit_time` DATETIME NULL COMMENT '审核时间',
  `patrol_date` int(11) NULL COMMENT '巡查时间,yyyyMMdd',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `uk_patrol_campaign_type` (`patrol_type`,`campaign_id`, `patrol_date`),
  KEY `idx_patrol_date` (`patrol_date`, `patrol_type`),
  KEY `idx_patrol_user` (`patrol_date`, `user_id`, `patrol_type`),
  KEY `idx_patrol_campaign` (`patrol_date`,`campaign_id`)*/
)/* ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='计划巡查审核表'*/;

CREATE TABLE `audit_patrol_creative` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `patrol_type` int(11) NOT NULL COMMENT '巡查类型，8：网民举报',
  `creative_id` BIGINT(20) NOT NULL COMMENT '创意id',
  `campaign_id` BIGINT(20) NOT NULL COMMENT '计划id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `target_url` varchar(1024) DEFAULT NULL COMMENT '落地页url',
  `effect_url` varchar(1024) DEFAULT NULL COMMENT '风险url',
  `hit_words` varchar(2048) DEFAULT NULL COMMENT '落地页命中的风险词，{"1":"低俗","2":"医疗"}',
  `risk_type` varchar(2048) NOT NULL COMMENT '风险类型，逗号分隔的风险标签',
  `risk_rate` varchar(255) DEFAULT NULL COMMENT '风险值：{"1":1}',
  `url_snapshot` varchar(255) DEFAULT NULL COMMENT '页面截图地址',
  `operate` tinyint(6) NOT NULL DEFAULT '-1' COMMENT '操作类型 1：有风险，0：无风险，-1：未操作',
  `audit_tag` varchar(2048) DEFAULT '' COMMENT '风险类型，逗号分隔的风险标签',
  `auditor_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '审核员id',
  `audit_time` DATETIME NULL COMMENT '审核时间',
  `patrol_date` int(11) NULL COMMENT '巡查时间,yyyyMMdd',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `uk_patrol_creative_type` (`patrol_type`,`creative_id`, `patrol_date`),
  KEY `idx_campaign_id` (`patrol_date`, `campaign_id`)*/
) /*ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='创意巡查审核表'*/;

CREATE TABLE `audit_patrol_risk` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `entity_id` BIGINT(20) NOT NULL COMMENT '实体id',
  `type` SMALLINT(6) NOT NULL DEFAULT '0' COMMENT '实体类型：0-计划，1-创意',
  `patrol_type` int(11) NOT NULL COMMENT '巡查类型，巡查类型，1：落地页内容审核，2：落地页篡改，4：策略巡查，8：网民举报',
  `uc_id` BIGINT(20) DEFAULT NULL COMMENT '用户id',
  `user_id` BIGINT(20) DEFAULT NULL COMMENT '账户id',
  `target_url` varchar(1024) DEFAULT NULL COMMENT '落地页url',
  `effect_url` varchar(1024) DEFAULT NULL COMMENT '风险url',
  `hit_words` varchar(2048) DEFAULT NULL COMMENT '落地页命中的风险词，{"1":"低俗","2":"医疗"}',
  `risk_type` varchar(2048) NOT NULL COMMENT '风险类型，逗号分隔的风险标签',
  `risk_rate` varchar(255) DEFAULT NULL COMMENT '风险值：{"1":1}',
  `url_snapshot` varchar(255) DEFAULT NULL COMMENT '页面截图地址',
  `patrol_date` int(11) NULL COMMENT '巡查时间,yyyyMMdd',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)/*,
  KEY `idx_patrol_date` (`patrol_date`)*/
) /*ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='巡查原始数据表'*/;

CREATE TABLE `ara_hc_pv_sample` (
    `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
    `group_id` BIGINT NOT NULL DEFAULT -1 COMMENT '推广组id',
    `campaign_id` BIGINT NOT NULL DEFAULT -1 COMMENT '推广计划id',
    `creative_id` BIGINT NOT NULL DEFAULT -1 COMMENT '推广创意id',
    `creative_type` INT NOT NULL DEFAULT -1 COMMENT '创意类型：0普通创意 1动态组合',
    `objective_type` INT NOT NULL DEFAULT -1 COMMENT '标的物类型，1:落地页，2:APP iOS，4:APP Android, 8:商品',
    `content` TEXT NOT NULL COMMENT 'JSON数据，物料内容',
    `ad_resource_id` INT NOT NULL DEFAULT -1 COMMENT '推广资源包id',
    `ad_style_id` BIGINT NOT NULL DEFAULT -1 COMMENT '芳华样式',
    `style` BIGINT NOT NULL DEFAULT -1 COMMENT '样式组:创意样式：1大图 2小图 4三图 8GIF 16视频',
    `account_id` BIGINT NOT NULL DEFAULT -1 COMMENT '广告主id',
    `user_source` INT DEFAULT 0 COMMENT '账户来源,0:无，7：中小子账户，9：ka子账户，11：换量投放账户',
    `industry1_id` INT DEFAULT 0 COMMENT '一级行业',
    `industry2_id` INT DEFAULT 0 COMMENT '二级行业',
    `industry3_id` INT DEFAULT 0 COMMENT '三级行业',
    `tag_content` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '用户风险标签',
    `show_time` VARCHAR(20)  NOT NULL DEFAULT '' COMMENT '广告展示时间戳',
    `region_id` BIGINT DEFAULT -1 COMMENT '点击用户地域id',
    `bucket_type` INT NOT NULL DEFAULT -1 COMMENT '内外渠类型:0,应用商店;1,内渠;2,外渠',
    `bucket_id` BIGINT NOT NULL DEFAULT -1 COMMENT '内外渠id',
    `media_id` BIGINT NOT NULL DEFAULT -1 COMMENT '媒体id',
    `os_id` BIGINT NOT NULL DEFAULT -1 COMMENT '0:ios,1:安卓,100:other',
    `ua` VARCHAR(512)  NOT NULL DEFAULT '' COMMENT '设备user-agent',
    `event_ip` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '用户ip',
    `event_ipv6` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '用户ip',
    `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `dimension` INT(6) NOT NULL DEFAULT -1 COMMENT '采样维度',
    `dt` INT COMMENT'采样日期:yyyMMdd,分组字段',
    PRIMARY KEY (`id`)/*,
    INDEX `idx_dt_creative_id` (`dt`,`creative_id`)*/
) /*ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '汇川PV采样原始表'*/;

CREATE TABLE `ara_hc_pv_stat` (
    `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
    `creative_id` BIGINT NOT NULL COMMENT '创意id,标记字段',
    `ad_resource_id` INT NOT NULL DEFAULT -1 COMMENT '广告来源类型',
    `bucket_type` INT NOT NULL DEFAULT -1 COMMENT '广告的内外渠类型:0,应用商店;1,内渠;2,外渠',
    `user_source` INT NOT NULL DEFAULT -1 COMMENT '用户来源',
    `pv` INT NOT NULL DEFAULT 1 COMMENT 'PV数量,统计字段',
    `dt` INT COMMENT'采样日期:yyyMMdd,分组字段',
    `dimension` INT(6) NOT NULL DEFAULT 0 COMMENT '采样维度',
    `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY KEY (`id`)/*,
    KEY `idx_dt_tag_id` (`dt`,`dimension`,`creative_id`)*/
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT = '汇川物料PV统计'*/;

CREATE TABLE `ara_hc_creative_sample` (
    `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
    `creative_id` BIGINT NOT NULL COMMENT '创意id',
    `user_id` BIGINT NOT NULL COMMENT '账户id',
    `group_id` BIGINT NOT NULL COMMENT '推广组id',
    `campaign_id` BIGINT NOT NULL COMMENT '推广计划id',
    `title` TEXT NOT NULL COMMENT '创意标题',
    `description` TEXT NOT NULL COMMENT '创意描述',
    `target_url` VARCHAR(1024) DEFAULT NULL COMMENT '落地页url',
    `content` TEXT NOT NULL COMMENT 'JSON数据，物料数据',
    `ad_style_id` INT NOT NULL DEFAULT 0 COMMENT '样式模板的版本号，芳华样式专有',
    `ad_style_type` INT NOT NULL DEFAULT 1 COMMENT '样式类型:0-旧样式 1-芳华样式,默认新芳华',
    `platform` INT(10) NOT NULL DEFAULT 0 COMMENT '平台描述',
    `dt` INT COMMENT'采样日期:yyyMMdd,分组字段',
    `tag_target` INT(6) NOT NULL DEFAULT 0 COMMENT '打标对象,支持位运算: 文字,图片,落地页',
    `mark_state` INT(4) NOT NULL DEFAULT 1  COMMENT '任务打标状态：1:未打标,0:无风险,2:有风险',
    `mark_result` VARCHAR (1024) NOT NULL DEFAULT '' COMMENT '标签ID列表,逗号分割',
    `mark_time` DATETIME NOT NULL DEFAULT '9999-12-31 23:59:59' COMMENT '标注时间',
    `operator_id` BIGINT NOT NULL DEFAULT -1 COMMENT '操作人id',
    PRIMARY KEY (`id`)/*,
    UNIQUE `dt_creative_id` (`dt`,`creative_id`)*/
) /*ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '汇川物料采样镜像表'*/;


CREATE TABLE `ara_hc_creative_risk_detail` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `tag_name` varchar(512) NOT NULL COMMENT '风险标签名称,分组字段',
  `tag_target` INT(6) NOT NULL COMMENT '打标对象,文字,图片,落地页,',
  `creative_id` bigint(20) NOT NULL COMMENT '创意id,标记字段',
  `dt` INT COMMENT '采样日期:yyyMMdd,分组字段',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)/*,
  INDEX `idx_dt_creative` (`dt`,`creative_id`)*/
)/* ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT = '汇川物料风险分布统计'*/;


CREATE TABLE `brand_creative` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `name` VARCHAR(128) NOT NULL COMMENT '创意名称',
  `media` TINYINT NOT NULL COMMENT '媒体，见Media枚举',
  `resource_type` TINYINT(4) NOT NULL COMMENT '资源类型，见ResourceType枚举',
  `ad_style_id` INT(10) DEFAULT NULL COMMENT '广告样式',
  `ad_style_type` int(10) NOT NULL DEFAULT '1' COMMENT '样式类型:0-旧样式 1-芳华样式',
  `content` TEXT NOT NULL COMMENT 'JSON物料数据',
  `logic_state` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '逻辑状态:0-有效,1-无效',
  `version` BIGINT(20) DEFAULT NULL COMMENT '版本号',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `create_user_id` BIGINT NOT NULL COMMENT '创建人账户Id',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_user_id` BIGINT NOT NULL COMMENT '修改人账户Id',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
);

CREATE TABLE `brand_target_url` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `target_url` VARCHAR(1024) DEFAULT NULL COMMENT '落地页url',
  `creative_id` BIGINT(20) NOT NULL COMMENT '创意id',
  `logic_state` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '逻辑状态:0-有效,1-无效',
  `version` BIGINT(20) DEFAULT NULL COMMENT '版本号',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `create_user_id` BIGINT NOT NULL COMMENT '创建人账户Id',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_user_id` BIGINT NOT NULL COMMENT '修改人账户Id',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
);

CREATE TABLE `audit_brand_creative` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `entity_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '实体id',
  `version` bigint(20) NOT NULL DEFAULT '-1' COMMENT '版本号',
  `audit_type` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核类型',
  `user_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '账户id',
  `audit_state` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核状态（0:通过，1:待审，2:拒绝）',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `reason_code` varchar(4096) NOT NULL DEFAULT '' COMMENT '拒绝理由code，多个逗号分隔',
  `reason` varchar(4096) NOT NULL DEFAULT '' COMMENT '其他拒绝理由',
  `audit_start_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '开始审核时间',
  `audit_end_time` DATETIME NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '审核完成时间',
  `extend` varchar(4096) DEFAULT '' COMMENT '扩展字段',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `modify_day_tag` int (10) NOT NULL DEFAULT '-1' COMMENT '修改时间(单位天 用于统计索引)',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
);

CREATE TABLE `audit_brand_target_url` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `entity_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '实体id',
  `version` bigint(20) NOT NULL DEFAULT '-1' COMMENT '版本号',
  `audit_type` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核类型',
  `user_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '账户id',
  `audit_state` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核状态（0:通过，1:待审，2:拒绝）',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `reason_code` varchar(4096) NOT NULL DEFAULT '' COMMENT '拒绝理由code，多个逗号分隔',
  `reason` varchar(4096) NOT NULL DEFAULT '' COMMENT '其他拒绝理由',
  `audit_start_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '开始审核时间',
  `audit_end_time` DATETIME NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '审核完成时间',
  `extend` varchar(4096) DEFAULT '' COMMENT '扩展字段',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `modify_day_tag` int (10) NOT NULL DEFAULT '-1' COMMENT '修改时间(单位天 用于统计索引)',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
);

CREATE TABLE `audit_brand_creative_log_history` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `creative_id` BIGINT(20) NOT NULL DEFAULT '-1' COMMENT '创意id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `name` VARCHAR(128) NOT NULL COMMENT '创意名称',
  `media` TINYINT NOT NULL COMMENT '媒体，见Media枚举',
  `resource_type` TINYINT(4) NOT NULL COMMENT '资源类型，见ResourceType枚举',
  `ad_style_id` INT(10) DEFAULT NULL COMMENT '广告样式',
  `ad_style_type` int(10) NOT NULL DEFAULT '1' COMMENT '样式类型:0-旧样式 1-芳华样式',
  `content` TEXT NOT NULL COMMENT 'JSON物料数据',
  `logic_state` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '逻辑状态:0-有效,1-无效',
  `version` BIGINT(20) DEFAULT NULL COMMENT '物料版本号',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `audit_type` VARCHAR (128) NOT NULL DEFAULT '' COMMENT '审核类型，逗号分隔',
  `audit_detail` TEXT NOT NULL COMMENT '审核记录',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
);

CREATE TABLE `audit_brand_target_url_log_history` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `target_url_id` BIGINT(20) NOT NULL COMMENT '落地页id',
  `creative_id` BIGINT(20) NOT NULL DEFAULT '-1' COMMENT '创意id',
  `name` VARCHAR(128) NOT NULL COMMENT '创意名称',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `target_url` VARCHAR(1024) DEFAULT NULL COMMENT '落地页url',
  `logic_state` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '逻辑状态:0-有效,1-无效',
  `version` BIGINT(20) DEFAULT NULL COMMENT '版本号',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `audit_type` VARCHAR (128) NOT NULL DEFAULT '' COMMENT '审核类型，逗号分隔',
  `audit_detail` TEXT NOT NULL COMMENT '审核记录',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
);

-- 爬虫
CREATE TABLE `ara_compete_ad_sample` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
  `type` INT(6) NOT NULL DEFAULT 0 COMMENT '竞对类型',
  `word` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '关键词',
  `query_url` varchar(1024) DEFAULT NULL COMMENT '搜索链接',
  `query_snapshot` varchar(1024) DEFAULT NULL COMMENT '搜索结果截图',
  `ad_url` varchar(1024) DEFAULT NULL COMMENT '广告URL',
  `ad_html_url` varchar(1024) DEFAULT NULL COMMENT '广告内容URL',
  `ad_snapshot` varchar(1024) DEFAULT NULL COMMENT '广告截图',
  `risk_type` varchar(2048) NOT NULL COMMENT '风险类型，逗号分隔的风险标签',
  `hit_words` varchar(2048) DEFAULT NULL COMMENT '广告内容命中的风险词',
  `audit_tag` varchar(2048) DEFAULT '' COMMENT '风险类型，逗号分隔的风险标签',
  `auditor_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '审核员id',
  `audit_time` DATETIME NULL COMMENT '审核时间',
  `dt` INT COMMENT'采样日期:yyyMMdd,分组字段',
  PRIMARY KEY (`id`)/*,
  INDEX `idx_dt` (`dt`)*/
) /*ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '竞对广告爬取结果表'*/;

CREATE TABLE `ara_query_word` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
  `word` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '关键词',
  `dt` INT COMMENT'采样日期:yyyMMdd,分组字段',
  PRIMARY KEY (`id`)
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT = '竞对广告爬取词表'*/;

-- 企明星

CREATE TABLE `cpt_qmxing_idea` (
  `id` BIGINT(20) NOT NULL COMMENT '创意id',
  `uc_id` BIGINT(20) NOT NULL COMMENT '用户id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `contract_id` BIGINT(20) NOT NULL COMMENT 'contract_id',
  `plan_id` BIGINT(20) NOT NULL COMMENT 'plan_id',
  `style_type` SMALLINT(6) NOT NULL DEFAULT '0' COMMENT '创意类型：0普通创意 1动态组合',
  `brand_name` varchar(256) NOT NULL COMMENT '词包名',
  `corp_name` varchar(256) NOT NULL COMMENT '公司名称',
  `keywords` mediumtext NOT NULL COMMENT '关键字，多个用$进行连接',
  `regions` text NOT NULL COMMENT '推广地域',
  `expect_deploy_time` varchar(20) NOT NULL COMMENT '预计上线时间',
  `real_deploy_time` varchar(20) NOT NULL COMMENT '真实上线时间',
  `content` text NOT NULL COMMENT '创意内容，json格式字符串，包含样式类型property，json中的每个property要与前端协商，从而渲染前端的模板',
  `logic_state` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '逻辑状态:0-有效,1-无效',
  `version` bigint(20) DEFAULT NULL COMMENT '物料版本号',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)/*,
  KEY `idx_user_id` (`user_id`)*/
)/*  ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='企明星创意表'*/;

CREATE TABLE `audit_cpt_qmxing_idea` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `entity_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '实体id',
  `version` bigint(20) NOT NULL DEFAULT '-1' COMMENT '物料版本号',
  `audit_type` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核类型',
  `user_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '账户id',
  `audit_state` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核状态（0:通过，1:待审，2:拒绝）',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `reason_code` varchar(4096) NOT NULL DEFAULT '' COMMENT '拒绝理由code，多个逗号分隔',
  `reason` varchar(4096) NOT NULL DEFAULT '' COMMENT '其他拒绝理由',
  `audit_start_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '开始审核时间',
  `audit_end_time` DATETIME NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '审核完成时间',
  `extend` varchar(1024) DEFAULT '' COMMENT '扩展字段',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `modify_day_tag` int (10) NOT NULL DEFAULT '-1' COMMENT '修改时间(单位天 用于统计索引)',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `idx_entity_id_audit_type` (`entity_id`,`audit_type`),
  KEY `idx_user_id_audit_type_state` (`user_id`,`audit_type`,`audit_state`),
  KEY `idx_modify_day_tag` (`modify_day_tag`) */
)/* ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='企明星创意审核表'*/;

CREATE TABLE `cpt_qmxing_package` (
  `id` bigint(20) NOT NULL COMMENT '主键id',
  `uc_id` BIGINT(20) NOT NULL COMMENT '用户id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `package_name` varchar(300) NOT NULL DEFAULT '' COMMENT '词包名称',
  `company_name` varchar(300) NOT NULL DEFAULT '' COMMENT '公司名称',
  `brand_name` varchar(300) NOT NULL DEFAULT '' COMMENT '品牌名称',
  `launch_region` text NOT NULL COMMENT '推广地域',
  `attachments` text NOT NULL COMMENT '附件',
  `site_url` varchar(1024) NOT NULL DEFAULT '' COMMENT '推广url',
  `audit_word_file` varchar(1024) NOT NULL DEFAULT '' COMMENT '词包文件oss地址',
  `pass_word_file` varchar(1024) NOT NULL DEFAULT '' COMMENT '通过词文件oss地址',
  `reject_word_file` varchar(1024) NOT NULL DEFAULT '' COMMENT '拒绝词文件oss地址',
  `version` bigint(20) NOT NULL COMMENT '词包版本号',
  `create_user_id` bigint(20) NOT NULL COMMENT '创建人',
  `logic_state` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '逻辑状态:0-有效,1-无效',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)/*,
  KEY `idx_user_id` (`user_id`)*/
)/* ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='企明星词包'*/;

CREATE TABLE `audit_cpt_qmxing_package` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `entity_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '实体id',
  `version` bigint(20) NOT NULL DEFAULT '-1' COMMENT '物料版本号',
  `audit_type` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核类型',
  `user_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '账户id',
  `audit_state` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核状态（0:通过，1:待审，2:拒绝）',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `reason_code` varchar(4096) NOT NULL DEFAULT '' COMMENT '拒绝理由code，多个逗号分隔',
  `reason` varchar(4096) NOT NULL DEFAULT '' COMMENT '其他拒绝理由',
  `audit_start_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '开始审核时间',
  `audit_end_time` DATETIME NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '审核完成时间',
  `extend` varchar(1024) DEFAULT '' COMMENT '扩展字段',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `modify_day_tag` int (10) NOT NULL DEFAULT '-1' COMMENT '修改时间(单位天 用于统计索引)',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `idx_entity_id_audit_type` (`entity_id`,`audit_type`),
  KEY `idx_user_id_audit_type_state` (`user_id`,`audit_type`,`audit_state`),
  KEY `idx_modify_day_tag` (`modify_day_tag`)*/
)/* ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='企明星词包审核表'*/;

CREATE TABLE `cpt_qmxing_package_detail` (
  `id` bigint(20) AUTO_INCREMENT COMMENT '主键',
  `package_id` bigint(20) NOT NULL COMMENT '词包id',
  `audit_state` tinyint(4) NOT NULL DEFAULT '1' COMMENT '审核状态 0:通过 1:待审 2:拒绝',
  `word` varchar(256) NOT NULL DEFAULT '' COMMENT '词面',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `reason_code` varchar(4096) NOT NULL DEFAULT '' COMMENT '拒绝理由code，多个逗号分隔',
  `reason` varchar(4096) NOT NULL DEFAULT '' COMMENT '其他拒绝理由',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)/*,
  KEY `idx_package_id_state` (`package_id`,`audit_state`)*/
)/* ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='企明星词包详情表'*/;

-- 站点库
CREATE TABLE `site_page` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `name` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '站点名称',
  `title` VARCHAR(255) DEFAULT '' COMMENT '页面标题',
  `snapshot` VARCHAR(255) DEFAULT '' COMMENT '站点缩略图',
  `inner_url` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '内部url',
  `appid` INT(10) NOT NULL DEFAULT '1' COMMENT '产品线，参见BizType',
  `logic_state` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '逻辑状态:0-有效,1-无效',
  `version` BIGINT(20) DEFAULT NULL COMMENT '版本号',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) /*ENGINE=InnoDB CHARACTER SET=utf8 COMMENT='站点库'*/;

CREATE TABLE `audit_site_page` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `entity_id` BIGINT(20) NOT NULL DEFAULT '-1' COMMENT '实体id',
  `version` BIGINT(20) NOT NULL DEFAULT '-1' COMMENT '版本号',
  `audit_type` TINYINT(4) NOT NULL DEFAULT '-1' COMMENT '审核类型',
  `user_id` BIGINT(20) NOT NULL DEFAULT '-1' COMMENT '账户id',
  `audit_state` TINYINT(4) NOT NULL DEFAULT '-1' COMMENT '审核状态（0:通过，1:待审，2:拒绝）',
  `auditor_id` BIGINT(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `reason_code` VARCHAR(4096) NOT NULL DEFAULT '' COMMENT '拒绝理由code，多个逗号分隔',
  `reason` VARCHAR(4096) NOT NULL DEFAULT '' COMMENT '其他拒绝理由',
  `audit_start_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '开始审核时间',
  `audit_end_time` DATETIME NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '审核完成时间',
  `extend` varchar(1024) DEFAULT '' COMMENT '扩展字段',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `modify_day_tag` int (10) NOT NULL DEFAULT '-1' COMMENT '修改时间(单位天 用于统计索引)',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) /*ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='站点库审核表'*/;

CREATE TABLE `audit_site_page_log_history` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `site_page_id` BIGINT(20) NOT NULL COMMENT '站点库id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `name` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '站点名称',
  `title` VARCHAR(255) DEFAULT '' COMMENT '页面标题',
  `snapshot` VARCHAR(255) DEFAULT '' COMMENT '站点缩略图',
  `inner_url` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '内部url',
  `appid` INT(10) NOT NULL DEFAULT '1' COMMENT '产品线，参见BizType',
  `logic_state` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '逻辑状态:0-有效,1-无效',
  `version` BIGINT(20) DEFAULT NULL COMMENT '版本号',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `audit_type` VARCHAR (128) NOT NULL DEFAULT '' COMMENT '审核类型，逗号分隔',
  `audit_detail` TEXT NOT NULL COMMENT '审核记录',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) /*ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='站点库审核历史表'*/;


-- 应用分发
CREATE TABLE `app_ad_idea` (
  `id` bigint(20) NOT NULL COMMENT '主键id',
  `uc_id` BIGINT(20) NOT NULL COMMENT '用户id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `group_id` BIGINT(20) NOT NULL COMMENT '推广组id',
  `campaign_id` BIGINT(20) NOT NULL COMMENT '计划id',
  `ad_style_id` INT(10) DEFAULT NULL COMMENT '广告样式',
  `app_name` varchar(1024) NOT NULL COMMENT '应用名称',
  `content` TEXT NOT NULL COMMENT 'JSON数据',
  `platform` int(10) DEFAULT NULL COMMENT '平台描述',
  `version` bigint(20) NOT NULL COMMENT '词包版本号',
  `logic_state` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '逻辑状态:0-有效,1-无效',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)/*,
  KEY `idx_user_id` (`user_id`)*/
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='应用分发创意'*/;

CREATE TABLE `audit_app_ad_idea` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `entity_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '实体id',
  `version` bigint(20) NOT NULL DEFAULT '-1' COMMENT '物料版本号',
  `audit_type` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核类型',
  `user_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '账户id',
  `campaign_id` BIGINT(20) NOT NULL COMMENT '计划id',
  `audit_state` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核状态（0:通过，1:待审，2:拒绝）',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `reason_code` varchar(4096) NOT NULL DEFAULT '' COMMENT '拒绝理由code，多个逗号分隔',
  `reason` varchar(4096) NOT NULL DEFAULT '' COMMENT '其他拒绝理由',
  `audit_start_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '开始审核时间',
  `audit_end_time` DATETIME NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '审核完成时间',
  `extend` varchar(1024) DEFAULT '' COMMENT '扩展字段',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `modify_day_tag` int (10) NOT NULL DEFAULT '-1' COMMENT '修改时间(单位天 用于统计索引)',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `idx_entity_id_audit_type` (`entity_id`,`audit_type`),
  KEY `idx_user_id_audit_type_state` (`user_id`,`audit_type`,`audit_state`),
  KEY `idx_modify_day_tag` (`modify_day_tag`)*/
) /*ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='应用分发创意审核表'*/;

CREATE TABLE `audit_app_ad_idea_log_history` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `idea_id` BIGINT(20) NOT NULL COMMENT '创意id',
  `uc_id` BIGINT(20) NOT NULL COMMENT '用户id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `group_id` BIGINT(20) NOT NULL COMMENT '推广组id',
  `campaign_id` BIGINT(20) NOT NULL COMMENT '计划id',
  `ad_style_id` int(10) DEFAULT NULL COMMENT '广告样式',
  `app_name` varchar(1024) NOT NULL COMMENT '应用名称',
  `content` TEXT NOT NULL COMMENT 'JSON数据',
  `platform` int(10) DEFAULT NULL COMMENT '平台描述',
  `version` bigint(20) NOT NULL COMMENT '词包版本号',
  `logic_state` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '逻辑状态:0-有效,1-无效',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `audit_type` VARCHAR (128) NOT NULL DEFAULT '' COMMENT '审核类型，逗号分隔',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `audit_detail` TEXT NOT NULL COMMENT '审核记录',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)/*,
  KEY `idx_idea_id` (`idea_id`),
  KEY `idx_user_id` (`user_id`)*/
) /*ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='应用分发创意审核历史表'*/;

-- 视频交易平台审核
CREATE TABLE `video_exchange_order` (
  `id` bigint(20) NOT NULL COMMENT '主键id 订单id',
  `uc_id` BIGINT(20) NOT NULL COMMENT '用户id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `advertiser` varchar(1024) NOT NULL COMMENT '客户名称',
  `video_file` varchar(1024) NOT NULL COMMENT '视频地址',
  `mc_video_id` bigint(20) NOT NULL COMMENT '视频库id',
  `vex_video_id` bigint(20) NOT NULL COMMENT '视频交易平台id',
  `industry1` int(11) NOT NULL DEFAULT 0 COMMENT '一级行业',
  `duration` int(11) NOT NULL DEFAULT 0 COMMENT '视频时长',
  `width` int(11) NOT NULL DEFAULT 0 COMMENT '视频宽度',
  `height` int(11) NOT NULL DEFAULT 0 COMMENT '视频高度',
  `version` bigint(20) NOT NULL COMMENT '词包版本号',
  `logic_state` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '逻辑状态:0-有效,1-无效',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='视频交易平台素材'*/;

CREATE TABLE `audit_video_exchange_order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `entity_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '实体id',
  `version` bigint(20) NOT NULL DEFAULT '-1' COMMENT '物料版本号',
  `audit_type` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核类型',
  `user_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '账户id',
  `audit_state` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核状态（0:通过，1:待审，2:拒绝）',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `reason_code` varchar(4096) NOT NULL DEFAULT '' COMMENT '拒绝理由code，多个逗号分隔',
  `reason` varchar(4096) NOT NULL DEFAULT '' COMMENT '其他拒绝理由',
  `audit_start_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '开始审核时间',
  `audit_end_time` DATETIME NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '审核完成时间',
  `extend` varchar(4096) DEFAULT '' COMMENT '扩展字段',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `modify_day_tag` int (10) NOT NULL DEFAULT '-1' COMMENT '修改时间(单位天 用于统计索引)',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `idx_entity_id_audit_type` (`entity_id`,`audit_type`),
  KEY `idx_user_id_audit_type_state` (`user_id`,`audit_type`,`audit_state`),
  KEY `idx_modify_day_tag` (`modify_day_tag`) */
) /*ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='视频交易平台素材审核表'*/;

CREATE TABLE `audit_video_exchange_order_log_history` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_id` BIGINT(20) NOT NULL COMMENT '订单id',
  `uc_id` bigint(20) NOT NULL COMMENT '用户id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `advertiser` varchar(1024) NOT NULL COMMENT '客户名称',
  `video_file` varchar(1024) NOT NULL COMMENT '视频地址',
  `mc_video_id` bigint(20) NOT NULL COMMENT '视频库id',
  `vex_video_id` bigint(20) NOT NULL COMMENT '视频交易平台id',
  `industry1` int(11) NOT NULL DEFAULT 0 COMMENT '一级行业',
  `version` bigint(20) NOT NULL COMMENT '词包版本号',
  `logic_state` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '逻辑状态:0-有效,1-无效',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `audit_type` VARCHAR (128) NOT NULL DEFAULT '' COMMENT '审核类型，逗号分隔',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `audit_detail` TEXT NOT NULL COMMENT '审核记录',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) /*ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='视频交易平台素材审核历史表'*/;

-- 账户头像
CREATE TABLE `user_logo` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `logo_url` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '账户头像的URL',
  `logic_state` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '逻辑状态:0-有效,1-无效',
  `version` BIGINT(20) DEFAULT NULL COMMENT '版本号',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) /*ENGINE=InnoDB CHARACTER SET=utf8 COMMENT='账户头像库'*/;

CREATE TABLE `audit_user_logo` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `entity_id` BIGINT(20) NOT NULL DEFAULT '-1' COMMENT '实体id',
  `version` BIGINT(20) NOT NULL DEFAULT '-1' COMMENT '版本号',
  `audit_type` TINYINT(4) NOT NULL DEFAULT '-1' COMMENT '审核类型',
  `user_id` BIGINT(20) NOT NULL DEFAULT '-1' COMMENT '账户id',
  `audit_state` TINYINT(4) NOT NULL DEFAULT '-1' COMMENT '审核状态（0:通过，1:待审，2:拒绝）',
  `auditor_id` BIGINT(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `reason_code` VARCHAR(4096) NOT NULL DEFAULT '' COMMENT '拒绝理由code，多个逗号分隔',
  `reason` VARCHAR(4096) NOT NULL DEFAULT '' COMMENT '其他拒绝理由',
  `audit_start_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '开始审核时间',
  `audit_end_time` DATETIME NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '审核完成时间',
  `extend` varchar(1024) DEFAULT '' COMMENT '扩展字段',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `modify_day_tag` int (10) NOT NULL DEFAULT '-1' COMMENT '修改时间(单位天 用于统计索引)',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) /*ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='账户头像审核表'*/;

CREATE TABLE `audit_user_logo_log_history` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `user_logo_id` BIGINT(20) NOT NULL COMMENT '账户头像id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `logo_url` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '内部url',
  `logic_state` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '逻辑状态:0-有效,1-无效',
  `version` BIGINT(20) DEFAULT NULL COMMENT '版本号',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `audit_type` VARCHAR (128) NOT NULL DEFAULT '' COMMENT '审核类型，逗号分隔',
  `audit_detail` TEXT NOT NULL COMMENT '审核记录',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) /*ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='账户头像审核历史表'*/;

-- 视频库视频
CREATE TABLE `video` (
  `id` bigint(20) NOT NULL COMMENT '主键id 生成的唯一id',
  `video_id` bigint(20) NOT NULL COMMENT '视频id',
  `uc_id` BIGINT(20) NOT NULL COMMENT '用户id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `video_inner_url` varchar(1024) NOT NULL COMMENT '视频地址',
  `name` varchar(1024) NOT NULL COMMENT '视频名称',
  `width` int(10) NOT NULL DEFAULT '0' COMMENT '视频宽度(像素)',
  `height` int(10) NOT NULL DEFAULT '0' COMMENT '视频高度(像素)',
  `length` bigint(20) NOT NULL DEFAULT '0' COMMENT '视频文件大小，单位：byte',
  `route` tinyint(6) NOT NULL DEFAULT '1' COMMENT '视频来源 0:MC 1投放 2建站',
  `version` bigint(20) NOT NULL COMMENT '版本号',
  `logic_state` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '逻辑状态:0-有效,1-无效',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='视频库视频'*/;

CREATE TABLE `audit_video` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `entity_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '实体id',
  `version` bigint(20) NOT NULL DEFAULT '-1' COMMENT '物料版本号',
  `audit_type` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核类型',
  `user_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '账户id',
  `audit_state` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核状态（0:通过，1:待审，2:拒绝）',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `reason_code` varchar(4096) NOT NULL DEFAULT '' COMMENT '拒绝理由code，多个逗号分隔',
  `reason` varchar(4096) NOT NULL DEFAULT '' COMMENT '其他拒绝理由',
  `audit_start_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '开始审核时间',
  `audit_end_time` DATETIME NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '审核完成时间',
  `extend` varchar(4096) DEFAULT '' COMMENT '扩展字段',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `modify_day_tag` int (10) NOT NULL DEFAULT '-1' COMMENT '修改时间(单位天 用于统计索引)',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `idx_entity_id_audit_type` (`entity_id`,`audit_type`),
  KEY `idx_user_id_audit_type_state` (`user_id`,`audit_type`,`audit_state`),
  KEY `idx_modify_day_tag` (`modify_day_tag`)*/
) /*ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='视频库视频审核表'*/;

CREATE TABLE `audit_video_log_history` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `entity_id` bigint(20) NOT NULL COMMENT '生成的唯一ID',
  `video_id` bigint(20) NOT NULL COMMENT '视频id',
  `uc_id` BIGINT(20) NOT NULL COMMENT '用户id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `video_inner_url` varchar(1024) NOT NULL COMMENT '视频地址',
  `name` varchar(1024) NOT NULL COMMENT '视频名称',
  `width` int(10) NOT NULL DEFAULT '0' COMMENT '视频宽度(像素)',
  `height` int(10) NOT NULL DEFAULT '0' COMMENT '视频高度(像素)',
  `length` bigint(20) NOT NULL DEFAULT '0' COMMENT '视频文件大小，单位：byte',
  `route` tinyint(6) NOT NULL DEFAULT '1' COMMENT '视频来源 0:MC 1投放 2建站',
  `version` bigint(20) NOT NULL COMMENT '版本号',
  `logic_state` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '逻辑状态:0-有效,1-无效',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `audit_type` VARCHAR (128) NOT NULL DEFAULT '' COMMENT '审核类型，逗号分隔',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `audit_detail` TEXT NOT NULL COMMENT '审核记录',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biz_type` INT(11) NOT NULL DEFAULT 1 COMMENT '业务类型 1 wl,2 hc',
  PRIMARY KEY (`id`)
) /*ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='视频库视频审核历史表'*/;

CREATE TABLE `pending_video_material` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL DEFAULT 0 COMMENT '用户ID',
  `entity_id` bigint(20) NOT NULL DEFAULT 0 COMMENT '生成的唯一ID',
  `route` tinyint(6) NOT NULL DEFAULT '1' COMMENT '视频来源 0:MC 1投放 2建站',
  `auditor_id` bigint(20) NOT NULL DEFAULT -1 COMMENT '审核员ID',
  `video_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '视频更新时间',
  `state` TINYINT(4) NOT NULL DEFAULT 1 COMMENT '审核状态，1-未审核 0-已审核',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `uk_user_id_video_id` (`user_id`,`entity_id`)*/
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='视频库人工待审表'*/;

CREATE TABLE `video_comment` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `target_id` BIGINT(20) NOT NULL COMMENT '批注目标ID',
  `content` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '批注内容，需要拼接出标签内容',
  `expire_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  `enabled` INT(11) NOT NULL DEFAULT 1 COMMENT '是否启用，0-停用,1:启用',
  `creator` BIGINT(20) NOT NULL COMMENT '创建者',
  `operator` BIGINT(20) NOT NULL COMMENT '操作人',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY(`id`)
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='视频库批注'*/;

-- 营销组件
CREATE TABLE `micro_idea` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `type` tinyint(4) NOT NULL COMMENT '类型: 1.卡券',
  `ad_style_id` int(10) DEFAULT NULL COMMENT '广告样式id',
  `content` text NOT NULL COMMENT '创意内容',
  `libs` varchar(1024) NOT NULL DEFAULT '[]' COMMENT '关联素材, 格式：[{type:, ids:[]}]',
  `platform` tinyint(4) NOT NULL DEFAULT 1 COMMENT '投放平台，1：ios、2：安卓、4：其它',
  `logic_state` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '逻辑状态:0-有效,1-无效',
  `version` bigint(20) DEFAULT NULL COMMENT '物料版本号',
  `submit_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '送审时间',
  `expired_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) /*ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='营销组件创意'*/;

CREATE TABLE `audit_micro_idea` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `entity_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '营销组件创意id',
  `version` bigint(20) NOT NULL DEFAULT '-1' COMMENT '物料版本号',
  `audit_type` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核类型',
  `user_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '账户id',
  `audit_state` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核状态（0:通过，2:拒绝，3:待人工）',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `reason_code` varchar(4096) NOT NULL DEFAULT '' COMMENT '拒绝理由code，多个逗号分隔',
  `reason` varchar(4096) NOT NULL DEFAULT '' COMMENT '其他拒绝理由',
  `audit_start_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '开始审核时间',
  `audit_end_time` DATETIME NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '审核完成时间',
  `extend` varchar(4096) DEFAULT '' COMMENT '扩展字段',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `modify_day_tag` int (10) NOT NULL DEFAULT '-1' COMMENT '修改时间(单位天 用于统计索引)',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) /*ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='营销组件创意审核表'*/;

CREATE TABLE `audit_micro_idea_log_history` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `entity_id` BIGINT(20) NOT NULL COMMENT '营销组件创意id',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `type` tinyint(4) NOT NULL COMMENT '类型: 1.卡券',
  `ad_style_id` int(10) DEFAULT NULL COMMENT '广告样式id',
  `content` text NOT NULL COMMENT '创意内容',
  `libs` varchar(1024) NOT NULL DEFAULT '[]' COMMENT '关联素材, 格式：[{type:, ids:[]}]',
  `platform` tinyint(4) NOT NULL DEFAULT 1 COMMENT '投放平台，1：ios、2：安卓、4：其它',
  `logic_state` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '逻辑状态:0-有效,1-无效',
  `version` bigint(20) DEFAULT NULL COMMENT '物料版本号',
  `submit_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '送审时间',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `audit_type` VARCHAR (128) NOT NULL DEFAULT '' COMMENT '审核类型，逗号分隔',
  `audit_detail` TEXT NOT NULL COMMENT '审核记录',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) /*ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='营销组件创意审核历史表'*/;

-- 图片库
CREATE TABLE `picture_lib` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '实体Id',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `image_url` varchar(1024) NOT NULL DEFAULT '' COMMENT '图片地址',
  `logic_state` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '逻辑状态:0-有效,1-无效',
  `version` bigint(20) DEFAULT NULL COMMENT '送审时间戳',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝 3:待人工',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='图片库'*/;

CREATE TABLE `audit_picture_lib` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `entity_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '实体id',
  `version` bigint(20) NOT NULL DEFAULT '-1' COMMENT '物料版本号',
  `audit_type` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核类型',
  `user_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '账户id',
  `audit_state` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核状态（0:通过，1:待审，2:拒绝, 3:待人工）',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `reason_code` varchar(4096) NOT NULL DEFAULT '' COMMENT '拒绝理由code，多个逗号分隔',
  `reason` varchar(4096) NOT NULL DEFAULT '' COMMENT '其他拒绝理由',
  `audit_start_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '开始审核时间',
  `audit_end_time` DATETIME NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '审核完成时间',
  `extend` varchar(4096) DEFAULT '' COMMENT '扩展字段',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `modify_day_tag` int (10) NOT NULL DEFAULT '-1' COMMENT '修改时间(单位天 用于统计索引)',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) /*ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='图片库审核表'*/;

CREATE TABLE `audit_picture_lib_log_history` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `entity_id` BIGINT(20) NOT NULL COMMENT '图片库id',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `image_url` varchar(1024) NOT NULL DEFAULT '' COMMENT '图片地址',
  `logic_state` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '逻辑状态:0-有效,1-无效',
  `version` bigint(20) DEFAULT NULL COMMENT '物料版本号',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `audit_type` VARCHAR (128) NOT NULL DEFAULT '' COMMENT '审核类型，逗号分隔',
  `audit_detail` TEXT NOT NULL COMMENT '审核记录',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) /*ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='图片库审核历史表'*/;

-- DSP
CREATE TABLE `dsp_idea` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` BIGINT(20) NOT NULL COMMENT '账户id',
  `title` text NOT NULL COMMENT '创意标题',
  `description` text NOT NULL COMMENT '创意描述',
  `source` varchar(128) DEFAULT NULL COMMENT '来源',
  `target_url` varchar(1024) DEFAULT NULL COMMENT '落地页url',
  `img_urls` TEXT DEFAULT NULL COMMENT '图片地址，多个用逗号分隔',
  `video_urls` TEXT DEFAULT NULL COMMENT '视频地址，多个用逗号分隔',
  `idea_ids` text NOT NULL DEFAULT '' COMMENT '创意id列表',
  `click` BIGINT(20) NOT NULL DEFAULT '0' COMMENT '点击量',
  `show` BIGINT(20) NOT NULL DEFAULT '0' COMMENT '展现量',
  `consume` BIGINT(20) NOT NULL DEFAULT '0' COMMENT '消费',
  `logic_state` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '逻辑状态:0-有效, 1-无效',
  `version` bigint(20) DEFAULT 0 COMMENT '物料版本号',
  `state` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `state_detail` INT(10) NOT NULL DEFAULT '-1' COMMENT '详细审核状态',
  `sample_state` TINYINT(4) NOT NULL DEFAULT '-1' COMMENT '抽查状态, -1:未抽查、1-待核查, 0-核查通过、2：核查拒绝',
  `sent` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '是否被发送: 0-否, 1-是',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) /*ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='dsp创意表'*/;

CREATE TABLE `audit_dsp_idea` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `entity_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '实体id',
  `version` bigint(20) NOT NULL DEFAULT '-1' COMMENT '物料版本号',
  `audit_type` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核类型',
  `user_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '账户id',
  `audit_state` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核状态（0:通过，1:待审，2:拒绝, 3:待人工）',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `reason_code` varchar(4096) NOT NULL DEFAULT '' COMMENT '拒绝理由code，多个逗号分隔',
  `reason` varchar(4096) NOT NULL DEFAULT '' COMMENT '其他拒绝理由',
  `audit_start_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '开始审核时间',
  `audit_end_time` DATETIME NOT NULL DEFAULT '2000-01-01 00:00:00' COMMENT '审核完成时间',
  `extend` varchar(4096) DEFAULT '' COMMENT '扩展字段',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `modify_day_tag` int (10) NOT NULL DEFAULT '-1' COMMENT '修改时间(单位天 用于统计索引)',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) /*ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='dsp创意审核表'*/;