package br.com.tsm.siscontrans.dao;

import java.util.List;

import br.com.tsm.siscontrans.model.Veiculo;
import br.com.tsm.siscontrans.model.enums.SituacaoVeiculo;

public interface VeiculoDAO {
	
	public List<Veiculo> findVeiculosBySituacao(SituacaoVeiculo situacaoVeiculo);

}
