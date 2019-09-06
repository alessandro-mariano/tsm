package br.com.tsm.siscontrans.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.tsm.siscontrans.model.Veiculo;
import br.com.tsm.siscontrans.model.enums.SituacaoVeiculo;

@Service
public interface VeiculoService {
	
	public List<Veiculo> findVeiculosBySituacao(SituacaoVeiculo situacaoVeiculo);

}
