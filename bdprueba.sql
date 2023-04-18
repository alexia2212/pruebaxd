-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`cuenta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`cuenta` (
  `idcuenta` INT NOT NULL,
  `correo` VARCHAR(45) NULL,
  `direccion` VARCHAR(80) NOT NULL,
  `password` VARCHAR(128) NOT NULL,
  `telefono` VARCHAR(10) NOT NULL,
  `admin` INT NULL,
  PRIMARY KEY (`idcuenta`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`responsable`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`responsable` (
  `idresponsable` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idresponsable`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`raza_especie`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`raza_especie` (
  `idraza_especie` INT NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idraza_especie`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`mascota`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`mascota` (
  `idmascota` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `anho` VARCHAR(45) NOT NULL,
  `historia` TEXT NOT NULL,
  `observaciones` TEXT NOT NULL,
  `sexo` VARCHAR(45) NOT NULL,
  `raza_otros` VARCHAR(45) NULL,
  `raza_especie_idraza_especie` INT NOT NULL,
  `cuenta_idcuenta` INT NULL,
  PRIMARY KEY (`idmascota`),
  INDEX `fk_mascota_raza_especie_idx` (`raza_especie_idraza_especie` ASC) VISIBLE,
  INDEX `fk_mascota_cuenta2_idx` (`cuenta_idcuenta` ASC) VISIBLE,
  CONSTRAINT `fk_mascota_raza_especie`
    FOREIGN KEY (`raza_especie_idraza_especie`)
    REFERENCES `mydb`.`raza_especie` (`idraza_especie`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_mascota_cuenta2`
    FOREIGN KEY (`cuenta_idcuenta`)
    REFERENCES `mydb`.`cuenta` (`idcuenta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`servicio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`servicio` (
  `idservicio` INT NOT NULL,
  `hora_inicio` TIMESTAMP NOT NULL,
  `duracion` INT NOT NULL,
  `entrega` VARCHAR(45) NOT NULL,
  `responsable_idresponsable` INT NOT NULL,
  `mascota_idmascota` INT NOT NULL,
  `cuenta_idcuenta` INT NOT NULL,
  PRIMARY KEY (`idservicio`),
  INDEX `fk_servicio_responsable1_idx` (`responsable_idresponsable` ASC) VISIBLE,
  INDEX `fk_servicio_mascota1_idx` (`mascota_idmascota` ASC) VISIBLE,
  INDEX `fk_servicio_cuenta1_idx` (`cuenta_idcuenta` ASC) VISIBLE,
  CONSTRAINT `fk_servicio_responsable1`
    FOREIGN KEY (`responsable_idresponsable`)
    REFERENCES `mydb`.`responsable` (`idresponsable`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_servicio_mascota1`
    FOREIGN KEY (`mascota_idmascota`)
    REFERENCES `mydb`.`mascota` (`idmascota`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_servicio_cuenta1`
    FOREIGN KEY (`cuenta_idcuenta`)
    REFERENCES `mydb`.`cuenta` (`idcuenta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`opcion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`opcion` (
  `idopcion` INT NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  `tiempo_minutos` INT NOT NULL,
  `precio` FLOAT NOT NULL,
  PRIMARY KEY (`idopcion`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`opciones_servicio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`opciones_servicio` (
  `idopciones_servicio` INT NOT NULL,
  `servicio_idservicio1` INT NOT NULL,
  `opcion_idopcion` INT NOT NULL,
  PRIMARY KEY (`idopciones_servicio`),
  INDEX `fk_opciones_servicio_servicio1_idx` (`servicio_idservicio1` ASC) VISIBLE,
  INDEX `fk_opciones_servicio_opcion1_idx` (`opcion_idopcion` ASC) VISIBLE,
  CONSTRAINT `fk_opciones_servicio_servicio1`
    FOREIGN KEY (`servicio_idservicio1`)
    REFERENCES `mydb`.`servicio` (`idservicio`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_opciones_servicio_opcion1`
    FOREIGN KEY (`opcion_idopcion`)
    REFERENCES `mydb`.`opcion` (`idopcion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
