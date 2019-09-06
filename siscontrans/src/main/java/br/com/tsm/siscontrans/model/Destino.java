package br.com.tsm.siscontrans.model;

import java.io.Serializable;

public class Destino implements Serializable {

	private static final long serialVersionUID = -4933000149114216409L;
	
	private Integer id;
	private String nome;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
