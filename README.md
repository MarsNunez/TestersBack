# ProyectoInventarioF2 - Backend

Este es el backend del sistema de **Control de Inventario**, desarrollado con **Spring Boot** y conectado a **PostgreSQL**. Incluye endpoints REST para crear, listar, editar y eliminar productos, así como pruebas unitarias.

---

## 🚀 Pasos para comenzar

### 1. Clonar el repositorio

```bash
git clone https://github.com/MarsNunez/gerraTestersBack.git
cd gerraTestersBack
```

---

### 2. Configurar base de datos

Dentro del folder clonado encontrarás el archivo SQL base que contiene la estructura de la base de datos (por ejemplo, la tabla `producto`).  
Debes crear una base de datos en PostgreSQL y ejecutar ese script.

📌 **Nombre sugerido para la base:** `inventario`  
📂 Ruta esperada del script: `/database/init.sql` (ajústalo si está en otra carpeta)

---

### 3. Configurar el archivo `application.properties`

Ubicación del archivo:
```
src/main/resources/application.properties
```

Abre ese archivo y modifica estas líneas con tu propio usuario y contraseña de PostgreSQL:

```properties
spring.datasource.username=TU_USUARIO
spring.datasource.password=TU_CONTRASENA
```

Asegúrate de que el puerto y nombre de base de datos también coincidan si hiciste cambios.

---

### 4. Correr el backend

Puedes ejecutar el proyecto directamente desde tu IDE (IntelliJ, Eclipse) o con Maven:

```bash
./mvnw spring-boot:run
```

> Asegúrate de que PostgreSQL esté corriendo y la base esté creada antes de iniciar.

---

## ✅ Pruebas unitarias

El proyecto incluye pruebas unitarias enfocadas en el controlador `ProductoController`.

📄 Archivo de test:
```
src/test/java/com/example/ProyectoInventarioF2/ProductoControllerTest.java
```

Para ejecutar los tests, puedes hacerlo desde tu IDE o vía Maven:

```bash
./mvnw test
```

Estas pruebas validan que:
- No se permite crear productos con nombre vacío o precio inválido.
- Se guarda correctamente un producto válido.

---

## 📬 Autor

Desarrollado por [Mars Núñez](https://github.com/MarsNunez)
