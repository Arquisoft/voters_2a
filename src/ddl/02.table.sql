CREATE TABLE `voters`.`user` (
  `id` INT NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `password` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC));