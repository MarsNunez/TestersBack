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

📌 **Nombre sugerido para la base:** `prueba02`  
📂 Ruta esperada del script: `/BaseDeDatosInventario.sql`

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
(En IntelliJ) Puedes hacer click izquierdo sobre el archivo main, llamado `ProyectoInventarioF2Application.java` y escoger la opcion Run.

> Asegúrate de que PostgreSQL esté corriendo y la base esté creada antes de iniciar.

---

## ✅ Pruebas unitarias

El proyecto incluye pruebas unitarias enfocadas en el controlador `ProductoController`.

📄 Archivo de test:
```
src/test/java/com/example/ProyectoInventarioF2/ProductoControllerTest.java
```

Para ejecutar los tests, puedes hacerlo desde IntelliJ: click izquierdo sobre el archivo main, llamado `ProductoControllerTest.java` en la ruta de test/java/com/example/ProyectoInventarioF2 y escoger la opcion Run.

Estas pruebas validan que:
- No se permite crear productos con nombre vacío o precio inválido.
- Se guarda correctamente un producto válido.

---

## 🟢 ¿Donde ver y validar que el servidor este levantado?
Una vez hecho todo lo anterior, se puede ir al navegador y entrar a la ruta base: `http://localhost:8081/api/productos`.
