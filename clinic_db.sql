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


LOAD DATA LOCAL INFILE 'C:/Workspaces/Java/java-project/doctor_info.csv' INTO TABLE doctor  
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA LOCAL INFILE 'C:/Workspaces/Java/java-project/nurse_info.csv' INTO TABLE nurse  
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA LOCAL INFILE 'C:/Workspaces/Java/java-project/medicine_info.csv' INTO TABLE medicine  
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA LOCAL INFILE 'C:/Workspaces/Java/java-project/patient_info.csv' INTO TABLE patient 
FIELDS TERMINATED BY ','
OPTIONALLY ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'    
IGNORE 1 ROWS;
