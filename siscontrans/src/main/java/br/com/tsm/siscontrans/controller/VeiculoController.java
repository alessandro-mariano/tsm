package br.com.tsm.siscontrans.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VeiculoController {
	
	@RequestMapping(value="/cadastro/veiculo", method=RequestMethod.GET)
	public ModelAndView veiculo() {
		
		ModelAndView model = new ModelAndView();
		model.setViewName("cadastro.veiculo");
		
		return model;
	}

}
