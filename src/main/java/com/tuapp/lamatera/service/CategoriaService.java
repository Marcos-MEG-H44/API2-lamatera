package com.tuapp.lamatera.service;

import com.tuapp.lamatera.dto.CategoriaRequest;
import com.tuapp.lamatera.dto.CategoriaResponse;
import com.tuapp.lamatera.entity.Categoria;
import com.tuapp.lamatera.mapper.CategoriaMapper;
import com.tuapp.lamatera.repository.CategoriaRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaService {

    private final CategoriaRepository categoriaRepo;

    public List<CategoriaResponse> listar() {

        return categoriaRepo.findAll()
                .stream()
                .map(CategoriaMapper::toResponse)
                .toList();

    }

    public CategoriaResponse crear(
            CategoriaRequest dto) {

        Categoria categoria =
                Categoria.builder()
                        .nombre(dto.getNombre())
                        .build();

        return CategoriaMapper.toResponse(
                categoriaRepo.save(categoria)
        );

    }

    public CategoriaResponse actualizar(
        Long id,
        CategoriaRequest dto) {

    Categoria categoria =
            categoriaRepo.findById(id)
                    .orElseThrow();

    categoria.setNombre(
            dto.getNombre()
    );

    return CategoriaMapper.toResponse(
            categoriaRepo.save(categoria)
    );

}


public void eliminar(Long id) {

    categoriaRepo.deleteById(id);

}

}
