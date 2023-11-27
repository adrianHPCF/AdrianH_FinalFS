package com.example.finalFS.persistence.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class AutorEntity {
	public AutorEntity() {
		super();
	}
	public AutorEntity(Long id, String nombre, String nacionalidad, List<LibroEntity> libros) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.libros = libros;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String nacionalidad;
	@OneToMany(mappedBy = "autor")
	private List<LibroEntity> libros = new ArrayList<>();
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
	public List<LibroEntity> getLibros() {
		return libros;
	}
	public void setLibros(List<LibroEntity> libros) {
		this.libros = libros;
	}
}
