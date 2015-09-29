drop table SALE_ORDER if exists;

create table SALE_ORDER (
ORDER_NO bigint primary key,
NAME varchar(50) not null, 
PRICE decimal(8,2) not null);

                        
ALTER TABLE SALE_ORDER ALTER COLUMN PRICE SET DEFAULT 0.0;
