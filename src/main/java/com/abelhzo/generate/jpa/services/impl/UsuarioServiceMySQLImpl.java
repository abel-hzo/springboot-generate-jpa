package com.abelhzo.generate.jpa.services.impl;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.abelhzo.generate.jpa.dtos.RolDTO;
import com.abelhzo.generate.jpa.dtos.UsuarioDTO;
import com.abelhzo.generate.jpa.dtos.UsuarioRolDTO;
import com.abelhzo.generate.jpa.mysql.entities.Usuario;
import com.abelhzo.generate.jpa.mysql.mappers.MapperUsuarioMySQL;
import com.abelhzo.generate.jpa.mysql.repositories.UsuarioRepository;
import com.abelhzo.generate.jpa.services.UsuarioService;

/**
 * @author: Abel HZO
 * @project: springboot-generate-jpa
 * @file: UsuarioServiceMySQLImpl.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Sábado 17 Junio 2023, 03:36:20.
 * @description: El presente archivo UsuarioServiceMySQLImpl.java fue creado por
 *               Abel HZO.
 */
@Profile("mysql")
@Service
public class UsuarioServiceMySQLImpl implements UsuarioService {

	@Autowired
	private MapperUsuarioMySQL mappersMySQL;

	@Autowired
	@Qualifier("usuarioRepositoryMySQL")
	private UsuarioRepository usuarioRepository;

	@Override
	public ResponseEntity<UsuarioDTO> guardarUsuario(UsuarioDTO usuarioDTO) {

		usuarioDTO.setIdUsuario(System.currentTimeMillis());
		usuarioDTO.setCreado(new Timestamp(System.currentTimeMillis()));
			UsuarioRolDTO usuarioRolDTO = new UsuarioRolDTO();
			usuarioRolDTO.setIdUsuariosroles(System.currentTimeMillis());
				RolDTO rol = new RolDTO();
				rol.setIdRol(1);
				UsuarioDTO usuDTO = new UsuarioDTO();
				usuDTO.setIdUsuario(usuarioDTO.getIdUsuario());
			usuarioRolDTO.setUsuario(usuDTO);
			usuarioRolDTO.setRol(rol);
			usuarioRolDTO.setCreado(new Timestamp(System.currentTimeMillis()));
		usuarioDTO.setFoto(loadImageUserDefault());
		usuarioDTO.getUsuarioRols().add(usuarioRolDTO);

		Usuario usuario = mappersMySQL.toUsuario(usuarioDTO);

		Usuario save = usuarioRepository.save(usuario);

		UsuarioDTO usuarioDTOResp = mappersMySQL.toUsuarioDTO(save);

		return new ResponseEntity<UsuarioDTO>(usuarioDTOResp, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<UsuarioDTO> buscarUsuario(Long idUsuario) {

		Optional<Usuario> findById = usuarioRepository.findById(idUsuario);

		if (findById.isEmpty())
			new ResponseEntity<UsuarioDTO>(new UsuarioDTO(), HttpStatus.OK);

		UsuarioDTO usuarioDTO = mappersMySQL.toUsuarioDTO(findById.get());

		return new ResponseEntity<UsuarioDTO>(usuarioDTO, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<UsuarioDTO>> listarUsuarios() {
		List<Usuario> findAll = usuarioRepository.findAll();
		List<UsuarioDTO> listaUsuarios = new ArrayList<>();

		findAll.forEach(usuario -> {
			listaUsuarios.add(mappersMySQL.toUsuarioDTO(usuario));
		});

		return new ResponseEntity<List<UsuarioDTO>>(listaUsuarios, HttpStatus.OK);
	}
	
	private byte[] loadImageUserDefault() {
		InputStream is = getClass().getResourceAsStream("/user-default.png");
		try {
			return is.readAllBytes();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}	

}
