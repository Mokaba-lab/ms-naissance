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