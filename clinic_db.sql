CREATE DATABASE clinic;

USE clinic;

CREATE TABLE doctor (
  id INT AUTO_INCREMENT,
  first_name VARCHAR(50),
  last_name VARCHAR(50),
  position VARCHAR(50),	
  PRIMARY KEY (id)
);

CREATE TABLE nurse (
  id INT AUTO_INCREMENT,
  first_name VARCHAR(50),
  last_name VARCHAR(50),
  position VARCHAR(50),
  PRIMARY KEY (id)
);
  
CREATE TABLE medicine (
  id INT AUTO_INCREMENT,
  name VARCHAR(50),
  price DOUBLE,
  quantity INT,
  PRIMARY KEY (id)
);

CREATE TABLE patient (
  pid INT AUTO_INCREMENT,
  nid CHAR(10),
  first_name VARCHAR(50),
  last_name VARCHAR(50),
  age INT,
  gender BOOLEAN,
  address VARCHAR(250),
  UNIQUE (nid),
  PRIMARY KEY (pid)
);


LOAD DATA LOCAL INFILE 'C:/Users/THAO/Desktop/Chaistain2/clinic-management-system/doctor_info.csv' INTO TABLE doctor  /** Change directory to your onw computer directory */
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA LOCAL INFILE 'C:/Users/THAO/Desktop/Chaistain2/clinic-management-system/nurse_info.csv' INTO TABLE nurse  /** Change directory to your onw computer directory */
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA LOCAL INFILE 'C:/Users/THAO/Desktop/Chaistain2/clinic-management-system/medicine_info.csv' INTO TABLE medicine  /** Change directory to your onw computer directory */
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA LOCAL INFILE 'C:/Users/THAO/Desktop/Chaistain2/clinic-management-system/patient_info.csv' INTO TABLE patient /** Change directory to your onw computer directory */
FIELDS TERMINATED BY ','
OPTIONALLY ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'    /** Add \r for revent unread error */
IGNORE 1 ROWS;
