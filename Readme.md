# World Tour App:-

#### ``` CREATE DATABASE World_tour; ```
#### ``` USE World_tour; ``` 


#### ``` CREATE TABLE User_details(id TINYINT(4) PRIMARY KEY , name VARCHAR(50) NOT NULL , email_id VARCHAR(100) NOT NULL UNIQUE , password VARCHAR(8) NOT NULL , mobile_number INT(10) NOT NULL UNIQUE , date_of_birth DATE NOT NULL , gender CHAR(1) NOT NULL , nationality VARCHAR(50) NOT NULL , CHECK(date_of_birth > "2000-01-01") , CHECK(gender = "MALE" OR "Female")); ```


#### ``` DESC User_details; ```


| Field         | Type         | Null | Key | Default | Extra |
|:-------------:|:------------:|:----:|:---:|:-------:|:-----:|
| id            | tinyint      | NO   | PRI | NULL    |       |
| name          | varchar(50)  | NO   |     | NULL    |       |
| email_id      | varchar(100) | NO   | UNI | NULL    |       |
| password      | varchar(8)   | NO   |     | NULL    |       |
| mobile_number | int          | NO   | UNI | NULL    |       |
| date_of_birth | date         | NO   |     | NULL    |       |
| gender        | char(1)      | NO   |     | NULL    |       |
| nationality   | varchar(50)  | NO   |     | NULL    |       |



 #### ```CREATE TABLE User_roles(role_id TINYINT(4) PRIMARY KEY , user_id TINYINT(4) NOT NULL , role_name VARCHAR(50) NOT NULL , FOREIGN KEY(user_id) REFERENCES User_details(id) ); ``` 

 #### ``` DESC User_roles; ``` 



| Field     | Type        | Null | Key | Default | Extra |
|:---------:|:-----------:|:----:|:---:|:-------:|:-----:|
| role_id   | tinyint     | NO   | PRI | NULL    |       |
| user_id   | tinyint     | NO   | MUL | NULL    |       |
| role_name | varchar(50) | NO   |     | NULL    |       |



#### ``` CREATE TABLE contact_us(user_id TINYINT(4) NOT NULL , query TEXT NOT NULL , FOREIGN KEY(user_id) REFERENCES User_details(id)); ```

#### ``` DESC contact_us; ``` 



| Field   | Type    | Null | Key | Default | Extra |
|:-------:|:-------:|:----:|:---:|:-------:|:-----:|
| user_id | tinyint | NO   | MUL | NULL    |       |
| query   | text    | NO   |     | NULL    |       |


#### ``` CREATE TABLE reviews(user_id TINYINT(4) NOT NULL , review TEXT NOT NULL , FOREIGN KEY(user_id) REFERENCES User_details(id));  ```

#### ``` DESC reviews; ``` 



| Field   | Type    | Null | Key | Default | Extra |
|:-------:|:-------:|:----:|:---:|:-------:|:-----:|
| user_id | tinyint | NO   | MUL | NULL    |       |
| review  | text    | NO   |     | NULL    |       |



#### ``` CREATE TABLE guide_details(guide_id TINYINT(4) PRIMARY KEY , guide_name VARCHAR(50) NOT NULL , FOREIGN KEY(guide_id) REFERENCES User_roles(role_id)); ``` 

#### ``` DESC guide_details; ``` 


| Field      | Type        | Null | Key | Default | Extra |
|:----------:|:-----------:|:----:|:---:|:-------:|:-----:|
| guide_id   | tinyint     | NO   | PRI | NULL    |       |
| guide_name | varchar(50) | NO   |     | NULL    |       |




#### ``` CREATE TABLE guide_details(guide_id INT PRIMARY KEY , guide_name VARCHAR(50) NOT NULL UNIQUE); ```

#### ``` DESC guide_details; ``` 


| Field      | Type        | Null | Key | Default | Extra |
|:----------:|:------------:|:---:|:---:|:-------:|:-----:|
| guide_id   | int         | NO   | PRI | NULL    |       |
| guide_name | varchar(50) | NO   | UNI | NULL    |       |


#### ``` CREATE TABLE place_details(place_id TINYINT(4) PRIMARY KEY , place_name VARCHAR(50) NOT NULL UNIQUE , country VARCHAR(50) NOT NULL , guide_id TINYINT(4) NOT NULL , cost_of_trip INT NOT NULL , pick_up_at TEXT NOT NULL ,trip_added_date TIMESTAMP NOT NULL DEFAULT NOW() ,  FOREIGN KEY(guide_id) REFERENCES guide_details(guide_id) , CHECK(cost_of_trip >= 50000)); ``` 

#### ``` DESC place_details; ```



| Field           | Type        | Null | Key | Default           | Extra             |
|:---------------:|:-----------:|:----:|:---:|:-----------------:|:-----------------:|
| place_id        | tinyint     | NO   | PRI | NULL              |                   |
| place_name      | varchar(50) | NO   | UNI | NULL              |                   |
| country         | varchar(50) | NO   |     | NULL              |                   |
| guide_id        | tinyint     | NO   | MUL | NULL              |                   |
| cost_of_trip    | int         | NO   |     | NULL              |                   |
| pick_up_at      | text        | NO   |     | NULL              |                   |
| trip_added_date | timestamp   | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |




