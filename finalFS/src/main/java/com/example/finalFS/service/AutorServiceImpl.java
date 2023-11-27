package com.example.finalFS.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.finalFS.persistence.entities.AutorEntity;
import com.example.finalFS.persistence.repositories.AutorRepository;
import com.example.finalFS.mappers.AutorMapper;
import com.example.finalFS.model.AutorDTO;
@Service
public class AutorServiceImpl implements AutorService {
	@Autowired
	AutorRepository AutorRepository;
	@Autowired 
	AutorMapper AutorMapper;
	@Override
	public AutorDTO crearAutor(AutorDTO autor) {
		 AutorEntity AutorN = AutorMapper.autorToEntity(autor);
		 AutorEntity GuardarAutor = AutorRepository.save(AutorN);
	     return AutorMapper.autorToDTO(GuardarAutor);
	}

	@Override
	public List<AutorDTO> verAutores() {
		List<AutorEntity> lista = AutorRepository.findAll();
		List<AutorDTO> autores = AutorMapper.listaToDTO(lista);
			
		return autores;
	}

}
