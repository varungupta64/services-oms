drop table ORDERS if exists;

create table ORDERS (
ID bigint primary key,
SUBORDERID varchar(255) not null,
MOBILENUMBER bigint not null,
STATUS varchar(100));


