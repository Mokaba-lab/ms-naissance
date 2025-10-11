/*
la création de la base de données
la création d'une table address où sont stocké les addresses  
*/
drop database if exists dbnaissance;

create database dbnaissance;
use dbnaissance;
-- Création de la table roles
create table roles
(
id int auto_increment primary key,
label varchar(30) unique,
description text,
creation datetime default current_timestamp
);
-- création d la table addresses 
create table addresses
(
id int auto_increment primary key,
zip varchar (30),
street varchar(225),
city varchar(225),
country varchar(100),
creation datetime default current_timestamp
);
-- Création de la table profiles
create table profiles
(
id int auto_increment primary key,
civility varchar(100),
first_name varchar(100),
last_name varchar(100),
email varchar(100),
phone varchar(30),
password varchar(50),
roles_id int,
addresses_id int,
constraint profiles_roles_fk foreign key(roles_id) references roles(id),
constraint fk_addresses foreign key(addresses_id) references addresses(id)
);
alter table profiles
add constraint profiles_email_is_unique
unique(email); 