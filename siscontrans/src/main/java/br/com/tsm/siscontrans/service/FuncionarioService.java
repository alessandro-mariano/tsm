package br.com.tsm.siscontrans.service;

import java.util.List;

import br.com.tsm.siscontrans.model.Funcionario;
import br.com.tsm.siscontrans.model.enums.SituacaoFuncionario;

public interface FuncionarioService {
	
	public List<Funcionario> findFuncionariosBySituacao(SituacaoFuncionario situacaoFuncionario);

}
