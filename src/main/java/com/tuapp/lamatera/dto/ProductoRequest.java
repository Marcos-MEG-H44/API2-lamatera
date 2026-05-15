package com.tuapp.lamatera.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProductoRequest {

    @NotBlank
    private String nombre;

    @NotNull
    private Double precio;

    @NotNull
    private Integer stock;

    private String descripcion;

    @NotNull
    private Long categoriaId;
}