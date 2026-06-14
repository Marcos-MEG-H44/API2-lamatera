package com.tuapp.lamatera.controller;

import com.tuapp.lamatera.dto.*;
import com.tuapp.lamatera.service.PedidoService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
@RequiredArgsConstructor
@CrossOrigin(origins = {
    "http://localhost:5173",
    "http://localhost:5174"
})

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


    @PutMapping("/{id}")
public PedidoResponse actualizar(

        @PathVariable Long id,

        @RequestBody
        PedidoRequest dto) {

    return service.actualizar(
            id,
            dto
    );

}

    @DeleteMapping("/{id}")

    public void eliminar(
            @PathVariable Long id) {

        service.eliminar(id);

    }



    // TOTAL DE VENTAS
    @GetMapping("/ventas")

    public Double
    totalVentas() {

        return service
                .totalVentas();

    }

}