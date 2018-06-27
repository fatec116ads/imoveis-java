package br.com.quintoads.imoveis.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.quintoads.imoveis.model.Oferta;

@Repository
public interface OfertaDao extends JpaRepository<Oferta, Integer>  {
	
	@Query("Select e from Oferta e  where e.vlOferta = ?1")
	List<Oferta> findByValorOferta(float oferta);

}
