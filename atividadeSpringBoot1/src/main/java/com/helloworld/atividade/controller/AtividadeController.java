package com.helloworld.atividade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtividadeController {

	@GetMapping("/atividade1")
	public String Atividade1() {
		return "Habilidades e mentalidades utilizadas: Atenção aos detalhes, Persistência e Mentalidade de Crescimento." ;
	}
	
	@GetMapping("/atividade2")
	public String Atividade2() {
		return "Objetivos de aprendizagem: Conhecimentos básicos em MySQL, SpringBoot.";
	}
}
