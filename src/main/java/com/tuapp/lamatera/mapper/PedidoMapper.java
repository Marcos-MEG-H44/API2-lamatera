package com.tuapp.lamatera.mapper;

import com.tuapp.lamatera.dto.PedidoResponse;
import com.tuapp.lamatera.entity.Pedido;

public class PedidoMapper {

    public static PedidoResponse
    toResponse(Pedido pedido){

        return PedidoResponse
                .builder()

                .id(
                        pedido.getId()
                )

                .fecha(
                        pedido.getFecha()
                )

                .total(
                        pedido.getTotal()
                )

                .cliente(

                        pedido.getCliente()
                                .getNombre()

                )

                .build();

    }

}