package br.com.tsm.siscontrans.model.enums;

import java.io.Serializable;

public enum TipoCombustivel implements Serializable {

	ARLA(1, "Arla"),
	DIESEL(2, "Diesel");
	
	TipoCombustivel(Integer id, String descricao) {
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
