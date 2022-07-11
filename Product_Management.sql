drop database if EXISTS vietanhshop;
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
	product_id int UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    product_name varchar(50),
    cost bigint,
    insurance int,
    description varchar(100),
    quantity int,
    product_url varchar(300)
);
INSERT INTO `vietanhshop`.`user` (`uuid`, `fullname`, `age`, `phone`, `password`, `role`) VALUES ('vietanh9720', 'Nguyễn Văn Việt Anh', '22', '0914917499', '$2a$12$8ofnt8tnj9sBtDbROmFpF.fSApW/nI2N7qLwa7SkZG6u2xj.ObJVm', 'ROLE_ADMIN');
INSERT INTO `vietanhshop`.`product` (`product_id`, `product_name`, `cost`, `insurance`, `description`,`quantity`, `product_url`) VALUES ('1', 'Iphone 13 Pro Max', '23000000', '2', 'Iphone by Apple .Inc', 100,'default');
INSERT INTO `vietanhshop`.`product` (`product_id`, `product_name`, `cost`, `insurance`, `description`,`quantity`, `product_url`) VALUES ('2', 'Iphone 14 Pro Max', '26000000', '2', 'Iphone by Apple .Inc', 100, 'default');
INSERT INTO `vietanhshop`.`product` (`product_id`, `product_name`, `cost`, `insurance`, `description`,`quantity`, `product_url`) VALUES ('3', 'Iphone 15 Pro Max', '26000000', '2', 'Iphone by Apple .Inc', 100, 'default');
INSERT INTO `vietanhshop`.`product` (`product_id`, `product_name`, `cost`, `insurance`, `description`,`quantity`, `product_url`) VALUES ('4', 'Iphone 16 Pro Max', '26000000', '2', 'Iphone by Apple .Inc', 100, 'default');
INSERT INTO `vietanhshop`.`product` (`product_id`, `product_name`, `cost`, `insurance`, `description`,`quantity`, `product_url`) VALUES ('5', 'Iphone 17 Pro Max', '26000000', '2', 'Iphone by Apple .Inc', 100, 'default');
INSERT INTO `vietanhshop`.`product` (`product_id`, `product_name`, `cost`, `insurance`, `description`,`quantity`, `product_url`) VALUES ('6', 'Iphone 18 Pro Max', '26000000', '2', 'Iphone by Apple .Inc', 100, 'default');