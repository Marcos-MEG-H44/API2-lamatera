package com.tuapp.lamatera.dto;

import lombok.Data;

import java.util.List;

@Data
public class PedidoRequest {

    private Double total;

    private Long clienteId;

    private List<Long>
            productosIds;

}