CREATE TABLE `anything`.`MEMBER` (
  `id` BIGINT NOT NULL COMMENT '회원 시퀀스 ID',
  `email` VARCHAR(60) NOT NULL COMMENT '회원 email계정',
  `password` VARCHAR(60) NOT NULL COMMENT '회원 비밀번호',
  `name` VARCHAR(20) NOT NULL COMMENT '회원 이름',
  `nick_name` VARCHAR(20) NOT NULL COMMENT '회원 별명',
  `grade` VARCHAR(10) NOT NULL COMMENT '회원 등급',
  `update_at` DATETIME NULL DEFAULT now() COMMENT '회원 정보 수정일시',
  `register_at` DATETIME NULL DEFAULT now() COMMENT '회원 등록일시',
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC),
  UNIQUE INDEX `nick_name_UNIQUE` (`nick_name` ASC));