package com.dha.neo4j.repository;

import java.util.Collection;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.dha.neo4j.model.Usuario;

@Repository
public interface UsuarioRepository extends Neo4jRepository<Usuario, Long> {

	@Query("MATCH (p:Pelicula)-[r:CALIFICADO_POR]-(u:Usuario) RETURN p,r,u")
	Collection<Usuario> obtenerUsuarios();
}
