-- noinspection SqlNoDataSourceInspectionForFile


CREATE SCHEMA `audit_wolong`;
SET SCHEMA `audit_wolong`;
CREATE TABLE `audit_account_tag` (
    `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
    `version` BIGINT NOT NULL COMMENT '版本号',
    `user_id` BIGINT NOT NULL COMMENT '用户ID',
    `tag_type` INT NOT NULL COMMENT '标签类型',
    `tag_content` VARCHAR (512) NOT NULL COMMENT '标签内容',
    `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modify_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
);

CREATE TABLE `audit_patrol_risk` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `entity_id` BIGINT(20) NOT NULL COMMENT '实体id',
  `type` SMALLINT(6) NOT NULL DEFAULT '0' COMMENT '实体类型：1-卧龙用户，2-卧龙创意，3-汇川用户，4-汇川创意',
  `patrol_type` int(11) NOT NULL COMMENT '巡查类型，巡查类型，16：策略巡查, 32：卧龙PV落地页词表巡查',
  `user_id` BIGINT(20) DEFAULT NULL COMMENT '账户id',
  `target_url` varchar(1024) DEFAULT NULL COMMENT '落地页url',
  `effect_url` varchar(1024) DEFAULT NULL COMMENT '风险url',
  `hit_words` varchar(2048) DEFAULT NULL COMMENT '落地页命中的风险词，{"1":"低俗","2":"医疗"}',
  `risk_type` varchar(2048) NOT NULL COMMENT '风险类型，2048-医疗软文',
  `risk_rate` varchar(255) DEFAULT NULL COMMENT '风险值：{"1":1}',
  `url_snapshot` varchar(255) DEFAULT NULL COMMENT '页面截图地址',
  `remark` varchar(2048) DEFAULT NULL COMMENT '附加属性',
  `patrol_date` int(11) NULL COMMENT '巡查时间,yyyyMMdd',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `audit_user_landing_page_risk` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `userid` bigint(20) NOT NULL,
    `url` varchar(1024) DEFAULT NULL COMMENT '风险url',
    `hit_words` varchar(2048) DEFAULT NULL COMMENT '落地页命中的风险词，{"1":"赌博","2":"兼职"}',
    `type` int(11) NOT NULL COMMENT '多个数据来源合并后的风险类型，1：赌博 2：兼职 3：赌博+兼职',
    `risk_rate` varchar(255) DEFAULT NULL COMMENT '风险值 json串表示赌 黄 反的风险值\r\n{"1":0.5,"2":0.3,"4":0.8}',
    `operate` tinyint(6) NOT NULL DEFAULT '-1' COMMENT '操作类型（是否认可风险） 是:1 否:0 未操作:-1',
    `tag` int(11) DEFAULT '0' COMMENT '风险拒绝标签，默认值0：代表无 1：赌博 2：兼职 3：赌博+兼职',
    `pic` varchar(255) DEFAULT NULL COMMENT '页面截图 mogilekey',
    `reason` varchar(255) DEFAULT NULL COMMENT '拒绝原因',
    `crawl_time` datetime DEFAULT NULL COMMENT '页面爬取时间',
    `audit_time` datetime DEFAULT NULL COMMENT '审核时间',
    `create_time` datetime DEFAULT NULL COMMENT '记录创建时间',
    `source` int(11) DEFAULT '1' COMMENT '数据来源，1：落地页，2：非企，3：落地页+非企',
    `url_risk_type` int(11) DEFAULT NULL COMMENT '落地页预测的风险类型，1：赌博，2：兼职，3：赌博+兼职',
    `feiqi_risk_type` int(11) DEFAULT NULL COMMENT '非企预测的风险类型，1：赌博，2：兼职，3：赌博+兼职',
    `auditorid` bigint(20) DEFAULT NULL COMMENT '操作人id',
    `request_id` varchar(255) DEFAULT NULL COMMENT '任务请求id',
    `material_risk_id` bigint(20) DEFAULT '-1' COMMENT '对应material_risk表的id,当且仅当source=8有效',
    `ext` varchar(2048) DEFAULT NULL COMMENT '额外的信息，具体格式由使用者自行定义',
    PRIMARY KEY (`id`)
);

