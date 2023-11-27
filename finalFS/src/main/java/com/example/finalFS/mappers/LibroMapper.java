package com.example.finalFS.mappers;

import org.mapstruct.Mapper;

import com.example.finalFS.model.LibroDTO;
import com.example.finalFS.persistence.entities.LibroEntity;

@Mapper(componentModel = "spring", uses = {AutorMapper.class})
public interface LibroMapper {
	LibroDTO libroToDTO (LibroEntity libro);
	LibroEntity libroToEntity(LibroDTO LibroDTO);

}
