 # World Tour App:-

 PPT link: https://docs.google.com/presentation/d/1MQ0Ur5rb2P4x5YnM57XHH3U072JePLoWpbsbVj2kRm8/edit?usp=sharing 

 
creating and using database - world_tour

 ``` 
 CREATE DATABASE world_tour; 
 ```
 ``` 
 USE world_tour; 
 ``` 
----
Creating users table:-
 ``` 
 CREATE TABLE User_details(id TINYINT(4) PRIMARY KEY , name VARCHAR(50) NOT NULL , email_id VARCHAR(100) NOT NULL UNIQUE , password VARCHAR(8) NOT NULL , mobile_number INT(10) NOT NULL UNIQUE , date_of_birth DATE NOT NULL , gender VARCHAR(10) NOT NULL , nationality VARCHAR(50) NOT NULL );
  ```
```
ALTER TABLE User_details MODIFY gender enum("Male","Female");
```

```
DESC User_details; 
```

| Field         | Type                  | Null | Key | Default | Extra |
|:-------------:|:---------------------:|:----:|:---:|:-------:|:-----:|
| id            | tinyint               | NO   | PRI | NULL    |       |
| name          | varchar(50)           | NO   |     | NULL    |       |
| email_id      | varchar(100)          | NO   | UNI | NULL    |       |
| password      | varchar(8)            | NO   |     | NULL    |       |
| mobile_number | bigint                | NO   | UNI | NULL    |       |
| date_of_birth | date                  | NO   |     | NULL    |       |
| gender        | enum('Male','Female') | YES  |     | NULL    |       |
| nationality   | varchar(50)           | NO   |     | NULL    |       |

Registration of users:

```
* INSERT INTO User_details VALUES(101 , "Pavan Raaj" , "pavan@gmail.com" , "pavan@06" , 9493170308 , "2003-07-06" , "Male" , "Indian" );

* INSERT INTO User_details VALUES(102 , "Meenu" , "meenu@gmail.com" , "meenu@02" , 8765432763 , "2003-09-24" , "Female" , "American" );

* INSERT INTO User_details VALUES(103 , "Keerthana" , "keerthana@gmail.com" , "keerthi3" , 9887654827 , "2001-08-14" , "Female" , "Korean" );

* INSERT INTO User_details VALUES(104 , "Suguram" , "sugu@gmail.com" , "sugu@104" , 9876545673 , "2002-10-04" , "Male" , "Indian" );

* INSERT INTO User_details VALUES(105 , "Ramesh" , "ramu@gmail.com" , "ramu@105" , 9813246752 , "2001-11-14" , "Male" , "Indian" );

* INSERT INTO User_details VALUES(106 , "Kumar" , "kumar@gmail.com" , "kumar@13" , 9000876652 , "2000-02-13" , "Male" , "Indian" );

* INSERT INTO User_details VALUES(107 , "Suresh" , "suresh@gmail.com" , "suresh@7" , 9887564553 , "2002-12-03" , "Male" , "Indian" );

* INSERT INTO User_details VALUES(108 , "Deepak" , "deepak@gmail.com" , "deepak@8" , 8776655489 , "2003-11-03" , "Male" , "Indian" );

* INSERT INTO User_details VALUES(109 , "Hasan" , "hasan@gmail.com" , "hasan@09" , 7665544352 , "2000-12-23" , "Male" , "Indian" );

* INSERT INTO User_details VALUES(110 , "Ismail" , "ismail@gmail.com" , "ismail19" , 9675432187 , "2002-02-21" , "Male" , "Indian" );

* INSERT INTO User_details VALUES(111 , "Musaraf" , "musaraf@gmail.com" , "mus@1234" , 8776599087 , "2001-04-12" , "Male" , "Indian" );

* INSERT INTO User_details VALUES(112 , "Venkat" , "venkat@gmail.com" , "venkat@1" , 7665498362 , "2004-03-03" , "Male" , "Indian" );

* INSERT INTO User_details VALUES(113 , "kamal" , "kamal@gmail.com" , "kamal@13" , 9111234456 , "2002-03-21" , "Male" , "Indian" );


```


User list:

```
SELECT * FROM User_details;
```


