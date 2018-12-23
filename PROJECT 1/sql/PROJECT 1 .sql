CREATE TABLE EMPLOYEE
(
EMPLOYEE_ID INTEGER PRIMARY KEY,
firstname varchar2(50)not null,
lastname varchar2 (50)not null,
EMAIL VARCHAR2(50) NOT NULL
)
CREATE TABLE CREDENTIALS
(
USERNAME VARCHAR2(50) PRIMARY KEY,
PASSWORD VARCHAR2(50) NOT NULL,
EMPLOYEE_ID INTEGER NOT NULL
)

CREATE TABLE MANAGERS
(
MANAGER_ID INTEGER PRIMARY KEY,
firstname varchar2(50) not null,
lastname varchar2(50) not null,
EMAIL VARCHAR2(50) NOT NULL,
TITLE VARCHAR2(50) NOT NULL
)

CREATE TABLE  REIMBURSEMENTS
(
R_ID INTEGER PRIMARY KEY,
R_DESCRIPTION VARCHAR2(50) NOT NULL,
AMOUNT NUMBER NOT NULL,
PICTURE BLOB,
EMPLOYEE_ID INTEGER NOT NULL
)

CREATE TABLE MANAGER_EMPLOYEE 
(
    EMPLOYEE_ID INTEGER,
    MANAGER_ID INTEGER,
    PRIMARY KEY (EMPLOYEE_ID, MANAGER_ID)
);


ALTER TABLE CREDENTIALS ADD CONSTRAINT FK_CREDENTAILSEMPLOYEE
FOREIGN KEY (EMPLOYEE_ID)  REFERENCES EMPLOYEE (EMPLOYEE_ID);

ALTER TABLE REIMBURSEMENTS ADD CONSTRAINT FK_REIMBURSEMENTSEMPLOYEE
FOREIGN KEY (EMPLOYEE_ID)  REFERENCES EMPLOYEE (EMPLOYEE_ID);

insert into EMPLOYEE (employee_id, firstname, lastname, email) values (1, 'Morgen', 'Elcox', 'melcox0@deviantart.com');
insert into EMPLOYEE (employee_id, firstname, lastname, email) values (2, 'Casandra', 'Goode', 'cgoode1@blinklist.com');
insert into EMPLOYEE (employee_id, firstname, lastname, email) values (3, 'Britte', 'Piggin', 'bpiggin2@dyndns.org');
insert into EMPLOYEE (employee_id, firstname, lastname, email) values (4, 'Jarret', 'Noice', 'jnoice3@vk.com');
insert into EMPLOYEE (employee_id, firstname, lastname, email) values (5, 'Dasya', 'Walcar', 'dwalcar4@sun.com');
insert into EMPLOYEE (employee_id, firstname, lastname, email) values (6, 'Guy', 'Greenhead', 'ggreenhead5@hp.com');
insert into EMPLOYEE (employee_id, firstname, lastname, email) values (7, 'Quincey', 'Harmson', 'qharmson6@apple.com');
insert into EMPLOYEE (employee_id, firstname, lastname, email) values (8, 'Aliza', 'Smithend', 'asmithend7@people.com.cn');
insert into EMPLOYEE (employee_id, firstname, lastname, email) values (9, 'Mort', 'Pemberton', 'mpemberton8@answers.com');
insert into EMPLOYEE (employee_id, firstname, lastname, email) values (10, 'Lana', 'Paolacci', 'lpaolacci9@canalblog.com');
insert into EMPLOYEE (employee_id, firstname, lastname, email) values (11, 'Maria', 'Lorenc', 'mlorenca@phoca.cz');
insert into EMPLOYEE (employee_id, firstname, lastname, email) values (12, 'Nonie', 'Braunlein', 'nbraunleinb@csmonitor.com');
insert into EMPLOYEE (employee_id, firstname, lastname, email) values (13, 'Roselia', 'Follis', 'rfollisc@umich.edu');
insert into EMPLOYEE (employee_id, firstname, lastname, email) values (14, 'Norina', 'Sealove', 'nsealoved@blog.com');
insert into EMPLOYEE (employee_id, firstname, lastname, email) values (15, 'Moises', 'Ghilks', 'mghilkse@marketwatch.com');
insert into EMPLOYEE (employee_id, firstname, lastname, email) values (16, 'Fifine', 'Risdall', 'frisdallf@adobe.com');
insert into EMPLOYEE (employee_id, firstname, lastname, email) values (17, 'Elissa', 'Glading', 'egladingg@yale.edu');
insert into EMPLOYEE (employee_id, firstname, lastname, email) values (18, 'Tobias', 'Weagener', 'tweagenerh@tumblr.com');
insert into EMPLOYEE (employee_id, firstname, lastname, email) values (19, 'Dorene', 'Colliver', 'dcolliveri@drupal.org');
insert into EMPLOYEE (employee_id, firstname, lastname, email) values (20, 'Jesse', 'Ivatt', 'jivattj@odnoklassniki.ru');
insert into EMPLOYEE (employee_id, firstname, lastname, email) values (21, 'Scarlett', 'Hamber', 'shamberk@army.mil');
insert into EMPLOYEE (employee_id, firstname, lastname, email) values (22, 'Bartholomeus', 'Valadez', 'bvaladezl@ezinearticles.com');
insert into EMPLOYEE (employee_id, firstname, lastname, email) values (23, 'Latrina', 'Arnott', 'larnottm@forbes.com');
insert into EMPLOYEE (employee_id, firstname, lastname, email) values (24, 'Ellyn', 'Seleway', 'eselewayn@tiny.cc');
/

