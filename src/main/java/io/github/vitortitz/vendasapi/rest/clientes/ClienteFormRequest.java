package io.github.vitortitz.vendasapi.rest.clientes;

import java.time.LocalDate;

import io.github.vitortitz.vendasapi.model.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClienteFormRequest {
    private Long id;
    private LocalDate aniversario;
    private String cpf, nome;

    public ClienteFormRequest() {
        super();
    }

    public Cliente toModel() {
        return new Cliente(id, aniversario, cpf, nome);
    }

    public static ClienteFormRequest fromModel(Cliente cliente) {
        return new ClienteFormRequest(cliente.getId(), cliente.getAniversario(), cliente.getCpf(), cliente.getNome());
    }
}