CREATE TABLE `uc_account` (
  `userid` bigint(20) NOT NULL DEFAULT '-1' COMMENT '用户的ID',
  `user_name` varchar(128) NOT NULL DEFAULT '' COMMENT '用户的user_name',
  `nick_name` varchar(128) NOT NULL DEFAULT '' COMMENT '用户的昵称nick_name',
  `industry1` int(11) NOT NULL DEFAULT '-1' COMMENT '用户的1级行业',
  `industry2` int(11) NOT NULL DEFAULT '-1' COMMENT '用户的2级行业',
  `industry3` int(11) NOT NULL DEFAULT '-1' COMMENT '用户的3级行业',
  `account_type` int(11) NOT NULL DEFAULT '-1' COMMENT '账户类型',
  `review_state` int(11) NOT NULL DEFAULT '13' COMMENT '审核状态:0-通过,1-待审核',
  `finance_state` int(11) NOT NULL DEFAULT '-1' COMMENT '财务状态:0为正常投放,1为预算花完,2为余额为未负,3为1和2的重合',
  `view_state` int(11) NOT NULL DEFAULT '-1' COMMENT '账户展示状态:1-被禁用,2-暂未生效,3-待审核,0-正常生效,4-被拒绝,5-预算不足,6-账面为零',
  `group_name` varchar(32) NOT NULL DEFAULT '' COMMENT '用户组',
  `roles` varchar(256) NOT NULL DEFAULT '' COMMENT '用户角色',
  `source` int(11) NOT NULL DEFAULT '-1' COMMENT '用户来源',
  `create_time` timestamp NOT NULL DEFAULT '1970-01-01 08:00:01' COMMENT '创建时间',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后一次修改时间',
  `first_recharge_time` datetime DEFAULT NULL COMMENT '首次充值时间',
  `last_login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `first_available_time` datetime DEFAULT NULL COMMENT '首次审核通过的生效时间',
  `deleted` int(11) NOT NULL DEFAULT '0' COMMENT '是否删除:0-未删除,1-删除',
  PRIMARY KEY (`userid`)
);

 CREATE TABLE `uc_contact` (
  `userid` bigint(20) NOT NULL DEFAULT '-1' COMMENT '用户的ID',
  `user_name` varchar(128) NOT NULL DEFAULT '' COMMENT '用户的user_name',
  `company_name` varchar(128) NOT NULL DEFAULT '' COMMENT '公司名称',
  `site_name` varchar(128) NOT NULL DEFAULT '' COMMENT '网站名称',
  `site_url` text COMMENT '网站Url',
  `contact_name` varchar(128) NOT NULL DEFAULT '' COMMENT '联系人名称',
  `contact_phone` varchar(32) NOT NULL DEFAULT '' COMMENT '联系电话（座机）',
  `mobile` varchar(32) NOT NULL DEFAULT '' COMMENT '手机',
  `contact_email` varchar(128) NOT NULL DEFAULT '' COMMENT '联系邮箱',
  `qq` varchar(32) NOT NULL DEFAULT '' COMMENT '联系邮箱',
  `fax` varchar(32) NOT NULL DEFAULT '' COMMENT '传真',
  `province` varchar(32) NOT NULL DEFAULT '' COMMENT '省',
  `city` varchar(32) NOT NULL DEFAULT '' COMMENT '市',
  `address` varchar(1024) NOT NULL DEFAULT '' COMMENT '联系地址',
  `zip_code` varchar(8) NOT NULL DEFAULT '' COMMENT '邮编',
  `create_time` timestamp NOT NULL DEFAULT '1970-01-01 08:00:01' COMMENT '创建时间',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后一次修改时间',
  `deleted` int(11) NOT NULL DEFAULT '0' COMMENT '是否删除:0-未删除,1-删除',
  PRIMARY KEY (`userid`)
); /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账户联系方式信息表'*/

 CREATE TABLE `account_relation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `userid` bigint(20) NOT NULL DEFAULT '-1' COMMENT '用户的ID',
  `user_name` varchar(128) NOT NULL DEFAULT '' COMMENT '用户名',
  `type` tinyint(3) NOT NULL DEFAULT '-1' COMMENT '关系类型，1:代理商ID,2:客户ID,3:SME一线客服ID',
  `target_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '目标的ID',
  `target_name` varchar(128) NOT NULL DEFAULT '' COMMENT '目标名称',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
);

-- CREATE TABLE `audit_special_user` (
--   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
--   `user_id` bigint(20) NOT NULL COMMENT '用户id',
--   `target_id` bigint(20) NOT NULL COMMENT '代理商客服id',
--   `type` tinyint(3) NOT NULL COMMENT '目标类型，1-代理商ID,2-客户ID,3-SME一线客服ID',
--   `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
--   `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
--   PRIMARY KEY (`id`)
-- );

CREATE TABLE `audit_wait_auto` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键，自增',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `unitid` bigint(20) NOT NULL COMMENT '单元id',
  `umod` smallint(6) NOT NULL COMMENT 'unitid模线程数的值',
  `type` smallint(6) NOT NULL COMMENT '创意类型，203：winfo，203：idea，203：ideapro，404：xijing，504：app',
  `status` smallint(6) NOT NULL DEFAULT '0' COMMENT '数据处理状态，0:未处理，1:正在处理',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `mids` varchar(1024) DEFAULT NULL COMMENT '预留，物料id,多个用逗号分隔',
  `idea_num` int(10) DEFAULT NULL COMMENT '预留，包含的物料个数',
  `priority` smallint(6) DEFAULT '1' COMMENT '审核优先级，1为普通级别，0为优先级别',
  PRIMARY KEY (`id`)/*,
  KEY `idx_unitid` (`unitid`) USING BTREE,
  KEY `idx_umod_ct` (`umod`,`create_time`)*/
); /*ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='自动审核待审核表'*/

CREATE TABLE `audit_unit_material` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL DEFAULT 0 COMMENT '用户ID',
  `unit_id` bigint(20) NOT NULL DEFAULT 0 COMMENT '单元ID',
  `auditor_id` bigint(20) NOT NULL DEFAULT -1 COMMENT '审核员ID',
  `unit_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '单元更新时间',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `uk_user_id_unit_id` (`user_id`,`unit_id`),*/
)/* ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='审核单元物料信息'*/;

