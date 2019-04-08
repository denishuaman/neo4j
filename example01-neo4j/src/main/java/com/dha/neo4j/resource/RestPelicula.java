package com.dha.neo4j.resource;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dha.neo4j.model.Pelicula;
import com.dha.neo4j.service.PeliculaService;

@RestController
@RequestMapping("/pelicula")
public class RestPelicula {

	@Autowired
	PeliculaService peliculaService;

	@GetMapping("/listar")
	public Collection<Pelicula> listarPeliculas() {
		return peliculaService.obtenerPeliculas();
	}
}
