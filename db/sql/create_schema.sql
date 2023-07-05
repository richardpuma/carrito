CREATE TABLE cliente
(
    id int NOT NULL ,
    nombres varchar(50) NOT NULL ,
    apellidos varchar(50) NOT NULL ,
    dni varchar(8) NOT NULL ,
    telefono varchar(8) ,
    email varchar(20) ,
    CONSTRAINT pk_cliente PRIMARY KEY (id)
);

CREATE TABLE producto
(
    id int NOT NULL ,
    nombre varchar(50) NOT NULL ,
    precio decimal(10,2) NOT NULL ,
    CONSTRAINT pk_producto PRIMARY KEY (id)
);

CREATE TABLE producto
(
    id int NOT NULL ,
    nombre varchar(50) NOT NULL ,
    precio decimal(10,2) NOT NULL ,
    CONSTRAINT pk_producto PRIMARY KEY (id)
)