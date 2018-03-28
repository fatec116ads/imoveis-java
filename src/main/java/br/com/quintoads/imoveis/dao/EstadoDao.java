package br.com.quintoads.imoveis.dao;
import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import br.com.quintoads.imoveis.model.Estado;

@Transactional
public interface EstadoDao extends CrudRepository<Estado, Long> {

	
	
	
	
	public Estado findBySiglaEstado(String sigla);
}
