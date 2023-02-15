package io.github.vitortitz.vendasapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.github.vitortitz.vendasapi.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
