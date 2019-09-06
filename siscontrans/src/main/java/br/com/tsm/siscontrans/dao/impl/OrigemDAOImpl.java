package br.com.tsm.siscontrans.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.tsm.siscontrans.dao.OrigemDAO;
import br.com.tsm.siscontrans.model.Origem;

@Repository
public class OrigemDAOImpl implements OrigemDAO, Serializable {

	private static final long serialVersionUID = -4573624052100516060L;

	@Override
	public List<Origem> findOrigens() {
		
		Origem origem1 = new Origem();
		origem1.setId(1);
		origem1.setNome("Guaxup�");
		
		Origem origem2 = new Origem();
		origem2.setId(2);
		origem2.setNome("S�o Sebasti�o do Paraiso");
		
		Origem origem3 = new Origem();
		origem3.setId(3);
		origem3.setNome("Varginha");
		
		List<Origem> origens = new ArrayList<Origem>();
		origens.add(origem1);
		origens.add(origem3);
		
		return origens;
	}
}
