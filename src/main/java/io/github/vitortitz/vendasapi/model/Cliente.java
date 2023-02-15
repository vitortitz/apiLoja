package io.github.vitortitz.vendasapi.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "produto")
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate aniversario;
    private String cpf, nome;

    public Cliente() {
        super();
    }

    public Cliente(Long id, LocalDate aniversario, String cpf, String nome) {
        this.id = id;
        this.aniversario = aniversario;
        this.cpf = cpf;
        this.nome = nome;
    }

    public Cliente(LocalDate aniversario, String cpf, String nome) {
        this.aniversario = aniversario;
        this.cpf = cpf;
        this.nome = nome;
    }

}
