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

import br.com.quintoads.imoveis.model.Cidade;
import br.com.quintoads.imoveis.service.CidadeService;

@RestController
@RequestMapping("/cidade")
public class CidadeController {
	
	@PostMapping("/inserir")
	@ResponseBody
	public void inserirCidade(@Valid @RequestBody Cidade cidade) {
		try {
			cidadeServ.inserir(cidade);
		}
		catch (Exception ex) {
			System.out.println("Erro ao criar a Cidade: " + ex.toString() + "\n" + cidade);
		}
			System.out.println("Cidade criada com sucesso, id: " + cidade.getCdCidade());
		
	}
	@PostMapping("/buscar-pelo-nome")
	@ResponseBody
	public List<Cidade> buscaPeloNome(@Valid @RequestBody Cidade cidade) {
			 return cidadeServ.consultar(cidade);
	}
	@PostMapping("/buscar-pelo-estado")
	@ResponseBody
	public List<Cidade> buscaPeloEstado(@Valid @RequestBody Cidade cidade) {
			 return cidadeServ.consultarUf(cidade);
	}
	
	@PostMapping("/buscar")
	@ResponseBody
	public Cidade buscar(@Valid @RequestBody Cidade cidade) {
		try {
		return cidadeServ.buscar(cidade);
		}
		catch (Exception ex) {
			System.out.println("Erro ao buscar a Cidade: " + ex.toString() + cidade);
		}
		return cidade;
		}
	
	@PostMapping("/delete")
	@ResponseBody
	public void deletarEstado(@Valid @RequestBody Cidade cidade) {
		try {
			cidadeServ.excluir(cidade);
		}
		catch (Exception ex) {
			System.out.println("Erro ao deletar a Cidade:" + ex.toString());
		}
		System.out.println("Cidade deletada com sucesso");
	}
	@PostMapping("/update")
	@ResponseBody
	public void updateCidade(@Valid @RequestBody Cidade cidade) {
			String nome ="";
		try {
			nome = cidade.getnmCidade();
			cidadeServ.buscar(cidade);
			cidade.setnmCidade(nome);
			cidadeServ.alterar(cidade);
		}
		catch (Exception ex) {
			System.out.println("Erro ao atualizar a Cidade: " + ex.toString());
		}
		System.out.println("Cidade atualizada com sucesso"+ cidade);
	}
	@PostMapping("/listar")
	@ResponseBody
	public List<Cidade> listar(){
		List<Cidade> lista = new ArrayList<Cidade>();
		lista = cidadeServ.listarTodos();
		return lista;
	}
	
	@Autowired
	private CidadeService cidadeServ;
}
