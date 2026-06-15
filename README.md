# API2 - La Matera

## Proyecto Final - Programación IV

Sistema de gestión desarrollado para administrar productos, categorías, clientes y pedidos de un emprendimiento denominado "La Matera".

El proyecto fue desarrollado utilizando una arquitectura Full Stack, compuesta por un Backend REST en Spring Boot y un Frontend en React.

---

# Objetivo del Proyecto

Desarrollar una aplicación que permita gestionar la información principal de un emprendimiento mediante operaciones CRUD completas, utilizando tecnologías modernas de desarrollo web y bases de datos relacionales.

---

# Tecnologías Utilizadas

## Backend

* Java 21
* Spring Boot
* Spring Data JPA
* Hibernate
* SQL Server
* Maven
* Lombok

## Frontend

* React
* Vite
* React Router DOM
* Axios
* JavaScript

## Herramientas

* Git
* GitHub
* Visual Studio Code
* IntelliJ IDEA
* Thunder Client

---

# Arquitectura Implementada

## Backend

Arquitectura en capas:

* Controller
* Service
* Repository
* Entity
* DTO
* Mapper

Estructura:

src/main/java/com/tuapp/lamatera

* controller
* service
* repository
* entity
* dto
* mapper
* config

## Frontend

Estructura basada en componentes:

src

* components
* pages
* services

---

# Funcionalidades Implementadas

## Dashboard

Visualización de estadísticas generales:

* Cantidad de productos
* Cantidad de clientes
* Cantidad de pedidos
* Total de ventas

---

## Gestión de Productos

* Listar productos
* Crear productos
* Modificar productos
* Eliminar productos

---

## Gestión de Categorías

* Listar categorías
* Crear categorías
* Modificar categorías
* Eliminar categorías

---

## Gestión de Clientes

* Listar clientes
* Crear clientes
* Modificar clientes
* Eliminar clientes

---

## Gestión de Pedidos

* Listar pedidos
* Crear pedidos
* Modificar pedidos
* Eliminar pedidos

---

# Modelo de Datos

## Cliente

* id
* nombre
* apellido
* telefono
* direccion

## Categoria

* id
* nombre

## Producto

* id
* nombre
* precio
* stock
* descripcion
* categoria

Relación:

ManyToOne → Categoria

## Pedido

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

# Relaciones Implementadas

* OneToMany
* ManyToOne
* ManyToMany
* Tabla intermedia

---

# Endpoints Disponibles

## Clientes

* GET /clientes
* POST /clientes
* PUT /clientes/{id}
* DELETE /clientes/{id}

## Productos

* GET /productos
* POST /productos
* PUT /productos/{id}
* DELETE /productos/{id}

## Categorías

* GET /categorias
* POST /categorias
* PUT /categorias/{id}
* DELETE /categorias/{id}

## Pedidos

* GET /pedidos
* POST /pedidos
* PUT /pedidos/{id}
* DELETE /pedidos/{id}
* GET /pedidos/ventas

---

# Consultas Personalizadas

Se implementaron consultas utilizando:

@Query

Ejemplo:

SELECT SUM(total)

Para obtener el total de ventas registradas.

---

# Base de Datos

Motor utilizado:

SQL Server

Incluye:

* Base de datos
* Tablas
* Relaciones
* Tabla intermedia pedido_producto

Script:

database/script_lamatera.sql

---

# Ejecución del Backend

Configurar:

src/main/resources/application.properties

Ejecutar:

.\mvnw spring-boot:run

Servidor:

http://localhost:8080

---

# Ejecución del Frontend

Instalar dependencias:

npm install

Ejecutar:

npm run dev

Servidor:

http://localhost:5173

---

# Pruebas

Incluye pruebas unitarias y de integración:

* ProductoServiceTest
* ProductoControllerTest
* LamateraApplicationTests

Ejecutar:

.\mvnw test

---

# Repositorios

## Backend

https://github.com/Marcos-MEG-H44/API2-lamatera

## Frontend

https://github.com/Marcos-MEG-H44/API2-lamatera-frontend

---

# Autor

Marcos Godoy

Tecnicatura en Programación

Materia: Programación IV

---

# Estado del Proyecto

✔ Backend Spring Boot

✔ Frontend React

✔ CRUD completo

✔ SQL Server

✔ Dashboard

✔ Arquitectura en capas

✔ DTOs y Mappers

✔ Relaciones entre entidades

✔ Tests

✔ GitHub

✔ Documentación

PROYECTO FINALIZADO
