package br.com.quintoads.imoveis.service;

import java.util.List;

import br.com.quintoads.imoveis.model.FaixaImovel;

public interface FaixaImovelService {
	
	public FaixaImovel buscar(FaixaImovel faixaImovel);
	public void inserir(FaixaImovel faixaImovel);
	public void excluir(FaixaImovel faixaImovel);
	public void alterar(FaixaImovel faixaImovel);
	public List<FaixaImovel> listarTodos();
	public List<FaixaImovel> consultar (FaixaImovel faixaImovel);

}
