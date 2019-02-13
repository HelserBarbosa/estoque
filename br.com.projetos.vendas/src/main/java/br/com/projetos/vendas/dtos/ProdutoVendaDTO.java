package br.com.projetos.vendas.dtos;

public class ProdutoVendaDTO {

    public Long idProduto;
    
    public Long qtdProduto;

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public Long getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(Long qtdProduto) {
        this.qtdProduto = qtdProduto;
    }
    
}
