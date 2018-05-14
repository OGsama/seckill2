CREATE DATABASE seckill2;
USE seckill2;
CREATE TABLE seckill2(
  `seckill_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` VARCHAR(120) NOT NULL COMMENT '名字',
  PRIMARY KEY (seckill_id)
)ENGINE = InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET =utf8 COMMENT '秒杀表2';
CREATE DATABASE seckill2;
USE seckill2;
CREATE TABLE seckill2(
  `seckill_id` BIGINT NOT NULL  AUTO_INCREMENT COMMENT 'id',
  `seckill_name` VARCHAR(20) NOT NULL COMMENT 'name',
  PRIMARY KEY (seckill_id)
)ENGINE = InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET =utf8 COMMENT 'table2';
CREATE DATABASE seckill2;
USE seckill2;
CREATE TABLE seckill2(
  `seckill_id` BIGINT(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `seckill_name` VARCHAR(120) NOT NULL COMMENT 'name',
  PRIMARY KEY (seckill_id)
)ENGINE =InnoDB AUTO_INCREMENT=200 DEFAULT CHARSET =utf8 COMMENT 'table2';

INSERT seckill2 (seckill_id, seckill_name) VALUE (null,'haha');
INSERT seckill2 (seckill_id, seckill_name) VALUE (null,'hehe');
INSERT seckill2 (seckill_id, seckill_name) VALUE (null,'heihei');