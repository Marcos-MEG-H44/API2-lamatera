package com.tuapp.lamatera.mapper;

import com.tuapp.lamatera.dto.CategoriaResponse;
import com.tuapp.lamatera.entity.Categoria;

public class CategoriaMapper {

    public static CategoriaResponse toResponse(
            Categoria categoria) {

        return CategoriaResponse.builder()
                .id(categoria.getId())
                .nombre(categoria.getNombre())
                .build();

    }

}