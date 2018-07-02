package br.com.quintoads.imoveis.service;

import java.util.List;

import br.com.quintoads.imoveis.model.Cidade;

public interface CidadeService {
	
	public Cidade buscar(Cidade cidade);
	public void inserir(Cidade cidade);
	public void excluir(Cidade cidade);
	public void alterar(Cidade cidade);
	public List<Cidade> listarTodos();
	public List<Cidade> consultar (Cidade cidade);
	public List<Cidade> consultarUf (Cidade cidade);

}
