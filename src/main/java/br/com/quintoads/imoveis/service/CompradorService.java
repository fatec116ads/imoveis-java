package br.com.quintoads.imoveis.service;

import java.util.List;
import br.com.quintoads.imoveis.model.Comprador;

public interface CompradorService {
	
	public Comprador buscar(Comprador comprador);
	public void inserir(Comprador comprador);
	public void excluir(Comprador comprador);
	public void alterar(Comprador comprador);
	public List<Comprador> listarTodos();
	public List<Comprador> consultar (Comprador comprador);

}
