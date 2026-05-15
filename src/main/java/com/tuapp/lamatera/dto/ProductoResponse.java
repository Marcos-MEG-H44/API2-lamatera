package com.tuapp.lamatera.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductoResponse {

    private Long id;

    private String nombre;

    private Double precio;

    private Integer stock;

    private String descripcion;

    private String categoria;
}