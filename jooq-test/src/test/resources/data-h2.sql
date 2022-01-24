-- noinspection SqlNoDataSourceInspectionForFile
-- 规则词表
INSERT INTO `audit_word_rule`(`id`, `source`, `word`, `word_type`, `match_type`, `entity_type`, `exclude_words`, `exclude_users`, `exclude_customers`, `industries`, `status`) VALUES (280799, 14, '药', 1, 0, 1, '药流', '12428198', '', '0', 1);
INSERT INTO `audit_word_rule`(`id`, `source`, `word`, `word_type`, `match_type`, `entity_type`, `exclude_words`, `exclude_users`, `exclude_customers`, `industries`, `status`) VALUES (280804, 14, '华尔街', 1, 0, 1, NULL, NULL, NULL, '0', 1);
INSERT INTO `audit_word_rule`(`id`, `source`, `word`, `word_type`, `match_type`, `entity_type`, `exclude_words`, `exclude_users`, `exclude_customers`, `industries`, `status`) VALUES (280805, 14, '办法  分钟', 1, 0, 1, NULL, NULL, NULL, '0', 1);
INSERT INTO `audit_word_rule`(`id`, `source`, `word`, `word_type`, `match_type`, `entity_type`, `exclude_words`, `exclude_users`, `exclude_customers`, `industries`, `status`) VALUES (280806, 14, '中国 中国', 1, 0, 1, '中国人', NULL, NULL, '0', 1);
INSERT INTO `audit_word_rule`(`id`, `source`, `word`, `word_type`, `match_type`, `entity_type`, `exclude_words`, `exclude_users`, `exclude_customers`, `industries`, `status`) VALUES (280807, 14, '原血神座', 1, 2, 1, NULL, NULL, NULL, '10000', 1);
INSERT INTO `audit_word_rule`(`id`, `source`, `word`, `word_type`, `match_type`, `entity_type`, `exclude_words`, `exclude_users`, `exclude_customers`, `industries`, `status`) VALUES (280808, 14, '神座', 2, 1, 1, NULL, NULL, NULL, '', 1);
INSERT INTO `audit_word_rule`(`id`, `source`, `word`, `word_type`, `match_type`, `entity_type`, `exclude_words`, `exclude_users`, `exclude_customers`, `industries`, `status`) VALUES (280809, 14, '微信', 1, 2, 1, NULL, NULL, NULL, '', 1);

-- 变体词
INSERT INTO `audit_similar_word`(`id`, `original_word`, `similar_word`, `status`) VALUES (1, '微信', STRINGDECODE('威信\nVX\n薇.芯'), 1);
