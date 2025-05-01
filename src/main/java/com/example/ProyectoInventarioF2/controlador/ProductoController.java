package com.example.ProyectoInventarioF2.controlador;

import com.example.ProyectoInventarioF2.modelo.Producto;
import com.example.ProyectoInventarioF2.repositorio.ProductoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoRepository productoRepository;

    public ProductoController(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    // GET: listar todos los productos
    @GetMapping
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    // POST: crear un nuevo producto
    @PostMapping
    public ResponseEntity<?> crearProducto(@RequestBody Producto producto) {
        // Validación manual
        if (producto.getNombre() == null || producto.getNombre().trim().isEmpty()) {
            return ResponseEntity.badRequest().body("El nombre es obligatorio y no puede estar vacío.");
        }

        if (producto.getPrecio() == null || producto.getPrecio() <= 0) {
            return ResponseEntity.badRequest().body("El precio debe ser mayor que cero.");
        }

        Producto guardado = productoRepository.save(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(guardado);
    }

    // DELETE: eliminar producto por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarProducto(@PathVariable Long id) {
        if (!productoRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Producto no encontrado.");
        }

        productoRepository.deleteById(id);
        return ResponseEntity.ok("Producto eliminado exitosamente.");
    }

    // PUT: actualizar producto existente
    @PutMapping("/{id}")
    public ResponseEntity<?> actualizarProducto(@PathVariable Long id, @RequestBody Producto nuevoProducto) {
        // Validación manual
        if (nuevoProducto.getNombre() == null || nuevoProducto.getNombre().trim().isEmpty()) {
            return ResponseEntity.badRequest().body("El nombre no puede estar vacío.");
        }

        if (nuevoProducto.getPrecio() == null || nuevoProducto.getPrecio() <= 0) {
            return ResponseEntity.badRequest().body("El precio debe ser mayor que cero.");
        }

        if (!productoRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Producto no encontrado.");
        }

        Producto productoExistente = productoRepository.findById(id).get();
        productoExistente.setNombre(nuevoProducto.getNombre());
        productoExistente.setPrecio(nuevoProducto.getPrecio());

        Producto actualizado = productoRepository.save(productoExistente);
        return ResponseEntity.ok(actualizado);
    }


}
