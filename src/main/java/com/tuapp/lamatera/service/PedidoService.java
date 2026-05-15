package com.tuapp.lamatera.service;

import com.tuapp.lamatera.dto.*;
import com.tuapp.lamatera.entity.*;
import com.tuapp.lamatera.mapper.PedidoMapper;
import com.tuapp.lamatera.repository.*;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final PedidoRepository pedidoRepo;

    private final ClienteRepository clienteRepo;

    private final ProductoRepository productoRepo;



    // LISTAR PEDIDOS
    public List<PedidoResponse> listar() {

        return pedidoRepo.findAll()

                .stream()

                .map(
                        PedidoMapper::toResponse
                )

                .toList();

    }



    // CREAR PEDIDO
    public PedidoResponse crear(
            PedidoRequest dto) {


        Cliente cliente =

                clienteRepo.findById(
                        dto.getClienteId()
                )

                .orElseThrow(
                        () -> new RuntimeException(
                                "Cliente no encontrado"
                        )
                );



        List<Producto>
                productos =

                productoRepo.findAllById(
                        dto.getProductosIds()
                );



        Pedido pedido =

                Pedido.builder()

                .fecha(
                        LocalDate.now()
                )

                .total(
                        dto.getTotal()
                )

                .cliente(
                        cliente
                )

                .productos(
                        productos
                )

                .build();



        return PedidoMapper
                .toResponse(

                        pedidoRepo.save(
                                pedido
                        )

                );

    }



    // TOTAL DE VENTAS
    public Double totalVentas() {

        Double total =
                pedidoRepo.totalVentas();

        return total != null
                ? total
                : 0.0;

    }

}