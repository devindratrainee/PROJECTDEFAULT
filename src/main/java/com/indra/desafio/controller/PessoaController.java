package com.indra.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.indra.desafio.model.entity.Pessoa;
import com.indra.desafio.model.repository.PessoaRepository;

@Controller
public class PessoaController {
	@Autowired
	private PessoaRepository dao;

	@RequestMapping(method = RequestMethod.GET, value = "/check-in")
	public String cadastrarPessoa() {
		return "cadastrar_pessoa";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/save")
	public String salvarCadastro(Model model) {
		Pessoa pessoa = new Pessoa();
		model.addAttribute("pessoa", pessoa);
		dao.save(pessoa);
		return "redirect:/index";
	}
}