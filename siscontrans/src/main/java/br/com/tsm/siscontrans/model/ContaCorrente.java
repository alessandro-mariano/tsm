package br.com.tsm.siscontrans.model;

import java.io.Serializable;

public class ContaCorrente implements Serializable {

	private static final long serialVersionUID = 1558733788791022249L;
	
	private Integer id;
	private Banco banco;
	private String agencia;
	private String operacao;
	private String contaCorrente;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Banco getBanco() {
		return banco;
	}
	
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public String getOperacao() {
		return operacao;
	}
	
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	
	public String getContaCorrente() {
		return contaCorrente;
	}
	
	public void setContaCorrente(String contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
}
