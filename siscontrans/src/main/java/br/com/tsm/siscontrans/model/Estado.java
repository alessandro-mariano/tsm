package br.com.tsm.siscontrans.model;

import java.io.Serializable;

public class Estado implements Serializable {

	private static final long serialVersionUID = 5074252908735021451L;

	private Integer id;
	private String sigla;
	private String nome;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
