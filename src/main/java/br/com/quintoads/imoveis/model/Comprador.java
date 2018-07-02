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
@Table(name = "comprador")
public class Comprador {

@Id
private int cdComprador;

@NotNull
@Column(name = "nmComprador")
private String nmComprador;

@ManyToOne
@JoinColumn(name = "cdBairro")
private Bairro bairro;

@Column(name = "nmEndereco")
private String nmEndereco;

@Column(name = "nrCpfComprador")
private String nrCpfComprador;

@Column(name = "telComprador")
private String telComprador;

public Comprador() {}


public int getCdComprador() {
	return cdComprador;
}

public Comprador(int cdComprador, @NotNull String nmComprador, Bairro bairro, String nmEndereco, String nrCpfComprador,
		String telComprador) {
	this.cdComprador = cdComprador;
	this.nmComprador = nmComprador;
	this.bairro = bairro;
	this.nmEndereco = nmEndereco;
	this.nrCpfComprador = nrCpfComprador;
	this.telComprador = telComprador;
}


public void setCdComprador(int cdComprador) {
	this.cdComprador = cdComprador;
}

public String getNmComprador() {
	return nmComprador;
}

public void setNmComprador(String nmComprador) {
	this.nmComprador = nmComprador;
}

public String getNmEndereco() {
	return nmEndereco;
}

public void setNmEndereco(String nmEndereco) {
	this.nmEndereco = nmEndereco;
}

public String getNrCpfComprador() {
	return nrCpfComprador;
}

public void setNrCpfComprador(String nrCpfComprador) {
	this.nrCpfComprador = nrCpfComprador;
}

public String getTelComprador() {
	return telComprador;
}

public void setTelComprador(String telComprador) {
	this.telComprador = telComprador;
}

public Bairro getBairro() {
	return this.bairro;
}

public void setBairro(Bairro bairro) {
	this.bairro = bairro;
}


@Override
public String toString() {
	return "{cdComprador:" + cdComprador + ",\n nmComprador:" + nmComprador + ",\n bairro:" + bairro.toString() + ",\n nmEndereco:"
			+ nmEndereco + ",\n nrCpfComprador:" + nrCpfComprador + ",\n telComprador:" + telComprador + " }";
}




}
