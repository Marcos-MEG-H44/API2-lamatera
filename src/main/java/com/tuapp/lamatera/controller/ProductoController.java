package com.tuapp.lamatera.controller;

import com.tuapp.lamatera.dto.*;
import com.tuapp.lamatera.service.ProductoService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
@RequiredArgsConstructor
@CrossOrigin(origins = {
    "http://localhost:5173",
    "http://localhost:5174"
})
public class ProductoController {

    private final ProductoService service;


    // LISTAR
    @GetMapping
    public List<ProductoResponse>
    listar() {

        return service.listar();

    }



    // CREAR
    @PostMapping
    public ProductoResponse crear(

            @RequestBody
            @Valid
            ProductoRequest dto){

        return service.crear(
                dto
        );

    }



    // ACTUALIZAR
    @PutMapping("/{id}")
    public ProductoResponse actualizar(

            @PathVariable Long id,

            @RequestBody
            ProductoRequest dto){

        return service.actualizar(
                id,
                dto
        );

    }



    // ELIMINAR
    @DeleteMapping("/{id}")

    public void eliminar(

            @PathVariable
            Long id){

        service.eliminar(
                id
        );

    }



    // BUSCAR POR NOMBRE
    @GetMapping("/buscar")

    public List<ProductoResponse>

    buscar(

            @RequestParam
            String nombre){

        return service.buscarNombre(
                nombre
        );

    }

}