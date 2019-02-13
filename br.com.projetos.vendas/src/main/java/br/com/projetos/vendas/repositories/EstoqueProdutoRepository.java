package br.com.projetos.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.projetos.vendas.models.EstoqueProduto;

@Repository
public interface EstoqueProdutoRepository extends JpaRepository<EstoqueProduto, Long> {

    @Query("SELECT ep FROM EstoqueProduto ep WHERE ep.produto.nome = :produtoNome")
    EstoqueProduto findByProduto(@Param("produtoNome") String produtoNome);
 
    @Query("SELECT ep FROM EstoqueProduto ep WHERE ep.produto.id = :produtoId")
    EstoqueProduto findByProduto(@Param("produtoId") Long id);
}
