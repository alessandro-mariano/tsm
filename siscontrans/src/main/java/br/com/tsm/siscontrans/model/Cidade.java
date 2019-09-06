package br.com.tsm.siscontrans.model;

import java.io.Serializable;

public class Cidade implements Serializable {

	private static final long serialVersionUID = -6222519297543193643L;

	private Integer id;
	private String nome;
	private Estado estado;
		
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
	
	public Estado getEstado() {
		return estado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
