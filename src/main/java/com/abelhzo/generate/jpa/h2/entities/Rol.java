package com.abelhzo.generate.jpa.h2.entities;
// Generated 17 jun. 2023 01:56:49 by Hibernate Tools 6.2.4.Final

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.IDENTITY;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * Rol generated by hbm2java
 */
@Entity
@Table(name = "ROLES", schema = "PUBLIC", catalog = "MYDATABASE")
public class Rol implements java.io.Serializable {

	private static final long serialVersionUID = -281266035706365756L;
	private Integer idRol;
	private String rol;
	private Set<UsuarioRol> usuarioRols = new HashSet<UsuarioRol>(0);

	public Rol() {
	}

	public Rol(String rol, Set<UsuarioRol> usuarioRols) {
		this.rol = rol;
		this.usuarioRols = usuarioRols;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID_ROL", unique = true, nullable = false)
	public Integer getIdRol() {
		return this.idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	@Column(name = "ROL", nullable = false, length = 30)
	public String getRol() {
		return this.rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rol")
	public Set<UsuarioRol> getUsuarioRols() {
		return this.usuarioRols;
	}

	public void setUsuarioRols(Set<UsuarioRol> usuarioRols) {
		this.usuarioRols = usuarioRols;
	}

}
