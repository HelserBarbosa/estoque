package br.com.projetos.vendas.dtos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import br.com.projetos.vendas.enums.TipoVenda;

public class VendaDTO {

    private Long id;
    
    private BigDecimal valorTotal;
    
    private Date data;
    
    private TipoVenda tipo;
    
    private List<ProdutoVendaDTO> produtosVenda;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public TipoVenda getTipo() {
        return tipo;
    }

    public void setTipo(TipoVenda tipo) {
        this.tipo = tipo;
    }

    public List<ProdutoVendaDTO> getProdutosVenda() {
        return produtosVenda;
    }

    public void setProdutosVenda(List<ProdutoVendaDTO> produtosVenda) {
        this.produtosVenda = produtosVenda;
    }

}
