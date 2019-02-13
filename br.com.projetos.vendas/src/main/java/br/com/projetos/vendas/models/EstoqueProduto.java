package br.com.projetos.vendas.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "estoque_produto")
@SequenceGenerator(name = "seq_estoque_produto", sequenceName = "seq_estoque_produto", allocationSize = 1)
public class EstoqueProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_estoque_produto")
    @Column(name = "id_estoque_produto")
    private Long id;
    
    @Column(name = "qtd_estoque_produto", nullable = false)
    private Long quantidade;
    
    @OneToOne
    @JoinColumn(name = "id_produto", nullable = false)
    private Produto produto;

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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
}
