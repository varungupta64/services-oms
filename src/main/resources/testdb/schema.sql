CREATE SCHEMA `oms` ;




CREATE TABLE `oms`.`suborder` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `order_id` VARCHAR(50) NOT NULL,
  `status` VARCHAR(45) NOT NULL,
  `store_id` VARCHAR(45) NULL,
  `created_at` DATETIME NULL,
  

`updated_at` TIMESTAMP NULL,
  `latitude` DOUBLE NULL,
  `longitude` DOUBLE NULL,
  `x_forwarded_for` VARCHAR(1) NULL,
  `customer_name` VARCHAR(45) NULL,
  `customer_id` BIGINT NULL,
  

`customer_is_guest` VARCHAR(1) NULL,
  `customer_email` VARCHAR(45) NULL,
  `mobile` VARCHAR(10) NULL,
  `total_item_count` BIGINT NULL,
  `order_currency` VARCHAR(45) NULL,
  `subtotal` DECIMAL NULL,
  

`coupon_code` VARCHAR(15) NULL,
  `grand_total` DECIMAL NULL,
  `gift_card_amount_used` DECIMAL NULL,
  `store_credits_used` DECIMAL NULL,
  `total_paid` DECIMAL NULL,
  `prepaid_amount` DECIMAL NULL,
  

`cod_amount` DECIMAL NULL,
  `part_payment` DECIMAL NULL,
  `emi_charges` DECIMAL NULL,
  `shipping_address_id` INT NULL,
  `billing_address_id` INT NULL,
  `shipping_method` VARCHAR(45) NULL,
  

`shipping_charges` DECIMAL NULL,
  `subordercol` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `subordercol_UNIQUE` (`subordercol` ASC));




ALTER TABLE `oms`.`suborder` 
CHANGE COLUMN `subordercol` `suborder_id` VARCHAR(255) NOT NULL AFTER `id`;


ALTER TABLE `oms`.`suborder` 
CHANGE COLUMN `mobile` `mobilenumber` BIGINT NOT NULL ;

CREATE TABLE `orders` (
  `order_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `total_amount` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
SELECT * FROM oms.orders;CREATE TABLE `suborder_history` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `suborder_id` varchar(45) DEFAULT NULL,
  `order_id` bigint(20) DEFAULT NULL,
  `source` varchar(45) DEFAULT NULL,
  `action_type` varchar(45) DEFAULT NULL,
  `value_type` varchar(45) DEFAULT NULL,
  `status` varchar(45) NOT NULL,
  `store_id` varchar(45) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `latitude` double DEFAULT NULL,
  `longitude` double DEFAULT NULL,
  `x_forwarded_for` varchar(1) DEFAULT NULL,
  `customer_name` varchar(45) DEFAULT NULL,
  `customer_id` bigint(20) DEFAULT NULL,
  `customer_is_guest` varchar(1) DEFAULT NULL,
  `customer_email` varchar(45) DEFAULT NULL,
  `mobilenumber` bigint(20) NOT NULL,
  `total_item_count` bigint(20) DEFAULT NULL,
  `order_currency` varchar(45) DEFAULT NULL,
  `subtotal` decimal(10,0) DEFAULT NULL,
  `coupon_code` varchar(15) DEFAULT NULL,
  `grand_total` decimal(10,0) DEFAULT NULL,
  `gift_card_amount_used` decimal(10,0) DEFAULT NULL,
  `store_credits_used` decimal(10,0) DEFAULT NULL,
  `total_paid` decimal(10,0) DEFAULT NULL,
  `prepaid_amount` decimal(10,0) DEFAULT NULL,
  `cod_amount` decimal(10,0) DEFAULT NULL,
  `part_payment` decimal(10,0) DEFAULT NULL,
  `emi_charges` decimal(10,0) DEFAULT NULL,
  `shipping_address_id` int(11) DEFAULT NULL,
  `billing_address_id` int(11) DEFAULT NULL,
  `shipping_method` varchar(45) DEFAULT NULL,
  `shipping_charges` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `suborder_id_idx` (`suborder_id`),
  CONSTRAINT `suborder_id` FOREIGN KEY (`suborder_id`) REFERENCES `suborder` (`suborder_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
