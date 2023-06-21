package com.abelhzo.generate.jpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abelhzo.generate.jpa.dtos.UsuarioDTO;
import com.abelhzo.generate.jpa.services.UsuarioService;

/**
 * @author: Abel HZO
 * @project: springboot-generate-jpa
 * @file: UsuarioMySQLController.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Sábado 17 Junio 2023, 02:04:02.
 * @description: El presente archivo UsuarioMySQLController.java fue creado por
 *               Abel HZO.
 */
@Profile("mysql")
@RestController
@RequestMapping
public class UsuarioMySQLController implements UsuarioService {
	
	@Autowired
	@Qualifier("usuarioServiceMySQLImpl")
	private UsuarioService usuarioService;

	@Override
	@PostMapping
	public ResponseEntity<UsuarioDTO> guardarUsuario(UsuarioDTO usuarioDTO) {
		return usuarioService.guardarUsuario(usuarioDTO);
	}

	@Override
	@GetMapping
	public ResponseEntity<UsuarioDTO> buscarUsuario(Long idUsuario) {
		return usuarioService.buscarUsuario(idUsuario);
	}

	@Override
	@GetMapping("/all")
	public ResponseEntity<List<UsuarioDTO>> listarUsuarios() {
		return usuarioService.listarUsuarios();
	}

}
