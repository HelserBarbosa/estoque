package br.com.projetos.vendas.dtos;

import java.io.Serializable;

public class AdicaoProdutoDTO implements Serializable{

    private static final long serialVersionUID = 5017310440057548385L;

    private Long idProduto;
    
    private Long qtd;

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public Long getQtd() {
        return qtd;
    }

    public void setQtd(Long qtd) {
        this.qtd = qtd;
    }
    
    
}
