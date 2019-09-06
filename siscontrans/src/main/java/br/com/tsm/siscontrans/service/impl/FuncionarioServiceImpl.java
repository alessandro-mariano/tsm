package br.com.tsm.siscontrans.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tsm.siscontrans.dao.FuncionarioDAO;
import br.com.tsm.siscontrans.model.Funcionario;
import br.com.tsm.siscontrans.model.enums.SituacaoFuncionario;
import br.com.tsm.siscontrans.service.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService, Serializable {

	private static final long serialVersionUID = -4956162865791804212L;
	
	@Autowired
	private FuncionarioDAO funcionarioDAO;

	@Override
	public List<Funcionario> findFuncionariosBySituacao(SituacaoFuncionario situacaoFuncionario) {
		
		return funcionarioDAO.findFuncionariosBySituacao(situacaoFuncionario);
	}
}
