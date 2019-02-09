package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/promocao")
public class PromocaoController {
	
	

	@GetMapping("/add")
	public String abrirCadastro() {
		return "/promocao/add";
	}
}
