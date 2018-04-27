package br.com.quintoads.imoveis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "estado")
public class Estado {

@Id
private String uf;

@NotNull
@Column(name = "nome_Estado")
private String nomeEstado;

public Estado() {}

public Estado(String uf) {
	this.uf = uf;
}
public Estado(String uf, String nome) {
	this.uf = uf;
	this.nomeEstado = nome;
}

public void setUf(String uf){
	this.uf = uf;
}
public String getUf() {
	return this.uf;
}
public void setNomeEstado(String estado) {
	this.nomeEstado = estado;
}
public String getNomeEstado() {
	return this.nomeEstado;
}

@Override
public String toString() {
	return "[uf="+ this.uf + ", nome="+this.nomeEstado+"]";
}

}
