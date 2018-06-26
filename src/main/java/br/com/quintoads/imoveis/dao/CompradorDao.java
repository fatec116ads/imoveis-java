package br.com.quintoads.imoveis.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import br.com.quintoads.imoveis.model.Comprador;
@Repository
public interface CompradorDao extends JpaRepository<Comprador, Integer> {
	
	@Query("Select e from Comprador e  where e.nmComprador LIKE %?1%")
	List<Comprador> findByNomeComprador(String nome);

}
