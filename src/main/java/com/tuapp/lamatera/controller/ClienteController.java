package com.tuapp.lamatera.controller;

import com.tuapp.lamatera.dto.*;
import com.tuapp.lamatera.service.ClienteService;

import lombok.RequiredArgsConstructor;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/clientes")

@RequiredArgsConstructor

public class ClienteController {


    private final
    ClienteService service;



    @GetMapping

    public List<ClienteResponse>
    listar(){

        return service.listar();

    }



    @PostMapping

    public ClienteResponse
    crear(

            @RequestBody
            @Valid

            ClienteRequest dto){

        return service.crear(
                dto
        );

    }

}