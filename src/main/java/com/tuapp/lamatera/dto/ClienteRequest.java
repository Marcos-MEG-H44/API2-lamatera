package com.tuapp.lamatera.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ClienteRequest {

    @NotBlank
    private String nombre;

    @NotBlank
    private String apellido;

    private String telefono;

    private String direccion;

}