package br.com.quintoads.imoveis.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.quintoads.imoveis.model.Vendedor;
import br.com.quintoads.imoveis.service.VendedorService;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {
	
	@PostMapping("/inserir")
	@ResponseBody
	public void inserir(@Valid @RequestBody Vendedor vendedor) {
		vendeServ.inserir(vendedor);
	}
	
	@PostMapping("/update")
	@ResponseBody
	public void alterar(@Valid @RequestBody Vendedor vendedor) {
		vendeServ.alterar(vendedor);
	}
	
	@PostMapping("/delete")
	@ResponseBody
	public void excluir(@Valid @RequestBody Vendedor vendedor) {
		vendeServ.excluir(vendedor);
	}
	
	@PostMapping("/buscar")
	@ResponseBody
	public Vendedor buscar(@Valid @RequestBody Vendedor vendedor) {
		return vendeServ.buscar(vendedor);
	}
	
	@PostMapping("/listar")
	@ResponseBody
	public List<Vendedor> listar(){
		return vendeServ.listarTodos();
	}
	
	@PostMapping("/buscar-pelo-nome")
	@ResponseBody
	public List<Vendedor> consultar(@Valid @RequestBody Vendedor vendedor)	{
		return vendeServ.consultar(vendedor);
	}
	
	@Autowired
	private VendedorService vendeServ;
}
