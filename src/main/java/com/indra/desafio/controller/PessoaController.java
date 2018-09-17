package com.indra.desafio.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.indra.desafio.model.entity.Pessoa;
import com.indra.desafio.model.repository.PessoaRepository;

@Controller
public class PessoaController {
	@Autowired
	private PessoaRepository dao;
	
	@RequestMapping(method=RequestMethod.GET, value="/check-in")
	public String cadastrarPessoa() {
		return "cadastrar_pessoa";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/save")
	public String savePessoa(@Valid Pessoa pessoa, BindingResult bs, RedirectAttributes attr) {
		if(bs.hasErrors()) {
			attr.addFlashAttribute("message", "Check-in não realizado, tente novamente");
			return "/cadastrar_pessoa";
		}
		
		dao.save(pessoa);
		attr.addFlashAttribute("message", "Check-in realizado com sucesso!");
		return cadastrarPessoa();
	}
}