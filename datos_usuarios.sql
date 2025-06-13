-- Ejemplo para desarrollar el Tutorial de TODOCODE: ABM en Java Web con MySQL y Tomcat
CREATE DATABASE datos_usuarios;
USE datos_usuarios;

CREATE TABLE usuarios (
    cedula VARCHAR(10)  PRIMARY KEY,
    nombre VARCHAR(20) NOT NULL,
    apellido VARCHAR(20) NOT NULL,
    telefono VARCHAR(10) NOT NULL
    );