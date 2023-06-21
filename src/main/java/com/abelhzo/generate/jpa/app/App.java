package com.abelhzo.generate.jpa.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: Abel HZO
 * @project: springboot-generate-jpa
 * @file: App.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Viernes 16 Junio 2023, 22:07:43.
 * @description: El presente archivo App.java fue creado por Abel HZO.
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.abelhzo.generate.jpa" })
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
