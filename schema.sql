create database schoolLibrary;
use schoolLibrary;

create table books(
    id int primary key auto_increment,
    bname varchar(20),
    author varchar(20),
    btype varchar(20),
    price float
);
