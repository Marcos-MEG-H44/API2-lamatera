package com.tuapp.lamatera.repository;

import com.tuapp.lamatera.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository
        extends JpaRepository<Categoria,Long> {
}