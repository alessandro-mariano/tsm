package br.com.tsm.siscontrans.model;

import java.io.Serializable;
import java.util.Date;

import br.com.tsm.siscontrans.model.enums.SituacaoFuncionario;

public class Funcionario implements Serializable {

	private static final long serialVersionUID = -1789456694711641783L;
	
	private Integer id;
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	private String celular;
	private Date dataNascimento;
	private Date dataAdmissao;
	private Date dataDemissao;
	private Endereco endereco;
	private ContaCorrente contaCorrente;
	private SituacaoFuncionario situacaoFuncionario;
	
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
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getCelular() {
		return celular;
	}
	
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public Date getDataDemissao() {
		return dataDemissao;
	}
	
	public void setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public ContaCorrente getContaCorrente() {
		return contaCorrente;
	}
	
	public void setContaCorrente(ContaCorrente contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
	
	public SituacaoFuncionario getSituacaoFuncionario() {
		return situacaoFuncionario;
	}
	
	public void setSituacaoFuncionario(SituacaoFuncionario situacaoFuncionario) {
		this.situacaoFuncionario = situacaoFuncionario;
	}
}
