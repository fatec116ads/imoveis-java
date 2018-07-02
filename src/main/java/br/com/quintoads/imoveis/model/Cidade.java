
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
@Table(name = "cidade")
public class Cidade {

@Id
private int cdCidade;

@NotNull
@Column(name = "nome_cidade")
private String nmCidade;

@ManyToOne
@JoinColumn(name = "uf_Estado")
private Estado estado;

public Cidade() {}

public Cidade(int cdCidade) {
	this.cdCidade = cdCidade;
}

public Cidade(int cdCidade, @NotNull String nmCidade, Estado estado) {
	this.cdCidade = cdCidade;
	this.nmCidade = nmCidade;
	this.estado = estado;
}

public void setCdCidade(int cdCidade){
	this.cdCidade = cdCidade;
}
public int getCdCidade() {
	return this.cdCidade;
}
public void setnmCidade(String cidade) {
	this.nmCidade = cidade;
}
public String getnmCidade() {
	return this.nmCidade;
}

public Estado getEstado() {
	return this.estado;
}

public void setEstado(Estado estado) {
	this.estado = estado;
}

@Override
public String toString() {
	return "{cdCidade:" + cdCidade + ",\n nmCidade:" + nmCidade + ",\n estado:" + estado.toString() + " }";
}



}
