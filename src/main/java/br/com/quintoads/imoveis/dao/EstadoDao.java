package br.com.quintoads.imoveis.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.quintoads.imoveis.model.Estado;

@Repository
public interface EstadoDao extends JpaRepository<Estado, String> {
	
	@Query("Select e from Estado e  where e.nomeEstado LIKE %?1%")
	List<Estado> findByNomeEstado(String nome);

}
