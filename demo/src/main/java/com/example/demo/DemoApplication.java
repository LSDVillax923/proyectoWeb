package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public Comida comida() {
		return new Comida(1, "Ejemplo", "Descripción de ejemplo", 9.99, "http://example.com/imagen.jpg");
	}

}

