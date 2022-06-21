package com.cursoimersao.projetocursodioimersaospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoCursoDioImersaospringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoCursoDioImersaospringbootApplication.class, args);

		// Calculadora calculadora = new Calculadora(); -> com o uso de spring boot, esses mecanismos são desnecessários pois a inversão de controle ocorre com o gerenciamento dos beans. Portanto não há a necessidade da explicitação da instanciação.
	}

}