| id  | name       | email_id            | password | mobile_number | date_of_birth | gender | nationality |
|:---:|:----------:|:-------------------:|:--------:|:-------------:|:-------------:|:------:|:-----------:|
| 101 | Pavan Raaj | pavan@gmail.com     | pavan@06 |    9493170308 | 2003-07-06    | Male   | Indian      |
| 102 | Meenu      | meenu@gmail.com     | meenu@02 |    8765432763 | 2003-09-24    | Female | American    |
| 103 | Keerthana  | keerthana@gmail.com | keerthi3 |    9887654827 | 2001-08-14    | Female | Korean      |
| 104 | Suguram    | sugu@gmail.com      | sugu@104 |    9876545673 | 2002-10-04    | Male   | Indian      |
| 105 | Ramesh     | ramu@gmail.com      | ramu@105 |    9813246752 | 2001-11-14    | Male   | Indian      |
| 106 | Kumar      | kumar@gmail.com     | kumar@13 |    9000876652 | 2000-02-13    | Male   | Indian      |
| 107 | Suresh     | suresh@gmail.com    | suresh@7 |    9887564553 | 2002-12-03    | Male   | Indian      |
| 108 | Deepak     | deepak@gmail.com    | deepak@8 |    8776655489 | 2003-11-03    | Male   | Indian      |
| 109 | Hasan      | hasan@gmail.com     | hasan@09 |    7665544352 | 2000-12-23    | Male   | Indian      |
| 110 | Ismail     | ismail@gmail.com    | ismail19 |    9675432187 | 2002-02-21    | Male   | Indian      |
| 111 | Musaraf    | musaraf@gmail.com   | mus@1234 |    8776599087 | 2001-04-12    | Male   | Indian      |
| 112 | Venkat     | venkat@gmail.com    | venkat@1 |    7665498362 | 2004-03-03    | Male   | Indian      |
| 113 | kamal      | kamal@gmail.com     | kamal@13 |    9111234456 | 2002-03-21    | Male   | Indian      |

----

Creating roles table:
 ```
 CREATE TABLE User_roles(role_id TINYINT(4) NOT NULL UNIQUE , role_name VARCHAR(50) NOT NULL , FOREIGN KEY(role_id) REFERENCES User_details(id) );
  ``` 

 ``` 
 DESC User_roles; 
 ``` 



| Field     | Type        | Null | Key | Default | Extra |
|:---------:|:-----------:|:----:|:---:|:-------:|:-----:|
| role_id   | tinyint     | NO   | PRI | NULL    |       |
| role_name | varchar(50) | NO   |     | NULL    |       |

```
INSERT INTO User_roles VALUES(101 , "Admin"),(102 , "Tourist"),(103 , "Tourist"),(104 , "Guide"),(105 , "Driver"),(106 , "Driver"),(107 , "Driver"),(108 , "Guide"),(109 , "tourist"),(110 , "Guide") , (111,"Guide") , (112,"Guide") , (113,"Guide");
```

Roles of users:

```
SELECT * FROM User_roles;
```


| role_id | role_name |
|:-------:|----------:|
|     101 | Admin     |
|     102 | Tourist   |
|     103 | Tourist   |
|     104 | Guide     |
|     105 | Driver    |
|     106 | Driver    |
|     107 | Driver    |
|     108 | Guide     |
|     109 | tourist   |
|     110 | Guide     |
|     111 | Guide     |
|     112 | Guide     |
|     113 | Guide     |


----

Places details:

 ``` 
 CREATE TABLE place_details(place_id TINYINT(4) PRIMARY KEY , place_name VARCHAR(50) NOT NULL UNIQUE , country VARCHAR(50) NOT NULL , cost_of_trip INT NOT NULL , pick_up_at TEXT NOT NULL ,trip_added_date TIMESTAMP NOT NULL DEFAULT NOW() ,  FOREIGN KEY(guide_id) REFERENCES User_details(id) , CHECK(cost_of_trip >= 50000)); 
 ``` 

 ``` 
 DESC place_details; 
 ```

| Field           | Type        | Null | Key | Default           | Extra             |
|:---------------:|:-----------:|:----:|:---:|:-----------------:|:-----------------:|
| place_id        | tinyint     | NO   | PRI | NULL              |                   |
| place_name      | varchar(50) | NO   | UNI | NULL              |                   |
| country         | varchar(50) | NO   |     | NULL              |                   |
| cost_of_trip    | int         | NO   |     | NULL              |                   |
| pick_up_at      | text        | NO   |     | NULL              |                   |
| trip_added_date | timestamp   | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
| guide_id        | tinyint     | NO   | UNI | NULL              |                   |

