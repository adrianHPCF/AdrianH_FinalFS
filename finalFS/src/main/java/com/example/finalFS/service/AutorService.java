package com.example.finalFS.service;

import java.util.List;

import com.example.finalFS.model.AutorDTO;

public interface AutorService {
	AutorDTO crearAutor (AutorDTO autor);
	List <AutorDTO> verAutores();
}
