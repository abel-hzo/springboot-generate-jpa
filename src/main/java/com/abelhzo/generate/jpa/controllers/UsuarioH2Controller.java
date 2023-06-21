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
 * @file: UsuarioH2Controller.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Sábado 17 Junio 2023, 02:02:52.
 * @description: El presente archivo UsuarioH2Controller.java fue creado por
 *               Abel HZO.
 */
@Profile("h2")
@RestController
@RequestMapping
public class UsuarioH2Controller implements UsuarioService {
	
	@Autowired
	@Qualifier("usuarioServiceH2Impl")
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
