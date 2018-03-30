/*
Navicat MySQL Data Transfer

Source Server         : localhost_3305
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : person

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2018-03-20 17:13:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for eauthority
-- ----------------------------
DROP TABLE IF EXISTS `eauthority`;
CREATE TABLE `eauthority` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gong_cheng_id` int(11) DEFAULT NULL,
  `yong_hu_zu_id` int(11) DEFAULT NULL,
  `mask` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of eauthority
-- ----------------------------
INSERT INTO `eauthority` VALUES ('10', '1', '21', '0000000001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011001000000000000000000000000000000000000');
INSERT INTO `eauthority` VALUES ('11', '1', '20', '0000000001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011001000010000000000000000000000000000000');
INSERT INTO `eauthority` VALUES ('12', '1', '19', '0000000001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011001001000000000000000000000000000000000');
INSERT INTO `eauthority` VALUES ('13', '1', '17', '0000000001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011001000000000000000000000000000000000000');
INSERT INTO `eauthority` VALUES ('14', '1', '22', '0000000001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011001000000000000000000000000000000000000');
INSERT INTO `eauthority` VALUES ('15', '1', '23', '0000111101000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011110111110111110000000000000000000000000');
INSERT INTO `eauthority` VALUES ('16', '1', '25', '0000000001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011001000000000000000000000000000000000000');
INSERT INTO `eauthority` VALUES ('17', '1', '13', '0000000001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011001000100000000000000000000000000000000');
INSERT INTO `eauthority` VALUES ('18', '1', '14', '0000000001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011001101000000000000000000000000000000000');

-- ----------------------------
-- Table structure for gong_cheng_
-- ----------------------------
DROP TABLE IF EXISTS `gong_cheng_`;
CREATE TABLE `gong_cheng_` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `xiang_mu_id_` int(11) DEFAULT NULL,
  `dan_xiang_gong_cheng_` varchar(255) DEFAULT NULL,
  `gui_mo_mian_ji_` varchar(255) DEFAULT NULL,
  `gui_mo_chang_du_` varchar(255) DEFAULT NULL,
  `gui_mo_qi_ta_` varchar(255) DEFAULT NULL,
  `yan_gao_` varchar(255) DEFAULT NULL,
  `zong_gao_` varchar(255) DEFAULT NULL,
  `di_shang_di_xia_ceng_shu_` varchar(255) DEFAULT NULL,
  `gong_cheng_lei_bie_` varchar(255) DEFAULT NULL,
  `jie_gou_lei_xing_` varchar(255) DEFAULT NULL,
  `ji_chu_jie_gou_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `xiang_mu_id` (`xiang_mu_id_`)
) ENGINE=MyISAM AUTO_INCREMENT=43 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of gong_cheng_
-- ----------------------------
INSERT INTO `gong_cheng_` VALUES ('1', null, null, '1', '1', '1', '1', '1', '1', '1', '1', '1', '1');
INSERT INTO `gong_cheng_` VALUES ('2', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `gong_cheng_` VALUES ('3', null, null, '1', '1', '1', '1', '1', '1', '1', '1', '1', '1');
INSERT INTO `gong_cheng_` VALUES ('4', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `gong_cheng_` VALUES ('5', null, null, '11', '111', '', '', '', '', '', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('6', null, '45', '222', '222', '', '', '', '', '', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('7', null, '45', '333', '33', '', '', '', '', '', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('8', null, '45', '444', '4444', '', '', '', '', '', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('9', null, '44', 's', 's', 's', 's', 's', '', '', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('10', null, '45', '阿萨', '嘻嘻嘻', '嘻嘻嘻', '', '', '', '', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('11', null, '45', '按顺序', '搜索', '学习', '', '', '', '', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('12', null, '46', '阿萨2', '嘻嘻嘻', '嘻嘻嘻', '', '', '', '', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('13', null, '46', '按顺序2', '搜索', '学习', '', '', '', '', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('14', null, '3', '111', '444', '', '', '', '', '', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('15', null, '3', '4444', '', '', '', '', '', '', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('16', null, '3', '22', '', '', '', '', '', '', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('17', null, '1', '1', '1', '1', '', '', '', '', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('18', null, '1', '11', '11', '11', '', '', '', '', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('19', null, '1', '33', '222', '22', '', '', '', '', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('20', null, '1', '22', '嗯嗯23', '', '', '', '', '', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('21', null, '1', '33', '一个', '', '', '', '', '', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('22', null, '1', '44', '连个', '', '', '', '', '', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('23', null, '1', '55', '是多少', '', '', '', '', '', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('24', null, '8', '111', '111', '', '', '', '', '', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('25', null, '8', '111223', '11', '', '', '', '', '', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('26', null, null, '省道', '的', '11沙发', '打发', '11', '112', '第三方', '请问', '请问', '请问');
INSERT INTO `gong_cheng_` VALUES ('27', null, null, '打发', '阿斯蒂芬', '暗室逢灯', '大师傅', '大师傅', '大师傅', '大师傅', '阿斯蒂芬', '发多少', '大厦');
INSERT INTO `gong_cheng_` VALUES ('28', null, '47', '11', '', '', '', '', '', '', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('29', null, '49', 'xxx1', '', '', '', '', '', '', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('30', null, '49', 'xxx2', '', '', '', '', '', '', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('31', null, '50', '大幅度', '大法师打', '大师傅的a', '阿斯顿发生', '大师傅', '大师傅', '打发', '爱的方式', '爱迪生', '爱的方式');
INSERT INTO `gong_cheng_` VALUES ('32', null, '50', '第三方', '大师傅', '爱迪生', '大师傅', '阿斯蒂芬', '阿斯蒂芬', '大师傅', '阿斯蒂芬', '阿斯蒂芬', '的撒');
INSERT INTO `gong_cheng_` VALUES ('33', null, '51', '一个项目', '10000', '4000', '', '3', '4', '5', '公建', '钢架', '钢架');
INSERT INTO `gong_cheng_` VALUES ('34', null, '52', '省道', '222', '32323', '2323', '2323', '2323', '2323', '2323', '232', '2323');
INSERT INTO `gong_cheng_` VALUES ('35', null, '53', '在线咨询', '朱辛庄', 'zx', '这些', 'zx', '', 'z', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('36', null, '54', '在线咨询', '朱辛庄', 'zx', '这些', 'zx', '', 'z', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('37', null, '55', '在线咨询', '朱辛庄', 'zx', '这些', 'zx', '', 'z', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('38', null, '56', '在线咨询', '朱辛庄', 'zx', '这些', 'zx', '', 'z', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('39', null, '57', '在线咨询', '朱辛庄', 'zx', '这些', 'zx', '', 'z', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('40', null, '58', '在线咨询', '朱辛庄', 'zx', '这些', 'zx', '', 'z', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('41', null, '59', '在线咨询', '朱辛庄', 'zx', '这些', 'zx', '', 'z', '', '', '');
INSERT INTO `gong_cheng_` VALUES ('42', null, '60', '在线咨询', '朱辛庄', 'zx', '这些', 'zx', '', 'z', '', '', '');

-- ----------------------------
-- Table structure for gong_si_xin_xi_
-- ----------------------------
DROP TABLE IF EXISTS `gong_si_xin_xi_`;
CREATE TABLE `gong_si_xin_xi_` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `qi_ye_ming_cheng_` varchar(255) NOT NULL COMMENT '企业名称',
  `gong_si_lei_xing_` varchar(255) DEFAULT NULL COMMENT '公司类型',
  `zhu_ce_di_zhi_` varchar(255) DEFAULT NULL COMMENT '注册地址',
  `fa_ding_dai_biao_ren_` varchar(255) DEFAULT NULL COMMENT '法定代表人',
  `gong_shang_zhu_ce_hao_` varchar(255) DEFAULT NULL COMMENT '工商注册号',
  `zhu_ce_zi_ben_` varchar(255) DEFAULT NULL COMMENT '注册资本',
  `kai_hu_yin_hang_` varchar(255) DEFAULT NULL COMMENT ' 开户银行',
  `kai_hu_zhang_hao_` varchar(255) DEFAULT NULL COMMENT '开户账号',
  `jing_ying_fan_wei_` longtext COMMENT '经营范围',
  `wei_tuo_dai_li_ren_` varchar(255) DEFAULT NULL COMMENT '委托代理人',
  `wei_tuo_dai_li_ren_zhi_wu_` varchar(255) DEFAULT NULL,
  `wei_tuo_dai_li_ren_dian_hua_` varchar(255) DEFAULT NULL,
  `lian_xi_ren_` varchar(255) DEFAULT NULL,
  `lian_xi_ren_zhi_wu_` varchar(255) DEFAULT NULL,
  `lian_xi_ren_dian_hua_` varchar(255) DEFAULT NULL,
  `dian_zi_you_xiang_` varchar(255) DEFAULT NULL,
  `chuan_zhen_` varchar(255) DEFAULT NULL,
  `ban_shi_ji_gou_xiang_xi_di_zhi_` varchar(255) DEFAULT NULL,
  `ban_shi_ji_gou_you_zheng_bian_ma_` varchar(255) DEFAULT NULL,
  `ban_shi_ji_gou_lian_xi_ren_` varchar(255) DEFAULT NULL COMMENT '联系人',
  `ban_shi_ji_gou_lian_xi_ren_zhi_wu_` varchar(255) DEFAULT NULL COMMENT '职   务',
  `ban_shi_ji_gou_lian_xi_ren_dian_hua_` varchar(255) DEFAULT NULL COMMENT '电    话',
  `ban_shi_ji_gou_lian_xi_ren_dian_zi_you_xiang_` varchar(255) DEFAULT NULL COMMENT '电子邮箱',
  `ban_shi_ji_gou_lian_xi_ren_chuan_zhen_` varchar(255) DEFAULT NULL COMMENT '传    真',
  `gong_si_ji_lu_lei_xing_` int(11) DEFAULT NULL COMMENT '公司的基本类型。0：主公司，1：外协公司；',
  PRIMARY KEY (`id`,`qi_ye_ming_cheng_`)
) ENGINE=MyISAM AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gong_si_xin_xi_
-- ----------------------------
INSERT INTO `gong_si_xin_xi_` VALUES ('3', '张西洋大事发生', '第三方', '打卡机啊哈计划反倒是看好就', '电话即可', '撒阿士大夫撒旦', '大多数', '第三方第三方', '大爱的', '大赛科技离开第三方拉的屎就离开来看待来看待了解肯定是经理撒大家了肯定撒立刻就发来看撒娇的', '阿达地方', '啊发大水', '的撒范德萨', '大厦', '士大夫', '打发', '第三方发奥术大师', '打发啊', '打发地方看见啊', '第三方的', '的撒范德萨', '第三方 ', '第三方阿萨德', '第三方 大的时间浩丰科技阿萨德', '大发啊 ', '0');
INSERT INTO `gong_si_xin_xi_` VALUES ('6', '多范德萨阿', '大家看撒谎尽快答复哈市监控返回ad数据库', '加底色监控返回就喀', '就肯定会撒即可fhd道具卡监控的看', '经典款发货卡接收到回复', '抠脚大汉安居客', '就大煞风景', '抠脚大汉阿克纠纷', '尽快回到家奥斯卡', '就可获得撒即可发等级考试发挥', '京东卡和会计法', '健康的恢复', '大家阿富汗', '电视剧看撒谎', '大家爱护', '大家看看', '多久发货', '登记卡复活肯定就是', '接电话阿贾克斯', '电视剧看好付款后', '登记卡复活', '登记卡复活 ', '的范德萨', '第三方', '1');
INSERT INTO `gong_si_xin_xi_` VALUES ('7', '是打发的所发生的大', '大家看撒谎尽快答复哈市监控返回ad数据库', '加底色监控返回就喀什开机', '就肯定会撒即可fhd道具卡监控的看', '经典款发货卡接收到回复', '抠脚大汉安居客', '就大煞风景', '抠脚大汉阿克纠纷', '尽快回到家奥斯卡', '就可获得撒即可发等级考试发挥', '京东卡和会计法', '健康的恢复', '大家阿富汗', '电视剧看撒谎', '大家爱护', '大家看看', '多久发货', '登记卡复活肯定就是', '接电话阿贾克斯', '电视剧看好付款后', '登记卡复活', '登记卡复活 ', '的范德萨2323', '第三方', '1');
INSERT INTO `gong_si_xin_xi_` VALUES ('8', '打飞机哈副科代发', '大家看撒谎尽快答复哈市监控返回ad数据库', '加底色监控返回就喀什开机', '就肯定会撒即可fhd道具卡监控的看', '经典款发货卡接收到回复', '抠脚大汉安居客', '就大煞风景', '抠脚大汉阿克纠纷', '尽快回到家奥斯卡', '就可获得撒即可发等级考试发挥', '京东卡和会计法', '健康的恢复', '大家阿富汗', '电视剧看撒谎', '大家爱护', '大家看看', '多久发货', '登记卡复活肯定就是', '接电话阿贾克斯', '电视剧看好付款后', '登记卡复活', '登记卡复活 ', '的范德萨', '第三方', '1');
INSERT INTO `gong_si_xin_xi_` VALUES ('9', '倒海翻江爱福克斯', '加的撒谎就', '极大很快就回家看电视哈空间的', '囧的呼唤', '就的撒会尽快', '简单化开机', '就好打击', '就的还快', '尽快的哈风健康的时间看到计划', '加大富豪监控', '记到哈', '加的撒谎端口', '结婚的风', '记到哈', '京东卡和', '加快递费卡接收到回复发', '的话华东师范', '回复就开始的恢复健康东三环 ', '接收到回复', '角度看伤口就开始东方红', '绝对是咖啡还款', '科技活动', '跨境电商可好看', '打发士大夫', '1');
INSERT INTO `gong_si_xin_xi_` VALUES ('10', '倒海翻江爱福克斯的划', '加的撒谎就', '极大很快就回家看电视哈空间的', '囧的呼唤', '就的撒会尽快', '简单化开机', '就好打击', '就的还快', '尽快的哈风健康的时间看到计划', '加大富豪监控', '记到哈', '加的撒谎端口', '结婚的风', '记到哈', '京东卡和', '加快递费卡接收到回复发', '的话华东师范', '回复就开始的恢复健康东三环 ', '接收到回复', '角度看伤口就开始东方红', '绝对是咖啡还款', '科技活动', '跨境电商可好看', '打发士大夫', '1');
INSERT INTO `gong_si_xin_xi_` VALUES ('11', '倒海翻江爱福克斯', '加的撒谎就', '极大很快就回家看电视哈空间的', '囧的呼唤', '就的撒会尽快', '简单化开机', '就好打击', '就的还快', '尽快的哈风健康的时间看到计划', '加大富豪监控', '记到哈', '加的撒谎端口', '结婚的风', '记到哈', '京东卡和', '加快递费卡接收到回复发', '的话华东师范', '回复就开始的恢复健康东三环 ', '接收到回复', '角度看伤口就开始东方红', '绝对是咖啡还款', '科技活动', '跨境电商可好看', '打发士大夫', '1');
INSERT INTO `gong_si_xin_xi_` VALUES ('12', '测试一个公司', '可视对讲快疯了', '打开撒即可', '肯德基艾克', '考虑到家啊阑槛', '扩大', '看第三届了', '肯定就是案例库', '打开啦阑槛打死了会计法了空间大三考虑到了空间啊但是', '端口', '扩大发', '端口发', '贷款垃圾啊', '端口', '端口案例', '宽带连接福利卡就', '看大家', '贷款垃圾啊李开复大立科技的撒娇弗雷德凯撒', '打开了家', '抵抗力发', '的空间啊', '看得见啊', '斯柯达按时 ', '快乐大', '1');

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(11) DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `registerDate` datetime DEFAULT NULL,
  `submit` datetime DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of person
-- ----------------------------

-- ----------------------------
-- Table structure for t151_002
-- ----------------------------
DROP TABLE IF EXISTS `t151_002`;
CREATE TABLE `t151_002` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_id` int(11) DEFAULT NULL,
  `tr_order` int(11) DEFAULT NULL,
  `ji_hua_xiang_mu_` varchar(255) DEFAULT NULL,
  `cheng_ben_jiang_di_lv_` varchar(255) DEFAULT NULL,
  `cheng_ben_ze_ren_ren_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t151_002
-- ----------------------------

-- ----------------------------
-- Table structure for t152_002
-- ----------------------------
DROP TABLE IF EXISTS `t152_002`;
CREATE TABLE `t152_002` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_id` int(11) DEFAULT NULL,
  `tr_order` int(11) DEFAULT NULL,
  `bian_ma_` varchar(255) DEFAULT NULL,
  `cheng_ben_xiang_mu_` varchar(255) DEFAULT NULL,
  `na_rong_fan_wei_miao_shu_` varchar(255) DEFAULT NULL,
  `chu_shi_yu_suan_cheng_ben_` varchar(255) DEFAULT NULL,
  `diao_zheng_hou_yu_suan_cheng_ben_` varchar(255) DEFAULT NULL,
  `ben_qi_shu_` varchar(255) DEFAULT NULL,
  `lei_ji_shu_` varchar(255) DEFAULT NULL,
  `bei_zhu_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=67 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t152_002
-- ----------------------------
INSERT INTO `t152_002` VALUES ('63', '468', '3', '', '啊实打实', '', '', '', '', '', '');
INSERT INTO `t152_002` VALUES ('64', '468', '1', '', '撒大声地所', '', '', '', '', '', '');
INSERT INTO `t152_002` VALUES ('65', '468', '0', '', '萨达所大所多', '', '', '', '', '', '');
INSERT INTO `t152_002` VALUES ('66', '474', '0', '', '是多少', '', '', '', '', '', '');

-- ----------------------------
-- Table structure for t152_004
-- ----------------------------
DROP TABLE IF EXISTS `t152_004`;
CREATE TABLE `t152_004` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_id` int(11) DEFAULT NULL,
  `tr_order` int(11) DEFAULT NULL,
  `cheng_ben_bian_ma_` varchar(255) DEFAULT NULL,
  `cheng_ben_xiang_mu_` varchar(255) DEFAULT NULL,
  `na_rong_fan_wei_miao_shu_` varchar(255) DEFAULT NULL,
  `dan_jia_` varchar(255) DEFAULT NULL,
  `ji_suan_ji_shu_` varchar(255) DEFAULT NULL,
  `yu_suan_cheng_ben_` varchar(255) DEFAULT NULL,
  `bei_zhu_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t152_004
-- ----------------------------

-- ----------------------------
-- Table structure for t152_005
-- ----------------------------
DROP TABLE IF EXISTS `t152_005`;
CREATE TABLE `t152_005` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_id` int(11) DEFAULT NULL,
  `tr_order` int(11) DEFAULT NULL,
  `bian_hao_` varchar(255) DEFAULT NULL,
  `cai_liao_ming_chen_` varchar(255) DEFAULT NULL,
  `gui_ge_xing_hao_` varchar(255) DEFAULT NULL,
  `dan_wei_` varchar(255) DEFAULT NULL,
  `shu_liang_` varchar(255) DEFAULT NULL,
  `tou_biao_dan_jia_` varchar(255) DEFAULT NULL,
  `tou_biao_he_ji_` varchar(255) DEFAULT NULL,
  `ce_suan_dan_jia_` varchar(255) DEFAULT NULL,
  `ce_suan_he_ji_` varchar(255) DEFAULT NULL,
  `bei_zhu_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t152_005
-- ----------------------------

-- ----------------------------
-- Table structure for t152_006
-- ----------------------------
DROP TABLE IF EXISTS `t152_006`;
CREATE TABLE `t152_006` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_id` int(11) DEFAULT NULL,
  `tr_order` int(11) DEFAULT NULL,
  `cheng_ben_bian_ma_` varchar(255) DEFAULT NULL,
  `cheng_ben_xiang_mu_` varchar(255) DEFAULT NULL,
  `na_rong_fan_wei_miao_shu_` varchar(255) DEFAULT NULL,
  `dan_jia_` varchar(255) DEFAULT NULL,
  `ji_suan_ji_shu_` varchar(255) DEFAULT NULL,
  `yu_suan_cheng_ben_` varchar(255) DEFAULT NULL,
  `bei_zhu_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t152_006
-- ----------------------------

-- ----------------------------
-- Table structure for t152_007
-- ----------------------------
DROP TABLE IF EXISTS `t152_007`;
CREATE TABLE `t152_007` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_id` int(11) DEFAULT NULL,
  `tr_order` int(11) DEFAULT NULL,
  `cheng_ben_bian_ma_` varchar(255) DEFAULT NULL,
  `cheng_ben_xiang_mu_` varchar(255) DEFAULT NULL,
  `na_rong_fan_wei_miao_shu_` varchar(255) DEFAULT NULL,
  `dan_jia_` varchar(255) DEFAULT NULL,
  `ji_suan_ji_shu_` varchar(255) DEFAULT NULL,
  `yu_suan_cheng_ben_` varchar(255) DEFAULT NULL,
  `bei_zhu_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t152_007
-- ----------------------------

-- ----------------------------
-- Table structure for t153_002
-- ----------------------------
DROP TABLE IF EXISTS `t153_002`;
CREATE TABLE `t153_002` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_id` int(11) DEFAULT NULL,
  `tr_order` int(11) DEFAULT NULL,
  `cheng_ben_bian_ma_` varchar(255) DEFAULT NULL,
  `cheng_ben_xiang_mu_` varchar(255) DEFAULT NULL,
  `ben_qi_shu_diao_zheng_e_` varchar(255) DEFAULT NULL,
  `ben_qi_shu_shu_liang_` varchar(255) DEFAULT NULL,
  `ben_qi_shu_jia_ge_` varchar(255) DEFAULT NULL,
  `ben_qi_shu_qi_ta_` varchar(255) DEFAULT NULL,
  `lei_ji_shu_diao_zheng_e_` varchar(255) DEFAULT NULL,
  `lei_ji_shu_shu_liang_` varchar(255) DEFAULT NULL,
  `lei_ji_shu_jia_ge_` varchar(255) DEFAULT NULL,
  `lei_ji_shu_qi_ta_` varchar(255) DEFAULT NULL,
  `bei_zhu_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t153_002
-- ----------------------------

-- ----------------------------
-- Table structure for t154_002
-- ----------------------------
DROP TABLE IF EXISTS `t154_002`;
CREATE TABLE `t154_002` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_id` int(11) DEFAULT NULL,
  `tr_order` int(11) DEFAULT NULL,
  `cheng_ben_bian_ma_` varchar(255) DEFAULT NULL,
  `cheng_ben_xiang_mu_` varchar(255) DEFAULT NULL,
  `na_rong_fan_wei_miao_shu_` varchar(255) DEFAULT NULL,
  `yu_suan_cheng_ben_` varchar(255) DEFAULT NULL,
  `ji_hua_cheng_ben_` varchar(255) DEFAULT NULL,
  `cheng_ben_jiang_di_lv_` varchar(255) DEFAULT NULL,
  `bei_zhu_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=66 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t154_002
-- ----------------------------
INSERT INTO `t154_002` VALUES ('64', '480', '1', '', '', '萨达所大所多', '', '', '', '');
INSERT INTO `t154_002` VALUES ('65', '480', '0', '', '', '撒大声地所', '', '', '', '');

-- ----------------------------
-- Table structure for t155_002
-- ----------------------------
DROP TABLE IF EXISTS `t155_002`;
CREATE TABLE `t155_002` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_id` int(11) DEFAULT NULL,
  `tr_order` int(11) DEFAULT NULL,
  `bian_ma_` varchar(255) DEFAULT NULL,
  `cheng_ben_xiang_mu_` varchar(255) DEFAULT NULL,
  `na_rong_fan_wei_miao_shu_` varchar(255) DEFAULT NULL,
  `yu_suan_cheng_ben_` varchar(255) DEFAULT NULL,
  `ji_hua_cheng_ben_` varchar(255) DEFAULT NULL,
  `shi_ji_yu_ji_cheng_ben_` varchar(255) DEFAULT NULL,
  `yu_suan_shi_ji_jin_e_` varchar(255) DEFAULT NULL,
  `yu_suan_shi_ji_bi_li_` varchar(255) DEFAULT NULL,
  `ji_hua_shi_ji_jin_e_` varchar(255) DEFAULT NULL,
  `ji_hua_shi_ji_bi_li_` varchar(255) DEFAULT NULL,
  `zhuang_tai_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t155_002
-- ----------------------------

-- ----------------------------
-- Table structure for t155_004
-- ----------------------------
DROP TABLE IF EXISTS `t155_004`;
CREATE TABLE `t155_004` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_id` int(11) DEFAULT NULL,
  `tr_order` int(11) DEFAULT NULL,
  `cheng_ben_bian_ma_` varchar(255) DEFAULT NULL,
  `cheng_ben_xiang_mu_` varchar(255) DEFAULT NULL,
  `yu_suan_cheng_ben_` varchar(255) DEFAULT NULL,
  `zhi_qi_mo_yi_fa_sheng_cheng_ben_` varchar(255) DEFAULT NULL,
  `zu_lin_shi_jian_zong_yu_suan_shi_jian_` varchar(255) DEFAULT NULL,
  `zu_lin_shi_jian_yi_fa_sheng_shi_jian_` varchar(255) DEFAULT NULL,
  `zu_lin_shi_jian_yu_suan_sheng_yu_shi_jian_` varchar(255) DEFAULT NULL,
  `zu_lin_shi_jian_huai_xu_yao_shi_jian_` varchar(255) DEFAULT NULL,
  `sheng_yu_cheng_ben_yu_kong_shu_yue_du_yu_kong_shu_` varchar(255) DEFAULT NULL,
  `sheng_yu_cheng_ben_yu_kong_shu_zong_yu_kong_shu_` varchar(255) DEFAULT NULL,
  `sheng_yu_cheng_ben_yu_ce_shu_yue_du_yu_ce_shu_` varchar(255) DEFAULT NULL,
  `sheng_yu_cheng_ben_yu_ce_shu_zong_yu_ce_shu_` varchar(255) DEFAULT NULL,
  `sheng_yu_cheng_ben_yu_ce_shu_jie_chao_` varchar(255) DEFAULT NULL,
  `shi_ji_yu_ji_cheng_ben_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t155_004
-- ----------------------------

-- ----------------------------
-- Table structure for t155_005
-- ----------------------------
DROP TABLE IF EXISTS `t155_005`;
CREATE TABLE `t155_005` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_id` int(11) DEFAULT NULL,
  `tr_order` int(11) DEFAULT NULL,
  `cheng_ben_bian_hao_` varchar(255) DEFAULT NULL,
  `cheng_ben_xiang_mu_` varchar(255) DEFAULT NULL,
  `yu_suan_cheng_ben_` varchar(255) DEFAULT NULL,
  `zhi_qi_mo_yi_fa_sheng_cheng_ben_` varchar(255) DEFAULT NULL,
  `cheng_ben_shi_jian_zong_yu_suan_shi_jian_` varchar(255) DEFAULT NULL,
  `cheng_ben_shi_jian_yi_fa_sheng_shi_jian_` varchar(255) DEFAULT NULL,
  `cheng_ben_shi_jian_yu_suan_sheng_yu_shi_jian_` varchar(255) DEFAULT NULL,
  `cheng_ben_shi_jian_huai_xu_yao_shi_jian_` varchar(255) DEFAULT NULL,
  `sheng_yu_cheng_ben_yu_kong_shu_yue_du_yu_kong_shu_` varchar(255) DEFAULT NULL,
  `sheng_yu_cheng_ben_yu_kong_shu_zong_yu_kong_shu_` varchar(255) DEFAULT NULL,
  `sheng_yu_cheng_ben_yu_ce_shu_yue_du_yu_ce_shu_` varchar(255) DEFAULT NULL,
  `sheng_yu_cheng_ben_yu_ce_shu_zong_yu_ce_shu_` varchar(255) DEFAULT NULL,
  `sheng_yu_cheng_ben_yu_ce_shu_jie_chao_` varchar(255) DEFAULT NULL,
  `shi_ji_yu_ji_cheng_ben_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t155_005
-- ----------------------------

-- ----------------------------
-- Table structure for t156_002
-- ----------------------------
DROP TABLE IF EXISTS `t156_002`;
CREATE TABLE `t156_002` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_id` int(11) DEFAULT NULL,
  `tr_order` int(11) DEFAULT NULL,
  `xu_hao_` varchar(255) DEFAULT NULL,
  `wu_zi_ming_chen_` varchar(255) DEFAULT NULL,
  `gui_ge_xing_hao_` varchar(255) DEFAULT NULL,
  `dan_wei_` varchar(255) DEFAULT NULL,
  `zong_yu_suan_shu_shu_liang_` varchar(255) DEFAULT NULL,
  `zong_yu_suan_shu_dan_jia_` varchar(255) DEFAULT NULL,
  `zong_yu_suan_shu_jin_e_` varchar(255) DEFAULT NULL,
  `yi_wan_cai_gou_shu_shu_liang_` varchar(255) DEFAULT NULL,
  `yi_wan_cai_gou_shu_jin_e_` varchar(255) DEFAULT NULL,
  `wei_wan_yu_kong_shu_sheng_yu_liang_` varchar(255) DEFAULT NULL,
  `wei_wan_yu_kong_shu_yu_ce_dan_jia_` varchar(255) DEFAULT NULL,
  `wei_wan_yu_kong_shu_yu_kong_dan_jia_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t156_002
-- ----------------------------

-- ----------------------------
-- Table structure for t157_002
-- ----------------------------
DROP TABLE IF EXISTS `t157_002`;
CREATE TABLE `t157_002` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_id` int(11) DEFAULT NULL,
  `tr_order` int(11) DEFAULT NULL,
  `bian_ma_` varchar(255) DEFAULT NULL,
  `cheng_ben_xiang_mu_` varchar(255) DEFAULT NULL,
  `ben_qi_shu_yu_suan_cheng_ben_` varchar(255) DEFAULT NULL,
  `ben_qi_shu_shi_ji_cheng_ben_` varchar(255) DEFAULT NULL,
  `ben_qi_shu_jiang_di_e_` varchar(255) DEFAULT NULL,
  `ben_qi_shu_jiang_di_lv_` varchar(255) DEFAULT NULL,
  `lei_ji_shu_yu_suan_cheng_ben_` varchar(255) DEFAULT NULL,
  `lei_ji_shu_shi_ji_cheng_ben_` varchar(255) DEFAULT NULL,
  `lei_ji_shu_jiang_di_e_` varchar(255) DEFAULT NULL,
  `lei_ji_shu_jiang_di_lv_` varchar(255) DEFAULT NULL,
  `bei_zhu_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t157_002
-- ----------------------------

-- ----------------------------
-- Table structure for t158_002
-- ----------------------------
DROP TABLE IF EXISTS `t158_002`;
CREATE TABLE `t158_002` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_id` int(11) DEFAULT NULL,
  `tr_order` int(11) DEFAULT NULL,
  `cheng_ben_bian_ma_` varchar(255) DEFAULT NULL,
  `cheng_ben_xiang_mu_` varchar(255) DEFAULT NULL,
  `na_rong_fan_wei_miao_shu_` varchar(255) DEFAULT NULL,
  `yu_suan_cheng_ben_` varchar(255) DEFAULT NULL,
  `shi_ji_cheng_ben_` varchar(255) DEFAULT NULL,
  `bei_zhu_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t158_002
-- ----------------------------

-- ----------------------------
-- Table structure for t158_003
-- ----------------------------
DROP TABLE IF EXISTS `t158_003`;
CREATE TABLE `t158_003` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_id` int(11) DEFAULT NULL,
  `tr_order` int(11) DEFAULT NULL,
  `xu_hao_` varchar(255) DEFAULT NULL,
  `wu_zi_ming_chen_` varchar(255) DEFAULT NULL,
  `gui_ge_xing_hao_` varchar(255) DEFAULT NULL,
  `dan_wei_` varchar(255) DEFAULT NULL,
  `ben_yue_yu_suan_cheng_ben_yu_suan_dan_jia_` varchar(255) DEFAULT NULL,
  `ben_yue_yu_suan_cheng_ben_yu_suan_yong_liang_` varchar(255) DEFAULT NULL,
  `ben_yue_yu_suan_cheng_ben_he_jia_` varchar(255) DEFAULT NULL,
  `sun_hao_lv_` varchar(255) DEFAULT NULL,
  `ben_yue_shi_ji_cheng_ben_cai_gou_dan_jia_` varchar(255) DEFAULT NULL,
  `ben_yue_shi_ji_cheng_ben_shi_ji_yong_liang_` varchar(255) DEFAULT NULL,
  `ben_yue_shi_ji_cheng_ben_he_jia_` varchar(255) DEFAULT NULL,
  `suo_shu_cheng_ben_xiang_mu_` varchar(255) DEFAULT NULL,
  `shi_yong_bu_wei_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t158_003
-- ----------------------------

-- ----------------------------
-- Table structure for t158_004
-- ----------------------------
DROP TABLE IF EXISTS `t158_004`;
CREATE TABLE `t158_004` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_id` int(11) DEFAULT NULL,
  `tr_order` int(11) DEFAULT NULL,
  `xu_hao_` varchar(255) DEFAULT NULL,
  `wu_zi_ming_chen_` varchar(255) DEFAULT NULL,
  `gui_ge_xing_hao_` varchar(255) DEFAULT NULL,
  `zu_lin_dan_jia_dan_wei_` varchar(255) DEFAULT NULL,
  `zu_lin_dan_jia_yu_suan_shu_` varchar(255) DEFAULT NULL,
  `zu_lin_dan_jia_shi_ji_shu_` varchar(255) DEFAULT NULL,
  `zu_lin_shu_liang_dan_wei_` varchar(255) DEFAULT NULL,
  `zu_lin_shu_liang_yu_suan_shu_` varchar(255) DEFAULT NULL,
  `zu_lin_shu_liang_shi_ji_shu_` varchar(255) DEFAULT NULL,
  `zu_lin_shi_jian_dan_wei_` varchar(255) DEFAULT NULL,
  `zu_lin_shi_jian_yu_suan_shu_` varchar(255) DEFAULT NULL,
  `zu_lin_shi_jian_shi_ji_shu_` varchar(255) DEFAULT NULL,
  `yu_suan_cheng_ben_he_ji_` varchar(255) DEFAULT NULL,
  `shi_ji_cheng_ben_he_jia_` varchar(255) DEFAULT NULL,
  `suo_shu_cheng_ben_xiang_mu_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t158_004
-- ----------------------------

-- ----------------------------
-- Table structure for t159_002
-- ----------------------------
DROP TABLE IF EXISTS `t159_002`;
CREATE TABLE `t159_002` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_id` int(11) DEFAULT NULL,
  `tr_order` int(11) DEFAULT NULL,
  `xu_hao_` varchar(255) DEFAULT NULL,
  `ji_hua_xiang_mu_` varchar(255) DEFAULT NULL,
  `cheng_ben_jiang_di_lv_mu_biao_zhi_` varchar(255) DEFAULT NULL,
  `ben_qi_shu_zong_fen_` varchar(255) DEFAULT NULL,
  `ben_qi_shu_da_biao_` varchar(255) DEFAULT NULL,
  `ben_qi_shu_wei_da_biao_` varchar(255) DEFAULT NULL,
  `ben_qi_shu_shi_ji_jia_quan_ping_jun_zhi_` varchar(255) DEFAULT NULL,
  `lei_ji_shu_zong_fen_` varchar(255) DEFAULT NULL,
  `lei_ji_shu_da_biao_` varchar(255) DEFAULT NULL,
  `lei_ji_shu_wei_da_biao_` varchar(255) DEFAULT NULL,
  `lei_ji_shu_shi_ji_jia_quan_ping_jun_zhi_` varchar(255) DEFAULT NULL,
  `bei_zhu_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t159_002
-- ----------------------------

-- ----------------------------
-- Table structure for t160_002
-- ----------------------------
DROP TABLE IF EXISTS `t160_002`;
CREATE TABLE `t160_002` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_id` int(11) DEFAULT NULL,
  `tr_order` int(11) DEFAULT NULL,
  `bian_ma_` varchar(255) DEFAULT NULL,
  `cheng_ben_xiang_mu_` varchar(255) DEFAULT NULL,
  `na_rong_fan_wei_miao_shu_` varchar(255) DEFAULT NULL,
  `yu_suan_cheng_ben_` varchar(255) DEFAULT NULL,
  `ji_hua_cheng_ben_` varchar(255) DEFAULT NULL,
  `guo_cheng_cheng_ben_` varchar(255) DEFAULT NULL,
  `jie_chao_jin_e_` varchar(255) DEFAULT NULL,
  `jie_chao_bi_li_` varchar(255) DEFAULT NULL,
  `jie_chao_yin_su_fen_xi_shu_liang_` varchar(255) DEFAULT NULL,
  `jie_chao_yin_su_fen_xi_jia_ge_` varchar(255) DEFAULT NULL,
  `jie_chao_yin_su_fen_xi_qi_ta_` varchar(255) DEFAULT NULL,
  `zhuang_tai_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t160_002
-- ----------------------------

-- ----------------------------
-- Table structure for t161_002
-- ----------------------------
DROP TABLE IF EXISTS `t161_002`;
CREATE TABLE `t161_002` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_id` int(11) DEFAULT NULL,
  `tr_order` int(11) DEFAULT NULL,
  `xu_hao_` varchar(255) DEFAULT NULL,
  `wu_zi_ming_chen_` varchar(255) DEFAULT NULL,
  `gui_ge_xing_hao_` varchar(255) DEFAULT NULL,
  `dan_wei_` varchar(255) DEFAULT NULL,
  `yu_suan_zhi_shu_liang_` varchar(255) DEFAULT NULL,
  `yu_suan_zhi_dan_jia_` varchar(255) DEFAULT NULL,
  `yu_suan_zhi_jin_e_` varchar(255) DEFAULT NULL,
  `shi_ji_zhi_shu_liang_` varchar(255) DEFAULT NULL,
  `shi_ji_zhi_dan_jia_` varchar(255) DEFAULT NULL,
  `shi_ji_zhi_jin_e_` varchar(255) DEFAULT NULL,
  `ying_kui_` varchar(255) DEFAULT NULL,
  `liang_cha_ying_xiang_liang_cha_` varchar(255) DEFAULT NULL,
  `liang_cha_ying_xiang_jin_e_` varchar(255) DEFAULT NULL,
  `jia_cha_ying_xiang_jia_cha_` varchar(255) DEFAULT NULL,
  `jia_cha_ying_xiang_jin_e_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t161_002
-- ----------------------------

-- ----------------------------
-- Table structure for t161_003
-- ----------------------------
DROP TABLE IF EXISTS `t161_003`;
CREATE TABLE `t161_003` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_id` int(11) DEFAULT NULL,
  `tr_order` int(11) DEFAULT NULL,
  `xu_hao_` varchar(255) DEFAULT NULL,
  `wu_zi_ming_chen_` varchar(255) DEFAULT NULL,
  `gui_ge_xing_hao_` varchar(255) DEFAULT NULL,
  `dan_wei_` varchar(255) DEFAULT NULL,
  `yu_suan_zhi_shu_liang_` varchar(255) DEFAULT NULL,
  `yu_suan_zhi_dan_jia_` varchar(255) DEFAULT NULL,
  `yu_suan_zhi_jin_e_` varchar(255) DEFAULT NULL,
  `shi_ji_zhi_shu_liang_` varchar(255) DEFAULT NULL,
  `shi_ji_zhi_dan_jia_` varchar(255) DEFAULT NULL,
  `shi_ji_zhi_jin_e_` varchar(255) DEFAULT NULL,
  `ying_kui_` varchar(255) DEFAULT NULL,
  `liang_cha_ying_xiang_liang_cha_` varchar(255) DEFAULT NULL,
  `liang_cha_ying_xiang_jin_e_` varchar(255) DEFAULT NULL,
  `liang_cha_ying_xiang_zhan_bi_` varchar(255) DEFAULT NULL,
  `jia_cha_ying_xiang_jia_cha_` varchar(255) DEFAULT NULL,
  `jia_cha_ying_xiang_jin_e_` varchar(255) DEFAULT NULL,
  `jia_cha_ying_xiang_zhan_bi_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t161_003
-- ----------------------------

-- ----------------------------
-- Table structure for t162_002
-- ----------------------------
DROP TABLE IF EXISTS `t162_002`;
CREATE TABLE `t162_002` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_id` int(11) DEFAULT NULL,
  `tr_order` int(11) DEFAULT NULL,
  `xu_hao_` varchar(255) DEFAULT NULL,
  `cheng_ben_xiang_mu_` varchar(255) DEFAULT NULL,
  `na_rong_fan_wei_miao_shu_` varchar(255) DEFAULT NULL,
  `yu_suan_zao_jia_` varchar(255) DEFAULT NULL,
  `yu_suan_cheng_ben_` varchar(255) DEFAULT NULL,
  `ying_kui_e_du_` varchar(255) DEFAULT NULL,
  `li_run_dian_biao_ji_` varchar(255) DEFAULT NULL,
  `bei_zhu_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t162_002
-- ----------------------------

-- ----------------------------
-- Table structure for wexcel
-- ----------------------------
DROP TABLE IF EXISTS `wexcel`;
CREATE TABLE `wexcel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `gong_cheng_id` int(11) NOT NULL,
  `excelType` varchar(255) NOT NULL,
  `createDate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=224 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of wexcel
-- ----------------------------
INSERT INTO `wexcel` VALUES ('221', '工程成本测算表(1)', '1', '152', '2018-03-20 16:32:44');
INSERT INTO `wexcel` VALUES ('222', '工程成本测算表(2)', '1', '152', '2018-03-20 16:32:51');
INSERT INTO `wexcel` VALUES ('223', '工程成本计划表(3)', '1', '154', '2018-03-20 16:33:04');

-- ----------------------------
-- Table structure for wtable
-- ----------------------------
DROP TABLE IF EXISTS `wtable`;
CREATE TABLE `wtable` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tableType` varchar(255) DEFAULT NULL,
  `wen_dang_bian_hao_` varchar(255) DEFAULT NULL,
  `excel_id` int(11) DEFAULT NULL,
  `biao_dan_bian_hao_` varchar(255) DEFAULT NULL,
  `xiang_mu_ming_chen_` varchar(255) DEFAULT NULL,
  `xiang_mu_ming_chen_dan_xiang_gong_cheng_` varchar(255) DEFAULT NULL,
  `xiang_mu_ming_chen_dan_xiang_gong_cheng_zhuan_ye_lei_bie_` varchar(255) DEFAULT NULL,
  `tong_ji_yue_fen_` varchar(255) DEFAULT NULL,
  `tong_ji_ri_qi_` varchar(255) DEFAULT NULL,
  `dan_wei_` varchar(255) DEFAULT NULL,
  `bian_zhi_ren_` varchar(255) DEFAULT NULL,
  `shen_he_ren_` varchar(255) DEFAULT NULL,
  `shen_pi_ren_` varchar(255) DEFAULT NULL,
  `bian_zhi_ri_qi_` varchar(255) DEFAULT NULL,
  `shen_he_ri_qi_` varchar(255) DEFAULT NULL,
  `shen_pi_ri_qi_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=482 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of wtable
-- ----------------------------
INSERT INTO `wtable` VALUES ('468', '152_002', null, '221', '嘻嘻嘻', '', null, null, 'null', 'null', '', '', '', '', '', '', '');
INSERT INTO `wtable` VALUES ('469', '152_003', null, '221', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `wtable` VALUES ('470', '152_004', null, '221', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `wtable` VALUES ('471', '152_005', null, '221', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `wtable` VALUES ('472', '152_006', null, '221', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `wtable` VALUES ('473', '152_007', null, '221', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `wtable` VALUES ('474', '152_002', null, '222', '', '', null, null, 'null', 'null', '', '', '', '', '', '', '');
INSERT INTO `wtable` VALUES ('475', '152_003', null, '222', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `wtable` VALUES ('476', '152_004', null, '222', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `wtable` VALUES ('477', '152_005', null, '222', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `wtable` VALUES ('478', '152_006', null, '222', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `wtable` VALUES ('479', '152_007', null, '222', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `wtable` VALUES ('480', '154_002', null, '223', '', '', null, null, 'null', 'null', '', '', '', '', '', '', '');
INSERT INTO `wtable` VALUES ('481', '154_003', null, '223', null, null, null, null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for wtable_authority
-- ----------------------------
DROP TABLE IF EXISTS `wtable_authority`;
CREATE TABLE `wtable_authority` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `bei_zhu_` varchar(255) DEFAULT NULL,
  `mtmask` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of wtable_authority
-- ----------------------------
INSERT INTO `wtable_authority` VALUES ('1', 'aaa', null, null);
INSERT INTO `wtable_authority` VALUES ('2', 'aaa', null, null);
INSERT INTO `wtable_authority` VALUES ('3', 'ssss', null, '01010101');
INSERT INTO `wtable_authority` VALUES ('4', 'ssss', null, '01010101');
INSERT INTO `wtable_authority` VALUES ('5', 'ssss', null, '01010101');
INSERT INTO `wtable_authority` VALUES ('6', 'ssss', null, '01010101');
INSERT INTO `wtable_authority` VALUES ('7', 'ssss', null, '01010101');
INSERT INTO `wtable_authority` VALUES ('8', 'ssss', null, '01010101');
INSERT INTO `wtable_authority` VALUES ('9', 'ssss', null, '01010101');
INSERT INTO `wtable_authority` VALUES ('10', 'ssss', null, '01010101');
INSERT INTO `wtable_authority` VALUES ('11', 'ssss', null, '01010101');
INSERT INTO `wtable_authority` VALUES ('12', 'ssss', null, '01010101');
INSERT INTO `wtable_authority` VALUES ('13', 'ssss', null, '11111101010101000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');
INSERT INTO `wtable_authority` VALUES ('14', 'ssss', null, '00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');
INSERT INTO `wtable_authority` VALUES ('15', '孟宏伟', null, '00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');
INSERT INTO `wtable_authority` VALUES ('16', '21212', null, '00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');
INSERT INTO `wtable_authority` VALUES ('17', 'ÌïÃ¯ÁÖ', null, '11111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');
INSERT INTO `wtable_authority` VALUES ('18', 'ç°èæ', null, '00011100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');
INSERT INTO `wtable_authority` VALUES ('19', 'ÌïÃ¯ÁÖ', null, '11111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');
INSERT INTO `wtable_authority` VALUES ('20', 'ÌïÃ¯ÁÖ', null, '11111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');
INSERT INTO `wtable_authority` VALUES ('21', 'ÌïÃ¯ÁÖ', null, '11111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');
INSERT INTO `wtable_authority` VALUES ('22', 'ÌïÃ¯ÁÖ', null, '11111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');
INSERT INTO `wtable_authority` VALUES ('23', 'ÌïÃ¯ÁÖ', null, '11111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');
INSERT INTO `wtable_authority` VALUES ('24', '��ï��', null, '11111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');
INSERT INTO `wtable_authority` VALUES ('25', '��ï��', null, '11111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');
INSERT INTO `wtable_authority` VALUES ('26', '��ï��', null, '11111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');
INSERT INTO `wtable_authority` VALUES ('27', '蛮好玩', null, '11111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');
INSERT INTO `wtable_authority` VALUES ('28', 'è®å¥½ç©', null, '11111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');
INSERT INTO `wtable_authority` VALUES ('29', 'ÌïÃ¯ÁÖ', null, '11111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');
INSERT INTO `wtable_authority` VALUES ('30', 'ÌïÃ¯ÁÖ', null, '11111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');
INSERT INTO `wtable_authority` VALUES ('31', '��ï��', null, '11111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');
INSERT INTO `wtable_authority` VALUES ('32', '��ï��', null, '11111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');
INSERT INTO `wtable_authority` VALUES ('33', '��ï��', null, '11111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');
INSERT INTO `wtable_authority` VALUES ('34', '��ï��', null, '11111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');
INSERT INTO `wtable_authority` VALUES ('35', '蛮好玩', null, '11111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');
INSERT INTO `wtable_authority` VALUES ('36', '��ï��', null, '11111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');
INSERT INTO `wtable_authority` VALUES ('37', '��ï��', null, '11111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000');

-- ----------------------------
-- Table structure for wtable_title
-- ----------------------------
DROP TABLE IF EXISTS `wtable_title`;
CREATE TABLE `wtable_title` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_id` int(11) DEFAULT NULL,
  `tr_order` int(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `level` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of wtable_title
-- ----------------------------
INSERT INTO `wtable_title` VALUES ('25', '313', '16', '的撒啊啊啊啊啊啊啊啊', '3');
INSERT INTO `wtable_title` VALUES ('26', '352', '4', '一·工程调整', '1');
INSERT INTO `wtable_title` VALUES ('24', '313', '24', '撒大大多多多多多多', '1');
INSERT INTO `wtable_title` VALUES ('23', '313', '5', '阿斯顿点点滴滴', '2');
INSERT INTO `wtable_title` VALUES ('18', '313', '25', '333333333333', '3');
INSERT INTO `wtable_title` VALUES ('21', '313', '10', '十大啊啊啊啊啊啊啊啊', '3');
INSERT INTO `wtable_title` VALUES ('22', '313', '0', '撒大大多多多多多多多多多多多多多多多多多多多多多多多多多多多', '1');
INSERT INTO `wtable_title` VALUES ('20', '313', '20', '大搜索搜索', '1');
INSERT INTO `wtable_title` VALUES ('27', '360', '19', '第二个标题', '1');
INSERT INTO `wtable_title` VALUES ('28', '360', '4', '第一个标题', '1');
INSERT INTO `wtable_title` VALUES ('29', '360', '23', '2.1标题', '2');
INSERT INTO `wtable_title` VALUES ('30', '360', '8', '1.1标题', '2');
INSERT INTO `wtable_title` VALUES ('31', '360', '15', '1.2标题', '2');
INSERT INTO `wtable_title` VALUES ('32', '360', '27', '2.2标题', '2');
INSERT INTO `wtable_title` VALUES ('33', '360', '32', '2.3标题', '2');
INSERT INTO `wtable_title` VALUES ('34', '360', '37', '2.4标题', '1');
INSERT INTO `wtable_title` VALUES ('35', '468', '2', '萨达所大所多所', '1');

-- ----------------------------
-- Table structure for xiang_mu_ren_yuan_zhu_ce_
-- ----------------------------
DROP TABLE IF EXISTS `xiang_mu_ren_yuan_zhu_ce_`;
CREATE TABLE `xiang_mu_ren_yuan_zhu_ce_` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ren_yuan_id_` int(11) DEFAULT NULL,
  `xiang_mu_id_` int(11) DEFAULT NULL,
  `gang_wei_ming_cheng_` varchar(255) DEFAULT NULL COMMENT '岗位名称',
  `zhi_wu_` varchar(255) DEFAULT NULL COMMENT '职务',
  `suo_shu_bu_men_` varchar(255) DEFAULT NULL,
  `dao_gang_shi_jian_` date DEFAULT NULL,
  `gang_wei_xing_zhi_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xiang_mu_ren_yuan_zhu_ce_
-- ----------------------------
INSERT INTO `xiang_mu_ren_yuan_zhu_ce_` VALUES ('8', '23', '1', '改了', '测试', '投标', '2018-02-01', '测试');
INSERT INTO `xiang_mu_ren_yuan_zhu_ce_` VALUES ('9', '19', '1', '岗位2', '测试', '行政', '2018-02-02', '哦哦哦');
INSERT INTO `xiang_mu_ren_yuan_zhu_ce_` VALUES ('10', '22', '1', '岗位3', 'Alla', '测绘', '2018-02-03', '啊啊');
INSERT INTO `xiang_mu_ren_yuan_zhu_ce_` VALUES ('11', '17', '1', '岗位4', '啦啦啦', '核算', '2018-02-04', '对对对');
INSERT INTO `xiang_mu_ren_yuan_zhu_ce_` VALUES ('12', '14', '1', '岗位5', '对对对', '行政', '2018-02-06', '1111');
INSERT INTO `xiang_mu_ren_yuan_zhu_ce_` VALUES ('13', '13', '1', '岗位6', '大', '测绘', '2018-02-01', '3233');
INSERT INTO `xiang_mu_ren_yuan_zhu_ce_` VALUES ('14', '20', '1', '岗位7', '晓得', '投标', '2018-02-08', '4433');
INSERT INTO `xiang_mu_ren_yuan_zhu_ce_` VALUES ('15', '25', '1', '岗位8', '电视剧', '核算', '2018-02-07', '7677');
INSERT INTO `xiang_mu_ren_yuan_zhu_ce_` VALUES ('18', '21', '1', '岗位9', '大大', '核算', '2018-02-02', '大第三方');

-- ----------------------------
-- Table structure for xiang_mu_xin_xi_
-- ----------------------------
DROP TABLE IF EXISTS `xiang_mu_xin_xi_`;
CREATE TABLE `xiang_mu_xin_xi_` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `xiang_mu_ming_chen_` varchar(255) DEFAULT NULL COMMENT '项目名称',
  `xiang_mu_yong_tu_` varchar(255) DEFAULT NULL COMMENT '项目用途',
  `gong_cheng_di_dian_` varchar(255) DEFAULT NULL,
  `tou_zi_xing_zhi_` varchar(255) DEFAULT NULL COMMENT '投资性质',
  `jian_she_dan_wei_` varchar(255) DEFAULT NULL COMMENT '建设单位',
  `jian_she_dan_wei_zhu_gong_di_dai_biao_` varchar(255) DEFAULT NULL,
  `she_ji_dan_wei_` varchar(255) DEFAULT NULL,
  `she_ji_dan_wei_zhu_gong_di_dai_biao_` varchar(255) DEFAULT NULL,
  `jian_li_dan_wei_` varchar(255) DEFAULT NULL COMMENT '监理单位',
  `jian_li_dai_biao_` varchar(255) DEFAULT NULL COMMENT '监理代表',
  `kai_gong_ri_qi_` datetime DEFAULT NULL COMMENT '开工日期',
  `jun_gong_ri_qi_` datetime DEFAULT NULL COMMENT '竣工日期',
  `gong_qi_tian_shu_` varchar(255) DEFAULT NULL COMMENT '工期天数',
  `zhi_liang_mu_biao_` varchar(255) DEFAULT NULL COMMENT '质量目标',
  `he_tong_jia_kuan_` varchar(255) DEFAULT NULL,
  `cheng_bao_fang_shi_` varchar(255) DEFAULT NULL COMMENT '承包方式',
  `shen_he_zhuang_tai_` int(11) DEFAULT '1' COMMENT '1:编辑等待审核；2：审核完成；',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=61 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xiang_mu_xin_xi_
-- ----------------------------
INSERT INTO `xiang_mu_xin_xi_` VALUES ('3', '测试项目', 'asdd', 'as', '1', '2', '4', '3', '2', '', '', '1900-01-01 00:00:00', '1900-01-01 00:00:00', '', '万元', '万元', '', '1');
INSERT INTO `xiang_mu_xin_xi_` VALUES ('1', '测试项目', '', '', '', '', '', '', '', '', '', '1900-01-01 00:00:00', '1900-01-01 00:00:00', '', '万元', '万元', '', '1');
INSERT INTO `xiang_mu_xin_xi_` VALUES ('7', '213', '是大法师的法', '第三方撒旦法师打发第三方', '爱的色放撒地方撒地方', '大法师打发打发', '的撒发生大所发生的', '是打发打发大是大非', '的撒范德萨发生的', '士大夫的撒发顺丰', '的萨芬撒打发的撒', '0000-00-00 00:00:00', '0000-00-00 00:00:00', '222', '打发第三方', '万元', '士大夫士大夫', '1');
INSERT INTO `xiang_mu_xin_xi_` VALUES ('8', '11111dsfasdf', '222', 'dsfasdfs', 'fasdfsd', '', '', '', '', '', '', '1900-01-01 00:00:00', '1900-01-01 00:00:00', '', '万元', '万元', '', '1');
INSERT INTO `xiang_mu_xin_xi_` VALUES ('9', '1121212121测试室', 'dfasdfds中', 'dsfsdfdas', 'dsfsadf', 'dsfsadfdas', '1121', '的好方法设计的回复即可收到货达到1测试测试是是', '达瓦', '', '', '2017-00-00 00:00:00', '0000-00-00 00:00:00', '', '', '万元', '', '1');
INSERT INTO `xiang_mu_xin_xi_` VALUES ('10', 'adawddawsad', 'dsfads', 'asdsa', 'sd', 'asdasdas', 'asdas', '', '', '', '', '0000-00-00 00:00:00', '0000-00-00 00:00:00', '', '', '万元', '', '1');
INSERT INTO `xiang_mu_xin_xi_` VALUES ('11', '的看法还是劳动', '爱迪生多', '奥术大师多', '111', '奥术大师大阿迪王哇大无大无阿瓦达', '撒大声地', '阿瓦达无多哇大啊啊啊啊', '', '', '', '0000-00-00 00:00:00', '0000-00-00 00:00:00', '', '', '万元', '', '1');
INSERT INTO `xiang_mu_xin_xi_` VALUES ('12', '测试项目', '', '但是士大夫撒旦发的说法是否萨达撒大多撒奥所所大所多', '', '是撒多撒大所多撒安达市大所多所啊撒大声地', '', '', '', '', '', '0000-00-00 00:00:00', '0000-00-00 00:00:00', '', '', '万元', '', '2');
INSERT INTO `xiang_mu_xin_xi_` VALUES ('47', '数据的返回', '计算的和', '电视剧啊很费劲', '外资', 'djsahfjk打发', '阿萨德发多少', '啊实打实', '啊实打实', '啊实打实', '啊实打实', '1900-01-01 00:00:00', '1900-01-01 00:00:00', '112', '', '', '联合总承包，合作伙伴是张西洋', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('49', '新建项目', '', '', '', '', '', '', '', '', '', '1900-01-01 00:00:00', '1900-01-01 00:00:00', '', '', '', '', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('48', '孟宏伟', '', '', '', '', '', '', '', '', '', '1900-01-01 00:00:00', '1900-01-01 00:00:00', '', '', '', '', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('22', '但是打发斯蒂', '第三方', '爱的色放的撒范德萨', '奥术大师多', '士大夫的撒范德萨', '大凤', '爱的色放第三方', '大师傅', 'Asdasd撒大声地', '爱迪生撒的撒', '2017-01-01 00:00:00', '2018-01-01 00:00:00', '365', '啊第三方sad', '900', '奥术大师', '1');
INSERT INTO `xiang_mu_xin_xi_` VALUES ('24', '测试一个项目', '答复', '阿萨德啊啊十大', '', '撒大 的撒范德萨', '发', '大事发生的 AAS发的', '', '', '', '0000-00-00 00:00:00', '0000-00-00 00:00:00', '', '', '', '', '1');
INSERT INTO `xiang_mu_xin_xi_` VALUES ('50', '测试一下', '第三方', '大打发修改了', '世（亚）行贷款', '大师傅大师傅', '大法师打', '发生的发生大', '阿斯蒂芬大厦', '阿萨德发多少', '阿斯蒂芬大厦', '1900-01-01 00:00:00', '1900-01-01 00:00:00', '111', '取1', '取1', '联合总承包，合作伙伴是张张', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('29', '33333', '', '44444', '', '', '', '', '', '', '', '2018-02-01 00:00:00', '2018-02-12 00:00:00', '', '', '', '', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('30', '1111', '', '', '', '', '', '', '', '', '', '2018-02-07 00:00:00', '2020-10-14 00:00:00', '', '', '', '', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('31', '1234789', '', '', '', '', '', '', '', '', '', '2018-02-01 00:00:00', '2018-02-01 00:00:00', '', '', '', '', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('32', '1234789', '', '', '', '', '', '', '', '', '', '2018-02-01 00:00:00', '2018-02-01 00:00:00', '', '', '', '', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('33', '1234789', '', '', '', '', '', '', '', '', '', '2018-02-01 00:00:00', '2018-02-01 00:00:00', '', '', '', '', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('34', '1234789', '', '', '', '', '', '', '', '', '', '2018-02-01 00:00:00', '2018-02-01 00:00:00', '', '', '', '', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('35', '1234789', '', '', '', '', '', '', '', '', '', '2018-02-01 00:00:00', '2018-02-01 00:00:00', '', '', '', '', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('36', '1234789', '', '', '', '', '', '', '', '', '', '2018-02-01 00:00:00', '2018-02-01 00:00:00', '', '', '', '', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('37', '1234789', '', '', '', '', '', '', '', '', '', '2018-02-01 00:00:00', '2018-02-01 00:00:00', '', '', '', '', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('38', '1234789', '', '', '', '', '', '', '', '', '', '2018-02-01 00:00:00', '2018-02-01 00:00:00', '', '', '', '', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('39', '1234789', '', '', '', '', '', '', '', '', '', '2018-02-01 00:00:00', '2018-02-01 00:00:00', '', '', '', '', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('40', '1234789', '', '', '', '', '', '', '', '', '', '2018-02-01 00:00:00', '2018-02-01 00:00:00', '', '', '', '', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('41', '1234789', '', '', '', '', '', '', '', '', '', '2018-02-01 00:00:00', '2018-02-01 00:00:00', '', '', '', '', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('42', '222', '', '11', '', '', '', '', '', '', '', '2018-02-15 00:00:00', '2018-02-24 00:00:00', '', '', '', '', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('43', '222', '', '11', '', '', '', '', '', '', '', '2018-02-15 00:00:00', '2018-02-24 00:00:00', '', '', '', '', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('44', 'xxx', '', '', '', '', '', '', '', '', '', '2018-02-01 00:00:00', '2018-02-28 00:00:00', '', '', '', '', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('45', 'XXXX', '', '', '', '', '', '', '', '', '', '2018-03-01 00:00:00', '2018-03-14 00:00:00', '', '', '', '', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('46', 'XXXX2', '', '', '', '', '', '', '', '', '', '2018-03-01 00:00:00', '2018-03-14 00:00:00', '', '', '', '', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('51', '测试0317', '五五五', '北京', '国拨', '五五五', '五五五', '五五五', '五五五', '五五五', '五五五', '1900-01-01 00:00:00', '1900-01-01 00:00:00', '五五五', '五五五', '五五五', '分包，总承包商是', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('52', '嘻嘻哈哈', '阿萨德', '阿萨德', '国拨', '阿萨德', '阿萨德', '阿萨德', '阿萨德', '阿萨德', '阿萨德', '1900-01-01 00:00:00', '1900-01-01 00:00:00', '', '956', '5656', '总承包', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('53', '322323', '2323', '2323', '其他', '2323', '23', '2323', '23', '2323', '323', '1900-01-01 00:00:00', '1900-01-01 00:00:00', '', '', '', '总承包', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('54', '322323', '2323', '2323', '其他', '2323', '23', '2323', '23', '2323', '323', '1900-01-01 00:00:00', '1900-01-01 00:00:00', '', '', '', '总承包', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('55', '322323', '2323', '2323', '其他', '2323', '23', '2323', '23', '2323', '323', '1900-01-01 00:00:00', '1900-01-01 00:00:00', '', '', '', '总承包', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('56', '322323', '2323', '2323', '其他', '2323', '23', '2323', '23', '2323', '323', '1900-01-01 00:00:00', '1900-01-01 00:00:00', '', '', '', '总承包', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('57', '322323', '2323', '2323', '其他', '2323', '23', '2323', '23', '2323', '323', '1900-01-01 00:00:00', '1900-01-01 00:00:00', '', '', '', '总承包', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('58', '322323', '2323', '2323', '其他', '2323', '23', '2323', '23', '2323', '323', '1900-01-01 00:00:00', '1900-01-01 00:00:00', '', '', '', '总承包', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('59', '322323', '2323', '2323', '其他', '2323', '23', '2323', '23', '2323', '323', '1900-01-01 00:00:00', '1900-01-01 00:00:00', '', '', '', '总承包', null);
INSERT INTO `xiang_mu_xin_xi_` VALUES ('60', '322323', '2323', '2323', '其他', '2323', '23', '2323', '23', '2323', '323', '1900-01-01 00:00:00', '1900-01-01 00:00:00', '', '', '', '总承包', null);

-- ----------------------------
-- Table structure for yong_hu_
-- ----------------------------
DROP TABLE IF EXISTS `yong_hu_`;
CREATE TABLE `yong_hu_` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `yong_hu_ming_` varchar(255) DEFAULT NULL COMMENT '用户名，用于登录',
  `mi_ma_` varchar(255) DEFAULT NULL COMMENT '密码',
  `xing_ming_` varchar(255) DEFAULT NULL COMMENT '姓名',
  `xing_bie_` varchar(255) DEFAULT '男' COMMENT '性别',
  `min_zu_` varchar(255) DEFAULT NULL COMMENT '名族',
  `shen_fen_zheng_hao_ma_` varchar(255) DEFAULT '' COMMENT '身份证号码',
  `shen_fen_zheng_zhao_zheng_` varchar(255) DEFAULT NULL COMMENT '身份证正面',
  `shen_fen_zheng_zhao_fan_` varchar(255) DEFAULT NULL COMMENT '身份证证件反面',
  `jia_ting_zhu_zhi_` varchar(255) DEFAULT NULL COMMENT '家庭住址',
  `lao_dong_he_tong_bian_hao_` varchar(255) DEFAULT NULL COMMENT '劳动合同编号',
  `zheng_jian_zhao_ids_` varchar(255) DEFAULT NULL COMMENT '证件证书-存储证件照的id字符串',
  `suo_shu_yong_hu_zu_` int(11) DEFAULT '2' COMMENT '用户组的id',
  `biao_qian_` int(11) DEFAULT '0' COMMENT '存储标签的id',
  `qi_ye_` int(11) DEFAULT NULL COMMENT '存储企业对应的id',
  `quan_xian_` int(11) DEFAULT '1' COMMENT '权限：0暂时表示超级管理员，1：基本用户；剩下的用二进制算',
  `zhu_ce_shi_jian_` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of yong_hu_
-- ----------------------------
INSERT INTO `yong_hu_` VALUES ('30', null, null, '发个梵蒂冈', '1', ' 发', '发的地方', '2018031113585225666z.png', '2018031113585225666f.png', '讽德诵功的方式发给', '大师傅', '[]', '2', '2', '3', '1', '2018-03-11 01:58:52');
INSERT INTO `yong_hu_` VALUES ('14', null, null, '电话费', '2', '好', '89749878923184', '2018020713414777362z.png', '2018020713414777362f.png', '分开绝对是分开计算的话就开始电话', '的科技荣获', '[4]', '2', '1', '3', '1', '2018-02-01 03:50:37');
INSERT INTO `yong_hu_` VALUES ('13', null, null, '电接收', '2', '好', '的89749878923184', '2018020713404121670z.png', '2018020713404121670f.png', '分开绝对是分开计算的话就开始电话', '的科技荣获', null, '2', '1', '3', '1', '2018-02-05 03:50:43');
INSERT INTO `yong_hu_` VALUES ('18', null, null, '张西洋', '1', '机会', '321323198907115379', '2018020714263568312z.png', '2018020714263568312f.png', '加快速度浩丰科技暗室逢灯', '撒第三方', '[7]', '2', '1', '3', '1', '2018-02-07 03:50:50');
INSERT INTO `yong_hu_` VALUES ('17', null, null, '等冰冰', '1', '汉', '876387687634872', '2018020714245911985z.png', '2018020714245911985f.png', '接电话副科级撒好地方', '的粉红色', '[]', '2', '7', '6', '1', '2018-02-09 03:50:58');
INSERT INTO `yong_hu_` VALUES ('19', null, null, '张中', '1', '的', '贷款垃圾阑槛', '2018020815360044521z.png', '2018020815360044521f.png', '的空间啊理发看到了设计费看', '答复 ', '[8]', '2', '1', '3', '1', '2018-02-08 03:51:06');
INSERT INTO `yong_hu_` VALUES ('20', null, null, '东方会', '1', '就的撒开户费', '348732143384687216 ', '2018021020141955747z.png', '2018021020141955747f.png', '涉及到合肥空间大三监控', '金卡戴珊回复', '[9]', '2', '2', '3', '1', '2018-02-09 04:20:49');
INSERT INTO `yong_hu_` VALUES ('21', null, null, '绝对是', '1', '抗衰', '空间的说法空间受到就看见', '2018021020201295124z.png', '2018021020201295124f.png', '，没多少那封，没撒旦看到了计算非', '绝对是开发', '[10]', '2', '7', '6', '1', '2018-02-10 08:20:12');
INSERT INTO `yong_hu_` VALUES ('22', null, null, '孟宏伟', '1', '蒙古', '231231231231', '2018021215584491241z.png', '2018021215584491241f.png', '等级划分空间的说法空间受到回复', '安慰群-1', '[11,12]', '2', '15', '7', '1', '2018-02-12 03:58:44');
INSERT INTO `yong_hu_` VALUES ('23', null, null, '张三', '2', '但是', '倒计时卡号凤凰科技世纪东方', '2018021216130780425z.png', '2018021216130780425f.png', '大家发空间撒大黄蜂就开始电话费', '就的撒', '[13,14]', '2', '8', '6', '1', '2018-02-12 04:13:07');
INSERT INTO `yong_hu_` VALUES ('24', null, null, '张大大', '1', '汉', '1786872163871263', '2018022004193080905z.png', '2018022004193080905f.png', '东方丽景阿萨德回复空间大三', '大富科技监控', '[15]', '2', '2', '3', '1', '2018-02-20 04:19:30');
INSERT INTO `yong_hu_` VALUES ('25', null, null, '孟孟', '1', '蒙古', '764872376846', '2018022004222712892z.png', '2018022004222712892f.png', '我ad符合会计师电话费空间撒旦画', '大多数', '[]', '2', '16', '3', '1', '2018-02-20 04:22:27');
INSERT INTO `yong_hu_` VALUES ('29', '1', '111111', null, null, null, null, null, null, null, null, null, null, null, null, '0', null);

-- ----------------------------
-- Table structure for yong_hu_biao_qian_
-- ----------------------------
DROP TABLE IF EXISTS `yong_hu_biao_qian_`;
CREATE TABLE `yong_hu_biao_qian_` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `biao_qian_ming_` varchar(255) DEFAULT NULL COMMENT '标签名称',
  `suo_shu_gong_si_` int(11) DEFAULT NULL COMMENT '这个标签属于哪个公司',
  `bei_zhu_` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of yong_hu_biao_qian_
-- ----------------------------
INSERT INTO `yong_hu_biao_qian_` VALUES ('1', '行政', '3', '的说法洛杉矶的看法蓝卡队 了');
INSERT INTO `yong_hu_biao_qian_` VALUES ('2', '工期', '3', '盛开的联发科拉圣诞节疯狂拉升的激发是大法师的法');
INSERT INTO `yong_hu_biao_qian_` VALUES ('4', '项目', '3', '圣诞节疯狂萨拉大家疯狂拉升');
INSERT INTO `yong_hu_biao_qian_` VALUES ('5', '成本', '3', '贷款辣椒粉看了大家');
INSERT INTO `yong_hu_biao_qian_` VALUES ('6', '行政', '6', '的空间撒回复');
INSERT INTO `yong_hu_biao_qian_` VALUES ('7', '核算', '6', '倒计时萨达');
INSERT INTO `yong_hu_biao_qian_` VALUES ('8', '投标', '6', '贷款垃圾萨洛克就的撒范德萨');
INSERT INTO `yong_hu_biao_qian_` VALUES ('9', '是撒多', '8', '第三方撒大多数');
INSERT INTO `yong_hu_biao_qian_` VALUES ('10', '测试新标签', '12', '随便写个备注');
INSERT INTO `yong_hu_biao_qian_` VALUES ('11', '工程项目部', '12', '工程项目部备注');
INSERT INTO `yong_hu_biao_qian_` VALUES ('12', '核算', '3', '扩大家里空间发的拉法卡洛斯的分类');
INSERT INTO `yong_hu_biao_qian_` VALUES ('13', '的沙发斯蒂芬', '11', '第三方');
INSERT INTO `yong_hu_biao_qian_` VALUES ('14', '的神色', '10', '啊的说法');
INSERT INTO `yong_hu_biao_qian_` VALUES ('15', '测绘', '7', '打卡机法律手段会计分录');
INSERT INTO `yong_hu_biao_qian_` VALUES ('16', '绘图', '3', '打算范德萨范德萨发的');

-- ----------------------------
-- Table structure for yong_hu_zheng_shu_
-- ----------------------------
DROP TABLE IF EXISTS `yong_hu_zheng_shu_`;
CREATE TABLE `yong_hu_zheng_shu_` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `yong_hu_id_` int(11) NOT NULL COMMENT '证书所属的用户的id',
  `zheng_jian_ming_chen_` varchar(255) DEFAULT NULL COMMENT '证书名称',
  `zheng_jian_hao_ma_` varchar(255) DEFAULT NULL COMMENT '证件号码',
  `fa_zheng_ji_guan_` varchar(255) DEFAULT NULL COMMENT '发证机关',
  `nian_shen_shi_jian_` varchar(255) DEFAULT NULL COMMENT '证书年审时间',
  `zheng_jian_zhao_` varchar(255) DEFAULT NULL COMMENT '证件照的名称，多张照片的时候可以用特殊符号隔开',
  `bei_zhu_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`,`yong_hu_id_`)
) ENGINE=MyISAM AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of yong_hu_zheng_shu_
-- ----------------------------
INSERT INTO `yong_hu_zheng_shu_` VALUES ('3', '13', '等级划分', '接电话计算机返回', '独家首发就开始', '就订好房撒地方', '20180207134041188520.png', null);
INSERT INTO `yong_hu_zheng_shu_` VALUES ('4', '14', '等级划分', '接电话计算机返回', '独家首发就开始', '就订好房撒地方', '20180207134147465730.png', null);
INSERT INTO `yong_hu_zheng_shu_` VALUES ('7', '18', '大的撒发达', '的撒范德萨', '啥的范德萨', '啥的范德萨', '20180207142635110321.png', null);
INSERT INTO `yong_hu_zheng_shu_` VALUES ('8', '19', '但是发啊的说法', '打发的所发生的', '阿达是否单身', '打算发大水', '20180208153600502510.png', null);
INSERT INTO `yong_hu_zheng_shu_` VALUES ('9', '20', '的撒范德萨发', '大法师打', '大法师打发但是', '第三方但是', '20180210201419626790.png', null);
INSERT INTO `yong_hu_zheng_shu_` VALUES ('10', '21', '大家发空间大三', '健康的说法看', '的监控和环境', '绝对是卡回复空间大三好', '20180210202012783070.png', null);
INSERT INTO `yong_hu_zheng_shu_` VALUES ('11', '22', '大姐几顿饭', '几点开始', '健康的说法', '的空间啊', '20180212155844958990.png', null);
INSERT INTO `yong_hu_zheng_shu_` VALUES ('12', '22', '绝地反击卡萨丁', '就订好房', '撒地方', 'ad所发生的', '20180212155844958991.png', null);
INSERT INTO `yong_hu_zheng_shu_` VALUES ('13', '23', '独食难肥没多少', '大部分的', '电脑没办法的事', '带你飞', '20180212161307579380.png', null);
INSERT INTO `yong_hu_zheng_shu_` VALUES ('14', '23', '第三方美三方', '你们的说法，萨达', '吗，独食难肥，但是', '啥大发多少', '20180212161307579381.png', null);
INSERT INTO `yong_hu_zheng_shu_` VALUES ('15', '24', '空间的', '家第三方看到', '可是抵抗力发', '的撒发达', '20180220041930685650.png', null);

-- ----------------------------
-- Table structure for yong_hu_zu_
-- ----------------------------
DROP TABLE IF EXISTS `yong_hu_zu_`;
CREATE TABLE `yong_hu_zu_` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `zu_ming_` varchar(255) DEFAULT NULL COMMENT '组名',
  `quan_xian_` int(11) DEFAULT NULL COMMENT '权限:0：超级管理员；1：普通用户',
  `shi_fou_nei_zhi_` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of yong_hu_zu_
-- ----------------------------
INSERT INTO `yong_hu_zu_` VALUES ('1', '超级管理员', '0', '1');
INSERT INTO `yong_hu_zu_` VALUES ('2', '普通用户', '1', '1');
