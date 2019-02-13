package br.com.projetos.vendas.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.projetos.vendas.enums.AtivoInativo;

@Entity
@Table(name = "item_venda")
@SequenceGenerator(name = "seq_item_venda", sequenceName = "seq_item_venda", allocationSize = 1)
public class ItemVenda implements Serializable{

    private static final long serialVersionUID = 7743960970817215391L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_item_venda")
    @Column(name = "id_item_venda")
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "id_produto", nullable = false)
    private Produto produto;
    
    @Column(name = "qtdProduto")
    private Long qtd;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "status_item_venda", nullable = false, length = 1)
    private AtivoInativo status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Long getQtd() {
        return qtd;
    }

    public void setQtd(Long qtd) {
        this.qtd = qtd;
    }

    public AtivoInativo getStatus() {
        return status;
    }

    public void setStatus(AtivoInativo status) {
        this.status = status;
    }
    
    
}
