package br.com.projetos.vendas.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.projetos.vendas.dtos.VisualizarEstoqueProdutoDTO;
import br.com.projetos.vendas.services.EstoqueProdutoService;

@Controller("estoque")
public class EstoqueProdutoController {

    @Autowired
    private EstoqueProdutoService service;

    @GetMapping("/produto")
    public ResponseEntity<VisualizarEstoqueProdutoDTO> consultarEstoquePorProduto(
	    @PathParam("produtoNome") String produtoNome) {
	return new ResponseEntity<VisualizarEstoqueProdutoDTO>(service.consularEstoque(produtoNome), HttpStatus.OK);
    }

}
