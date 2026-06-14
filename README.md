# API2 - La Matera

Sistema de gestión desarrollado para administrar productos, categorías, clientes y pedidos de un emprendimiento.

Proyecto realizado como práctica de Programación IV utilizando arquitectura Backend + Frontend.

## Tecnologías utilizadas

### Backend

* Java 21
* Spring Boot
* Spring Data JPA
* Hibernate
* SQL Server
* Maven
* Lombok

### Frontend

* React
* React Router DOM
* Axios

### Herramientas

* Git
* GitHub
* Thunder Client
* Visual Studio Code
* IntelliJ IDEA

---

## Descripción

El sistema permite administrar:

✔ Clientes

✔ Productos

✔ Categorías

✔ Pedidos

✔ Dashboard de estadísticas

Incluye relaciones entre entidades, arquitectura en capas, DTOs, Mappers y persistencia en SQL Server.

---

## Funcionalidades implementadas

### Productos

* Listar productos
* Crear productos
* Modificar productos
* Eliminar productos

### Categorías

* Listar categorías
* Crear categorías
* Modificar categorías
* Eliminar categorías

### Clientes

* Listar clientes
* Crear clientes
* Modificar clientes
* Eliminar clientes

### Pedidos

* Listar pedidos
* Crear pedidos
* Modificar pedidos
* Eliminar pedidos

### Dashboard

Visualización de:

* Cantidad de productos
* Cantidad de clientes
* Cantidad de pedidos
* Total de ventas

---

## Arquitectura del Backend

src/main/java/com/tuapp/lamatera

controller/

service/

repository/

entity/

dto/

mapper/

config/

---

## Entidades

### Cliente

* id
* nombre
* apellido
* telefono
* direccion

### Categoria

* id
* nombre

### Producto

* id
* nombre
* precio
* stock
* descripcion
* categoria

Relación:

ManyToOne → Categoria

### Pedido

* id
* fecha
* total
* cliente
* productos

Relaciones:

ManyToOne → Cliente

ManyToMany → Producto

Tabla intermedia:

pedido_producto

---

## Relaciones implementadas

✔ OneToMany

✔ ManyToOne

✔ ManyToMany

✔ Tabla intermedia

---

## Endpoints principales

### Clientes

GET /clientes

POST /clientes

PUT /clientes/{id}

DELETE /clientes/{id}

### Productos

GET /productos

POST /productos

PUT /productos/{id}

DELETE /productos/{id}

### Categorías

GET /categorias

POST /categorias

PUT /categorias/{id}

DELETE /categorias/{id}

### Pedidos

GET /pedidos

POST /pedidos

PUT /pedidos/{id}

DELETE /pedidos/{id}

GET /pedidos/ventas

---

## Consultas personalizadas

Implementadas mediante:

@Query

Ejemplo:

SELECT SUM(total)

Para calcular el total de ventas.

---

## Pruebas

Para ejecutar los tests:

.\mvnw test

Incluye:

* ProductoServiceTest
* ProductoControllerTest
* LamateraApplicationTests

---

## Configuración

Editar:

src/main/resources/application.properties

Configurar:

* SQL Server
* Usuario
* Contraseña
* Base de datos

---

## Ejecutar Backend

.\mvnw spring-boot:run

Servidor:

http://localhost:8080

---

## Ejecutar Frontend

npm install

npm run dev

Servidor React:

http://localhost:5173

---

## Script SQL

Incluye script para crear:

✔ Base de datos

✔ Tablas

✔ Relaciones

✔ Tabla intermedia pedido_producto

Ubicación:

database/script_lamatera.sql

---

## Autor

Marcos Godoy

Tecnicatura en Programación

Programación IV

---

## Repositorio

Repositorio GitHub:

https://github.com/Marcos-MEG-H44/API2-lamatera

---

## Estado del proyecto

✔ CRUD completo

✔ Frontend React

✔ Backend Spring Boot

✔ SQL Server

✔ Dashboard

✔ Relaciones entre entidades

✔ Tests implementados

✔ Documentación

✔ GitHub

Estado: TERMINADO
