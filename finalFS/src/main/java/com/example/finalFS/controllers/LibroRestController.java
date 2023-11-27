package com.example.finalFS.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.finalFS.model.LibroDTO;
import com.example.finalFS.service.LibroService;
@RestController
@RequestMapping("/libros")
public class LibroRestController {
	@Autowired
	LibroService LibroService;
	@PostMapping("/crear")
	public ResponseEntity<?> crearLibro(@RequestBody LibroDTO LibroC){
		LibroDTO Libro = LibroService.crearLibro(LibroC);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/" + Libro.getId()).buildAndExpand(Libro.getId()).toUri();		
		return ResponseEntity.created(location).build();
		
	}
	

}
