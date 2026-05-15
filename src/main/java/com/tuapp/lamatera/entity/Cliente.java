package com.tuapp.lamatera.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name="clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Cliente {

    @Id
    @GeneratedValue(
            strategy =
            GenerationType.IDENTITY
    )

    private Long id;


    @Column(nullable=false)
    private String nombre;


    @Column(nullable=false)
    private String apellido;


    @Column(unique=true)
    private String telefono;


    private String direccion;



    @OneToMany(
            mappedBy="cliente"
    )

    private List<Pedido>
            pedidos;

}