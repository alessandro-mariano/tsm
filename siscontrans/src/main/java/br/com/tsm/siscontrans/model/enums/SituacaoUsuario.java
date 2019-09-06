package br.com.tsm.siscontrans.model.enums;

import java.io.Serializable;

public enum SituacaoUsuario implements Serializable {

	ATIVO(1, "Ativo"),
	INATIVO(2, "Inativo"),
	BLOQUEADO(3, "Bloqueado");
	
	SituacaoUsuario(Integer id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	
	private Integer id;
	private String descricao;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
