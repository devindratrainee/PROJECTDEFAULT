package com.indra.desafio.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class PessoaController {
	
	@RequestMapping(method=RequestMethod.GET, value="/check-in")
	public String cadastrarPessoa() {
		return "cadastrar_pessoa";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/check-in-dep")
	public String cadastrarPessoaDep() {
		return "cadastrar_dependente";
	}
	
	
}