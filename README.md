#  API2 - La Matera

API REST desarrollada con Spring Boot para la gestión de un emprendimiento de mates y accesorios.

Proyecto realizado como práctica de API REST utilizando Java + Spring Boot + SQL Server + JWT + JPA.

---

#  Tecnologías usadas

- Java 17+
- Spring Boot
- Spring Security
- JWT Authentication
- Spring Data JPA
- SQL Server
- Maven
- Lombok
- Thunder Client
- Git + GitHub

---

# Estructura del proyecto

src/main/java/com/tuapp/lamatera

controller/
service/
repository/
entity/
dto/
mapper/
security/

---

# Seguridad

La API utiliza:

- Registro de usuarios
- Login
- JWT Token
- Endpoints protegidos

Endpoints públicos:

POST /auth/register

POST /auth/login

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

ManyToOne → Categoria

---

## Pedido

- id
- fecha
- total
- cliente
- productos

Relaciones:

ManyToOne → Cliente

ManyToMany → Productos

---

# Relaciones implementadas

✔ OneToMany

✔ ManyToOne

✔ ManyToMany

✔ Tabla intermedia:

pedido_producto

---

# Endpoints principales

## Auth

POST /auth/register

POST /auth/login

---

## Clientes

GET /clientes

POST /clientes

---

## Productos

GET /productos

POST /productos

---

## Categorías

GET /categorias

POST /categorias

---

## Pedidos

GET /pedidos

POST /pedidos

GET /pedidos/ventas

Obtiene total vendido.

---

# Consultas personalizadas

Implementadas usando:

@Query JPQL

Ejemplo:

Total de ventas:

SELECT SUM(total)

---

# Ejecutar proyecto

Configurar:

application.properties

Luego:

```bash
.\mvnw spring-boot:run