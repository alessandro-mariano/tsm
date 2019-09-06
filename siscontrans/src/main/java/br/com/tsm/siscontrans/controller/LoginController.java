package br.com.tsm.siscontrans.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.tsm.siscontrans.service.UsuarioService;

@Controller
public class LoginController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value={"/","/login"}, method=RequestMethod.GET)
	public ModelAndView login(@RequestParam(value="error", required=false) String error, @RequestParam(value="logout", required=false) String logout) {
		
		ModelAndView model = new ModelAndView();
		
		if (error != null) {
			model.addObject("error", "Usuário e/ou Senha inválidos!");
		}
		
		if (logout != null) {
			model.addObject("msg", "Você foi desconectado com sucesso!");
		}
		model.setViewName("login");
		
		return model;
	}
	
	@RequestMapping(value="/dashboard", method=RequestMethod.GET)
	public ModelAndView dashboard() {
		
		ModelAndView model = new ModelAndView();
		model.addObject("usuario", usuarioService.findUsuarioByLogin("alessandro"));
		model.setViewName("dashboard");
		
		return model;
	}
}
