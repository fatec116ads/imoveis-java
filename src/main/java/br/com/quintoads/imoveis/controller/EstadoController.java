package br.com.quintoads.imoveis.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.quintoads.imoveis.model.Estado;
import br.com.quintoads.imoveis.service.EstadoService;

@Controller
public class EstadoController {
	
	@RequestMapping("/inserir")
	@ResponseBody
	public String inserirEstado(String uf, String nome) {
		String sigla = "";
		try {
			Estado estado = new Estado(uf,nome);
			estadoServ.inserir(estado);
			sigla = estado.getUf();
		}
		catch (Exception ex) {
			return "Erro ao criar o Estado: " + ex.toString() + "\n" +nome;
		}
		return "Estado criado com sucesso, id: " + sigla;
		
	}
	@RequestMapping("/buscar-pelo-nome")
	@ResponseBody
	public String buscaPeloNome(String nome) {
		Estado estado = new Estado("o",nome);
		List<Estado> estados = new ArrayList<Estado>();
		try {
			estados = estadoServ.consultar(estado);
		}
		catch (Exception ex) {
			return "Nenhum estado encontrado"+ ex.toString();
		}
		return "Resultado da busca: "+ estados;
	}
	
	@RequestMapping("/buscar")
	@ResponseBody
	public String buscar(String uf) {
		Estado estado = new Estado(uf);
		try {
			estado = estadoServ.buscar(estado);
		}
		catch (Exception ex) {
			return "Estado não encontrado";
		}
		return "Resultado da busca: "+estado.toString();
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public String deletarEstado(String uf) {
		try {
			Estado estado = new Estado(uf);
			estadoServ.excluir(estado);;
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
			Estado estado = new Estado(uf);
			estadoServ.buscar(estado);
			estado.setNomeEstado(nome);
			estadoServ.alterar(estado);
		}
		catch (Exception ex) {
			return "Erro ao atualizar o estado: " + ex.toString();
		}
		return "Estado atualizado com sucesso";
	}
	@RequestMapping("/listar")
	@ResponseBody
	public List<Estado> listar(){
		List<Estado> lista = new ArrayList<Estado>();
		lista = estadoServ.listarTodos();
		return lista;
	}
	
	@Autowired
	private EstadoService estadoServ;
}
