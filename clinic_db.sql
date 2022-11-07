CREATE DATABASE `clinic`;

USE `clinic`;

CREATE TABLE `clinic`.`doctor` (
  `id` VARCHAR(10) NOT NULL,
  `name` VARCHAR(45) NULL,
  `position` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX ID_UNIQUE (`id` ASC) VISIBLE);
  
  INSERT INTO `clinic`.`doctor` VALUES('021547', 'Emma Wattson', 'Surgeon');
  INSERT INTO `clinic`.`doctor` VALUES('000125', 'William Jackson', 'Psychologist');
  INSERT INTO `clinic`.`doctor` VALUES('059845', 'Michael Brown', 'Cardiologist');
  INSERT INTO `clinic`.`doctor` VALUES('026584', 'Oliver White', 'Anesthesiologist');
  INSERT INTO `clinic`.`doctor` VALUES('106524', 'Noah Walker', 'Dermatologist');

CREATE TABLE `clinic`.`nurse` (
  `id` VARCHAR(10) NOT NULL,
  `name` VARCHAR(45) NULL,
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
  `name` VARCHAR(45) NULL,
  `age` INT NULL,
  `gender` TINYINT(1) NULL,
  `dob` DATE NULL,
  `pob` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  PRIMARY KEY (`pid`),
  UNIQUE INDEX `pid_UNIQUE` (`pid` ASC) VISIBLE);

