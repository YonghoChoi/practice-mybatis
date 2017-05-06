create table `comment` {
  `comment_no` bigint not null auto_increment,
  `user_id` varchar(32) not null,
  `comment_content` mediumtext not null,
  `reg_date` datetime not null,
};

create table `reply` {
  `reply_no` bigint(19) not null auto_increment,
  `comment_no` bigint(19) not null,
  `user_id` varchar(32) not null,
  `reply_content` mediumtext not null,
  `reg_date` datetime not null,
  PRIMARY KEY (`reply_no`)
};

create table `user` {
  `user_id` varchar(32) not null,
  `user_name` varchar(100) not null,
  PRIMARY KEY (`user_id`)
};