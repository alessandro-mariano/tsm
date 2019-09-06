package br.com.tsm.siscontrans.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.tsm.siscontrans.dao.FuncionarioDAO;
import br.com.tsm.siscontrans.model.Funcionario;
import br.com.tsm.siscontrans.model.enums.SituacaoFuncionario;

@Repository
public class FuncionarioDAOImpl implements FuncionarioDAO, Serializable {

	private static final long serialVersionUID = -346370742763783598L;

	@Override
	public List<Funcionario> findFuncionariosBySituacao(SituacaoFuncionario situacaoFuncionario) {
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setId(1);
		funcionario1.setNome("M�rio Carlos Davi");
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setId(2);
		funcionario2.setNome("Israel Am�rico dos Santos");
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(funcionario1);
		funcionarios.add(funcionario2);
		
		return funcionarios;
	}
}
