package br.com.projetos.vendas.dtos;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ProdutoDTO implements Serializable{

    private static final long serialVersionUID = 6506791114789529870L;

    private Long id;

    private String codigoDeBarras;

    @NotNull
    private BigDecimal preco;

    @NotEmpty
    private String nome;

    private String descricao;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getCodigoDeBarras() {
	return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
	this.codigoDeBarras = codigoDeBarras;
    }

    public BigDecimal getPreco() {
	return preco;
    }

    public void setPreco(BigDecimal preco) {
	this.preco = preco;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getDescricao() {
	return descricao;
    }

    public void setDescricao(String descricao) {
	this.descricao = descricao;
    }
}