CREATE TABLE `audit_img_whitelist` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `img_url` varchar(255) NOT NULL DEFAULT '' COMMENT '图片的url地址',
  `user_id` bigint(20) NOT NULL COMMENT '用户id，只做查询用',
  `logic_state` smallint(6) NOT NULL DEFAULT '0' COMMENT '0为正常，1为删除',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)/*,
  KEY `idx_user` (`user_id`),
  KEY `idx_url` (`img_url`),
  KEY `idx_state` (`logic_state`)*/
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='图片白名单表，针对img_url加白'*/;

CREATE TABLE `audit_manual_risk_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL COMMENT '风险用户id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `risk_type` int(11) NOT NULL DEFAULT '0' COMMENT '风险类型',
  `task_type` int(11) NOT NULL DEFAULT '0' COMMENT '任务类型,1:自动审核模型',
  `operate` smallint(6) NOT NULL DEFAULT '0' COMMENT '人工是否处理完成,0:未处理，1:处理完成',
  PRIMARY KEY (`id`)/*,
  KEY `idx_uid` (`user_id`),
  KEY `idx_time` (`create_time`),
  KEY `idx_opt` (`operate`)*/
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人工审核风险用户表'*/;

CREATE TABLE `account_logo_state_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '实体Id',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `state` tinyint(4) NOT NULL DEFAULT '1' COMMENT '审核状态,0:通过,1:审核中,2拒绝',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `audit_time` timestamp NOT NULL DEFAULT '2010-01-01 00:00:00' COMMENT '审核时间',
  `create_time` timestamp NOT NULL DEFAULT '2010-01-01 00:00:00' COMMENT '创建时间',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `manual_state` tinyint(4) NOT NULL DEFAULT '1' COMMENT '人工审核状态,0:通过,1:审核中,2拒绝',
  `manual_reason` text COMMENT '人工审核拒绝理由',
  `manual_auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `manual_audit_time` timestamp NOT NULL DEFAULT '1999-01-01 00:00:00' COMMENT '审核时间',
  `manual_version` bigint(20) NOT NULL COMMENT '数据版本',
  PRIMARY KEY (`id`)
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账户网站头像表'*/;

CREATE TABLE `picture_lib_state_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '实体Id',
  `userid` bigint(20) NOT NULL DEFAULT '-1' COMMENT '用户id',
  `version` bigint(20) NOT NULL DEFAULT '-1' COMMENT '实体对象当前版本',
  `state` tinyint(4) NOT NULL DEFAULT '1' COMMENT '审核状态,0:通过,1:审核中,2拒绝',
  `auto_state` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '自动审核状态,0:通过,1:审核中,2拒绝',
  `auto_version` bigint(20) NOT NULL DEFAULT '-1' COMMENT '自动审核版本号',
  `auto_reason` text NOT NULL COMMENT '自动审核拒绝理由',
  `manual_state` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '人工审核状态,0:通过,1:审核中,2拒绝',
  `manual_version` bigint(20) NOT NULL DEFAULT '-1' COMMENT '人工审核版本号',
  `manual_reason` text NOT NULL COMMENT '人工审核拒绝理由',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `audit_time` timestamp NOT NULL DEFAULT '1999-01-01 00:00:00' COMMENT '审核时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `manual_auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '人工审核员id',
  `manual_audit_time` timestamp NOT NULL DEFAULT '1999-01-01 00:00:00' COMMENT '审核时间',
  `auto_auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '机器审核员id',
  `auto_audit_time` timestamp NOT NULL DEFAULT '1999-01-01 00:00:00' COMMENT '机器审核时间',
  PRIMARY KEY (`id`)
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='图片库审核状态表'*/;

CREATE TABLE `picture_lib` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '实体Id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `version` bigint(20) NOT NULL COMMENT '实体对象当前版本',
  `image_url` varchar(1024) NOT NULL DEFAULT '' COMMENT '图片地址',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)/*,
  KEY `idx_userid` (`userid`)*/
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='图片库'*/;

CREATE TABLE `picture_manual_audit_result` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'Id',
  `picture_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '图片id',
  `picture_url` varchar(1024) NOT NULL DEFAULT '' COMMENT '图片url',
  `state` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '审核状态,0:通过,2拒绝',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)/*,
  KEY `idx_picture_url` (`picture_url`(255))*/
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人工审核状态表'*/;

