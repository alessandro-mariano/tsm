package br.com.tsm.siscontrans.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tsm.siscontrans.dao.VeiculoDAO;
import br.com.tsm.siscontrans.model.Veiculo;
import br.com.tsm.siscontrans.model.enums.SituacaoVeiculo;
import br.com.tsm.siscontrans.service.VeiculoService;

@Service
public class VeiculoServiceImpl implements VeiculoService, Serializable {

	private static final long serialVersionUID = -4956162865791804212L;
	
	@Autowired
	private VeiculoDAO veiculoDAO;

	@Override
	public List<Veiculo> findVeiculosBySituacao(SituacaoVeiculo situacaoVeiculo) {
		
		return veiculoDAO.findVeiculosBySituacao(situacaoVeiculo);
	}
}
