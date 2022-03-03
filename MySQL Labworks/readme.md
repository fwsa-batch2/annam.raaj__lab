## Tech Assignment-1:
### Table-1:-

 #### ``` create table students (id int primary key auto_increment,name varchar(100) not null,email varchar(100) not null,mobile_no bigint not null,password varchar(100) not null,gender char(1) not null,dob date,created_date timestamp not null default current_timestamp,unique (email),check ( gender in ('M','F'))); ```

### Table-2:-

#### ``` create table student_class (id int primary key auto_increment,student_id int not null, class int not null,status varchar(20) not null,foreign key (student_id) references students(id),check( class >= 1 and class <=12),check (status in ('ACTIVE','INACTIVE'))); ```


### Feature 1: Student Registration:-

#### ```INSERT INTO students VALUES(3,"Suguram","suguram@gmail.com","9876554332","sk@2003","M","2002-04-10",now()); ```
 __Query OK, 1 row affected (0.01 sec)__

### Feature 2: List All Students:-

#### ``` SELECT * FROM students; ``` 


| id | name               | email               | mobile_no  | password       | gender | dob        | created_date        |
|:--:|-------------------:|:-------------------:|:----------:|:--------------:|:------:|:----------:|:-------------------:|
|  1 | Pavan Raaj         | pavanraaj@gmail.com | 9493170308 | pavan@123      | M      | 2003-07-06 | 2022-03-01 00:00:00 |
|  2 | Meenu              | meenu@gmail.com     | 9876554768 | meenu@2003     | F      | 2003-09-24 | 2022-03-02 09:30:43 |
|  3 | Suguram            | suguram@gmail.com   | 9876554332 | sk@2003        | M      | 2002-04-10 | 2022-03-02 09:32:31 |
|  4 | Prasanna Venkatesh | prasanna@gmail.com  | 9876554356 | prasanna@2003  | M      | 2001-01-20 | 2022-03-02 09:38:33 |
|  5 | Ismail             | ismail@gmail.com    | 9865254356 | ismail@2003    | M      | 2002-02-27 | 2022-03-02 09:41:11 |
|  6 | Keerthana          | keerthana@gmail.com | 8653257336 | Keerthana@2003 | F      | 2001-08-14 | 2022-03-02 09:43:15 |


### Feature 3: Login with email and password:-

#### ``` SELECT * FROM students WHERE email="pavanraaj@gmail.com" and password="pavan@123"; ```


| id | name       | email               | mobile_no  | password  | gender | dob        | created_date        |
|:--:|-----------:|:-------------------:|:----------:|:---------:|:------:|:----------:|:-------------------:|
|  1 | Pavan Raaj | pavanraaj@gmail.com | 9493170308 | pavan@123 | M      | 2003-07-06 | 2022-03-01 00:00:00 |


### Feature 4: Update Password:-

#### ``` UPDATE students SET password="sugu@2002" WHERE id= 3; ``` 

__Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0__


### Feature 5: Enroll Student into Class:-

#### ``` INSERT INTO student_class VALUES(1,1,5,"ACTIVE"),(2,3,6,"ACTIVE"),(3,2,5,"ACTIVE"),(4,5,6,"ACTIVE"),(5,4,5,"ACTIVE"),(6,6,6,"ACTIVE"); ```

### Feature 6: Find Students who are enrolled in the given class. Find Students who are studying in 5th standard:-

#### (a) ``` SELECT * FROM student_class; ```


| id | student_id | class | status |
|:--:|:----------:|:-----:|:------:|
|  1 |          1 |     5 | ACTIVE |
|  2 |          3 |     6 | ACTIVE |
|  3 |          2 |     5 | ACTIVE |
|  4 |          5 |     6 | ACTIVE |
|  5 |          4 |     5 | ACTIVE |
|  6 |          6 |     6 | ACTIVE |
|  7 |          7 |     5 | ACTIVE |

__7 rows in set (0.00 sec)__

#### (b) ``` SELECT * FROM student_class WHERE class=5; ``` 


| id | student_id | class | status |
|:--:|:----------:|:-----:|:------:|
|  1 |          1 |     5 | ACTIVE |
|  3 |          2 |     5 | ACTIVE |
|  5 |          4 |     5 | ACTIVE |
|  7 |          7 |     5 | ACTIVE |

__4 rows in set (0.00 sec)__

### Feature 7: Update Student Class information # Update student from 5th standard to 6th standard.

#### ``` UPDATE student_class SET class=6 WHERE class=5; ```

| id | student_id | class | status |
|:--:|:----------:|:-----:|:------:|
|  1 |          1 |     6 | ACTIVE |
|  2 |          3 |     6 | ACTIVE |
|  3 |          2 |     6 | ACTIVE |
|  4 |          5 |     6 | ACTIVE |
|  5 |          4 |     6 | ACTIVE |
|  6 |          6 |     6 | ACTIVE |
|  7 |          7 |     6 | ACTIVE |


### Feature 8: Student withdrawn from a Class:-

#### ``` DELETE FROM student_class WHERE id=7; ```

__Query OK, 1 row affected (0.01 sec)__

### Feature 9: Find student details who have not updated their Date Of Birth:-

#### ``` SELECT * FROM students WHERE dob=NULL; ``` 

__Empty set (0.00 sec)__

