package br.com.tsm.siscontrans.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import br.com.tsm.siscontrans.model.enums.SituacaoPagamento;
import br.com.tsm.siscontrans.model.enums.TipoCombustivel;

public class Abastecimento implements Serializable {
	
	private static final long serialVersionUID = -5326860659630614105L;

	private Integer id;
	private Date data;
	private TipoCombustivel tipoCombustivel;
	private Integer quantidade;
	private String posto;
	private BigDecimal valor;
	private SituacaoPagamento situacaoPagamento;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public TipoCombustivel getTipoCombustivel() {
		return tipoCombustivel;
	}
	
	public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getPosto() {
		return posto;
	}
	
	public void setPosto(String posto) {
		this.posto = posto;
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public SituacaoPagamento getSituacaoPagamento() {
		return situacaoPagamento;
	}

	public void setSituacaoPagamento(SituacaoPagamento situacaoPagamento) {
		this.situacaoPagamento = situacaoPagamento;
	}
}
