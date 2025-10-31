create table companies
(
    id           int auto_increment primary key,
    name         varchar(225),
    description  text,
    addresses_id int,
    creation     datetime default current_timestamp,
    constraint fk_companies_addresses foreign key (addresses_id) references addresses (id)
);