package com.example.ProyectoInventarioF2.repositorio;

import com.example.ProyectoInventarioF2.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
