package br.com.tsm.siscontrans.model;

import java.io.Serializable;
import java.util.Date;

import br.com.tsm.siscontrans.model.enums.SituacaoUsuario;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 3838083721832517285L;
	
	private Integer id;
	private String login;
	private String senha;
	private String nome;
	private Date dataCriacao;
	private Date dataUltimoAcesso;
	private SituacaoUsuario situacaoUsuario;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataCriacao() {
		return dataCriacao;
	}
	
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	public Date getDataUltimoAcesso() {
		return dataUltimoAcesso;
	}
	
	public void setDataUltimoAcesso(Date dataUltimoAcesso) {
		this.dataUltimoAcesso = dataUltimoAcesso;
	}
	
	public SituacaoUsuario getSituacaoUsuario() {
		return situacaoUsuario;
	}
	
	public void setSituacaoUsuario(SituacaoUsuario situacaoUsuario) {
		this.situacaoUsuario = situacaoUsuario;
	}
}
