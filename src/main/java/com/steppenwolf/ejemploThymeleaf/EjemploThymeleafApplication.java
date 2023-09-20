package com.steppenwolf.ejemploThymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.steppenwolf") //Se dice que agregue todos los controladores que encuentre en ese paquete
public class EjemploThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemploThymeleafApplication.class, args);
	}

}
