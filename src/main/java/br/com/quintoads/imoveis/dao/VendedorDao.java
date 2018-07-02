package br.com.quintoads.imoveis.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.quintoads.imoveis.model.Vendedor;

@Repository
public interface VendedorDao extends JpaRepository<Vendedor, Integer>{
	
	
	List <Vendedor> findByNmVendedor(String nmVendedor);
	
}
