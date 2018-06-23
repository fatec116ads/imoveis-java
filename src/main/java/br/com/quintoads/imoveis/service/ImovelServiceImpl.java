/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quintoads.imoveis.service;

import br.com.quintoads.imoveis.dao.ImovelDao;
import br.com.quintoads.imoveis.model.Imovel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DEV_UNITED
 */
@Service
public class ImovelServiceImpl implements ImovelService {
    
    @Autowired
    private ImovelDao imovel;

    @Override
    public Imovel buscar(Imovel imovel) {
       return this.imovel.getOne(imovel.getCdImovel()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inserir(Imovel imovel) {
        this.imovel.save(imovel); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Imovel imovel) {
        this.imovel.deleteById(imovel.getCdImovel()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Imovel imovel) {
        this.imovel.save(imovel); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Imovel> listarTodos() {
        return this.imovel.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Imovel> consultar(Imovel imovel) {
        return this.imovel.findByNomeImovel(imovel.getNmEndereco()); //To change body of generated methods, choose Tools | Templates.
    }
    
}
