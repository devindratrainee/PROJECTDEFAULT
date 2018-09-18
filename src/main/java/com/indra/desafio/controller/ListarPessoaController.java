package com.indra.desafio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ListarPessoaController {
	
	@RequestMapping(method=RequestMethod.GET, value="/listar")
	public String listarHospedes() {
		return "listar_hospedes";
	}
}