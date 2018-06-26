/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quintoads.imoveis.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Victor
 */
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "imovel")
public class Imovel {
    
    @Id
    private int cdImovel;
    
    @Column(name = "nome_endereco")
    private String nmEndereco;
    
    @Column(name = "nr_area_util")
    private float nrAreaUtil;
    
     @Column(name = "nr_area_total")
    private float nrAreaTotal;
     
    @Column(name = "preco")
    private float vlPreco;
    
     @Column(name = "st_vendido")
    private int stVendido;
     
     @Column(name = "data_lancto")
    private Date dataLancto;

    public Imovel(int cdImovel) {
        this.cdImovel = cdImovel;
    }

    public Imovel(int cdImovel, String nmEstado, float nrAreaUtil, float nrAreaTotal, float vlPreco, int stVendido, Date dataLancto) {
        this.cdImovel = cdImovel;
        this.nmEndereco = nmEstado;
        this.nrAreaUtil = nrAreaUtil;
        this.nrAreaTotal = nrAreaTotal;
        this.vlPreco = vlPreco;
        this.stVendido = stVendido;
        this.dataLancto = dataLancto;
    }

    public Imovel() {}
    
    public int getCdImovel() {
        return cdImovel;
    }

    public void setCdImovel(int cdImovel) {
        this.cdImovel = cdImovel;
    }

    public String getNmEndereco() {
        return nmEndereco;
    }

    public void setNmEndereco(String nmEndereco) {
        this.nmEndereco = nmEndereco;
    }

    public float getNrAreaUtil() {
        return nrAreaUtil;
    }

    public void setNrAreaUtil(float nrAreaUtil) {
        this.nrAreaUtil = nrAreaUtil;
    }

    public float getNrAreaTotal() {
        return nrAreaTotal;
    }

    public void setNrAreaTotal(float nrAreaTotal) {
        this.nrAreaTotal = nrAreaTotal;
    }

    public float getVlPreco() {
        return vlPreco;
    }

    public void setVlPreco(float vlPreco) {
        this.vlPreco = vlPreco;
    }

    public int getStVendido() {
        return stVendido;
    }

    public void setStVendido(int stVendido) {
        this.stVendido = stVendido;
    }

    public Date getDataLancto() {
        return dataLancto;
    }

    public void setDataLancto(Date dataLancto) {
        this.dataLancto = dataLancto;
    }
     
    
     
     
    
}
