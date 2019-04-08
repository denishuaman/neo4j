package com.dha.neo4j.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dha.neo4j.model.Pelicula;
import com.dha.neo4j.repository.PeliculaRepository;

@Service
public class PeliculaService {

	@Autowired
	PeliculaRepository peliculaRepository;

	public Collection<Pelicula> obtenerPeliculas() {
		System.out.println("PeliculaService.obtenerPeliculas(): Inicio del servicio");
		Collection<Pelicula> peliculas = peliculaRepository.obtenerPeliculas();
		System.out.println("Peliculas=" + peliculas);
		return peliculas;
	}
}
