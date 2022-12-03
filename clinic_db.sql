CREATE DATABASE clinic;

USE clinic;

CREATE TABLE employee (
  id VARCHAR(10) NOT NULL,
  first_name VARCHAR(45) NULL,
  last_name VARCHAR(45) NULL,
  PRIMARY KEY (id)
);

CREATE TABLE doctor (
  id VARCHAR(10) NOT NULL,
  position VARCHAR(45) NULL,
  FOREIGN KEY (id) REFERENCES employee(id)
);

CREATE TABLE nurse (
  id VARCHAR(10) NOT NULL,
  position VARCHAR(45) NULL,
  FOREIGN KEY (id) REFERENCES employee(id)
);
  
CREATE TABLE medicine (
  id VARCHAR(10) NOT NULL,
  name VARCHAR(45) NULL,
  price DOUBLE NULL,
  quantity INT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE patient (
  pid VARCHAR(10) NOT NULL,
  nid VARCHAR(10) NULL,
  first_name VARCHAR(45) NULL,
  last_name VARCHAR(45) NULL,
  age INT NULL,
  gender TINYINT(1) NULL,
  address VARCHAR(100) NULL,
  PRIMARY KEY (pid)
);

SET GLOBAL local_infile = 1;

LOAD DATA LOCAL INFILE 'D:/Workspaces/Java/java-project/employee_info.csv' INTO TABLE employee
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA LOCAL INFILE 'D:/Workspaces/Java/java-project/doctor_info.csv' INTO TABLE doctor
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA LOCAL INFILE 'D:/Workspaces/Java/java-project/nurse_info.csv' INTO TABLE nurse
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA LOCAL INFILE 'D:/Workspaces/Java/java-project/medicine_info.csv' INTO TABLE medicine
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA LOCAL INFILE 'D:/Workspaces/Java/java-project/patient_info.csv' INTO TABLE patient
FIELDS TERMINATED BY ','
OPTIONALLY ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;
