package br.com.tsm.siscontrans.model;

import java.io.Serializable;

public class Origem implements Serializable {

	private static final long serialVersionUID = 2011641346120935527L;
	
	private Integer id;
	private String nome;
	private Integer distancia;
	
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

	public Integer getDistancia() {
		return distancia;
	}

	public void setDistancia(Integer distancia) {
		this.distancia = distancia;
	}
}
