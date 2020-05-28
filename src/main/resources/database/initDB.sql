create table if not exists users (
    id serial primary key,
    first_name varchar(50) not null ,
    last_name varchar (50) not null ,
    age int not null,
    passport int not null
);