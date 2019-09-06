package br.com.tsm.siscontrans.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.tsm.siscontrans.dao.VeiculoDAO;
import br.com.tsm.siscontrans.model.Veiculo;
import br.com.tsm.siscontrans.model.enums.SituacaoVeiculo;

@Repository
public class VeiculoDAOImpl implements VeiculoDAO, Serializable {

	private static final long serialVersionUID = -346370742763783598L;

	@Override
	public List<Veiculo> findVeiculosBySituacao(SituacaoVeiculo situacaoVeiculo) {
		
		Veiculo veiculo1 = new Veiculo();
		veiculo1.setId(1);
		veiculo1.setMarca("Volvo");
		veiculo1.setModelo("FH 440");
		veiculo1.setPlaca("DBL-3247");
		veiculo1.setAnoFabricacao(2007);
		veiculo1.setAnoModelo(2007);
		veiculo1.setCor("Branco");
		
		Veiculo veiculo2 = new Veiculo();
		veiculo2.setId(1);
		veiculo2.setMarca("Mercedes Benz");
		veiculo2.setModelo("Axor 2544");
		veiculo2.setPlaca("CUA-1385");
		veiculo2.setAnoFabricacao(2009);
		veiculo2.setAnoModelo(2009);
		veiculo2.setCor("Preto");
		
		List<Veiculo> veiculos = new ArrayList<Veiculo>();
		veiculos.add(veiculo1);
		veiculos.add(veiculo2);
		
		return veiculos;
	}

}
