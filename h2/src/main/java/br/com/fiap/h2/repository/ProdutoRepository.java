package br.com.fiap.h2.repository;

import br.com.fiap.h2.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Integer> {
}
