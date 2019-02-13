package br.com.projetos.vendas.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetos.vendas.dtos.VendaDTO;
import br.com.projetos.vendas.models.Venda;
import br.com.projetos.vendas.repositories.VendaRepository;

@Service
public class VendaService extends ServiceBase {

    @Autowired
    private VendaRepository repository;

    @Autowired
    private ItemVendaService itemVendaService;

    public VendaDTO realizarVenda(VendaDTO vendaDTO) {

	Venda venda = new Venda();
	venda.setValorTotal(vendaDTO.getValorTotal());
	venda.setTipo(vendaDTO.getTipo());
	venda.setData(new Date());
	venda.setItens(itemVendaService.mapperItemVenda(vendaDTO.getProdutosVenda()));
	
	//TODO decrementar estoque
	
	repository.save(venda);
	
	vendaDTO.setId(venda.getId());
	
	return vendaDTO;
    }

}
