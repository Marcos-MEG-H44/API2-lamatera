package com.tuapp.lamatera.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "productos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto {

    @Id
    @GeneratedValue(
            strategy =
            GenerationType.IDENTITY
    )
    private Long id;


    @Column(nullable = false)
    private String nombre;


    @Column(nullable = false)
    private Double precio;


    @Column(nullable = false)
    private Integer stock;


    private String descripcion;



    @ManyToOne

    @JoinColumn(
            name = "categoria_id"
    )

    private Categoria categoria;



    @ManyToMany(
            mappedBy =
            "productos"
    )

    private List<Pedido>
            pedidos;

}