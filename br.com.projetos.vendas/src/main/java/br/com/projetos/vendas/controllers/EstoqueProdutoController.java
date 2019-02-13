package br.com.projetos.vendas.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projetos.vendas.dtos.AdicaoProdutoDTO;
import br.com.projetos.vendas.dtos.VisualizarEstoqueProdutoDTO;
import br.com.projetos.vendas.services.EstoqueProdutoService;

@Controller
@RequestMapping("estoque")
public class EstoqueProdutoController {

    @Autowired
    private EstoqueProdutoService service;

    @GetMapping("/produto")
    public ResponseEntity<VisualizarEstoqueProdutoDTO> consultarEstoquePorProduto(
	    @PathParam("produtoNome") String produtoNome) {
	return new ResponseEntity<VisualizarEstoqueProdutoDTO>(service.consularEstoque(produtoNome), HttpStatus.OK);
    }

    @PostMapping("/produto")
    public ResponseEntity<AdicaoProdutoDTO> adicionarProdutoEstoque(@RequestBody AdicaoProdutoDTO adicaoProdutoDTO) {
	return new ResponseEntity<AdicaoProdutoDTO>(service.adicionarEstoque(adicaoProdutoDTO), HttpStatus.OK);
    }
}
