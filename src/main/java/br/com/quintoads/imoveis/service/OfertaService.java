package br.com.quintoads.imoveis.service;

import java.util.List;

import br.com.quintoads.imoveis.model.Oferta;

public interface OfertaService {
	
	public Oferta buscar(Oferta oferta);
	public void inserir(Oferta oferta);
	public void excluir(Oferta oferta);
	public void alterar(Oferta oferta);
	public List<Oferta> listarTodos();
	public List<Oferta> consultar (Oferta oferta);

}
