package com.viagen.gerador_viagen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class GeradorViagenApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeradorViagenApplication.class, args);
	}

	@GetMapping("/recomendar")
	public String getMethodName(@RequestParam String clima, @RequestParam String estilo) {

		String[][] cidades = {{"Tóquio","Rio de Janeiro"},{"Paris","Noruega"}};

		int v1;
		int v2;

		switch (clima) {
			case "calor" -> v1 = 0;
			case "frio" -> v1 = 1;
			default -> throw new AssertionError();
		}

		switch (estilo) {
			case "urbano" -> v2 = 0;
			case "natureza" -> v2 = 1;
			default -> throw new AssertionError();
		}

		String recomendacao = cidades[v1][v2];

		return recomendacao;
	}
	

}
