package br.com.tsm.siscontrans.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import br.com.tsm.siscontrans.model.enums.SituacaoPagamento;

public class Viagem implements Serializable {

	private static final long serialVersionUID = -9161451035968016594L;
	
	private Integer id;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date data;
	private Veiculo veiculo;
	private Funcionario funcionario;
	private String kmInicial;
	private Origem origem;
	private Destino destino;
	private String cte1;
	private String cte2;
	private String container1;
	private String container2;
	private List<Abastecimento> abastecimentos;
	private SituacaoPagamento situacaoPagamento;
	
	public Viagem() {
		
	}
	
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

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getKmInicial() {
		return kmInicial;
	}

	public void setKmInicial(String kmInicial) {
		this.kmInicial = kmInicial;
	}

	public Origem getOrigem() {
		return origem;
	}

	public void setOrigem(Origem origem) {
		this.origem = origem;
	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}

	public String getCte1() {
		return cte1;
	}

	public void setCte1(String cte1) {
		this.cte1 = cte1;
	}

	public String getCte2() {
		return cte2;
	}

	public void setCte2(String cte2) {
		this.cte2 = cte2;
	}

	public String getContainer1() {
		return container1;
	}

	public void setContainer1(String container1) {
		this.container1 = container1;
	}

	public String getContainer2() {
		return container2;
	}

	public void setContainer2(String container2) {
		this.container2 = container2;
	}

	public List<Abastecimento> getAbastecimentos() {
		return abastecimentos;
	}

	public void setAbastecimentos(List<Abastecimento> abastecimentos) {
		this.abastecimentos = abastecimentos;
	}

	public SituacaoPagamento getSituacaoPagamento() {
		return situacaoPagamento;
	}

	public void setSituacaoPagamento(SituacaoPagamento situacaoPagamento) {
		this.situacaoPagamento = situacaoPagamento;
	}
}
