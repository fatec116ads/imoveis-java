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

import br.com.quintoads.imoveis.model.Comprador;
import br.com.quintoads.imoveis.service.CompradorService;

@RestController
@RequestMapping("/comprador")
public class CompradorController {
	
	@PostMapping("/inserir")
	@ResponseBody
	public void inserirComprador(@Valid @RequestBody Comprador comprador) {
		try {
			compradorServ.inserir(comprador);
		}
		catch (Exception ex) {
			System.out.println("Erro ao criar o Comprador: " + ex.toString() + "\n" + comprador);
		}
			System.out.println("Comprador criado com sucesso, id: " + comprador.getCdComprador());
		
	}
	@PostMapping("/buscar-pelo-nome")
	@ResponseBody
	public List<Comprador> buscaPeloNome(@Valid @RequestBody Comprador comprador) {
			 return compradorServ.consultar(comprador);
	}
	
	@PostMapping("/buscar")
	@ResponseBody
	public Comprador buscar(@Valid @RequestBody Comprador comprador) {
		try {
		return compradorServ.buscar(comprador);
		}
		catch (Exception ex) {
			System.out.println("Erro ao buscar o Comprador: " + ex.toString() + comprador);
		}
		return comprador;
		}
	
	@PostMapping("/delete")
	@ResponseBody
	public void deletarComprador(@Valid @RequestBody Comprador comprador) {
		try {
			compradorServ.excluir(comprador);
		}
		catch (Exception ex) {
			System.out.println("Erro ao deletar o Comprador:" + ex.toString());
		}
		System.out.println("Comprador deletado com sucesso");
	}
	@PostMapping("/update")
	@ResponseBody
	public void updateComprador(@Valid @RequestBody Comprador comprador) {
			String nome ="";
		try {
			nome = comprador.getNmComprador();
			compradorServ.buscar(comprador);
			comprador.setNmComprador(nome);
			compradorServ.alterar(comprador);
		}
		catch (Exception ex) {
			System.out.println("Erro ao atualizar o Comprador: " + ex.toString());
		}
		System.out.println("Comprador atualizado com sucesso"+ comprador);
	}
	@PostMapping("/listar")
	@ResponseBody
	public List<Comprador> listar(){
		List<Comprador> lista = new ArrayList<Comprador>();
		lista = compradorServ.listarTodos();
		return lista;
	}
	
	@Autowired
	private CompradorService compradorServ;
}
