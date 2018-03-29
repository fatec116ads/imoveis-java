package br.com.quintoads.imoveis.service;

import java.util.List;

import br.com.quintoads.imoveis.model.Estado;

public interface EstadoService {
	
	public Estado buscar(Estado estado);
	public void inserir(Estado estado);
	public void excluir(Estado estado);
	public void alterar(Estado estado);
	public List<Estado> listarTodos();
	public List<Estado> consultar (Estado estado);

}
