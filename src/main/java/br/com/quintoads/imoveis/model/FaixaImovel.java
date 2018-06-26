package br.com.quintoads.imoveis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "FaixaImovel")
public class FaixaImovel {

	@Id
	private String cdFaixa;

	@NotNull
	@Column(name = "nmFaixa")
	private String nmFaixa;

	@Column(name = "vlMinimo")
	private String vlMinimo;

	@Column(name = "vlMaximo")
	private String vlMaximo;


	public FaixaImovel() {}


	public String getCdFaixa() {
		return cdFaixa;
	}


	public void setCdFaixa(String cdFaixa) {
		this.cdFaixa = cdFaixa;
	}


	public String getNmFaixa() {
		return nmFaixa;
	}


	public void setNmFaixa(String nmFaixa) {
		this.nmFaixa = nmFaixa;
	}


	public String getVlMinimo() {
		return vlMinimo;
	}


	public void setVlMinimo(String vlMinimo) {
		this.vlMinimo = vlMinimo;
	}


	public String getVlMaximo() {
		return vlMaximo;
	}


	public void setVlMaximo(String vlMaximo) {
		this.vlMaximo = vlMaximo;
	}

}
