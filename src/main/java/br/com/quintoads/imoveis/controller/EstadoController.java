package br.com.quintoads.imoveis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.quintoads.imoveis.model.Estado;
import br.com.quintoads.imoveis.dao.*;

@Controller
public class EstadoController {
	
	@RequestMapping("/create")
	@ResponseBody
	public String inserirEstado(String uf, String nome) {
		String sigla = "";
		try {
			Estado estado = new Estado(uf,nome);
			estadoDao.save(estado);
			sigla = estado.getUf();
		}
		catch (Exception ex) {
			return "Erro ao criar o Estado: " + ex.toString() + "\n" +nome;
		}
		return "Estado criado com sucesso, id: " + sigla;
		
	}
	@RequestMapping("/delete")
	@ResponseBody
	public String deletarEstado(String uf) {
		try {
			Estado estado = new Estado(uf);
			estadoDao.delete(estado);
		}
		catch (Exception ex) {
			return "Erro ao deletar o Estado:" + ex.toString();
		}
		return "Estado deletado com sucesso";
	}
	@RequestMapping("/update")
	@ResponseBody
	public String updateEstado(String uf, String nome) {
		try {
			Estado estado = estadoDao.getOne(uf);
			estado.setUf(uf);
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
