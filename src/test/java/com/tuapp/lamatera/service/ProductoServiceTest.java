package com.tuapp.lamatera.service;

import com.tuapp.lamatera.dto.ProductoResponse;
import com.tuapp.lamatera.entity.Categoria;
import com.tuapp.lamatera.entity.Producto;
import com.tuapp.lamatera.repository.CategoriaRepository;
import com.tuapp.lamatera.repository.ProductoRepository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

class ProductoServiceTest {


    @Mock
    ProductoRepository productoRepo;


    @Mock
    CategoriaRepository categoriaRepo;



    @InjectMocks
    ProductoService service;



    @Test
    void debeListarProductos(){


        Categoria categoria =
                Categoria.builder()

                        .id(1L)
                        .nombre("Mates")

                        .build();



        Producto producto=

                Producto.builder()

                        .id(1L)

                        .nombre("Mate Imperial")

                        .precio(30000.0)

                        .stock(5)

                        .categoria(categoria)

                        .build();



        when(
                productoRepo.findAll()
        )

        .thenReturn(
                List.of(producto)
        );



        List<ProductoResponse>
                resultado=

                service.listar();



        assertEquals(
                1,
                resultado.size()
        );


        assertEquals(

                "Mate Imperial",

                resultado
                        .get(0)
                        .getNombre()

        );

    }

}