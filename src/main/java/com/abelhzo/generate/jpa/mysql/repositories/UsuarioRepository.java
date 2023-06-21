package com.abelhzo.generate.jpa.mysql.repositories;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abelhzo.generate.jpa.mysql.entities.Usuario;

/**
 * @author: Abel HZO
 * @project: springboot-generate-jpa
 * @file: UsuarioRepository.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Sábado 17 Junio 2023, 02:18:08.
 * @description: El presente archivo UsuarioRepository.java fue creado por Abel HZO.
 */
@Profile("mysql")
@Repository(value = "usuarioRepositoryMySQL")
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
