package br.com.quintoads.imoveis.service;

import java.util.List;
import br.com.quintoads.imoveis.model.Bairro;
import br.com.quintoads.imoveis.model.Estado;

public interface BairroService {
	
	public Bairro buscar(Bairro bairro);
	public void inserir(Bairro bairro);
	public void excluir(Bairro bairro);
	public void alterar(Bairro bairro);
	public List<Bairro> listarTodos();
	public List<Bairro> consultar (Bairro bairro);

}
