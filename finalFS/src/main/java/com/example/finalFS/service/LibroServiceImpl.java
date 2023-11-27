package com.example.finalFS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.finalFS.persistence.entities.AutorEntity;
import com.example.finalFS.persistence.entities.LibroEntity;
import com.example.finalFS.persistence.repositories.AutorRepository;
import com.example.finalFS.persistence.repositories.LibroRepository;
import com.example.finalFS.mappers.LibroMapper;
import com.example.finalFS.model.LibroDTO;
@Service
public class LibroServiceImpl implements LibroService {
	@Autowired
	LibroRepository LibroRepository;
	@Autowired
	LibroMapper LibroMapper;
	@Autowired
	AutorRepository AutorRepository;

	@Override
	public LibroDTO crearLibro(LibroDTO libro) throws RuntimeException {
        AutorEntity autor = AutorRepository.findById(libro.getAutorId())
                .orElseThrow(() -> new RuntimeException("El autor no ha sido encontrado"));
        LibroEntity LibroN = LibroMapper.libroToEntity(libro);
        LibroN.setAutor(autor);
        LibroEntity GuardarLib = LibroRepository.save(LibroN);
        return LibroMapper.libroToDTO(GuardarLib);
    }

}

