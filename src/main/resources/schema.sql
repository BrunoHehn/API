
drop table if exists client;

create table client(
    id_client bigint auto_increment,
    first_name varchar(100) not null,
    cpf INTEGER not null,
    rg INTEGER not null,
    primary key(id_client)
    );

drop table if exists product;

create table product(
    id_product bigint auto_increment,
    name_product varchar(100) not null,
    price int not null,
    categories varchar(100) not null,
    primary key(id_product)
    );



