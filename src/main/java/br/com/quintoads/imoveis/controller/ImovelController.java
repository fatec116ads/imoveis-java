/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quintoads.imoveis.controller;

import br.com.quintoads.imoveis.model.Estado;
import br.com.quintoads.imoveis.model.Imovel;
import br.com.quintoads.imoveis.service.ImovelService;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DEV_UNITED
 */
@RestController
@RequestMapping("/imovel")
public class ImovelController {
    @Autowired
private ImovelService imovelServ;
	
	@PostMapping("/inserir")
	@ResponseBody
	public void inserirImovel(@Valid @RequestBody Imovel imovel) {
		try {
			imovelServ.inserir(imovel);
		}
		catch (Exception ex) {
			System.out.println("Erro ao criar o Imovel: " + ex.toString() + "\n" + imovel);
		}
			System.out.println("Imóvel criado com sucesso, id: " + imovel.getNmEndereco());
		
	}
	@PostMapping("/buscar-pelo-nome")
	@ResponseBody
	public List<Imovel> buscaPeloNome(@Valid @RequestBody Imovel imovel) {
			 return imovelServ.consultar(imovel);
	}
	
	@PostMapping("/buscar")
	@ResponseBody
	public Imovel buscar(@Valid @RequestBody Imovel imovel) {
		try {
		return imovelServ.buscar(imovel);
		}
		catch (Exception ex) {
			System.out.println("Erro ao buscar o Estado: " + ex.toString() + imovel);
		}
		return imovel;
		}
	
	@PostMapping("/delete")
	@ResponseBody
	public void deletarEstado(@Valid @RequestBody Imovel imovel) {
		try {
			imovelServ.excluir(imovel);
		}
		catch (Exception ex) {
			System.out.println("Erro ao deletar o Estado:" + ex.toString());
		}
		System.out.println("Estado deletado com sucesso");
	}
	@PostMapping("/update")
	@ResponseBody
	public void updateImovel(@Valid @RequestBody Imovel imovel) {
			String nome ="";
		try {
			nome = imovel.getNmEndereco();
			imovelServ.buscar(imovel);
			imovel.setNmEndereco(nome);
			imovelServ.alterar(imovel);
		}
		catch (Exception ex) {
			System.out.println("Erro ao atualizar o estado: " + ex.toString());
		}
		System.out.println("Estado atualizado com sucesso"+ imovel);
	}
	@PostMapping("/listar")
	@ResponseBody
	public List<Imovel> listar(){
		List<Imovel> lista = new ArrayList<Imovel>();
		lista = imovelServ.listarTodos();
		return lista;
	}
	
	
}
