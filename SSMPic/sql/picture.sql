# Host: localhost  (Version 5.7.20-log)
# Date: 2019-03-15 21:20:23
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "picture"
#

CREATE TABLE `picture` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `picname` varchar(255) DEFAULT NULL COMMENT '图片地址',
  `content` varchar(80) DEFAULT NULL COMMENT '图片标签',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8 COMMENT='图片表';

#
# Data for table "picture"
#

INSERT INTO `picture` VALUES (27,'upload/e8ec50f17d8b40c09fd68ba409ae45e0.jpg','瀑布'),(31,'upload/586f87a512b744f0b67d220bd1c7ec2a.jpg','船'),(32,'upload/7a1cc9d9001f4a2197326761944f6a34.jpg','姬如雪'),(37,'upload/e9492ac3fc9040039a55031996fa828b.jpg','夏洛特'),(38,'upload/eea648530c8b4df7bd524928e7fff7ec.png','柯南'),(39,'upload/851508a2bd4e4a8c98a3ff96646aa9f0.jpg','夜色'),(40,'upload/4c916dfde3344d508cbb5f3eaf1e9a04.jpg','末日'),(46,'upload/61fbd2b2908e4c2181a9f310ef14d02b.jpg','街道'),(51,'upload/f07d672f17ac4c359a5cc87939e04070.jpg','拍摄'),(52,'upload/749608d045b94aba922f2cbfdad9b01b.jpg','简笔画'),(53,'upload/8e1a1718a10349db8d99bef3b558ceb4.jpg','不良人'),(55,'upload/5f4b0f78fb6347c29a022eba37397b27.jpg','冥帝'),(58,'upload/71779e5d87e54f1497d92f665b488f70.jpg','遛狗'),(59,'upload/e39613777f2846beb009cf37751d443f.jpg','流星雨');

#
# Structure for table "user"
#

CREATE TABLE `user` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(40) DEFAULT NULL COMMENT '用户名',
  `password` varchar(40) DEFAULT NULL COMMENT '用户密码',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户表';

#
# Data for table "user"
#

INSERT INTO `user` VALUES (1,'clg','123'),(2,'222','222'),(3,'abc','abc');
