sudo -u root mysql
PASSWORD -->login into mysql

##### 1. SHOW DATABASES; 

 * will show the databases which are in our laptop.

#### ``` SHOW DATABASES; ```

| Database           |
|:------------------:|
| information_schema |                 
| mysql              |
| performance_schema |
| sys                |

* Default databases in laptop.

##### 2. CREATE DATABASE database_name; 

* will create database with that name.

#### ``` CREATE DATABASE FWSA; ```


##### 3. USE  database_name; 
* will go to the database mentioned. 

#### ``` USE FWSA; ```   <br>                 

##### 4. SHOW TABLES; 

* will show the tables in that database.


| Tables_in_FWSA |
|:--------------:|
| Students       |
| Teacher        |



##### 5. CREATE TABLE table_name(column_name datatype KEY , column_name datatype);  
 
 * will create table with rows id and name.

#### ``` CREATE TABLE Students(TempID varchar(8) PRIMARY KEY  , Name_Of_Student varchar(50) NOT NULL , Office varchar(20) NOT NULL ); ```

##### 6. DESC table_name; 

* will show validations for that table.

#### ``` DESC Students; ```

| Field           | Type        | Null | Key | Default | Extra |
|:---------------:|:-----------:|:----:|:---:|:-------:|:-----:|
| TempID          | varchar(8)  | NO   | PRI | NULL    |       |
| Name_Of_Student | varchar(50) | NO   |     | NULL    |       |
| Office          | varchar(20) | NO   |     | NULL    |       |


##### 7. INSERT INTO  table_name(column_1 , column_2 ) VALUES (value_1 , value_2);

* will insert values into table.
 
#### ``` INSERT INTO Students VALUES("A0016" , "Pavan Raaj" , "Chennai"); ```

##### 8. SELECT * FROM TABLE NAME; 
* will show the table.

#### ``` SELECT * FROM Students; ```


| TempID | Name_Of_Student | Office  |
|:------:|:---------------:|:-------:|
| A0016  | Pavan Raaj      | Chennai |

##### 9. UPDATE table_name SET  column_name= vlaue  WHERE condition; 

* will be used to update a certain value in table.

#### ``` UPDATE Students SET TempID="A0022" WHERE Name_Of_Student="Jerusheya"; ```



##### 10. DELETE FROM table_name WHERE condition; 

* will delete a row in table.

#### ``` delete from students where id=17; ```


#### Alter's

##### (a) ALTER TABLE table_name DROP COLUMN column_name;

 #### ``` ALTER TABLE Customers DROP COLUMN Email; ```


##### (b) ALTER TABLE table_name ADD column_name datatype; 

* will add new column in Table

#### ``` ALTER TABLE Customers ADD Email varchar(255); ```


##### (c) ALTER TABLE table_name MODIFY COLUMN column_name datatype;


CHANGE

##### DROP TABLE table_name; 

* will delete that table.

##### DROP DATABASE database_name; 

* will delete that database.

##### exit 

* will logout from mysql
