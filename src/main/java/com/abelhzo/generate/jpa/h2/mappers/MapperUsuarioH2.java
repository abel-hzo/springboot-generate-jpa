package com.abelhzo.generate.jpa.h2.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import com.abelhzo.generate.jpa.dtos.UsuarioDTO;
import com.abelhzo.generate.jpa.dtos.UsuarioRolDTO;
import com.abelhzo.generate.jpa.h2.entities.Usuario;
import com.abelhzo.generate.jpa.h2.entities.UsuarioRol;

/**
 * @author: Abel HZO
 * @project: springboot-generate-jpa
 * @file: MapperUsuarioH2.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Sábado 17 Junio 2023, 02:49:27.
 * @description: El presente archivo MapperUsuarioH2.java fue creado por Abel HZO.
 */
@Mapper(componentModel = "spring")
public interface MapperUsuarioH2 {
	
	@Mapping(target = "usuarioRols", conditionExpression = "java(usuarioDTO.getUsuarioRols().size() != 0)")
	Usuario toUsuario(UsuarioDTO usuarioDTO);

	@Mapping(target = "usuarioRols", qualifiedByName = "sinUsuario")
	UsuarioDTO toUsuarioDTO(Usuario usuario);
	
	@Named("sinUsuario")
	@Mapping(target = "usuario", ignore = true)
	UsuarioRolDTO toUsuarioRolDTO(UsuarioRol usuarioRol);

}
