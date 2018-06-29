package br.com.quintoads.imoveis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.quintoads.imoveis.dao.VendedorDao;
import br.com.quintoads.imoveis.model.Vendedor;

@Service
public class VendedorServiceImpl implements VendedorService {
	
	@Autowired
	private VendedorDao venDao;
	
	@Override
	public Vendedor buscar(Vendedor vendedor) {
		// TODO Auto-generated method stub
		return venDao.getOne(vendedor.getCdVendedor());
	}

	@Override
	public void inserir(Vendedor vendedor) {
		// TODO Auto-generated method stub
		venDao.save(vendedor);

	}

	@Override
	public void excluir(Vendedor vendedor) {
		// TODO Auto-generated method stub
		venDao.delete(vendedor);
	}

	@Override
	public void alterar(Vendedor vendedor) {
		// TODO Auto-generated method stub
		venDao.save(vendedor);
	}

	@Override
	public List<Vendedor> listarTodos() {
		// TODO Auto-generated method stub
		return venDao.findAll();
	}

	@Override
	public List<Vendedor> consultar(Vendedor vendedor) {
		// TODO Auto-generated method stub
		return venDao.findByNmVendedor(vendedor.getNmVendedor());
	}

}
