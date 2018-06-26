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

public void setCdFaixa(String cdFaixa){
	this.cdFaixa = cdFaixa;
}
public String getcdFaixa() {
	return this.cdFaixa;
}
public void setNmFaixa(String nmFaixa) {
	this.nmFaixa = nmFaixa;
}

public void setVlMinimo(String vlMinimo) {
	this.vlMinimo = vlMinimo;
}
public void setVlMaximo(String vlMaximo) {
	this.vlMaximo = vlMaximo;
}


public String getCdFaixa() {
	return this.cdFaixa;
}


public String getNmFaixa() {
	return this.nmFaixa;
}

public String getVlMinimo() {
	return this.vlMinimo;
}

public String getVlMaximo() {
	return this.vlMaximo;
}


@Override
public String toString() {
	return "[Codigo Faixa ="+ this.cdFaixa + ", Nome Faixa="+this.nmFaixa+" , Valor Minimo="+this.vlMinimo+", Valor Maximo="+this.vlMaximo+" ]";
}

}
