package io.github.vitortitz.vendasapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.vitortitz.vendasapi.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
