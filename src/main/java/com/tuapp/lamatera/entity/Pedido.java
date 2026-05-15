package com.tuapp.lamatera.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="pedidos")

@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor

@Builder

public class Pedido {

    @Id
    @GeneratedValue(
            strategy =
            GenerationType.IDENTITY
    )
    private Long id;


    private LocalDate fecha;


    private Double total;


    @ManyToOne

    @JoinColumn(
            name="cliente_id"
    )

    private Cliente cliente;



    @ManyToMany

    @JoinTable(

            name="pedido_producto",

            joinColumns =
            @JoinColumn(
                    name="pedido_id"
            ),

            inverseJoinColumns =
            @JoinColumn(
                    name="producto_id"
            )

    )

    private List<Producto>
            productos;

}