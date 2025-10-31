drop table if exists companies;
drop table if exists addresses;
drop table if exists cityhalls;
drop table if exists profiles;
create table addresses
(
    id       int auto_increment primary key,
    tag      varchar(30),
    zip      varchar(30),
    street   varchar(225),
    city     varchar(225),
    country  varchar(100),
    creation datetime default current_timestamp
);
create table profiles
(
    id           int auto_increment primary key,
    civility     varchar(100),
    first_name   varchar(100),
    last_name    varchar(100),
    email        varchar(100) unique,
    phone        varchar(30) unique,
    password     varchar(50),
    creation     datetime default current_timestamp,
    addresses_id int,
    constraint fk_profiles_addresses foreign key (addresses_id) references addresses (id)
);
create table companies
(
    id           int auto_increment primary key,
    name         varchar(225),
    description  text,
    addresses_id int,
    creation     datetime default current_timestamp,
    constraint fk_companies_addresses foreign key (addresses_id) references addresses (id)
);
create table cityhalls
(
    id           int auto_increment primary key,
    name         varchar(225),
    description  text,
    addresses_id int,
    creation     datetime default current_timestamp,
    constraint fk_cityhalls_addresses foreign key (addresses_id) references addresses (id)
);