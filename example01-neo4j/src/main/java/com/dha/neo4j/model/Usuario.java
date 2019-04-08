package com.dha.neo4j.model;

import java.util.List;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Usuario {

	@GraphId
	private Long id;
	private String nombre;
	private Integer edad;
	@Relationship(type = "CALIFICADO_POR", direction = Relationship.INCOMING)
	private List<Pelicula> peliculasCalificadas;

	public Usuario() {
	}

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

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public List<Pelicula> getPeliculasCalificadas() {
		return peliculasCalificadas;
	}

	public void setPeliculasCalificadas(List<Pelicula> peliculasCalificadas) {
		this.peliculasCalificadas = peliculasCalificadas;
	}

}