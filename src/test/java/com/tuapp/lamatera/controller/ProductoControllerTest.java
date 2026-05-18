package com.tuapp.lamatera.controller;

import com.tuapp.lamatera.dto.ProductoResponse;
import com.tuapp.lamatera.service.ProductoService;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.http.MediaType;

import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@WebMvcTest(
        ProductoController.class
)

@AutoConfigureMockMvc(
        addFilters = false
)

class ProductoControllerTest {


    @Autowired
    private MockMvc mockMvc;



    @MockBean
    private ProductoService service;



    @Test
    void debeListarProductos()
            throws Exception {



        ProductoResponse producto =

                ProductoResponse
                        .builder()

                        .id(1L)

                        .nombre(
                                "Mate Imperial"
                        )

                        .precio(
                                30000.0
                        )

                        .stock(
                                5
                        )

                        .descripcion(
                                "Cuero premium"
                        )

                        .categoria(
                                "Mates"
                        )

                        .build();



        when(
                service.listar()
        )

        .thenReturn(
                List.of(
                        producto
                )
        );



        mockMvc.perform(

                get(
                        "/productos"
                )

                .contentType(
                        MediaType.APPLICATION_JSON
                )

        )

        .andExpect(
                status().isOk()
        )

        .andExpect(

                jsonPath(
                        "$[0].nombre"
                )

                .value(
                        "Mate Imperial"
                )

        );



    }


}