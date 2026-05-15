package com.tuapp.lamatera.mapper;

import com.tuapp.lamatera.dto.ProductoResponse;
import com.tuapp.lamatera.entity.Producto;

public class ProductoMapper {

    public static ProductoResponse
    toResponse(Producto producto){

        return ProductoResponse.builder()
                .id(producto.getId())
                .nombre(producto.getNombre())
                .precio(producto.getPrecio())
                .stock(producto.getStock())
                .descripcion(producto.getDescripcion())
                .categoria(
                        producto.getCategoria()
                                .getNombre()
                )
                .build();

    }

}