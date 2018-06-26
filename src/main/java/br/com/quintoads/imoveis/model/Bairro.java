package br.com.quintoads.imoveis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "bairro")
public class Bairro {

@Id
private int codBairro;

@NotNull
@Column(name = "nmBairro")
private String nmBairro;

public Bairro() {}

public Bairro(int codBairro) {
	this.codBairro = codBairro;
}
public Bairro(int codBairro, String nmBairro) {
	this.codBairro = codBairro;
	this.nmBairro = nmBairro;
}

public void setCodBairro(int codBairro){
	this.codBairro = codBairro;
}
public int getCodBairro() {
	return this.codBairro;
}
public void setNmBairro(String nmBairro) {
	this.nmBairro = nmBairro;
}
public String getNmBairro() {
	return this.nmBairro;
}

@Override
public String toString() {
	return "[Codigo do Bairro ="+ this.codBairro + ", Nome Do Bairro ="+this.nmBairro+"]";
}

}
