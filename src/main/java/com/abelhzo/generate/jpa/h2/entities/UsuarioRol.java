package com.abelhzo.generate.jpa.h2.entities;
// Generated 20 jun. 2023 22:18:56 by Hibernate Tools 6.2.4.Final

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.sql.Timestamp;

/**
 * UsuarioRol generated by hbm2java
 */
@Entity
@Table(name = "USUARIOSROLES", schema = "PUBLIC", catalog = "MYDATABASE")
public class UsuarioRol implements java.io.Serializable {

	private static final long serialVersionUID = 3454256987254263542L;
	private Long idUsuariosroles;
	private Usuario usuario;
	private Rol rol;
	private Timestamp creado;

	public UsuarioRol() {
	}

	public UsuarioRol(Long idUsuariosroles, Usuario usuario, Rol rol, Timestamp creado) {
		this.idUsuariosroles = idUsuariosroles;
		this.usuario = usuario;
		this.rol = rol;
		this.creado = creado;
	}

	@Id
	@Column(name = "ID_USUARIOSROLES", unique = true, nullable = false)
	public Long getIdUsuariosroles() {
		return this.idUsuariosroles;
	}

	public void setIdUsuariosroles(Long idUsuariosroles) {
		this.idUsuariosroles = idUsuariosroles;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_USUARIO", nullable = false)
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ROL", nullable = false)
	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREADO", nullable = false, length = 26)
	public Timestamp getCreado() {
		return this.creado;
	}

	public void setCreado(Timestamp creado) {
		this.creado = creado;
	}

}