CREATE TABLE `cpc_flow_market_word` (
  `id` bigint(20) NOT NULL COMMENT '主键',
  `word` varchar(64) NOT NULL COMMENT '词',
  `word_md5` bigint(20) NOT NULL COMMENT '词面哈希值，用于判断单元下面是否有重复的词面',
  `category` int(11) NOT NULL COMMENT '热点code',
  `category_name` varchar(512) NOT NULL COMMENT '热点',
  `logic_state` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除',
  `version` bigint(20) NOT NULL COMMENT '送审时间戳',
  `state_detail` int(11) NOT NULL DEFAULT '0' COMMENT '详细审核状态',
  `state` tinyint(4) NOT NULL DEFAULT '1' COMMENT '总审核状态 0:通过 1:待审 2:拒绝',
  `reject_reason` text COMMENT '拒绝理由',
  `auditor_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `delete_time` datetime NOT NULL DEFAULT '9999-00-00 00:00:00' COMMENT '删除时间戳',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`)
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='流量超市词表'*/;

-- CREATE TABLE `audit_wait_patrol_user`(
--   `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
--   `user_id` BIGINT(20) NOT NULL DEFAULT -1 COMMENT '用户ID',
--   `dt` int(10) NOT NULL DEFAULT -1 COMMENT '日期(单位天，yyyyMMdd)',
--   `node` int(10) NOT NULL DEFAULT -1 COMMENT '节点数',
--   `status` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '状态  0-待执行，1-执行中，2-执行完成',
--   `remark` VARCHAR (1024) NOT NULL DEFAULT '' COMMENT '备注',
--   `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
--   `modify_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
--    PRIMARY KEY (`id`)/*,
--    UNIQUE KEY `uk_user_id_dt` (`user_id`,`dt`),
--    KEY `idx_status` (`status`),
--    KEY `idx_node` (`node`)*/
-- ) /*ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='巡查待审用户表'*/;

CREATE TABLE `ara_material_risk_stat` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `tag_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '标签Id',
  `tag_name` varchar(512) NOT NULL COMMENT '标签名称',
  `count` bigint(20) NOT NULL DEFAULT '0' COMMENT '物料总数',
  `samp_date` char(8) NOT NULL COMMENT '采样日期,yyyyMMdd',
  `dimension` smallint(6) NOT NULL DEFAULT '0' COMMENT '采样维度',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='风险统计表'*/;

CREATE TABLE `audit_white_word` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `word` varchar(1024) NOT NULL COMMENT '白词',
  `word_type` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '词表类型,1:黑名单，2：商标词，3：竞品词，4：敏感词',
  `logic_state` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除，0:未删除，1:已删除',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `risk_tag` bigint(20) NOT NULL DEFAULT '-1' COMMENT '风险类型',
  PRIMARY KEY (`id`)/*,
  KEY `idx_state_type` (`logic_state`,`word_type`)*/
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='白词表'*/;

CREATE TABLE `tb_audit_history` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `auditid` bigint(20) NOT NULL DEFAULT '-1',
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `detail` varchar(4096) NOT NULL DEFAULT '',
  `event_type` smallint(6) NOT NULL DEFAULT '-1',
  `level` smallint(6) NOT NULL DEFAULT '-1',
  `state` smallint(6) NOT NULL DEFAULT '-1',
  `targetid` bigint(20) NOT NULL DEFAULT '-1',
  `reason_code` varchar(128) DEFAULT NULL,
  `userid` bigint(20) NOT NULL DEFAULT '-1',
  PRIMARY KEY (`id`)
);

