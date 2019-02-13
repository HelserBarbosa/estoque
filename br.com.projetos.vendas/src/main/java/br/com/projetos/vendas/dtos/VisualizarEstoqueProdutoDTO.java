package br.com.projetos.vendas.dtos;

import java.io.Serializable;

public class VisualizarEstoqueProdutoDTO implements Serializable {
    
    private static final long serialVersionUID = -2505448214248801320L;

    private Long id;
    
    private Long quantidade;
    
    private String nomeProduto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
}
