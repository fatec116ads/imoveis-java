package br.com.quintoads.imoveis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.quintoads.imoveis.dao.FaixaImovelDao;
import br.com.quintoads.imoveis.model.FaixaImovel;

@Service
public class FaixaImovelServiceImpl implements FaixaImovelService{
	
	@Autowired
	private FaixaImovelDao faixaImovelDao;
	
	@Override
	public void alterar(FaixaImovel faixaImovel){
		faixaImovelDao.save(faixaImovel);
	}

	@Override
	public FaixaImovel buscar(FaixaImovel faixaImovel) {
		// TODO Auto-generated method stub
		return faixaImovelDao.getOne(faixaImovel.getCdFaixa());
	}

	@Override
	public void inserir(FaixaImovel faixaImovel) {
		// TODO Auto-generated method stub
		faixaImovelDao.save(faixaImovel);
	}

	@Override
	public void excluir(FaixaImovel faixaImovel) {
		// TODO Auto-generated method stub
		faixaImovelDao.deleteById(faixaImovel.getCdFaixa());
	}

	@Override
	public List<FaixaImovel> listarTodos() {
		// TODO Auto-generated method stub
		return faixaImovelDao.findAll();
	}

	@Override
	public List<FaixaImovel> consultar(FaixaImovel faixaImovel) {
		// TODO Auto-generated method stub
		return faixaImovelDao.findByNmFaixa(faixaImovel.getNmFaixa());
	}
}
