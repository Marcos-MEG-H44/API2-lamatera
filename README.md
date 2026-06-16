# API2 - La Matera

## Proyecto Final - Programación IV

Sistema de gestión desarrollado para administrar productos, categorías, clientes y pedidos del emprendimiento **La Matera del Gringo y la Nona**.

El proyecto fue desarrollado utilizando una arquitectura Full Stack compuesta por:

* Backend REST desarrollado con Spring Boot.
* Frontend desarrollado con React.

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

Estructura principal:

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

## Gestión de Productos

* Listar productos
* Crear productos
* Modificar productos
* Eliminar productos

## Gestión de Categorías

* Listar categorías
* Crear categorías
* Modificar categorías
* Eliminar categorías

## Gestión de Clientes

* Listar clientes
* Crear clientes
* Modificar clientes
* Eliminar clientes

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

Implementadas mediante @Query.

Ejemplo:

SELECT SUM(total)

Utilizada para calcular el total de ventas registradas.

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

# Cómo Ejecutar el Proyecto

## Backend

Configurar:

src/main/resources/application.properties

Ejecutar:

mvn spring-boot:run

Servidor:

http://localhost:8080

## Frontend

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

mvn test

---

# Repositorios

## Backend

https://github.com/Marcos-MEG-H44/API2-lamatera

## Frontend

https://github.com/Marcos-MEG-H44/API2-lamatera-frontend

---

# Documentación de Entrega

Se incluye además el archivo:

ENTREGA.md

con instrucciones resumidas para la corrección del proyecto.

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

✔ Tests implementados

✔ GitHub

✔ Documentación

## Estado: PROYECTO FINALIZADO
