package com.abelhzo.generate.jpa.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.FileSystemResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author: Abel HZO
 * @project: springboot-generate-jpa
 * @file: DataSourceConfigH2.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Sábado 17 Junio 2023, 01:02:39.
 * @description: El presente archivo DataSourceConfigH2.java fue creado por Abel
 *               HZO.
 */
@Profile(value = "h2")
@Configuration
@EntityScan(basePackages = { "com.abelhzo.generate.jpa.h2.entities" })
@EnableJpaRepositories(basePackages = { "com.abelhzo.generate.jpa.h2.repositories" })
public class DataSourceConfigH2 {

	private final String PATH_DATABASE = new FileSystemResource("")
			.getFile()
			.getAbsolutePath()
			.concat("/src/main/resources/mydatabase");

	@Bean
	public DataSource dataSourceH2() {
		DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.driverClassName("org.h2.Driver");
		dataSourceBuilder.url("jdbc:h2:" + PATH_DATABASE);
		dataSourceBuilder.username("abelhzo");
		dataSourceBuilder.password("abcde");
		return dataSourceBuilder.build();
	}

}
