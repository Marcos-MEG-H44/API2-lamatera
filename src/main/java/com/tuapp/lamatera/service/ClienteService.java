package com.tuapp.lamatera.service;

import com.tuapp.lamatera.dto.*;
import com.tuapp.lamatera.entity.Cliente;
import com.tuapp.lamatera.mapper.ClienteMapper;
import com.tuapp.lamatera.repository.ClienteRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ClienteService {

    private final
    ClienteRepository repo;



    public List<ClienteResponse>
    listar(){

        return repo.findAll()

                .stream()

                .map(
                        ClienteMapper::toResponse
                )

                .toList();

    }



    public ClienteResponse
    crear(
            ClienteRequest dto){

        Cliente cliente=

                Cliente.builder()

                .nombre(
                        dto.getNombre()
                )

                .apellido(
                        dto.getApellido()
                )

                .telefono(
                        dto.getTelefono()
                )

                .direccion(
                        dto.getDireccion()
                )

                .build();


        return ClienteMapper
                .toResponse(

                        repo.save(
                                cliente
                        )

                );

    }
    public ClienteResponse actualizar(
        Long id,
        ClienteRequest dto) {

    Cliente cliente =
            repo.findById(id)
                    .orElseThrow();

    cliente.setNombre(
            dto.getNombre()
    );

    cliente.setApellido(
            dto.getApellido()
    );

    cliente.setTelefono(
            dto.getTelefono()
    );

    cliente.setDireccion(
            dto.getDireccion()
    );

    return ClienteMapper.toResponse(
            repo.save(cliente)
    );

}


public void eliminar(Long id) {

    repo.deleteById(id);

}

}