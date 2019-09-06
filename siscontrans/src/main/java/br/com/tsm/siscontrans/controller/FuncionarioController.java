package br.com.tsm.siscontrans.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FuncionarioController {
	
	@RequestMapping(value="/cadastro/funcionario", method=RequestMethod.GET)
	public ModelAndView funcionario() {
		
		ModelAndView model = new ModelAndView();
		model.setViewName("cadastro.funcionario");
		
		return model;
	}

}
