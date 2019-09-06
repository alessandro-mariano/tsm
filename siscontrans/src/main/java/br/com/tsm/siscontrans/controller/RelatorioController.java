package br.com.tsm.siscontrans.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RelatorioController {
	
	@RequestMapping(value="/relatorio/viagem", method=RequestMethod.GET)
	public ModelAndView relatorioViagem() {
		
		ModelAndView model = new ModelAndView();
		model.setViewName("relatorio.viagem");
		
		return model;
	}
	
	@RequestMapping(value="/relatorio/pagamento", method=RequestMethod.GET)
	public ModelAndView relatorioPagamento() {
		
		ModelAndView model = new ModelAndView();
		model.setViewName("relatorio.pagamento");
		
		return model;
	}

}
