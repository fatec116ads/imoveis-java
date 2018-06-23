<<<<<<< HEAD
package br.com.quintoads.imoveis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "cidade")
public class Cidade {

@Id
private String cdCidade;

@NotNull
@Column(name = "nome_cidade")
private String nmCidade;

public Cidade() {}

public Cidade(String cdCidade) {
	this.cdCidade = cdCidade;
}
public Cidade(String cdCidade, String cidade) {
	this.cdCidade = cdCidade;
	this.nmCidade = cidade;
}

public void cdCidade(String cdCidade){
	this.cdCidade = cdCidade;
}
public String getcdCidade() {
	return this.cdCidade;
}
public void setnmCidade(String cidade) {
	this.nmCidade = cidade;
}
public String getnmCidade() {
	return this.nmCidade;
}

@Override
public String toString() {
	return "[cd="+ this.cdCidade + ", nm="+this.nmCidade+"]";
}

=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quintoads.imoveis.model;

/**
 *
 * @author DEV_UNITED
 */
public class Cidade {
    
>>>>>>> 0b20804... Commit TbImovel
}
