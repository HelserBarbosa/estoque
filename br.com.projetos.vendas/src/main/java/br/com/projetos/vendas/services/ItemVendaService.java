package br.com.projetos.vendas.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetos.vendas.dtos.ProdutoVendaDTO;
import br.com.projetos.vendas.enums.AtivoInativo;
import br.com.projetos.vendas.models.ItemVenda;

@Service
public class ItemVendaService extends ServiceBase {

    @Autowired
    private ProdutoService produtoService;

    public List<ItemVenda> mapperItemVenda(List<ProdutoVendaDTO> produtosVenda) {

	List<ItemVenda> itensVendas = new ArrayList<>();
	produtosVenda.forEach(produtoVenda -> {
	    ItemVenda itemVenda = new ItemVenda();

	    itemVenda.setProduto(produtoService.findById(produtoVenda.getIdProduto()));
	    itemVenda.setStatus(AtivoInativo.A);
	    itemVenda.setQtd(produtoVenda.getQtdProduto());
	    itensVendas.add(itemVenda);
	    
	});

	return itensVendas;
    }

}
