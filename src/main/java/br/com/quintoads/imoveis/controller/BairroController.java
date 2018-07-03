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

import br.com.quintoads.imoveis.model.Bairro;
import br.com.quintoads.imoveis.service.BairroService;

@RestController
@RequestMapping("/bairro")
public class BairroController {
	
	@PostMapping("/inserir")
	@ResponseBody
	public void inserirBairro(@Valid @RequestBody Bairro bairro) {
		try {
			System.out.println(bairro.toString());
			bairroServ.inserir(bairro);
		}
		catch (Exception ex) {
			System.out.println("Erro ao criar o Estado: " + ex.toString() + "\n" + bairro);
		}
		
	}
	@PostMapping("/buscar-pelo-nome")
	@ResponseBody
	public List<Bairro> buscaPeloNome(@Valid @RequestBody Bairro bairro) {
			 return bairroServ.consultar(bairro);
	}
	
	@PostMapping("/buscar-pela-cidade")
	@ResponseBody
	public List<Bairro> buscaPelaCidade(@Valid @RequestBody Bairro bairro) {
			 return bairroServ.consultarCidade(bairro);
	}

	
	@PostMapping("/buscar")
	@ResponseBody
	public Bairro buscar(@Valid @RequestBody Bairro bairro) {
		try {
		return bairroServ.buscar(bairro);
		}
		catch (Exception ex) {
			System.out.println("Erro ao buscar o Bairro: " + ex.toString() + bairro);
		}
		return bairro;
		}
	
	@PostMapping("/delete")
	@ResponseBody
	public void deletarBairro(@Valid @RequestBody Bairro bairro) {
		try {
			bairroServ.excluir(bairro);
		}
		catch (Exception ex) {
			System.out.println("Erro ao deletar o Bairro:" + ex.toString());
		}
		System.out.println("Bairro deletado com sucesso");
	}
	@PostMapping("/update")
	@ResponseBody
	public void updateBairro(@Valid @RequestBody Bairro bairro) {
			String nome ="";
		try {
			nome = bairro.getNmBairro();
			bairroServ.buscar(bairro);
			bairro.setNmBairro(nome);
			bairroServ.alterar(bairro);
		}
		catch (Exception ex) {
			System.out.println("Erro ao atualizar o bairro: " + ex.toString());
		}
		System.out.println("Bairro atualizado com sucesso"+ bairro);
	}
	@PostMapping("/listar")
	@ResponseBody
	public List<Bairro> listar(){
		List<Bairro> lista = new ArrayList<Bairro>();
		lista = bairroServ.listarTodos();
		return lista;
	}
	
	@Autowired
	private BairroService bairroServ;
}
