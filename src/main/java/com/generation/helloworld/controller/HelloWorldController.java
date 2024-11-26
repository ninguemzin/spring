package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!!!";
	}

	@GetMapping("/BSM")
	public String bSM() {
		return """
				Mentalidade
				- Orientação ao futuro
				- Persistência
				- Responsabilidade Pessoal
				- Mentabilidade de Crescimento

				# Competências comportamentais:

				- Comunicação
				- Proatividade
				- Orientação ao Detalhe
				- Trabalho em equipe
								""";
	}
	
	@GetMapping("/objetivosDaSemana")
	public String objetivosDaSemana() {
		return """
				Aprendizados 
				Spring
				Estrututa
				Desenvolvimento Web
				Banco de dados
				Mysql
								""";
	}


}