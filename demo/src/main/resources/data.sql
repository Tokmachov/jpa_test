create table person
(
    id integer not null,
    name varchar(255) not null,
    location varchar(255),
    birth_date timestamp,
    primary key (id)
);

insert into person (ID, NAME, LOCATION, BIRTH_DATE)
values (10001, 'Oleg1', 'Sevastopol', CURRENT_TIMESTAMP());

insert into person (ID, NAME, LOCATION, BIRTH_DATE)
values (10002, 'Oleg2', 'Sevastopol', CURRENT_TIMESTAMP());

insert into person (ID, NAME, LOCATION, BIRTH_DATE)
values (10003, 'Oleg3', 'Sevastopol', CURRENT_TIMESTAMP());

insert into person (ID, NAME, LOCATION, BIRTH_DATE)
values (10004, 'Oleg4', 'Sevastopol', CURRENT_TIMESTAMP());