package br.com.quintoads.imoveis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.quintoads.imoveis.dao.BairroDao;
import br.com.quintoads.imoveis.dao.EstadoDao;
import br.com.quintoads.imoveis.model.Bairro;
import br.com.quintoads.imoveis.model.Estado;

@Service
public class BairroServiceImpl implements BairroService{
	
	@Autowired
	private BairroDao bairroDao;
	
	@Override
	public void alterar(Bairro bairro){
		bairroDao.save(bairro);
	}

	@Override
	public Bairro buscar(Bairro bairro) {
		// TODO Auto-generated method stub
		return bairroDao.getOne(bairro.getCodBairro());
	}

	@Override
	public void inserir(Bairro bairro) {
		// TODO Auto-generated method stub
		bairroDao.save(bairro);
	}

	@Override
	public void excluir(Bairro bairro) {
		// TODO Auto-generated method stub
		bairroDao.deleteById(bairro.getCodBairro());
	}

	@Override
	public List<Bairro> listarTodos() {
		// TODO Auto-generated method stub
		return bairroDao.findAll();
	}

	@Override
	public List<Bairro> consultar(Bairro bairro) {
		// TODO Auto-generated method stub
		return bairroDao.findByNomeBairro(bairro.getNmBairro());
	}

	
}
