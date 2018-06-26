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

import br.com.quintoads.imoveis.model.FaixaImovel;
import br.com.quintoads.imoveis.service.FaixaImovelService;

@RestController
@RequestMapping("/faixa-imovel")
public class FaixaImovelController {
	
	@PostMapping("/inserir")
	@ResponseBody
	public void inserirFaixaImovel(@Valid @RequestBody FaixaImovel faixaImovel) {
		try {
			faixaImovelServ.inserir(faixaImovel);
		}
		catch (Exception ex) {
			System.out.println("Erro ao criar o Faixa Imovel: " + ex.toString() + "\n" + faixaImovel);
		}
			System.out.println("Faixa Imovel criado com sucesso, id: " + faixaImovel.getCdFaixa());
		
	}
	@PostMapping("/buscar-pelo-nome")
	@ResponseBody
	public List<FaixaImovel> buscaPeloNome(@Valid @RequestBody FaixaImovel faixaImovel) {
			 return faixaImovelServ.consultar(faixaImovel);
	}
	
	@PostMapping("/buscar")
	@ResponseBody
	public FaixaImovel buscar(@Valid @RequestBody FaixaImovel faixaImovel) {
		try {
		return faixaImovelServ.buscar(faixaImovel);
		}
		catch (Exception ex) {
			System.out.println("Erro ao buscar o Estado: " + ex.toString() + faixaImovel);
		}
		return faixaImovel;
		}
	
	@PostMapping("/delete")
	@ResponseBody
	public void deletarEstado(@Valid @RequestBody FaixaImovel faixaImovel) {
		try {
			faixaImovelServ.excluir(faixaImovel);
		}
		catch (Exception ex) {
			System.out.println("Erro ao deletar o Estado:" + ex.toString());
		}
		System.out.println("Estado deletado com sucesso");
	}
	@PostMapping("/update")
	@ResponseBody
	public void updateFaixaImovel(@Valid @RequestBody FaixaImovel faixaImovel) {
			String nome ="";
		try {
			nome = faixaImovel.getNmFaixa();
			faixaImovelServ.buscar(faixaImovel);
			faixaImovel.setNmFaixa(nome);
			faixaImovelServ.alterar(faixaImovel);
		}
		catch (Exception ex) {
			System.out.println("Erro ao atualizar : " + ex.toString());
		}
		System.out.println("Faixa Imovel atualizado com sucesso"+ faixaImovel);
	}
	@PostMapping("/listar")
	@ResponseBody
	public List<FaixaImovel> listar(){
		List<FaixaImovel> lista = new ArrayList<>();
		lista = faixaImovelServ.listarTodos();
		return lista;
	}
	
	@Autowired
	private FaixaImovelService faixaImovelServ;
}