CREATE TABLE `audit_blacklist_word` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `operatorid` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `keyword` varchar(1024) NOT NULL DEFAULT '' COMMENT '关键词',
  `creative_confine` smallint(6) NOT NULL DEFAULT '0' COMMENT '是否针对创意',
  `creative_confine_type` int(11) NOT NULL DEFAULT '-1' COMMENT '-1:无,0:分散,1:包含,2:精确',
  `keyword_confine` smallint(6) NOT NULL DEFAULT '0' COMMENT '是否针对关键词',
  `keyword_confine_type` int(11) NOT NULL DEFAULT '-1' COMMENT '-1:无,0:分散,1:包含,2:精确',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `indus_ids` varchar(1024) NOT NULL DEFAULT '0' COMMENT '生效行业，多个行业用逗号分隔',
  `status` tinyint(4) NOT NULL DEFAULT '5' COMMENT '规则生效状态0:影响评估、1:待审核、2:审核中、3:审核拒绝、4:审核通过、5:生效、6:失效',
  `ref_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '变更时参考的规则id',
  `city_hash` bigint(20) NOT NULL DEFAULT '0' COMMENT '规则的cityhash 编辑或新建规则时写入',
  `effective_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '规则生效时间',
  `ineffective_time` timestamp NULL DEFAULT NULL COMMENT '规则失效时间',
  PRIMARY KEY (`id`)/*,
  KEY `index_keyword` (`keyword`(255)),
  KEY `idx_ref_id` (`ref_id`)*/
)/* ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='审核黑名单词表'*/;


CREATE TABLE `audit_brand_word` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `operatorid` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `keyword` varchar(1024) NOT NULL DEFAULT '' COMMENT '关键词',
  `creative_confine_type` int(11) NOT NULL DEFAULT '-1' COMMENT '-1:无,0:分散,1:包含,2:精确',
  `brand_user` varchar(128) NOT NULL DEFAULT '' COMMENT '商标持有人',
  `brand_num` varchar(128) NOT NULL DEFAULT '' COMMENT '商标号',
  `brand_deadline` varchar(1024) NOT NULL DEFAULT '' COMMENT '商标有效期',
  `remark` varchar(1024) NOT NULL DEFAULT '' COMMENT '备注',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `indus_ids` varchar(1024) NOT NULL DEFAULT '0' COMMENT '生效行业，多个行业用逗号分隔',
  `status` tinyint(4) NOT NULL DEFAULT '5' COMMENT '规则生效状态0:影响评估、1:待审核、2:审核中、3:审核拒绝、4:审核通过、5:生效、6:失效',
  `ref_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '变更时参考的规则id',
  `city_hash` bigint(20) NOT NULL DEFAULT '0' COMMENT '规则的cityhash 编辑或新建规则时写入',
  `effective_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '规则生效时间',
  `ineffective_time` timestamp NULL DEFAULT NULL COMMENT '规则失效时间',
  PRIMARY KEY (`id`)/*,
  KEY `index_keyword` (`keyword`(255)),
  KEY `idx_modify_time` (`modify_time`),
  KEY `idx_ref_id` (`ref_id`)*/
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='审核商标词表'*/;

