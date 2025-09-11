package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entities.Comida;

//@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
        public Comida comida() {
                return new Comida(1, "Ejemplo", "Descripción de ejemplo", 20000, "/images/platos/hamburguesa.png");
        }

}