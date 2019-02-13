package br.com.projetos.vendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetos.vendas.dtos.AdicaoProdutoDTO;
import br.com.projetos.vendas.dtos.VisualizarEstoqueProdutoDTO;
import br.com.projetos.vendas.models.EstoqueProduto;
import br.com.projetos.vendas.models.Produto;
import br.com.projetos.vendas.repositories.EstoqueProdutoRepository;

@Service
public class EstoqueProdutoService {

    @Autowired
    private EstoqueProdutoRepository repository;

    private static final Long QTD_INICIAL = 0L;

    public void criarEstoqueProduto(Produto produto) {

	EstoqueProduto estoqueProduto = new EstoqueProduto();
	estoqueProduto.setProduto(produto);
	estoqueProduto.setQuantidade(QTD_INICIAL);
	repository.save(estoqueProduto);
    }

    public AdicaoProdutoDTO adicionarEstoque(AdicaoProdutoDTO adicaoProdutoDTO) {

	EstoqueProduto estoqueProduto = repository.findByProduto(adicaoProdutoDTO.getIdProduto());

	estoqueProduto.setQuantidade(estoqueProduto.getQuantidade() + adicaoProdutoDTO.getQtd());

	AdicaoProdutoDTO adicaoProdutoDTORetorno = new AdicaoProdutoDTO();
	adicaoProdutoDTORetorno.setIdProduto(estoqueProduto.getProduto().getId());
	adicaoProdutoDTORetorno.setQtd(estoqueProduto.getQuantidade());
	
	return adicaoProdutoDTORetorno;

    }

    public VisualizarEstoqueProdutoDTO consularEstoque(String produtoNome) {

	VisualizarEstoqueProdutoDTO estoqueProdutoDTO = new VisualizarEstoqueProdutoDTO();

	EstoqueProduto estoqueProduto = repository.findByProduto(produtoNome);

	estoqueProdutoDTO.setId(estoqueProduto.getId());
	estoqueProdutoDTO.setNomeProduto(estoqueProduto.getProduto().getNome());
	estoqueProdutoDTO.setQuantidade(estoqueProduto.getQuantidade());

	return estoqueProdutoDTO;
    }
    
}