### Feature 10: Find Total no of students actively studying in this school:-

#### ``` SELECT COUNT(student_id) AS "Tota _no _of_student _actively_studying_in_this_school"FROM student_class WHERE status="ACTIVE"; ``` 


| Tota _no _of_student _actively_studying_in_this_school |
|:------------------------------------------------------:|
|                                                      7 |


__1 row in set (0.00 sec)__


### Feature 11: Find Total no of students actively studying in each class:-

#### ``` SELECT COUNT(student_id) AS "Total_no_of_students_Active",class FROM student_class WHERE status="ACTIVE" GROUP BY class; ```


| Total_no_of_students_Active | class |
|:---------------------------:|:-----:|
|                           4 |     5 |
|                           3 |     6 |

__2 rows in set (0.00 sec)__


### Feature 12: Find Total no of students actively studying each class which has less than 5 students:-

#### ``` SELECT COUNT(student_id),class FROM student_class WHERE status="ACTIVE" GROUP BY class HAVING COUNT(student_id)<5; ```


| COUNT(student_id) | class |
|:-----------------:|:-----:|
|                 4 |     5 |
|                 3 |     6 |

__2 rows in set (0.00 sec)__

### Feature 13: Display student and class details Using Joins (Inner Join)

#### ``` SELECT * FROM students s INNER JOIN student_class s_c ON s.id= s_c.student_id; ```

| id | name               | email               | mobile_no  | password         | gender | dob        | created_date        | id | student_id | class | status |
|:--:|:------------------:|:-------------------:|:----------:|:----------------:|:------:|:----------:|:-------------------:|:--:|:----------:|:-----:|:------:|
|  1 | Pavan Raaj         | pavanraaj@gmail.com | 9493170308 | pavan@123        | M      | 2003-07-06 | 2022-03-01 00:00:00 |  1 |          1 |     5 | ACTIVE |
|  2 | Meenu              | meenu@gmail.com     | 9876554768 | meenu@2003       | F      | 2003-09-24 | 2022-03-02 09:30:43 |  3 |          2 |     6 | ACTIVE |
|  3 | Suguram            | suguram@gmail.com   | 9876554332 | sugu@2002        | M      | 2002-04-10 | 2022-03-02 09:32:31 |  2 |          3 |     5 | ACTIVE |
|  4 | Prasanna Venkatesh | prasanna@gmail.com  | 9876554356 | PV@2001          | M      | 2001-01-20 | 2022-03-02 09:38:33 |  5 |          4 |     6 | ACTIVE |
|  5 | Ismail             | ismail@gmail.com    | 9865254356 | smile@2002       | M      | 2002-02-27 | 2022-03-02 09:41:11 |  4 |          5 |     5 | ACTIVE |
|  6 | Keerthana          | keerthana@gmail.com | 8653257336 | keerthana@school | F      | 2001-08-14 | 2022-03-02 09:43:15 |  6 |          6 |     6 | ACTIVE |


----------------------------------------------------
### Feature 13: Display student and class details # Using Subqueries ( Scalar SubQuery)
----------------------------------------------------


### Feature 14: Display Student Details for the given input class # Class : 5th Standard (Using Joins)

#### ``` SELECT * FROM students s INNER JOIN student_class s_c ON s.id= s_c.student_id WHERE s_c.class=5; ```


| id | name       | email               | mobile_no  | password   | gender | dob        | created_date        | id | student_id | class | status |
|:--:|:----------:|:-------------------:|:----------:|:----------:|:------:|:----------:|:-------------------:|:--:|:----------:|:-----:|:------:|
|  1 | Pavan Raaj | pavanraaj@gmail.com | 9493170308 | pavan@123  | M      | 2003-07-06 | 2022-03-01 00:00:00 |  1 |          1 |     5 | ACTIVE |
|  3 | Suguram    | suguram@gmail.com   | 9876554332 | sugu@2002  | M      | 2002-04-10 | 2022-03-02 09:32:31 |  2 |          3 |     5 | ACTIVE |
|  5 | Ismail     | ismail@gmail.com    | 9865254356 | smile@2002 | M      | 2002-02-27 | 2022-03-02 09:41:11 |  4 |          5 |     5 | ACTIVE |



### Feature 15: Find Class for the given student email id # Email: n@gmail.com

#### ``` SELECT class FROM student_class s_c INNER JOIN students s ON s.id= s_c.student_id WHERE s.email="pavanraaj@gmail.com"; ```


| class |
|:-----:|
|     5 |


__1 row in set (0.00 sec)__

---------------------------------------------------------------------
### Feature 16: Find Students who has not enrolled in a class #
### Using Subquery ( multiple row subquery )
### Using Subquery ( single row subquery )
-----------------------------------------------------------------------

### Feature 17: Display all students name with class - include both enrolled and not enrolled # Using Joins ( Left outer join):-


#### ``` SELECT students.name,student_class.class FROM students LEFT JOIN student_class ON students.id=student_class.student_id; ```


| name               | class |
|:------------------:|:-----:|
| Pavan Raaj         |     5 |
| Meenu              |     6 |
| Suguram            |     5 |
| Prasanna Venkatesh |     6 |
| Ismail             |     5 |
| Keerthana          |     6 |
| Kasi               |  NULL |

__7 rows in set (0.00 sec)__






