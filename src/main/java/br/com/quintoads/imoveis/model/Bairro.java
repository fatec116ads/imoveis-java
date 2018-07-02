package br.com.quintoads.imoveis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "bairro")
public class Bairro {

@Id
private int cdBairro;

@NotNull
@Column(name = "nmBairro")
private String nmBairro;

@ManyToOne
@JoinColumn(name = "cdCidade")
private Cidade cidade;

public Bairro() {}

public Bairro(int cdBairro, @NotNull String nmBairro, Cidade cidade) {
	this.cdBairro = cdBairro;
	this.nmBairro = nmBairro;
	this.cidade = cidade;
}


public void setCdBairro(int cdBairro){
	this.cdBairro = cdBairro;
}
public int getCdBairro() {
	return this.cdBairro;
}
public void setNmBairro(String nmBairro) {
	this.nmBairro = nmBairro;
}
public String getNmBairro() {
	return this.nmBairro;
}

public Cidade getCidade() {
	return this.cidade;
}

public void setCidade(Cidade cidade) {
	this.cidade = cidade;
}

@Override
public String toString() {
	return "{cdBairro:" + cdBairro + ",\n nmBairro:" + nmBairro + ",\n cidade:" + cidade.toString() + " }";
}



}
