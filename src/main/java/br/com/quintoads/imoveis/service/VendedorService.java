package br.com.quintoads.imoveis.service;

import java.util.List;

import br.com.quintoads.imoveis.model.Vendedor;

public interface VendedorService {
	
	public Vendedor buscar(Vendedor vendedor);
	public void inserir(Vendedor vendedor);
	public void excluir(Vendedor vendedor);
	public void alterar(Vendedor vendedor);
	public List<Vendedor> listarTodos();
	public List<Vendedor> consultar (Vendedor vendedor);

}
