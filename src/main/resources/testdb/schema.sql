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
