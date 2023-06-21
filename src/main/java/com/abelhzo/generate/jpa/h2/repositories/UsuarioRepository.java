package com.abelhzo.generate.jpa.h2.repositories;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abelhzo.generate.jpa.h2.entities.Usuario;

/**
 * @author: Abel HZO
 * @project: springboot-generate-jpa
 * @file: UsuarioRepository.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Sábado 17 Junio 2023, 02:16:47.
 * @description: El presente archivo UsuarioRepository.java fue creado por Abel HZO.
 */
@Profile("h2")
@Repository(value = "usuarioRepositoryH2")
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