```
* INSERT INTO place_details VALUES(01 , "Agra" , "India" , 87999 , "Perungudi,Chennai" , now() , 104 );

* INSERT INTO place_details VALUES(2 , "Darjeeling" , "India" , 67999 , "BTM Layout,Bengalore" , now() , 108 );

* INSERT INTO place_details VALUES(3 , "New York" , "America" , 159999 , "Chennai International Airport,Chennai" , now() , 110 );

* INSERT INTO place_details VALUES(4 , "Araku Valley" , "INDIA" , 67999 , "Raj Residency" , now() , 111 );

* INSERT INTO place_details VALUES(5 , "Ooty" , "INDIA" , 57999 , "Hotel Lakeview" , now() , 112 );

* INSERT INTO place_details VALUES(6 , "Varanasi" , "INDIA" , 57899 , "Taj Ganges" , now() , 113 );

```

```
SELECT * FROM place_details;
```


| place_id | place_name   | country | cost_of_trip | pick_up_at                            | trip_added_date     | guide_id |
|:--------:|:------------:|:-------:|:-----------:|:-------------------------------------:|:-------------------:|:--------:|
|        1 | Agra         | India   |        87999 | Perungudi,Chennai                     | 2022-03-22 14:28:20 |      104 |
|        2 | Darjeeling   | India   |        67999 | BTM Layout,Bengalore                  | 2022-03-22 14:31:50 |      108 |
|        3 | New York     | America |       159999 | Chennai International Airport,Chennai | 2022-03-22 14:34:32 |      110 |
|        4 | Araku Valley | INDIA   |        67999 | Raj Residency                         | 2022-03-23 12:20:17 |      111 |
|        5 | Ooty         | INDIA   |        57999 | Hotel Lakeview                        | 2022-03-23 12:21:34 |      112 |
|        6 | Varanasi     | INDIA   |        57899 | Taj Ganges                            | 2022-03-23 12:22:35 |      113 |


----
Transportation details:

``` 
CREATE TABLE transportation_details(transportation_id TINYINT(4) PRIMARY KEY , transportation_type VARCHAR(50) NOT NULL , driver_id TINYINT(4) NOT NULL UNIQUE , FOREIGN KEY(driver_id) REFERENCES User_details(id) ); 
``` 

``` 
DESC transportation_details; 
``` 



| Field               | Type        | Null | Key | Default | Extra |
|:-------------------:|:-----------:|:----:|:---:|:-------:|:-----:|
| transportation_id   | tinyint     | NO   | PRI | NULL    |       |
| transportation_type | varchar(50) | NO   |     | NULL    |       |
| driver_id           | tinyint     | NO   | UNI | NULL    |       |


```
* INSERT INTO transportation_details VALUES(10 , "BUS-01" , 105 );

* INSERT INTO transportation_details VALUES(11 , "PLANE-01" , 106 );

* INSERT INTO transportation_details VALUES(13 , "BUS-02" , 107 );
```

```
SELECT * FROM transportation_details;
```


| transportation_id | transportation_type | driver_id |
|:-----------------:|:-------------------:|:---------:|
|                10 | BUS-01              |       105 |
|                11 | PLANE-01            |       106 |
|                13 | BUS-02              |       107 |


----
Details of tourists:

``` 
CREATE TABLE tourist_details(tourist_id TINYINT(4) PRIMARY KEY , date_of_journey DATE NOT NULL , id_of_place_booked TINYINT(4) NOT NULL , no_of_tickets_booked TINYINT(3) NOT NULL , id_of_transportation_assigned TINYINT(4) NOT NULL , amount_paid INT NOT NULL , FOREIGN KEY(tourist_id) REFERENCES User_details(id) , FOREIGN KEY(id_of_place_booked) REFERENCES place_details(place_id) , FOREIGN KEY(id_of_transportation_assigned) REFERENCES transportation_details(transportation_id) , CHECK(no_of_tickets_booked <> 0 ) , CHECK(amount_paid >= 50000) ); 
```

```
 DESC tourist_details; 
``` 



| Field                         | Type    | Null | Key | Default | Extra |
|:-----------------------------:|:-------:|:----:|:---:|:-------:|:-----:|
| tourist_id                    | tinyint | NO   | PRI | NULL    |       |
| date_of_journey               | date    | NO   |     | NULL    |       |
| id_of_place_booked            | tinyint | NO   | MUL | NULL    |       |
| no_of_tickets_booked          | tinyint | NO   |     | NULL    |       |
| id_of_transportation_assigned | tinyint | NO   | MUL | NULL    |       |
| amount_paid                   | int     | NO   |     | NULL    |       |


