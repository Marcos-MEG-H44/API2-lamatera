package com.tuapp.lamatera.controller;

import com.tuapp.lamatera.dto.*;
import com.tuapp.lamatera.service.PedidoService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
@RequiredArgsConstructor

public class PedidoController {

    private final PedidoService service;



    // LISTAR PEDIDOS
    @GetMapping

    public List<PedidoResponse>
    listar() {

        return service.listar();

    }



    // CREAR PEDIDO
    @PostMapping

    public PedidoResponse
    crear(

            @RequestBody
            PedidoRequest dto) {

        return service.crear(
                dto
        );

    }



    // TOTAL DE VENTAS
    @GetMapping("/ventas")

    public Double
    totalVentas() {

        return service
                .totalVentas();

    }

}