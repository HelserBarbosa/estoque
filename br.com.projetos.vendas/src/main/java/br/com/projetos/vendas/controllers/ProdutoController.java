package br.com.projetos.vendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.projetos.vendas.dtos.ProdutoDTO;
import br.com.projetos.vendas.services.ProdutoService;

@Controller("produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;
    
    @PostMapping("novo")
    public ResponseEntity<ProdutoDTO> cadastrarProduto(@RequestBody ProdutoDTO produtoDTO){
	return new ResponseEntity<ProdutoDTO>(produtoService.cadastrarProduto(produtoDTO), HttpStatus.CREATED);
    }
    
    @GetMapping("{id}")
    public ResponseEntity<ProdutoDTO> consultarProduto(@PathVariable("id") Long id){
	return new ResponseEntity<ProdutoDTO>(produtoService.consultarPorId(id), HttpStatus.OK);
    }
}
