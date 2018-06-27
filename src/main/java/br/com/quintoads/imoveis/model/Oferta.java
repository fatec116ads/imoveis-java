/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quintoads.imoveis.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author vjunior
 */
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "oferta")
public class Oferta implements Serializable{

    @Id
    private int cdOferta;
    
    @NotNull 
    private float vlOferta;
    
    @NotNull
    private Date dtOferta; 
    
    public Oferta() {
    }

    public Oferta(int cdOferta, float vlOferta, Date dtOferta) {
        this.cdOferta = cdOferta;
        this.vlOferta = vlOferta;
        this.dtOferta = dtOferta;
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
    
    @Override
    public String toString() {
        return new StringBuilder()
                .append("[cdOferta=").append(this.cdOferta)
                .append(", vlOferta=").append(this.vlOferta)
                .append(", dtOferta=").append(this.dtOferta.toString())
                .append("]").toString();
    }

}