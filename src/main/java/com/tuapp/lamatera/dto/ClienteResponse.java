package com.tuapp.lamatera.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClienteResponse {

    private Long id;

    private String nombre;

    private String apellido;

    private String telefono;

    private String direccion;

}