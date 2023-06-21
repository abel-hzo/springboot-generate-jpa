package com.abelhzo.generate.jpa.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.abelhzo.generate.jpa.dtos.UsuarioDTO;

/**
 * @author: Abel HZO
 * @project: springboot-generate-jpa
 * @file: UsuarioService.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Sábado 17 Junio 2023, 02:11:45.
 * @description: El presente archivo UsuarioService.java fue creado por Abel HZO.
 */
public interface UsuarioService {
	
	ResponseEntity<UsuarioDTO> guardarUsuario(UsuarioDTO usuarioDTO);
	
	ResponseEntity<UsuarioDTO> buscarUsuario(Long idUsuario);
	
	ResponseEntity<List<UsuarioDTO>> listarUsuarios();	

}
