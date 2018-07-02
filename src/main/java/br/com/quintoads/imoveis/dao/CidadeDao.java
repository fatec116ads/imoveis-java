package br.com.quintoads.imoveis.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.quintoads.imoveis.model.Cidade;

@Repository
public interface CidadeDao extends JpaRepository<Cidade, Integer> {
	
	@Query("Select e from Cidade e  where e.nmCidade LIKE %?1%")
	List<Cidade> findByNomeCidade(String cidade);
	
	@Query("Select e from Cidade e  where e.estado.uf = ?1")
	List<Cidade> findByEstado(String uf);

}
