package com.itb.INF2AM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comercio/produtos")


public class LojaController {
	
	
	@GetMapping("/listar")
	public String listarProdutos() {
		System.out.println("LISTA DE PRODUTOS");
		
		return "produtos";
		
	}

}
