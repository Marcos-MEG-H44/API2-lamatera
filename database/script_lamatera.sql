CREATE DATABASE lamatera;
GO

USE lamatera;
GO


CREATE TABLE clientes (

    id BIGINT IDENTITY(1,1) PRIMARY KEY,

    nombre VARCHAR(100) NOT NULL,

    telefono VARCHAR(50),

    direccion VARCHAR(200)

);


CREATE TABLE categorias (

    id BIGINT IDENTITY(1,1) PRIMARY KEY,

    nombre VARCHAR(100) NOT NULL

);


CREATE TABLE productos (

    id BIGINT IDENTITY(1,1) PRIMARY KEY,

    nombre VARCHAR(100) NOT NULL,

    precio DECIMAL(10,2),

    stock INT,

    descripcion VARCHAR(255),

    categoria_id BIGINT,

    FOREIGN KEY (categoria_id)

    REFERENCES categorias(id)

);


CREATE TABLE pedidos (

    id BIGINT IDENTITY(1,1) PRIMARY KEY,

    fecha DATETIME,

    total DECIMAL(10,2),

    cliente_id BIGINT,

    FOREIGN KEY(cliente_id)

    REFERENCES clientes(id)

);


CREATE TABLE pedido_producto(

    pedido_id BIGINT,

    producto_id BIGINT,

    PRIMARY KEY(
        pedido_id,
        producto_id
    ),

FOREIGN KEY(pedido_id)
REFERENCES pedidos(id),

FOREIGN KEY(producto_id)
REFERENCES productos(id)

);