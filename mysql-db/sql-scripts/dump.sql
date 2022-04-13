DROP DATABASE IF EXISTS webservice;

CREATE DATABASE webservice;

USE webservice;

DROP TABLE IF EXISTS eleves;
 
CREATE TABLE eleves (
  id INT AUTO_INCREMENT PRIMARY KEY,
  prenom VARCHAR(50) NOT NULL,
  nom VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL,
  note INTEGER(2) NOT NULL
);
 
INSERT INTO eleves (prenom, nom, email, note) VALUES
  ('Alexandre', 'DUPUIDS', 'alexandre.dupuids@edu.esiee.fr', 20),
  ('Bukasa', 'TSHIBANDA', 'bukasa.tshibanda@edu.esiee.fr', 18),
  ('Jules', 'CESAR', 'empreur@gouv.rome.com', 9),
  ('Laurent', 'GINA', 'orangina@miam.org', 0),
  ('Edith', 'PIAF', 'edith@piaf.fr', 11),
  ('Emmanuel', 'MACRON', 'macron2022@elysee.fr', 14);