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