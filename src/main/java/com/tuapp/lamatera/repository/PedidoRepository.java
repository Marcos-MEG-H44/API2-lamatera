package com.tuapp.lamatera.repository;

import com.tuapp.lamatera.entity.Pedido;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

public interface PedidoRepository
        extends JpaRepository<Pedido,Long> {


    @Query(
            "SELECT SUM(p.total) " +
            "FROM Pedido p"
    )

    Double totalVentas();


}