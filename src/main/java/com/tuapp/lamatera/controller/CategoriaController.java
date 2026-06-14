package com.tuapp.lamatera.controller;

import com.tuapp.lamatera.dto.CategoriaRequest;
import com.tuapp.lamatera.dto.CategoriaResponse;
import com.tuapp.lamatera.service.CategoriaService;

import jakarta.validation.Valid;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
@RequiredArgsConstructor
@CrossOrigin(origins = {
    "http://localhost:5173",
    "http://localhost:5174"
})
public class CategoriaController {

    private final CategoriaService service;

    @GetMapping
    public List<CategoriaResponse> listar() {

        return service.listar();

    }

    @PostMapping
    public CategoriaResponse crear(

            @RequestBody
            @Valid
            CategoriaRequest dto) {

        return service.crear(dto);

    }

    @PutMapping("/{id}")
public CategoriaResponse actualizar(

        @PathVariable Long id,

        @RequestBody
        @Valid
        CategoriaRequest dto) {

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

}