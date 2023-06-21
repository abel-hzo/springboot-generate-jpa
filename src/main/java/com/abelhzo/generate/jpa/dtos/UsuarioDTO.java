package com.abelhzo.generate.jpa.dtos;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: Abel HZO
 * @project: springboot-generate-jpa
 * @file: UsuarioDTO.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Sábado 17 Junio 2023, 01:42:34.
 * @description: El presente archivo UsuarioDTO.java fue creado por Abel HZO.
 */
public class UsuarioDTO {

	private Long idUsuario;
	private String username;
	private String contrase;
	private String email;
	private Date nacimiento;
	private byte[] foto;
	private Timestamp creado;
	private Set<UsuarioRolDTO> usuarioRols = new HashSet<UsuarioRolDTO>(0);

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContrase() {
		return contrase;
	}

	public void setContrase(String contrase) {
		this.contrase = contrase;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Timestamp getCreado() {
		return creado;
	}

	public void setCreado(Timestamp creado) {
		this.creado = creado;
	}

	public Set<UsuarioRolDTO> getUsuarioRols() {
		return usuarioRols;
	}

	public void setUsuarioRols(Set<UsuarioRolDTO> usuarioRols) {
		this.usuarioRols = usuarioRols;
	}

}
