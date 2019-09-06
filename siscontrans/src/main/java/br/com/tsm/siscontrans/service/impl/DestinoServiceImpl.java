package br.com.tsm.siscontrans.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tsm.siscontrans.dao.DestinoDAO;
import br.com.tsm.siscontrans.model.Destino;
import br.com.tsm.siscontrans.service.DestinoService;

@Service
public class DestinoServiceImpl implements DestinoService, Serializable {
	
	private static final long serialVersionUID = 3626602662397186898L;

	@Autowired
	private DestinoDAO destinoDAO;

	@Override
	public List<Destino> findDestinos() {
		
		return destinoDAO.findDestinos();
	}
}
