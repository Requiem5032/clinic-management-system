CREATE DATABASE `clinic`;

USE `clinic`;

CREATE TABLE `clinic`.`doctor` (
  `id` VARCHAR(10) NOT NULL,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `position` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);

CREATE TABLE `clinic`.`nurse` (
  `id` VARCHAR(10) NOT NULL,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `position` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);
  
CREATE TABLE `clinic`.`medicine` (
  `id` VARCHAR(10) NOT NULL,
  `name` VARCHAR(45) NULL,
  `price` DOUBLE NULL,
  `quantity` INT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);

CREATE TABLE `clinic`.`patient` (
  `pid` VARCHAR(10) NOT NULL,
  `nid` VARCHAR(10) NULL,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `age` INT NULL,
  `gender` TINYINT(1) NULL,
  `address` VARCHAR(100) NULL,
  PRIMARY KEY (`pid`),
  UNIQUE INDEX `pid_UNIQUE` (`pid` ASC) VISIBLE);

SET GLOBAL local_infile = 1;

LOAD DATA LOCAL INFILE 'C:/Workspaces/Java/java-project/doctor_info.csv' INTO TABLE `clinic`.`doctor`
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA LOCAL INFILE 'C:/Workspaces/Java/java-project/nurse_info.csv' INTO TABLE `clinic`.`nurse`
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA LOCAL INFILE 'C:/Workspaces/Java/java-project/medicine_info.csv' INTO TABLE `clinic`.`medicine`
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA LOCAL INFILE 'C:/Workspaces/Java/java-project/patient_info.csv' INTO TABLE `clinic`.`patient`
FIELDS TERMINATED BY ','
OPTIONALLY ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;
