/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quintoads.imoveis.dao;

import br.com.quintoads.imoveis.model.Imovel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Victor
 */
@Repository
public interface ImovelDao extends JpaRepository<Imovel,Integer>{
    @Query("Select e from Imovel e  where e.nmEndereco LIKE %?1%")
	List<Imovel> findByNomeImovel(String nome);
}
