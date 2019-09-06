package br.com.tsm.siscontrans.model;

import java.io.Serializable;

public class Banco implements Serializable {

	private static final long serialVersionUID = -4491907788183538812L;

	private Integer id;
	private String numero;
	private String nome;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
