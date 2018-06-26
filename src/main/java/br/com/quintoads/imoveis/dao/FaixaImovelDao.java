package br.com.quintoads.imoveis.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.quintoads.imoveis.model.FaixaImovel;

@Repository
public interface FaixaImovelDao extends JpaRepository<FaixaImovel, String> {
	
	@Query("Select e from FaixaImovel e  where e.nmFaixa LIKE %?1%")
	List<FaixaImovel> findByNmFaixa(String nome);

}
