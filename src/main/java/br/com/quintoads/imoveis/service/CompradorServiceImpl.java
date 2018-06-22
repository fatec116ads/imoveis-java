package br.com.quintoads.imoveis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.quintoads.imoveis.dao.CompradorDao;
import br.com.quintoads.imoveis.model.Comprador;

@Service
public class CompradorServiceImpl implements CompradorService{
	
	@Autowired
	private CompradorDao compradorDao;
	
	@Override
	public void alterar(Comprador comprador){
		compradorDao.save(comprador);
	}

	@Override
	public Comprador buscar(Comprador comprador) {
		// TODO Auto-generated method stub
		return compradorDao.getOne(comprador.getCdComprador());
	}

	@Override
	public void inserir(Comprador comprador) {
		// TODO Auto-generated method stub
		compradorDao.save(comprador);
	}

	@Override
	public void excluir(Comprador comprador) {
		// TODO Auto-generated method stub
		compradorDao.deleteById(comprador.getCdComprador());
	}

	@Override
	public List<Comprador> listarTodos() {
		// TODO Auto-generated method stub
		return compradorDao.findAll();
	}

	@Override
	public List<Comprador> consultar(Comprador comprador) {
		// TODO Auto-generated method stub
		return compradorDao.findByNomeComprador(comprador.getNmComprador());
	}
}
