package com.indra.desafio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	@RequestMapping(method=RequestMethod.GET, value="/")
	public String adIndex() {
		return "index";
	}
}