package br.com.tsm.siscontrans.dao;

import java.util.List;

import br.com.tsm.siscontrans.model.Funcionario;
import br.com.tsm.siscontrans.model.enums.SituacaoFuncionario;

public interface FuncionarioDAO {
	
	public List<Funcionario> findFuncionariosBySituacao(SituacaoFuncionario situacaoFuncionario);

}
