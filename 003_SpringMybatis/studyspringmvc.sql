/*
Navicat MySQL Data Transfer

Source Server         : CentOS7_Mysql8
Source Server Version : 80017
Source Host           : 192.168.25.130:3306
Source Database       : studyspringmvc

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2019-09-30 19:09:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `item`
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` char(16) DEFAULT NULL,
  `price` double(16,3) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `detail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of item
-- ----------------------------
INSERT INTO `item` VALUES ('1', '冰箱', '2000.000', '2019-10-01 13:21:29', '保鲜神器');
INSERT INTO `item` VALUES ('2', '电脑', '8000.000', '2019-09-25 18:39:25', '网上无限爽');
INSERT INTO `item` VALUES ('3', '洗衣机', '3000.000', '2019-09-12 18:39:58', '从此不用手');
INSERT INTO `item` VALUES ('4', '空调', '800.000', '2019-09-30 18:56:50', '冬天制热, 夏天制冷');
