CREATE DATABASE clinic;

USE clinic;

CREATE TABLE employee (
  id CHAR(6) NOT NULL,
  first_name VARCHAR(50) NULL,
  last_name VARCHAR(50) NULL,
  PRIMARY KEY (id)
);

CREATE TABLE doctor (
  id CHAR(6) NOT NULL,
  position VARCHAR(50) NULL,
  FOREIGN KEY (id) REFERENCES employee(id)
);

CREATE TABLE nurse (
  id CHAR(6) NOT NULL,
  position VARCHAR(50) NULL,
  FOREIGN KEY (id) REFERENCES employee(id)
);
  
CREATE TABLE medicine (
  id CHAR(6) NOT NULL,
  name VARCHAR(50) NULL,
  price DOUBLE NULL,
  quantity INT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE patient (
  pid CHAR(6) NOT NULL,
  nid CHAR(10) NULL,
  first_name VARCHAR(50) NULL,
  last_name VARCHAR(50) NULL,
  age INT NULL,
  gender BOOLEAN NULL,
  address VARCHAR(250) NULL,
  PRIMARY KEY (pid)
);

LOAD DATA LOCAL INFILE 'C:/Workspaces/Java/java-project/employee_info.csv' INTO TABLE employee
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

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
