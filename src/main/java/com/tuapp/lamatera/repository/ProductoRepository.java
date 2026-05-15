package com.tuapp.lamatera.repository;

import com.tuapp.lamatera.entity.Producto;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository
        extends JpaRepository<Producto,Long>{

    List<Producto>
    findByNombreContainingIgnoreCase(
            String nombre
    );

}