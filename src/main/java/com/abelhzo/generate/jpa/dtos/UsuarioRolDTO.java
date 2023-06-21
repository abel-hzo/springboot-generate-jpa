package com.abelhzo.generate.jpa.dtos;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author: Abel HZO
 * @project: springboot-generate-jpa
 * @file: UsuarioRolDTO.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Sábado 17 Junio 2023, 01:43:19.
 * @description: El presente archivo UsuarioRolDTO.java fue creado por Abel HZO.
 */
public class UsuarioRolDTO {

	private Long idUsuariosroles;
	@JsonIgnore
	private UsuarioDTO usuario;
	private RolDTO rol;
	private Timestamp creado;

	public Long getIdUsuariosroles() {
		return idUsuariosroles;
	}

	public void setIdUsuariosroles(Long idUsuariosroles) {
		this.idUsuariosroles = idUsuariosroles;
	}

	public UsuarioDTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}

	public RolDTO getRol() {
		return rol;
	}

	public void setRol(RolDTO rol) {
		this.rol = rol;
	}

	public Timestamp getCreado() {
		return creado;
	}

	public void setCreado(Timestamp creado) {
		this.creado = creado;
	}

}
