package br.com.tsm.siscontrans.model;

import java.io.Serializable;

import br.com.tsm.siscontrans.model.enums.SituacaoVeiculo;

public class Veiculo implements Serializable {

	private static final long serialVersionUID = -3278286495197279396L;

	private Integer id;
	private String marca;
	private String modelo;
	private Integer anoFabricacao;
	private Integer anoModelo;
	private String cor;
	private String placa;
	private String renavam;
	private String chassi;
	private String kilometragem;
	private SituacaoVeiculo situacaoVeiculo;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}
	
	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	public Integer getAnoModelo() {
		return anoModelo;
	}
	
	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getRenavam() {
		return renavam;
	}
	
	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}
	
	public String getChassi() {
		return chassi;
	}
	
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getKilometragem() {
		return kilometragem;
	}

	public void setKilometragem(String kilometragem) {
		this.kilometragem = kilometragem;
	}

	public SituacaoVeiculo getSituacaoVeiculo() {
		return situacaoVeiculo;
	}

	public void setSituacaoVeiculo(SituacaoVeiculo situacaoVeiculo) {
		this.situacaoVeiculo = situacaoVeiculo;
	}
}