```
* INSERT INTO tourist_details VALUES(102 , "2022-09-24" , 1 , 3 , 11 , 263997 );

* INSERT INTO tourist_details VALUES(103 , "2022-08-14" , 2 , 3 , 10 , 203997 );

* INSERT INTO tourist_details VALUES(109 , "2022-09-19" , 3 , 1 , 11 , 159999 );

```

```
SELECT * FROM tourist_details;
```

| tourist_id | date_of_journey | id_of_place_booked | no_of_tickets_booked | id_of_transportation_assigned | amount_paid |
|:----------:|:---------------:|:------------------:|:--------------------:|:-----------------------------:|:-----------:|
|        102 | 2022-09-24      |                  1 |                    3 |                            11 |      263997 |
|        103 | 2022-08-14      |                  2 |                    3 |                            10 |      203997 |
|        109 | 2022-09-19      |                  3 |                    1 |                            11 |      159999 |


----

Hotel details:

 ``` 
 CREATE TABLE hotel_details(hotel_id TINYINT(4) PRIMARY KEY , hotel_name VARCHAR(200) NOT NULL UNIQUE , place_id TINYINT(4) NOT NULL , room_no TINYINT(2) NOT NULL , FOREIGN KEY(place_id) REFERENCES place_details(place_id) ); 
 ``` 

```
  DESC hotel_details; 
```


| Field            | Type         | Null | Key | Default | Extra |
|:----------------:|:------------:|:----:|:---:|:-------:|:-----:|
| hotel_id         | int          | NO   | PRI | NULL    |       |
| hotel_name       | varchar(200) | NO   | UNI | NULL    |       |
| place_id         | tinyint      | NO   | MUL | NULL    |       |
| reserved_room_no | tinyint      | NO   |     | NULL    |       |


```
* INSERT INTO hotel_details VALUES(1001 , "The Oberoi Amarvilas" , 1 , 89 );

* INSERT INTO hotel_details VALUES(1002 , "Mayfair" , 2 , 73 );

* INSERT INTO hotel_details VALUES(1003 , "Hilton" , 3 , 20 );

* INSERT INTO hotel_details VALUES(1004 , "Raj Residency" , 4 , 32 );

* INSERT INTO hotel_details VALUES(1005 , "Hotel Lakeview" , 5 , 22 );

* INSERT INTO hotel_details VALUES(1006 , "Taj Ganges" , 6 , 67 ); 

```

```
SELECT * FROM hotel_details;
```


| hotel_id | hotel_name           | place_id | reserved_room_no |
|:--------:|:--------------------:|:--------:|:----------------:|
|     1001 | The Oberoi Amarvilas |        1 |               89 |
|     1002 | Mayfair              |        2 |               73 |
|     1003 | Hilton               |        3 |               20 |
|     1004 | Raj Residency        |        4 |               32 |
|     1005 | Hotel Lakeview       |        5 |               22 |
|     1006 | Taj Ganges           |        6 |               67 |



----

Ticket status of tourists:

```  
 CREATE TABLE ticket_status(tourist_id TINYINT(4) NOT NULL , ticket_status VARCHAR(50) NOT NULL , FOREIGN KEY(tourist_id) REFERENCES tourist_details(tourist_id) , CHECK(ticket_status IN ("Confirmed" , "On hold" ,  "Cancelled") ) ); 
 ```

 ```
  DESC ticket_status; 
``` 

| Field         | Type        | Null | Key | Default | Extra |
|:-------------:|:-----------:|:----:|:---:|:-------:|:-----:|
| tourist_id    | tinyint     | NO   | MUL | NULL    |       |
| ticket_status | varchar(50) | NO   |     | NULL    |       |


```
* INSERT INTO ticket_status VALUES(103 , "Confirmed" );

* INSERT INTO ticket_status VALUES(109 , "On hold" );

* INSERT INTO ticket_status VALUES(102 , "Confirmed" );

```


```
SELECT * FROM ticket_status;
```


| tourist_id | ticket_status |
|:----------:|:-------------:|
|        103 | Confirmed     |
|        109 | On hold       |
|        102 | Confirmed     |


