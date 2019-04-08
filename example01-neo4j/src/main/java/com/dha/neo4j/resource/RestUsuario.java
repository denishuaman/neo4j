package com.dha.neo4j.resource;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dha.neo4j.model.Usuario;
import com.dha.neo4j.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class RestUsuario {

	@Autowired
	UsuarioService usuarioService;

	@GetMapping("/listar")
	public Collection<Usuario> listarUsuarios() {
		return usuarioService.obtenerUsuarios();
	}
}
