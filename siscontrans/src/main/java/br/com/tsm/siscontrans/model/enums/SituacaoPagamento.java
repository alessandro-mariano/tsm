package br.com.tsm.siscontrans.model.enums;

import java.io.Serializable;

public enum SituacaoPagamento implements Serializable {

	NAO_PAGO(1, "Não Pago"),
	PAGO(2, "Pago");
	
	SituacaoPagamento(Integer id, String descricao) {
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