----

querries of users:


 ``` 
 CREATE TABLE contact_us(user_id TINYINT(4) NOT NULL , query TEXT NOT NULL , FOREIGN KEY(user_id) REFERENCES User_details(id)); 
 ```

```
  DESC contact_us; 
``` 



| Field   | Type    | Null | Key | Default | Extra |
|:-------:|:-------:|:----:|:---:|:-------:|:-----:|
| user_id | tinyint | NO   | MUL | NULL    |       |
| query   | text    | NO   |     | NULL    |       |

```
* INSERT INTO contact_us VALUES(108 , "Not able to see to which palces I was assigned, can you please help me on this.");

* INSERT INTO contact_us VALUES(109 , "I didn't get my ticket via mail can you please check over this.");

* INSERT INTO contact_us VALUES(105 , "My bus is facing a trouble please change the bus of travel.");

* INSERT INTO contact_us VALUES(102 , "I am not able to get my ticket.");

* INSERT INTO contact_us VALUES(106 , "my plane has some issue can you please change the trip time.");

```

```
SELECT * FROM contact_us;
```

| user_id | query                                                                           |
|:-------:|:-------------------------------------------------------------------------------:|
|     108 | Not able to see to which palces I was assigned, can you please help me on this. |
|     109 | I didn't get my ticket via mail can you please check over this.                 |
|     105 | My bus is facing a trouble please change the bus of travel.                     |
|     102 | I am not able to get my ticket.                                                 |
|     106 | my plane has some issue can you please change the trip time.                    |



----

Reviews of tourists:

 ``` 
 CREATE TABLE reviews(tourist_id TINYINT(4) NOT NULL , review TEXT NOT NULL , FOREIGN KEY(tourist_id) REFERENCES User_details(id));  
 ```

 ``` 
 DESC reviews; 
 ``` 



| Field      | Type    | Null | Key | Default | Extra |
|:----------:|:-------:|:----:|:---:|:-------:|:-----:|
| tourist_id | tinyint | NO   | MUL | NULL    |       |
| review     | text    | NO   |     | NULL    |       |


```
* INSERT INTO reviews VALUES(103 , "I really enjoyed the trip and the trip was more informative and cool.");

* INSERT INTO reviews VALUES(102 , "I enjoyed the trip a lot.");

```

```
SELECT * FROM reviews;
```


| tourist_id | review                                                                |
|:----------:|:---------------------------------------------------------------------:|
|     103    | I really enjoyed the trip and the trip was more informative and cool. |
|     102    | I enjoyed the trip a lot.                                             |


----
Details of tourists in which hotel (Joins):

```
SELECT tourist_details.tourist_id , hotel_details.place_id , hotel_details.reserved_room_no AS room_no , hotel_details.hotel_id FROM tourist_details INNER JOIN hotel_details ON tourist_details.id_of_place_booked=hotel_details.place_id;
```


| tourist_id | place_id | room_no | hotel_id |
|:----------:|:--------:|:-------:|:--------:|
|        102 |        1 |      89 |     1001 |
|        103 |        2 |      73 |     1002 |
|        109 |        3 |      20 |     1003 |

----
Newly added trips

```
CREATE VIEW newly_added_trips AS SELECT place_id,place_name,country,cost_of_trip,pick_up_at,trip_added_date,guide_id FROM place_details WHERE trip_added_date > "2022-03-22 14:34:32";
```

```
SELECT * FROM newly_added_trips;
```

| place_id | place_name   | country | cost_of_trip | pick_up_at     | trip_added_date     | guide_id |
|:--------:|:------------:|:-------:|:------------:|:--------------:|:-------------------:|:--------:|
|        4 | Araku Valley | INDIA   |        67999 | Raj Residency  | 2022-03-23 12:20:17 |      111 |
|        5 | Ooty         | INDIA   |        57999 | Hotel Lakeview | 2022-03-23 12:21:34 |      112 |
|        6 | Varanasi     | INDIA   |        57899 | Taj Ganges     | 2022-03-23 12:22:35 |      113 |


ER-Diagram:




![Drawing (2)](https://user-images.githubusercontent.com/93571072/160089014-99ef4197-750d-4660-85ab-46ebbf31afcb.png)






EER-Diagram:









![EER](https://user-images.githubusercontent.com/93571072/159657781-6296dad5-6867-4591-b1e0-26fdd9184d9a.png)




























































































































































































