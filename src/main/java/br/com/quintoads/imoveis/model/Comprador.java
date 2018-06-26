package br.com.quintoads.imoveis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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

@Column(name = "nmEndereco")
private String nmEndereco;

@Column(name = "nrCpfComprador")
private String nrCpfComprador;

@Column(name = "telComprador")
private String telComprador;


public int getCdComprador() {
	return cdComprador;
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

public Comprador() {}

@Override
public String toString() {
	return "[codigo="+ this.cdComprador + ", nome="+this.nmComprador+"]";
}





}
