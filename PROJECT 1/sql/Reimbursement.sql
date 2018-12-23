create user reimbursement identified by swop24;
grant connect, resource to reimbursement;
grant dba to reimbursement with admin option;

/

CREATE TABLE swop_user
(
user_id INTEGER PRIMARY KEY,
firstName varchar2(50)not null,
lastName varchar2 (50)not null,
email varchar2(50) unique,
password varchar2(50) not null,
role_id int not null
);
/

create sequence "sequence1" minvalue 1 maxvalue 999999999 increment by 1 start with 1;
/

create or replace trigger "user_trigger"
before insert on swop_user
for each row
begin
if inserting then
if :new.user_id is null then
select "sequence1".nextval into  :new.user_id from dual;
end if;
end if;
end;
/

select * from swop_user where user_id = 3;
update swop_user set firstname = 'malika', lastname = 'parker' where user_id = 3;

update swop_user set username = firstname||lastname;

select * from swop_user;
insert into swop_user (firstname,lastname,email,password,role_id)values('ki','ki','doyouloveme@areyouriding.com','12345',2);

insert into swop_user (firstName, lastName, email, password, role_id) values ('Alys', 'Rusling', 'arusling0@pagesperso-orange.fr', '99V5zp', 1);
insert into swop_user (firstName, lastName, email, password, role_id) values ('Salomi', 'Hugues', 'shugues1@tinypic.com', 'RlT2xiqs', 2);
insert into swop_user (firstName, lastName, email, password, role_id) values ('Nelia', 'O''Kelly', 'nokelly2@blogger.com', 'hotL90XkElK0', 1);
insert into swop_user (firstName, lastName, email, password, role_id) values ('Culver', 'Jendrusch', 'cjendrusch3@com.com', '32aY94MMpLp', 1);
insert into swop_user (firstName, lastName, email, password, role_id) values ('Sonny', 'Lawfull', 'slawfull4@twitpic.com', 'VvKTt7gbuiI', 1);
insert into swop_user (firstName, lastName, email, password, role_id) values ('Licha', 'Edgehill', 'ledgehill5@clickbank.net', 'T4MAIUcRJP', 1);
insert into swop_user (firstName, lastName, email, password, role_id) values ('Clement', 'Bimrose', 'cbimrose6@networksolutions.com', 'NQUHBkEune', 1);
insert into swop_user (firstName, lastName, email, password, role_id) values ('Benoit', 'De-Ville', 'bdeville7@blogspot.com', '2BQClgOU', 1);
insert into swop_user (firstName, lastName, email, password, role_id) values ('Fran', 'Goodliff', 'fgoodliff8@google.nl', 'IQa7pmI4', 1);
insert into swop_user (firstName, lastName, email, password, role_id) values ('Tannie', 'Ivashov', 'tivashov9@people.com.cn', '9WHmW0vP9Jy9', 1);
insert into swop_user (firstName, lastName, email, password, role_id) values ('Shawn', 'Orbon', 'sorbona@independent.co.uk', 'cDpp1JvXPzSH', 1);
insert into swop_user (firstName, lastName, email, password, role_id) values ('Milly', 'Verdey', 'mverdeyb@vk.com', 'OVKeAEnaEvuW', 2);
insert into swop_user (firstName, lastName, email, password, role_id) values ('Emmery', 'Stamper', 'estamperc@woothemes.com', '2afDHND', 1);
insert into swop_user (firstName, lastName, email, password, role_id) values ('Kristi', 'Mewrcik', 'kmewrcikd@rambler.ru', 'OjzUQz', 2);
insert into swop_user (firstName, lastName, email, password, role_id) values ('Gar', 'Enrich', 'genriche@amazon.de', 'eNUNAthBE', 1);
insert into swop_user (firstName, lastName, email, password, role_id) values ('Hobie', 'Gritsaev', 'hgritsaevf@google.ru', 'wdIVGW4B6267', 1);
insert into swop_user (firstName, lastName, email, password, role_id) values ('Ettore', 'Barras', 'ebarrasg@wisc.edu', 'kvlTqWp2x4', 1);
insert into swop_user (firstName, lastName, email, password, role_id) values ('Irvine', 'Garstan', 'igarstanh@wix.com', 'mmgfxJ8', 1);
insert into swop_user (firstName, lastName, email, password, role_id) values ('Melosa', 'Helix', 'mhelixi@blogs.com', 'ZYdJ6li', 1);
insert into swop_user (firstName, lastName, email, password, role_id) values ('Kimberlee', 'Leamon', 'kleamonj@geocities.com', 'QNOL3aqE8S', 2);
insert into swop_user (firstName, lastName, email, password, role_id) values ('Dulciana', 'Gunnell', 'dgunnellk@wiley.com', 'na3IOtS1wJ0j', 2);
insert into swop_user (firstName, lastName, email, password, role_id) values ('Kippar', 'Chapelle', 'kchapellel@ft.com', 'Rggv3ldsr', 2);
insert into swop_user (firstName, lastName, email, password, role_id) values ('Darryl', 'Meagh', 'dmeaghm@google.co.uk', 'K5m70yQATaV', 2);
insert into swop_user (firstName, lastName, email, password, role_id) values ('Cosette', 'Exley', 'cexleyn@vimeo.com', 'jgae0D4ALc9O', 2);
insert into swop_user (firstName, lastName, email, password, role_id) values ('Terry', 'Collingwood', 'tcollingwoodo@reference.com', 'Oo2AnnbkWXE', 2)
/

create table status
(
status_id int primary key,
title varchar2(15)
)
/

insert into status (status_id, title)values(1,'pending');
insert into status (status_id, title)values(2,'approved');
insert into status (status_id, title)values(3,'denied');
/

create table r_type
(
r_type int primary key,
title varchar2(15)
)
/
create table role_id
(
role_id int primary key,
title varchar2(15)
)
/
create table  reimbursements
(
r_id INTEGER PRIMARY KEY,
r_description VARCHAR2(50) NOT NULL,
amount NUMBER NOT NULL,
picture BLOB null,
u_id INTEGER NOT NULL,
status_id int not null,
created_date timestamp,
resolve_date timestamp,
resolver_id int,  
r_type int not null,

foreign key(status_id) references status(status_id),
foreign key(r_type) references r_type(r_type),
foreign key(u_id) references swop_user(user_id),
foreign key( resolver_id) references swop_user(user_id)
);
/

create sequence "sequence2" minvalue 1 maxvalue 999999999 increment by 1 start with 1;
/
create or replace trigger "reimbursement_trigger"
before insert on reimbursements
for each row
begin
if inserting then
if :new.r_id is null then
select "sequence2".nextval into  :new.r_id from dual;
end if;
end if;
select 1 into :new.status_id from dual;
select current_timestamp into :new.created_date from dual;
end;
/



insert into reimbursements (r_description, amount, picture, u_id, status_id, created_date, resolve_date, resolver_id, r_type)
values (1, 6.33, null, 1, 3,  ('1972-01-01 02:12:01','yyyy-mm-dd hh24:mi:ss'),  ('1972-01-01 02:00:01','yyyy-mm-dd hh24:mi:ss'), 1, 3);
/
insert into r_type (r_type, title)values(1,'food');
insert into r_type (r_type, title)values(2,'travel');
insert into r_type (r_type, title)values(3,'entertainment');
insert into r_type (r_type, title)values(4,'other');
/
commit; 


