package com.tuapp.lamatera.service;

import com.tuapp.lamatera.dto.*;
import com.tuapp.lamatera.entity.*;
import com.tuapp.lamatera.mapper.ProductoMapper;
import com.tuapp.lamatera.repository.*;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductoService {

    private final ProductoRepository productoRepo;
    private final CategoriaRepository categoriaRepo;


    // LISTAR PRODUCTOS
    public List<ProductoResponse> listar() {

        return productoRepo.findAll()
                .stream()
                .map(ProductoMapper::toResponse)
                .toList();

    }


    // CREAR PRODUCTO
    public ProductoResponse crear(
            ProductoRequest dto) {

        Categoria categoria =
                categoriaRepo.findById(
                        dto.getCategoriaId()
                )
                .orElseThrow();

        Producto producto =
                Producto.builder()
                        .nombre(dto.getNombre())
                        .precio(dto.getPrecio())
                        .stock(dto.getStock())
                        .descripcion(dto.getDescripcion())
                        .categoria(categoria)
                        .build();

        return ProductoMapper
                .toResponse(
                        productoRepo.save(producto)
                );

    }


    // ACTUALIZAR PRODUCTO
    public ProductoResponse actualizar(
            Long id,
            ProductoRequest dto) {

        Producto producto =
                productoRepo.findById(id)
                        .orElseThrow();

        Categoria categoria =
                categoriaRepo.findById(
                        dto.getCategoriaId()
                )
                        .orElseThrow();


        producto.setNombre(
                dto.getNombre()
        );

        producto.setPrecio(
                dto.getPrecio()
        );

        producto.setStock(
                dto.getStock()
        );

        producto.setDescripcion(
                dto.getDescripcion()
        );

        producto.setCategoria(
                categoria
        );


        return ProductoMapper
                .toResponse(
                        productoRepo.save(producto)
                );

    }


    // ELIMINAR PRODUCTO
    public void eliminar(
            Long id) {

        productoRepo.deleteById(id);

    }



    // BUSCAR POR NOMBRE
    public List<ProductoResponse>
    buscarNombre(String nombre) {

        return productoRepo
                .findByNombreContainingIgnoreCase(
                        nombre
                )

                .stream()

                .map(
                        ProductoMapper::toResponse
                )

                .toList();

    }

}