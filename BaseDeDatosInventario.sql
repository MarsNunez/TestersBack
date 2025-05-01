CREATE TABLE producto (
  id SERIAL PRIMARY KEY,
  nombre VARCHAR(255),
  precio NUMERIC
);

INSERT INTO producto (nombre, precio) VALUES ('Laptop Lenovo', 750.00);
INSERT INTO producto (nombre, precio) VALUES ('Teclado Mecánico', 120.50);
INSERT INTO producto (nombre, precio) VALUES ('Mouse Inalámbrico', 35.99);
INSERT INTO producto (nombre, precio) VALUES ('Monitor 24 pulgadas', 199.99);
INSERT INTO producto (nombre, precio) VALUES ('Escritorio Gamer', 320.00);
INSERT INTO producto (nombre, precio) VALUES ('Auriculares Bluetooth', 89.90);
INSERT INTO producto (nombre, precio) VALUES ('Silla Ergonómica', 270.00);

-- select * from producto;