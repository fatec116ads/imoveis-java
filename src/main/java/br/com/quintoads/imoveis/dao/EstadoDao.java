package br.com.quintoads.imoveis.dao;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.quintoads.imoveis.model.Estado;

@Transactional
public interface EstadoDao extends JpaRepository<Estado, String> {

}
