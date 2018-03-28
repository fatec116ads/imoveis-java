package br.com.quintoads.imoveis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.quintoads.imoveis.model.Estado;
import br.com.quintoads.imoveis.dao.*;

@Controller
public class EstadoController {
	
	@RequestMapping("/inserir")
	@ResponseBody
	public String inserirEstado(String sigla, String nome) {
		String siglaUF = "";
		try {
			Estado estado = new Estado(sigla,nome);
			estadoDao.save(estado);
			siglaUF = estado.getSiglaEstado();
		}
		catch (Exception ex) {
			return "Erro ao criar o Estado: " + ex.toString();
		}
		return "Estado criado com sucesso para a Sigla = " + siglaUF;
		
	}
	@RequestMapping("/delete")
	@ResponseBody
	public String deletarEstado(String sigla) {
		try {
			Estado estado = new Estado(sigla);
			estadoDao.delete(estado);
		}
		catch (Exception ex) {
			return "Erro ao deletar o Estado:" + ex.toString();
		}
		return "Estado deletado com sucesso";
	}
	@RequestMapping("/update")
	@ResponseBody
	public String updateEstado(String sigla, String nome) {
		try {
			Estado estado = estadoDao.findBySiglaEstado(sigla);
			estado.setNomeEstado(nome);
			estadoDao.save(estado);
		}
		catch (Exception ex) {
			return "Erro ao atualizar o estado: " + ex.toString();
		}
		return "Estado atualizado com sucesso";
	}
	@Autowired
	private EstadoDao estadoDao;
}
