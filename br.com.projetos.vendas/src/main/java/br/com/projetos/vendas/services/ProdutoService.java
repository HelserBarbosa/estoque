package br.com.projetos.vendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetos.vendas.dtos.ProdutoDTO;
import br.com.projetos.vendas.models.Produto;
import br.com.projetos.vendas.repositories.ProdutoRepository;

@Service
public class ProdutoService extends ServiceBase {

    @Autowired
    private ProdutoRepository repository;
    
    @Autowired
    private EstoqueProdutoService estoqueProdutoService;
    
    public ProdutoDTO cadastrarProduto(ProdutoDTO produtoDTO){
	
	Produto produto = getModelMapper().map(produtoDTO, Produto.class);
	//Criacao do c�digo de barras
	repository.save(produto);
	estoqueProdutoService.criarEstoqueProduto(produto);
	
	return getModelMapper().map(produto, ProdutoDTO.class);
    }
    
    public ProdutoDTO consultarPorId(Long id) {
	return getModelMapper().map(repository.getOne(id), ProdutoDTO.class);
    }
    
    public Produto findById(Long id) {
	return repository.getOne(id);
    }
}
