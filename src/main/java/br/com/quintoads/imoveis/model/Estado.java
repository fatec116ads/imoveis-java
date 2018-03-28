package br.com.quintoads.imoveis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "estado")
public class Estado {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long codEstado;

@NotNull
@Column(unique = true)
private String siglaEstado;

@NotNull
private String nomeEstado;

public Estado() {}
public Estado(String sigla) {
	this.siglaEstado = sigla;
}
public Estado(String sigla, String nome) {
	this.siglaEstado = sigla;
	this.nomeEstado = nome;	
}

public void setSiglaEstado(String sigla) {
	this.siglaEstado = sigla;
}
public String getSiglaEstado() {
	return this.siglaEstado;
}
public void setNomeEstado(String nome) {
	this.nomeEstado = nome;
}
public String getNomeEstado() {
	return this.nomeEstado;
}
}
