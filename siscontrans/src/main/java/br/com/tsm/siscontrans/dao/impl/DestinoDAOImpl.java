package br.com.tsm.siscontrans.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.tsm.siscontrans.dao.DestinoDAO;
import br.com.tsm.siscontrans.model.Destino;

@Repository
public class DestinoDAOImpl implements DestinoDAO, Serializable {

	private static final long serialVersionUID = -1044009516985984508L;

	@Override
	public List<Destino> findDestinos() {

//		Destino destino1 = new Destino();
//		destino1.setId(1);
//		destino1.setNome("Guaruja - Santos Brasil");
//		
//		Destino destino2 = new Destino();
//		destino2.setId(1);
//		destino2.setNome("Cubatao - Patio");
//		
//		List<Destino> destinos = new ArrayList<Destino>();
//		destinos.add(destino1);
//		destinos.add(destino2);
		
		return null;
	}
}
