SET SESSION FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS t_user;

/* Create Tables */
CREATE TABLE `t_user` (
  	`id` int(11)  NOT NULL COMMENT '用户编号',
 	 `user_name` varchar(32) COMMENT '用户名字',
  	`user_password` varchar(32) COMMENT '用户密码',
	PRIMARY KEY (`id`)
)  COMMENT = '用户表';