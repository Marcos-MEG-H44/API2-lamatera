# API2 - La Matera

API REST desarrollada con Spring Boot para la gestión de un emprendimiento de mates y accesorios.

Proyecto realizado como práctica de desarrollo Backend utilizando:

- Java
- Spring Boot
- SQL Server
- JWT Authentication
- JPA / Hibernate
- Maven

---

# Descripción

La API permite administrar:

✔ Clientes  
✔ Productos  
✔ Categorías  
✔ Pedidos  
✔ Autenticación con JWT  

Incluye relaciones entre entidades, seguridad y pruebas automáticas.

---

# Tecnologías usadas

- Java 21
- Spring Boot
- Spring Security
- JWT Authentication
- Spring Data JPA
- Hibernate
- SQL Server
- Maven
- Lombok
- Thunder Client
- Git
- GitHub

---

# Estructura del proyecto

```txt
src/main/java/com/tuapp/lamatera

controller/
service/
repository/
entity/
dto/
mapper/
security/
config/
```

---

# Seguridad

La API utiliza:

- Registro de usuarios
- Login
- JWT Token
- Endpoints protegidos

Endpoints públicos:

```http
POST /auth/register
POST /auth/login
```

---

# Entidades

## Cliente

- id
- nombre
- telefono
- direccion

---

## Categoria

- id
- nombre

---

## Producto

- id
- nombre
- precio
- stock
- descripcion
- categoria

Relación:

```txt
ManyToOne → Categoria
```

---

## Pedido

- id
- fecha
- total
- cliente
- productos

Relaciones:

```txt
ManyToOne → Cliente
ManyToMany → Productos
```

Tabla intermedia:

```txt
pedido_producto
```

---

# Relaciones implementadas

✔ OneToMany

✔ ManyToOne

✔ ManyToMany

✔ Tabla intermedia

---

# Endpoints principales

## Auth

```http
POST /auth/register
POST /auth/login
```

---

## Clientes

```http
GET /clientes
POST /clientes
```

---

## Productos

```http
GET /productos
POST /productos
```

---

## Categorías

```http
GET /categorias
POST /categorias
```

---

## Pedidos

```http
GET /pedidos
POST /pedidos
GET /pedidos/ventas
```

Obtiene total vendido.

---

# Consultas personalizadas

Implementadas usando:

```java
@Query
```

Ejemplo:

```sql
SELECT SUM(total)
```

---

# Tests

Para ejecutar los tests:

```bash
.\mvnw test
```

Incluye:

✔ ProductoServiceTest

✔ ProductoControllerTest

✔ LamateraApplicationTests

---

# Configuración

Editar:

```txt
src/main/resources/application.properties
```

Configurar:

- SQL Server
- Usuario
- Password
- Base de datos

---

# Ejecutar proyecto

Ejecutar:

```bash
.\mvnw spring-boot:run
```

La API inicia en:

```txt
http://localhost:8080
```

---

# Script SQL

Incluye script para crear:

✔ Base de datos

✔ Tablas

✔ Relaciones

✔ Tabla intermedia `pedido_producto`

Ubicación:

```txt
database/script_lamatera.sql
```

---

# Estructura general del proyecto

```txt
API2-lamatera
│
├── database/
│      script_lamatera.sql
│
├── src/main/java/
│      controller/
│      service/
│      repository/
│      entity/
│      dto/
│      mapper/
│      security/
│
├── src/test/java/
│      ProductoServiceTest
│      ProductoControllerTest
│      LamateraApplicationTests
│
└── README.md
```

---

# Autor

Proyecto desarrollado por:

**Marcos Godoy**

Tecnicatura en Programación - Programacion IV

---

# Repositorio

Repositorio GitHub:

:contentReference[oaicite:0]{index=0}

---

# Estado del proyecto

Proyecto funcional con:

✔ CRUD completo

✔ Seguridad JWT

✔ Relaciones entre entidades

✔ Tests implementados

✔ SQL Server

✔ Documentación

✔ GitHub

✔ Script SQL

**Estado: TERMINADO**