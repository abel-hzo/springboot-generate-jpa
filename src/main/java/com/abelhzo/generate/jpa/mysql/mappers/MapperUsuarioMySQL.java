package com.abelhzo.generate.jpa.mysql.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import com.abelhzo.generate.jpa.dtos.UsuarioDTO;
import com.abelhzo.generate.jpa.dtos.UsuarioRolDTO;
import com.abelhzo.generate.jpa.mysql.entities.Usuario;
import com.abelhzo.generate.jpa.mysql.entities.UsuarioRol;

/**
 * @author: Abel HZO
 * @project: springboot-generate-jpa
 * @file: MapperUsuarioMySQL.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Sábado 17 Junio 2023, 02:47:47.
 * @description: El presente archivo MapperUsuarioMySQL.java fue creado por Abel HZO.
 */
@Mapper(componentModel = "spring")
public interface MapperUsuarioMySQL {
	
    @Mapping(target = "usuarioRols", conditionExpression = "java(usuarioDTO.getUsuarioRols().size() != 0)")
	Usuario toUsuario(UsuarioDTO usuarioDTO);
	
    @Mapping(target = "usuarioRols", qualifiedByName = "sinUsuario")
	UsuarioDTO toUsuarioDTO(Usuario usuario);
    
	@Named("sinUsuario")
	@Mapping(target = "usuario", ignore = true)
	UsuarioRolDTO toUsuarioRolDTO(UsuarioRol usuarioRol);

}
