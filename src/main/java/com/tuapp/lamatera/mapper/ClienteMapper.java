package com.tuapp.lamatera.mapper;

import com.tuapp.lamatera.dto.ClienteResponse;
import com.tuapp.lamatera.entity.Cliente;

public class ClienteMapper {

    public static ClienteResponse
    toResponse(
            Cliente cliente){

        return ClienteResponse
                .builder()

                .id(
                        cliente.getId()
                )

                .nombre(
                        cliente.getNombre()
                )

                .apellido(
                        cliente.getApellido()
                )

                .telefono(
                        cliente.getTelefono()
                )

                .direccion(
                        cliente.getDireccion()
                )

                .build();

    }

}