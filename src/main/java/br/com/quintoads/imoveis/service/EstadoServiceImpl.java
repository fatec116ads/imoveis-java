package br.com.quintoads.imoveis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.quintoads.imoveis.dao.EstadoDao;
import br.com.quintoads.imoveis.model.Estado;

@Service
public class EstadoServiceImpl implements EstadoService{
	
	@Autowired
	private EstadoDao estadao;
	
	@Override
	public void alterar(Estado estado){
		estadao.save(estado);
	}

	@Override
	public Estado buscar(Estado estado) {
		// TODO Auto-generated method stub
		return estadao.getOne(estado.getUf());
	}

	@Override
	public void inserir(Estado estado) {
		// TODO Auto-generated method stub
		estadao.save(estado);
	}

	@Override
	public void excluir(Estado estado) {
		// TODO Auto-generated method stub
		estadao.deleteById(estado.getUf());
	}

	@Override
	public List<Estado> listarTodos() {
		// TODO Auto-generated method stub
		return estadao.findAll();
	}

	@Override
	public List<Estado> consultar(Estado estado) {
		// TODO Auto-generated method stub
		return estadao.findByNomeEstado(estado.getNomeEstado());
	}
}
