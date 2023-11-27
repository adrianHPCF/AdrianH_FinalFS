package com.example.finalFS.model;

import java.util.ArrayList;
import java.util.List;

public class AutorDTO {
	public AutorDTO() {
		super();
	}

	public AutorDTO(Long id, String nombre, String nacionalidad, List<LibroDTO> libros) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.libros = libros;
	}

	private Long id;

	private String nombre;

	private String nacionalidad;

	private List<LibroDTO> libros = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public List<LibroDTO> getLibros() {
		return libros;
	}

	public void setLibros(List<LibroDTO> libros) {
		this.libros = libros;
	}
}
