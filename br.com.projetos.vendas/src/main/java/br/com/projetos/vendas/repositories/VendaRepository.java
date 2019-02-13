package br.com.projetos.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetos.vendas.models.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long>{

}