#### ``` CREATE TABLE drivers_details(driver_id TINYINT(4) PRIMARY KEY , user_id TINYINT(4) NOT NULL ,  driver_name VARCHAR(50) NOT NULL , FOREIGN KEY(user_id) REFERENCES User_details(id)); ```


#### ``` DESC drivers_details; ``` 


| Field       | Type        | Null | Key | Default | Extra |
|:-----------:|:-----------:|:----:|:---:|:-------:|:-----:|
| driver_id   | tinyint     | NO   | PRI | NULL    |       |
| user_id     | tinyint     | NO   | MUL | NULL    |       |
| driver_name | varchar(50) | NO   |     | NULL    |       |


#### ``` CREATE TABLE transportation(place_id TINYINT(4) NOT NULL , transportation_type VARCHAR(50) NOT NULL , driver_id TINYINT NOT NULL , FOREIGN KEY(place_id) REFERENCES place_details(place_id) , FOREIGN KEY(driver_id) REFERENCES drivers_details(driver_id) ); ``` 

#### ``` DESC transportation; ``` 


| Field               | Type        | Null | Key | Default | Extra |
|:-------------------:|:-----------:|:----:|:---:|:-------:|:-----:|
| place_id            | tinyint     | NO   | MUL | NULL    |       |
| transportation_type | varchar(50) | NO   |     | NULL    |       |
| driver_id           | tinyint     | NO   | MUL | NULL    |       |


#### ``` CREATE TABLE tourist_details(tourist_id TINYINT(4) PRIMARY KEY , user_id TINYINT(4) NOT NULL , date_of_journey DATE NOT NULL , id_of_place_booked TINYINT(4) NOT NULL , no_of_tickets_booked TINYINT(3) NOT NULL , id_of_guide_assigned TINYINT(4) NOT NULL , amount_paid INT NOT NULL , FOREIGN KEY(user_id) REFERENCES User_details(id) , FOREIGN KEY(id_of_place_booked) REFERENCES place_details(place_id) , FOREIGN KEY(id_of_guide_assigned) REFERENCES guide_details(guide_id) , CHECK(no_of_tickets_booked <> 0 ) , CHECK(amount_paid >= 50000) ); ```

#### ``` DESC tourist_details; ``` 



| Field                | Type    | Null | Key | Default | Extra |
|:--------------------:|:-------:|:----:|:---:|:-------:|:-----:|
| tourist_id           | tinyint | NO   | PRI | NULL    |       |
| user_id              | tinyint | NO   | MUL | NULL    |       |
| date_of_journey      | date    | NO   |     | NULL    |       |
| id_of_place_booked   | tinyint | NO   | MUL | NULL    |       |
| no_of_tickets_booked | tinyint | NO   |     | NULL    |       |
| id_of_guide_assigned | tinyint | NO   | MUL | NULL    |       |
| amount_paid          | int     | NO   |     | NULL    |       |



#### ```  CREATE TABLE ticket_status(tourist_id TINYINT(4) NOT NULL , ticket_status VARCHAR(50) NOT NULL , FOREIGN KEY(tourist_id) REFERENCES tourist_details(tourist_id) , CHECK(ticket_status = "Confirmed" OR "On hold" OR "Cancelled" )); ```

#### ``` DESC ticket_status; ``` 


| Field         | Type        | Null | Key | Default | Extra |
|:-------------:|:-----------:|:----:|:---:|:-------:|:-----:|
| user_id       | tinyint     | NO   | MUL | NULL    |       |
| ticket_status | varchar(50) | NO   |     | NULL    |       |



#### ``` CREATE TABLE hotel_details(hotel_id TINYINT(4) PRIMARY KEY , hotel_name VARCHAR(200) NOT NULL UNIQUE , place_id TINYINT(4) NOT NULL , room_no TINYINT(2) NOT NULL , FOREIGN KEY(place_id) REFERENCES place_details(place_id) ); ``` 

#### ``` DESC hotel_details; ```


| Field      | Type         | Null | Key | Default | Extra |
|:----------:|:------------:|:----:|:---:|:-------:|:-----:|
| hotel_id   | tinyint      | NO   | PRI | NULL    |       |
| hotel_name | varchar(200) | NO   | UNI | NULL    |       |
| place_id   | tinyint      | NO   | MUL | NULL    |       |
| room_no    | tinyint      | NO   |     | NULL    |       |



#### ``` CREATE TABLE tourist_in_hotel(tourist_id TINYINT(4) NOT NULL , hotel_id TINYINT(4) NOT NULL , place_id TINYINT(4) NOT NULL , FOREIGN KEY(tourist_id) REFERENCES tourist_details(tourist_id) , FOREIGN KEY(hotel_id) REFERENCES hotel_details(hotel_id) , FOREIGN KEY(place_id) REFERENCES place_details(place_id) ); ``` 


#### ``` DESC tourist_in_hotel; ``` 


| Field      | Type    | Null | Key | Default | Extra |
|:----------:|:-------:|:----:|:---:|:-------:|:-----:|
| tourist_id | tinyint | NO   | MUL | NULL    |       |
| hotel_id   | tinyint | NO   | MUL | NULL    |       |
| place_id   | tinyint | NO   | MUL | NULL    |       |












































































































































































































