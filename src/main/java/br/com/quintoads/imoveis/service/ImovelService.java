/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quintoads.imoveis.service;


import br.com.quintoads.imoveis.model.Imovel;
import java.util.List;

/**
 *
 * @author DEV_UNITED
 */
public interface ImovelService {
	
	public Imovel buscar(Imovel imovel);
	public void inserir(Imovel imovel);
	public void excluir(Imovel imovel);
	public void alterar(Imovel imovel);
	public List<Imovel> listarTodos();
	public List<Imovel> consultar (Imovel imovel);

}
