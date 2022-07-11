create database vietanhshop;
use vietanhshop;
ALTER DATABASE vietanhshop CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci;
create table `user`(
	uuid varchar(20) PRIMARY KEY,
    fullname varchar(30),
    age int,
    phone varchar(10),
    `password` varchar(100),
    role enum('ROLE_CLIENT','ROLE_ADMIN')
); 
create table product (
	product_id int UNSIGNED PRIMARY KEY,
    product_name varchar(50),
    cost bigint,
    insurance int,
    description varchar(100),
    product_url varchar(300)
);
INSERT INTO `vietanhshop`.`user` (`uuid`, `fullname`, `age`, `phone`, `password`, `role`) VALUES ('vietanh9720', 'Nguyễn Văn Việt Anh', '22', '0914917499', '$2a$12$8ofnt8tnj9sBtDbROmFpF.fSApW/nI2N7qLwa7SkZG6u2xj.ObJVm', 'ROLE_ADMIN');
INSERT INTO `vietanhshop`.`product` (`product_id`, `product_name`, `cost`, `insurance`, `description`, `product_url`) VALUES ('1', 'Iphone 13 Pro Max', '23000000', '2', 'Iphone by Apple .Inc', 'default');

