package com.tuapp.lamatera.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class PedidoResponse {

    private Long id;

    private LocalDate fecha;

    private Double total;

    private String cliente;

}