sudo -u root mysql
PASSWORD -->login into mysql

show databases; --> will show the databases which are in our laptop.

##### ``` show databases; ```

| Database           |
|:------------------:|
| information_schema |                 
| mysql              |
| performance_schema |
| sys                |

 --> Default databases in laptop.

create database DATABASE NAME; -->will create database with that name.

##### ``` create database FWSA; ```

use  DATABASE NAME; --> will go to that database. 

##### ``` use FWSA; ```                    
Database changed                          

show tables; --> will show the tables in that database.


create table:- TABLE NAME(COLUMN NAME DATA TYPE , COLUMN NAME DATA TYPE);  --> will create table with rows id and name.

##### ``` create table Students(TempID varchar(8) primary key  , Name_Of_Student varchar(50) not null , Office varchar(20) not null); ```

desc TABLE NAME; --> will show validations for that table.

##### ``` desc Students; ```

| Field           | Type        | Null | Key | Default | Extra |
|:---------------:|:-----------:|:----:|:---:|:-------:|:-----:|
| TempID          | varchar(8)  | NO   | PRI | NULL    |       |
| Name_Of_Student | varchar(50) | NO   |     | NULL    |       |
| Office          | varchar(20) | NO   |     | NULL    |       |


insert into TABLE NAME values(VALUE , VALUE , VAULE );
 
##### ``` insert into Students values("A0016" , "Pavan Raaj" , "Chennai"); ```

select * from TABLE NAME; --> will show the table.

##### ``` select * from Students; ```


| TempID | Name_Of_Student | Office  |
|:------:|:---------------:|:-------:|
| A0016  | Pavan Raaj      | Chennai |


delete from TABLE NAME where COLUMN NAME=VALUE; --> will delete a row in table.

##### ``` delete from students where id=17; ```

update TABLE NAME set __What to change__ COLUMN NAME=VALUE __Where to change__ where COLUMN NAME=VALUE; --> will change the wrong thing to correct or update.

##### ``` update Students set TempID="A0022" where Name_Of_Student="Jerusheya"; ```


delete from TABLE NAME where COLUMN NAME=VALUE;  --> will delete a row from table.

##### ``` delete from students where id=17; ```


Alter's

ALTER TABLE table_name DROP COLUMN column_name;

mysql> ALTER TABLE Customers DROP COLUMN Email;


ALTER TABLE table_nameADD column_name datatype; --> will add new column in Table

mysql> ALTER TABLE Customers ADD Email varchar(255);


ALTER TABLE table_name MODIFY COLUMN column_name datatype;


CHANGE

drop table TABLE NAME; -->will delete that table.

drop database DATABASE NAME; -->will delete that database.

exit --> will logout from mysql
