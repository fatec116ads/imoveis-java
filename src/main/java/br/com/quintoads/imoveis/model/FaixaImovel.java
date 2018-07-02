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
private Integer cdFaixa;

@NotNull
@Column(name = "nmFaixa")
private String nmFaixa;

@Column(name = "vlMinimo")
private float vlMinimo;

@Column(name = "vlMaximo")
private float vlMaximo;


public FaixaImovel() {}


public FaixaImovel(Integer cdFaixa, String nmFaixa, float vlMinimo, float vlMaximo) {
	this.cdFaixa = cdFaixa;
	this.nmFaixa = nmFaixa;
	this.vlMinimo = vlMinimo;
	this.vlMaximo = vlMaximo;
}



public Integer getCdFaixa() {
	return cdFaixa;
}



public void setCdFaixa(Integer cdFaixa) {
	this.cdFaixa = cdFaixa;
}



public String getNmFaixa() {
	return nmFaixa;
}



public void setNmFaixa(String nmFaixa) {
	this.nmFaixa = nmFaixa;
}



public float getVlMinimo() {
	return vlMinimo;
}



public void setVlMinimo(float vlMinimo) {
	this.vlMinimo = vlMinimo;
}



public float getVlMaximo() {
	return vlMaximo;
}



public void setVlMaximo(float vlMaximo) {
	this.vlMaximo = vlMaximo;
}


@Override
public String toString() {
	return "{ cdFaixa:" + cdFaixa + ",\n nmFaixa:" + nmFaixa + ",\n vlMinimo:" + vlMinimo + ",\n vlMaximo:" + vlMaximo	+ " }";
}

}
