package br.com.quintoads.imoveis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.quintoads.imoveis.dao.OfertaDao;
import br.com.quintoads.imoveis.model.Oferta;

@Service
public class OfertaServiceImpl implements OfertaService{
	
	@Autowired
	private OfertaDao oferdao;
	
	@Override
	public void alterar(Oferta oferta){
		oferdao.save(oferta);
	}

	@Override
	public Oferta buscar(Oferta oferta) {
		// TODO Auto-generated method stub
		return oferdao.getOne(oferta.getCdOferta());
	}

	@Override
	public void inserir(Oferta oferta) {
		// TODO Auto-generated method stub
		oferdao.save(oferta);
	}

	@Override
	public void excluir(Oferta oferta) {
		// TODO Auto-generated method stub
		oferdao.deleteById(oferta.getCdOferta());
	}

	@Override
	public List<Oferta> listarTodos() {
		// TODO Auto-generated method stub
		return oferdao.findAll();
	}

	@Override
	public List<Oferta> consultar(Oferta oferta) {
		// TODO Auto-generated method stub
		return oferdao.findByValorOferta(oferta.getVlOferta());
	}
}