CREATE TABLE `audit_compete_word` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `operatorid` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `keyword` varchar(1024) NOT NULL DEFAULT '' COMMENT '关键词',
  `creative_confine_type` int(11) NOT NULL DEFAULT '-1' COMMENT '-1:无,0:分散,1:包含,2:精确',
  `remark` varchar(1024) NOT NULL DEFAULT '' COMMENT '备注',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `indus_ids` varchar(1024) NOT NULL DEFAULT '0' COMMENT '生效行业，多个行业用逗号分隔',
  `status` tinyint(4) NOT NULL DEFAULT '5' COMMENT '规则生效状态0:影响评估、1:待审核、2:审核中、3:审核拒绝、4:审核通过、5:生效、6:失效',
  `ref_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '变更时参考的规则id',
  `city_hash` bigint(20) NOT NULL DEFAULT '0' COMMENT '规则的cityhash 编辑或新建规则时写入',
  `effective_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '规则生效时间',
  `ineffective_time` timestamp NULL DEFAULT NULL COMMENT '规则失效时间',
  PRIMARY KEY (`id`)/*,
  KEY `index_keyword` (`keyword`(255)),
  KEY `idx_ref_id` (`ref_id`)*/
) /*ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='审核竞品词表'*/;

CREATE TABLE `audit_sensitive_word` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `operatorid` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `keyword` varchar(1024) NOT NULL DEFAULT '' COMMENT '关键词',
  `creative_confine` smallint(6) NOT NULL DEFAULT '0' COMMENT '是否针对创意',
  `creative_confine_type` int(11) NOT NULL DEFAULT '-1' COMMENT '-1:无,0:分散,1:包含,2:精确',
  `keyword_confine` smallint(6) NOT NULL DEFAULT '0' COMMENT '是否针对关键词',
  `keyword_confine_type` int(11) NOT NULL DEFAULT '-1' COMMENT '-1:无,0:分散,1:包含,2:精确',
  `add_reason` varchar(1024) NOT NULL DEFAULT '' COMMENT '添加原因',
  `remark` varchar(1024) NOT NULL DEFAULT '' COMMENT '备注',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `indus_ids` varchar(1024) NOT NULL DEFAULT '0' COMMENT '生效行业，多个行业用逗号分隔',
  `status` tinyint(4) NOT NULL DEFAULT '5' COMMENT '规则生效状态0:影响评估、1:待审核、2:审核中、3:审核拒绝、4:审核通过、5:生效、6:失效',
  `ref_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '变更时参考的规则id',
  `city_hash` bigint(20) NOT NULL DEFAULT '0' COMMENT '规则的cityhash 编辑或新建规则时写入',
  `effective_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '规则生效时间',
  `ineffective_time` timestamp NULL DEFAULT NULL COMMENT '规则失效时间',
  PRIMARY KEY (`id`)/*,
  KEY `index_keyword` (`keyword`(255)),
  KEY `idx_ref_id` (`ref_id`)*/
)/* ENGINE=InnoDB AUTO_INCREMENT=9453 DEFAULT CHARSET=utf8 COMMENT='审核敏感词表'*/;

CREATE TABLE `audit_similar_word` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `operatorid` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `similar_word` text COMMENT '变体词名称, 以"\n"分隔',
  `original_word` varchar(1024) NOT NULL DEFAULT '' COMMENT '原体词名称',
  `remark` varchar(1024) NOT NULL DEFAULT '' COMMENT '备注',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)/*,
  KEY `index_original_word` (`original_word`(255))*/
) /*ENGINE=InnoDB AUTO_INCREMENT=3141 DEFAULT CHARSET=utf8 COMMENT='审核变体词表'*/;

CREATE TABLE `audit_exclude_word` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `word` varchar(128) NOT NULL COMMENT '非限对象名',
  `targetid` int(11) NOT NULL COMMENT '词表关联id',
  `word_type` tinyint(2) NOT NULL COMMENT '词表类型,1:黑名单，2：商标词，3：竞品词，4：敏感词',
  `create_time` datetime NOT NULL DEFAULT '2001-01-01 00:00:00' COMMENT '录入时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `index_word_targetid_word_type` (`word`,`targetid`,`word_type`),
  KEY `idx_targetid` (`targetid`)*/
) /*ENGINE=InnoDB AUTO_INCREMENT=166390 DEFAULT CHARSET=utf8 COMMENT='审核非限对象表'*/;

