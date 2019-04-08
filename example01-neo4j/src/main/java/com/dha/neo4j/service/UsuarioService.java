package com.dha.neo4j.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dha.neo4j.model.Usuario;
import com.dha.neo4j.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	public Collection<Usuario> obtenerUsuarios() {
		return usuarioRepository.obtenerUsuarios();
	}
}
