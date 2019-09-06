package br.com.tsm.siscontrans.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.tsm.siscontrans.model.Abastecimento;
import br.com.tsm.siscontrans.model.Viagem;
import br.com.tsm.siscontrans.model.enums.SituacaoFuncionario;
import br.com.tsm.siscontrans.model.enums.SituacaoVeiculo;
import br.com.tsm.siscontrans.model.enums.TipoCombustivel;
import br.com.tsm.siscontrans.service.DestinoService;
import br.com.tsm.siscontrans.service.FuncionarioService;
import br.com.tsm.siscontrans.service.OrigemService;
import br.com.tsm.siscontrans.service.VeiculoService;

@Controller
public class ViagemController {
	
	private final Logger logger = Logger.getLogger(ViagemController.class);
	
	@Autowired
	private VeiculoService veiculoService;
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	@Autowired
	private OrigemService origemService;
	
	//@Autowired
	//private DestinoService destinoService;
	
	@RequestMapping(value="/cadastro/viagem", method=RequestMethod.GET)
    public ModelAndView viewViagem() {
		
		logger.debug("viagem()");
		
		Abastecimento abastecimento1 = new Abastecimento();
		abastecimento1.setId(1);
		abastecimento1.setData(new Date());
		abastecimento1.setTipoCombustivel(TipoCombustivel.DIESEL);
		abastecimento1.setQuantidade(550);
		abastecimento1.setPosto("Posto Monte Santo");
		
		Abastecimento abastecimento2 = new Abastecimento();
		abastecimento2.setId(2);
		abastecimento2.setData(new Date());
		abastecimento2.setTipoCombustivel(TipoCombustivel.ARLA);
		abastecimento2.setQuantidade(30);
		abastecimento2.setPosto("Posto Monte Santo");
		
		Abastecimento abastecimento3 = new Abastecimento();
		abastecimento3.setId(3);
		abastecimento3.setData(new Date());
		abastecimento3.setTipoCombustivel(TipoCombustivel.DIESEL);
		abastecimento3.setQuantidade(300);
		abastecimento3.setPosto("Posto Minas Gerais");
		
		List<Abastecimento> abastecimentos = new ArrayList<Abastecimento>();
		abastecimentos.add(abastecimento1);
		abastecimentos.add(abastecimento2);
		abastecimentos.add(abastecimento3);
		
		Viagem viagem = new Viagem();
		viagem.setAbastecimentos(abastecimentos);
        
		ModelAndView model = new ModelAndView();
        model.addObject("viagem", viagem);
        model.addObject("veiculos", veiculoService.findVeiculosBySituacao(SituacaoVeiculo.ATIVO));
        model.addObject("funcionarios", funcionarioService.findFuncionariosBySituacao(SituacaoFuncionario.ATIVO));
        model.addObject("origens", origemService.findOrigens());
        model.addObject("destinos", null);///destinoService.findDestinos());
        
        model.setViewName("cadastro.viagem");
        
        return model;
    }
	
	@RequestMapping(value="/cadastro/viagem", method=RequestMethod.POST)
    public ModelAndView saveOrUpdateViagem(@ModelAttribute Viagem viagem, @ModelAttribute List<Abastecimento>abastecimentos) {
		
		logger.debug("saveOrUpdateViagem()");
		
		ModelAndView model = new ModelAndView();
		model.addObject("msg", "Viagem cadastrada com sucesso.");
		
		model.setViewName("cadastro.viagem");
         
        return model;
    }
}
