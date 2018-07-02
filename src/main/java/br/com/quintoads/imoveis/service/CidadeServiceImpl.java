package br.com.quintoads.imoveis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.quintoads.imoveis.dao.CidadeDao;
import br.com.quintoads.imoveis.model.Cidade;

@Service
public class CidadeServiceImpl implements CidadeService{
	
	@Autowired
	private CidadeDao cidadedao;
	
	@Override
	public void alterar(Cidade cidade){
		cidadedao.save(cidade);
	}

	@Override
	public Cidade buscar(Cidade cidade) {
		// TODO Auto-generated method stub
		return cidadedao.getOne(cidade.getCdCidade());
	}

	@Override
	public void inserir(Cidade cidade) {
		// TODO Auto-generated method stub
		cidadedao.save(cidade);
	}

	@Override
	public void excluir(Cidade cidade) {
		// TODO Auto-generated method stub
		cidadedao.deleteById(cidade.getCdCidade());
	}

	@Override
	public List<Cidade> listarTodos() {
		// TODO Auto-generated method stub
		return cidadedao.findAll();
	}

	@Override
	public List<Cidade> consultar(Cidade cidade) {
		// TODO Auto-generated method stub
		return cidadedao.findByNomeCidade(cidade.getnmCidade());
	}

	@Override
	public List<Cidade> consultarUf(Cidade cidade) {	
	 return cidadedao.findByEstado(cidade.getEstado().getUf());
	}
}
