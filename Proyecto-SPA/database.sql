CREATE DATABASE spa;

CREATE TABLE persona(
id INTEGER PRIMARY KEY,
nombre VARCHAR(255),
apellido VARCHAR(255)
);

INSERT INTO persona VALUES
(1 , 'Pedro' , 'Perez'),
(2 , 'Camila', 'Suarez');


SELECT * FROM persona;