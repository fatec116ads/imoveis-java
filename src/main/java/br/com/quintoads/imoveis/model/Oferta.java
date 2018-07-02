/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quintoads.imoveis.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author vjunior
 */
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "oferta")
public class Oferta {

    @Id
    private int cdOferta;
    
    @NotNull 
    private float vlOferta;
    
    @NotNull
    private Date dtOferta;
    
    @ManyToOne
    @JoinColumn(name = "cdComprador")
    private Comprador comprador;
    
    @ManyToOne
    @JoinColumn(name = "cdImovel")
    private Imovel imovel;
    
    public Oferta() {
    }
        
	public Oferta(int cdOferta, float vlOferta, Date dtOferta, Comprador comprador, Imovel imovel) {
		this.cdOferta = cdOferta;
		this.vlOferta = vlOferta;
		this.dtOferta = dtOferta;
		this.comprador = comprador;
		this.imovel = imovel;
	}

	public int getCdOferta() {
		return cdOferta;
	}

	public void setCdOferta(int cdOferta) {
		this.cdOferta = cdOferta;
	}

	public float getVlOferta() {
		return vlOferta;
	}

	public void setVlOferta(float vlOferta) {
		this.vlOferta = vlOferta;
	}

	public Date getDtOferta() {
		return dtOferta;
	}

	public void setDtOferta(Date dtOferta) {
		this.dtOferta = dtOferta;
	}

	public Comprador getComprador() {
		return comprador;
	}

	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	@Override
	public String toString() {
		return "{cdOferta:" + cdOferta + ",\n vlOferta:" + vlOferta + ",\n dtOferta:" + dtOferta + ",\n comprador:"
				+ comprador.toString() + ",\n imovel:" + imovel.toString() + " }";
	}

    
}