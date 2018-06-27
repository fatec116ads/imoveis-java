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

import br.com.quintoads.imoveis.model.Oferta;
import br.com.quintoads.imoveis.service.OfertaService;
import java.sql.Date;

@RestController
@RequestMapping("/oferta")
public class OfertaController {

    @PostMapping("/inserir")
    @ResponseBody
    public void inserirOferta(@Valid @RequestBody Oferta oferta) {
        try {
            ofertaServ.inserir(oferta);
        } catch (Exception ex) {
            System.out.println("Erro ao criar o Oferta: " + ex.toString() + "\n" + oferta);
        }
        System.out.println("Oferta criado com sucesso, id: " + oferta.getCdOferta());

    }

    @PostMapping("/buscar-pelo-codigo-oferta")
    @ResponseBody
    public List<Oferta> buscaPeloCodigoOferta(@Valid @RequestBody Oferta oferta) {
        return ofertaServ.consultar(oferta);
    }

    @PostMapping("/buscar")
    @ResponseBody
    public Oferta buscar(@Valid @RequestBody Oferta oferta) {
        try {
            return ofertaServ.buscar(oferta);
        } catch (Exception ex) {
            System.out.println("Erro ao buscar o Oferta: " + ex.toString() + oferta);
        }
        return oferta;
    }

    @PostMapping("/delete")
    @ResponseBody
    public void deletarOferta(@Valid @RequestBody Oferta oferta) {
        try {
            ofertaServ.excluir(oferta);
        } catch (Exception ex) {
            System.out.println("Erro ao deletar o Oferta:" + ex.toString());
        }
        System.out.println("Oferta deletado com sucesso");
    }

    @PostMapping("/update")
    @ResponseBody
    public void updateOferta(@Valid @RequestBody Oferta oferta) {
        Float vlOferta = null;
        Date dtOferta = null;
        try {
            vlOferta = oferta.getVlOferta();
            dtOferta = oferta.getDtOferta();
            ofertaServ.buscar(oferta);
            oferta.setVlOferta(vlOferta);
            oferta.setDtOferta(dtOferta);
            ofertaServ.alterar(oferta);
        } catch (Exception ex) {
            System.out.println("Erro ao atualizar o oferta: " + ex.toString());
        }
        System.out.println("Oferta atualizado com sucesso" + oferta);
    }

    @PostMapping("/listar")
    @ResponseBody
    public List<Oferta> listar() {
        List<Oferta> lista = new ArrayList<Oferta>();
        lista = ofertaServ.listarTodos();
        return lista;
    }

    @Autowired
    private OfertaService ofertaServ;
}
