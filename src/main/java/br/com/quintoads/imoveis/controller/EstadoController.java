package br.com.quintoads.imoveis.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.quintoads.imoveis.model.Estado;
import br.com.quintoads.imoveis.service.EstadoService;

@RestController
@RequestMapping("/estado")
public class EstadoController {
	
	@PostMapping("/inserir")
	@ResponseBody
	public void inserirEstado(@Valid @RequestBody Estado estado) {
		try {
			estadoServ.inserir(estado);
		}
		catch (Exception ex) {
			System.out.println("Erro ao criar o Estado: " + ex.toString() + "\n" + estado);
		}
			System.out.println("Estado criado com sucesso, id: " + estado.getUf());
		
	}
	@PostMapping("/buscar-pelo-nome")
	@ResponseBody
	public List<Estado> buscaPeloNome(@Valid @RequestBody Estado estado) {
			 return estadoServ.consultar(estado);
	}
	
	@PostMapping("/buscar")
	@ResponseBody
	public Estado buscar(@Valid @RequestBody Estado estado) {
		try {
		return estadoServ.buscar(estado);
		}
		catch (Exception ex) {
			System.out.println("Erro ao buscar o Estado: " + ex.toString() + estado);
		}
		return estado;
		}
	
	@PostMapping("/delete")
	@ResponseBody
	public void deletarEstado(@Valid @RequestBody Estado estado) {
		try {
			estadoServ.excluir(estado);
		}
		catch (Exception ex) {
			System.out.println("Erro ao deletar o Estado:" + ex.toString());
		}
		System.out.println("Estado deletado com sucesso");
	}
	@PostMapping("/update")
	@ResponseBody
	public void updateEstado(@Valid @RequestBody Estado estado) {
			String nome ="";
		try {
			nome = estado.getNomeEstado();
			estadoServ.buscar(estado);
			estado.setNomeEstado(nome);
			estadoServ.alterar(estado);
		}
		catch (Exception ex) {
			System.out.println("Erro ao atualizar o estado: " + ex.toString());
		}
		System.out.println("Estado atualizado com sucesso"+ estado);
	}
	@PostMapping("/listar")
	@ResponseBody
	public List<Estado> listar(){
		List<Estado> lista = new ArrayList<Estado>();
		lista = estadoServ.listarTodos();
		return lista;
	}
	
	@Autowired
	private EstadoService estadoServ;
}
