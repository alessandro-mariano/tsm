package br.com.tsm.siscontrans.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tsm.siscontrans.dao.OrigemDAO;
import br.com.tsm.siscontrans.model.Origem;
import br.com.tsm.siscontrans.service.OrigemService;

@Service
public class OrigemServiceImpl implements OrigemService, Serializable {

	private static final long serialVersionUID = 5723598444186481866L;

	@Autowired
	private OrigemDAO origemDAO;

	@Override
	public List<Origem> findOrigens() {
		
		return origemDAO.findOrigens();
	}
}
