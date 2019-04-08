package com.dha.neo4j.repository;

import java.util.Collection;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.dha.neo4j.model.Pelicula;

@Repository
public interface PeliculaRepository extends Neo4jRepository<Pelicula, Long> {

	@Query("match (p:Pelicula) return p")
	Collection<Pelicula> obtenerPeliculas();
}
