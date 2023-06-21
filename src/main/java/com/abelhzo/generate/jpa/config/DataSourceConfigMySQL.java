package com.abelhzo.generate.jpa.config;

import javax.sql.DataSource;

import org.hibernate.boot.model.naming.PhysicalNamingStrategy;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author: Abel HZO
 * @project: springboot-generate-jpa
 * @file: DataSourceConfigMySQL.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Sábado 17 Junio 2023, 01:00:36.
 * @description: El presente archivo DataSourceConfigMySQL.java fue creado por
 *               Abel HZO.
 */
@Profile(value = "mysql")
@Configuration
@EntityScan(basePackages = { "com.abelhzo.generate.jpa.mysql.entities" })
@EnableJpaRepositories(basePackages = { "com.abelhzo.generate.jpa.mysql.repositories" })
public class DataSourceConfigMySQL {

	@Bean
	public DataSource dataSourceMySQL() {
		DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
		dataSourceBuilder.url("jdbc:mysql://127.0.0.1:3306/mydatabase");
		dataSourceBuilder.username("abelhzo");
		dataSourceBuilder.password("abcde");
		return dataSourceBuilder.build();
	}
	
	@Bean
	public PhysicalNamingStrategy physicalNamingStrategy() {
		return new PhysicalNamingStrategyStandardImpl();
	}

}
