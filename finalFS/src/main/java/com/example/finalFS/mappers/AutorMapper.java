package com.example.finalFS.mappers;
import java.util.List;

import org.mapstruct.Mapper;	
import com.example.finalFS.model.AutorDTO;
import com.example.finalFS.persistence.entities.AutorEntity;
@Mapper(componentModel = "spring")
public interface AutorMapper {
	AutorDTO autorToDTO (AutorEntity autor);
	AutorEntity autorToEntity (AutorDTO autor);
	List<AutorDTO> listaToDTO(List<AutorEntity> listaEntity);
}