CREATE TABLE `audit_exclude_customer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cid` bigint(20) NOT NULL COMMENT '非限制客户id',
  `targetid` bigint(20) NOT NULL COMMENT '要非限的规则id',
  `type` int(11) NOT NULL COMMENT '规则类型 词表类型,1:黑名单，2：商标词，3：竞品词，4：敏感词',
  `auditorid` bigint(20) NOT NULL DEFAULT '-1' COMMENT '操作审核员id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `uq_cid_targetid_type` (`cid`,`targetid`,`type`),
  KEY `idx_target` (`targetid`)*/
) /*ENGINE=InnoDB AUTO_INCREMENT=13999 DEFAULT CHARSET=utf8 COMMENT='审核非限客户表'*/;

CREATE TABLE `audit_exclude_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` bigint(20) NOT NULL COMMENT '非限制用户id',
  `targetid` bigint(20) DEFAULT NULL COMMENT '词表关联id',
  `word_type` tinyint(2) NOT NULL COMMENT '词表类型,1:黑名单，2：商标词，3：竞品词，4：敏感词',
  `event_type` smallint(6) NOT NULL COMMENT '限制范围:203:关键词,304:创意',
  `create_time` datetime NOT NULL DEFAULT '2001-01-01 00:00:00' COMMENT '录入时间',
  PRIMARY KEY (`id`)/*,
  UNIQUE KEY `index_userid_targetid_word_type_event_type` (`userid`,`targetid`,`word_type`,`event_type`),
  KEY `idx_targetid` (`targetid`),
  KEY `idx_word_type_event_type_userid_targetid` (`word_type`,`event_type`,`userid`,`targetid`)*/
)/* ENGINE=InnoDB AUTO_INCREMENT=26935217 DEFAULT CHARSET=utf8 COMMENT='审核非限用户表'*/;

CREATE TABLE `audit_sensitive_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `operatorid` bigint(20) NOT NULL DEFAULT '-1' COMMENT '审核员id',
  `sensitive_userid` bigint(20) NOT NULL DEFAULT '-1' COMMENT '敏感用户id',
  `add_reason` varchar(1024) NOT NULL DEFAULT '' COMMENT '添加理由',
  `remark` varchar(1024) NOT NULL DEFAULT '' COMMENT '备注',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)/*,
  KEY `index_sensitive_userid` (`sensitive_userid`)*/
)/* ENGINE=InnoDB AUTO_INCREMENT=44099 DEFAULT CHARSET=utf8 COMMENT='审核敏感用户表'*/;

CREATE TABLE `audit_exclude_model_word` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `word` varchar(512) NOT NULL DEFAULT '' COMMENT '敏感词',
  `logic_state` tinyint(4) NOT NULL DEFAULT '0' COMMENT '逻辑删除位，0:正常，1:删除',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `risk_type` bigint(20) NOT NULL DEFAULT '0' COMMENT '风险类型，见ara_material_tag表',
  `effect_end_time` timestamp NOT NULL DEFAULT '2030-01-01 00:00:00' COMMENT '失效时间',
  PRIMARY KEY (`id`)/*,
  KEY `idx_word` (`word`(255))*/
)/* ENGINE=InnoDB AUTO_INCREMENT=5163 DEFAULT CHARSET=utf8 COMMENT='高危敏感用户表，表中的敏感词不使用模型结果全部进人工，需要在敏感词表中已经添加'*/;

CREATE TABLE `audit_exclude_model_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `exclude_user_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT '不进入模型的用户id',
  `logic_state` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除，0:未删除，1:已删除',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)/*,
  KEY `index_exclude_user_id` (`exclude_user_id`)*/
) /*ENGINE=InnoDB AUTO_INCREMENT=669 DEFAULT CHARSET=utf8 COMMENT='不进入模型的用户id表'*/;


CREATE TABLE `audit_material_list_state` (
  `userid` bigint(20) NOT NULL COMMENT '用户ID',
  `source` int(11) NOT NULL DEFAULT '-1' COMMENT '用户来源',
  `suspend_status` smallint(6) NOT NULL DEFAULT '-1' COMMENT '搁置状态',
  `suspend_time` timestamp NULL DEFAULT NULL COMMENT '搁置时间',
  `create_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`userid`)
)/* ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='待审列物料表用户状态及最新时间表'*/;
