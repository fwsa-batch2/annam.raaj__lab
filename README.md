
sudo -u root mysql
 PASSWORD -->login into mysql

#### 1. SHOW DATABASES; 

 * will show the databases which are in our laptop.

#### ``` SHOW DATABASES; ```

| Database           |
|:------------------:|
| information_schema |                 
| mysql              |
| performance_schema |
| sys                |

* Default databases in laptop.

#### 2. CREATE DATABASE database_name; 

* will create database with that name.

#### ``` CREATE DATABASE FWSA; ```


#### 3. USE  database_name; 
* will go to the database mentioned. 

#### ``` USE FWSA; ```                   

#### 4. SHOW TABLES; 

* will show the tables in that database.


| Tables_in_FWSA |
|:--------------:|
| Students       |
| Teacher        |



#### 5. CREATE TABLE table_name(column_name datatype KEY , column_name datatype);  
 
 * will create table with rows id and name.

#### ``` CREATE TABLE Students(TempID varchar(8) PRIMARY KEY  , Name_Of_Student varchar(50) NOT NULL , Office varchar(20) NOT NULL ); ```

#### 6. DESC table_name; 

* will show validations for that table.

#### ``` DESC Students; ```

| Field           | Type        | Null | Key | Default | Extra |
|:---------------:|:-----------:|:----:|:---:|:-------:|:-----:|
| TempID          | varchar(8)  | NO   | PRI | NULL    |       |
| Name_Of_Student | varchar(50) | NO   |     | NULL    |       |
| Office          | varchar(20) | NO   |     | NULL    |       |


#### 7. INSERT INTO  table_name(column_1 , column_2 ) VALUES (value_1 , value_2);

* will insert values into table.
 
#### ``` INSERT INTO Students VALUES("A0016" , "Pavan Raaj" , "Chennai"); ```

#### 8. SELECT * FROM TABLE NAME; 
* will show the table.

#### ``` SELECT * FROM Students; ```


| TempID | Name_Of_Student | Office  |
|:------:|:---------------:|:-------:|
| A0016  | Pavan Raaj      | Chennai |

#### 9. UPDATE table_name SET  column_name= vlaue  WHERE condition; 

* will be used to update a certain value in table.

#### ``` UPDATE Students SET TempID="A0022" WHERE Name_Of_Student="Jerusheya"; ```



#### 10. DELETE FROM table_name WHERE condition; 

* will delete a row in table.

#### ``` delete from students where id=17; ```


#### 11.Alter's

#### (a) Drop:- 

#### ALTER TABLE table_name DROP COLUMN column_name;

 #### ``` ALTER TABLE Customers DROP COLUMN Email; ```


#### (b) Add column:-

* will add new column in Table

#### ALTER TABLE table_name ADD column_name datatype; 

#### ``` ALTER TABLE Customers ADD Email varchar(255); ```


#### (c) Modify:-

* The MODIFY command is used to __change the column definition__ of the table.

#### ALTER TABLE table_name MODIFY COLUMN column_name column defination;

#### ``` ALTER TABLE Studnets  MODIFY student_name varchar(50); ```  

#### (d) Change:-

* After the CHANGE keyword, you name the column you want to change, then specify the new definition, which includes the new name.


#### ALTER TABLE table_name  CHANGE  column_old_name column_new_name column_definition; 

#### ``` ALTER TABLE Studnets CHANGE user_name student_name varchar(20); ``` 

#### (e) RENAME table:-

#### ALTER TABLE table_name  RENAME TO new_table_name;  

#### ``` ALTER TABLE Students RENAME TO student_details; ```  


#### 12.Aggreegate functions:-


| id | Name      | Age | City      |
|:--:|----------:|----:|----------:|
|  1 | Pavan     |  18 | Nellore   |
|  2 | Sugu      |  19 | Chennai   |
|  3 | Meenu     |  18 | Bengal    |
|  4 | Keerthana |  19 | Delhi     |
|  5 | Venkat    |  18 | Bengalore |



#### (a)SUM:-

* will add the values in the column.

#### SELECT SUM(column_name) FROM  table_name;

#### ``` SELECT SUM(Age) AS "Sum of ages:-" FROM Test_students; ``` 




| Sum of ages:- |
|:-------------:|
|            92 |

         

#### (b)AVG:-

* will give average alue of a column.

#### SELECT AVG(column_name) FROM table_name;

#### ``` SELECT AVG(Age) FROM Test_students; ```

| AVG(Age) |
|:--------:|
|  18.4000 |

#### (c)MIN:-

* will give a min value of that column.

#### SELECT MIN(column_name) FROM table_name;

#### ``` SELECT MIN(Age) FROM Test_students; ```


| MIN(Age) |
|:--------:|
|       18 |

#### (d)MAX:-

* will give a max value of that column.

#### SELECT MAX(column_name) FROM table_name;


| MAX(Age) |
|:--------:|
|       19 |

#### (e)COUNT:-

* will give the count of that column.

#### SELECT COUNT(*) FROM table_name;

#### ``` SELECT COUNT(Age) FROM Test_students; ```


| COUNT(Age) |
|:----------:|
|          5 |

#### (f)DISTINCT:-

* The DISTINCT keyword that allows us to omit duplicates from our results. This is achieved by grouping similar values together .

#### SELECT  DISTINCT (column_name) FROM table_name;

#### ``` SELECT Age FROM Test_students; ```


| Age |
|:---:|
|  18 |
|  19 |
|  18 |
|  19 |
|  18 |

#### ``` SELECT DISTINCT(Age) FROM Test_students; ```

| Age |
|:---:|
|  18 |
|  19 |



#### DROP TABLE table_name; 

* will delete that table. 

#### ``` DROP TABLE  table_name; ```

#### DROP DATABASE database_name; 

* will delete that database.

#### ``` DROP DATABASE database_name; ```  

##### exit 

* will logout from mysql
