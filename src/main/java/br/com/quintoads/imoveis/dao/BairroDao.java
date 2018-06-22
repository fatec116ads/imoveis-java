package br.com.quintoads.imoveis.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.quintoads.imoveis.model.Bairro;
import br.com.quintoads.imoveis.model.Estado;

@Repository
public interface BairroDao extends JpaRepository<Bairro, Integer> {
	
	@Query("Select e from Bairro e  where e.nmBairro LIKE %?1%")
	List<Bairro> findByNomeBairro(String nome);

}