insert into managers (manager_id, firstname, lastname, email, title) values (1, 'Morgen', 'Elcox', 'melcox0@deviantart.com','MANAGER');
insert into managers(manager_id, firstname, lastname, email, title) values (2, 'Casandra', 'Goode', 'cgoode1@blinklist.com','MANAGER');
insert into managers (manager_id, firstname, lastname, email, title) values (3, 'Britte', 'Piggin', 'bpiggin2@dyndns.org','MANAGER');
insert into managers (manager_id, firstname, lastname, email, title) values (4, 'Jarret', 'Noice', 'jnoice3@vk.com','MANAGER');
/
insert into MANAGER_EMPLOYEE (manager_id) values (1);
insert into MANAGER_EMPLOYEE(manager_id) values (2);
insert into MANAGER_EMPLOYEE (manager_id) values (3);
insert into MANAGER_EMPLOYEE (manager_id) values (4);

insert into MANAGER_EMPLOYEE (employee_id) values (1);
insert into MANAGER_EMPLOYEE (employee_id) values (2);
insert into MANAGER_EMPLOYEE (employee_id) values (3);
insert into MANAGER_EMPLOYEE (employee_id) values (4);
insert into MANAGER_EMPLOYEE (employee_id) values (5);
insert into MANAGER_EMPLOYEE (employee_id) values (6);
insert into MANAGER_EMPLOYEE (employee_id) values (7);
insert into MANAGER_EMPLOYEE (employee_id) values (8);
insert into MANAGER_EMPLOYEE (employee_id) values (9);
insert into MANAGER_EMPLOYEE (employee_id) values (10);
insert into MANAGER_EMPLOYEE (employee_id) values (1);
insert into MANAGER_EMPLOYEE (employee_id) values (12);
insert into MANAGER_EMPLOYEE (employee_id) values (13);
insert into MANAGER_EMPLOYEE (employee_id) values (14);
insert into MANAGER_EMPLOYEE (employee_id) values (15);
insert into MANAGER_EMPLOYEE (employee_id) values (16);
insert into MANAGER_EMPLOYEE (employee_id) values (17);
insert into MANAGER_EMPLOYEE (employee_id) values (18);
insert into MANAGER_EMPLOYEE (employee_id) values (19);
insert into MANAGER_EMPLOYEE (employee_id) values (20);
insert into MANAGER_EMPLOYEE (employee_id) values (21);
insert into MANAGER_EMPLOYEE (employee_id) values (22);
insert into MANAGER_EMPLOYEE (employee_id) values (23);
insert into MANAGER_EMPLOYEE (employee_idl) values (24);
/

insert into Reimbursements (r_description, amount, picture, u_id, status_id, create_date, resolve_date, resolver_id, r_type) values (1, 6.33, null, 1, 3,  '1970-01-01 00:00:01',  '1972-01-01 02:00:01', 1, 3);
insert into Reimbursements (r_description, amount, picture, u_id, status_id, create_date, resolve_date, resolver_id, r_type) values (2, 20.92, null, 2, 3, '1970-01-01 00:00:01',  '1970-01-01 00:00:01', 2, 1);
insert into Reimbursements (r_description, amount, picture, u_id, status_id, create_date, resolve_date, resolver_id, r_type) values (3, 55.96, null, 3, 2, '1970-01-01 00:00:01',  '1970-01-01 00:00:01', 3, 4);
insert into Reimbursements (r_description, amount, picture, u_id, status_id, create_date, resolve_date, resolver_id, r_type) values (4, 19.53, null, 4, 1, '1970-01-01 00:00:01',  '1970-01-01 00:00:01', 4, 1);
/