package io.github.vitortitz.vendasapi.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import io.github.vitortitz.vendasapi.model.converter.StringListConverter;
import lombok.Data;

@Entity
@Table(name = "produto")
@Data
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "sku", length = 30)
    private String sku;
    @Column(name = "nome", length = 60)
    private String nome;
    @Column(name = "precocusto", precision = 3, scale = 2)
    private BigDecimal precocusto;
    @Column(name = "precovenda", precision = 3, scale = 2)
    private BigDecimal precovenda;
    @Convert(converter = StringListConverter.class)
    private List<String> tamanho;
    @Convert(converter = StringListConverter.class)
    private List<String> quantidade;

    public Produto() {
        super();
    }

    public Produto(String sku, String nome, BigDecimal precocusto, BigDecimal precovenda, List<String> tamanho,
            List<String> quantidade) {
        this.sku = sku;
        this.nome = nome;
        this.precocusto = precocusto;
        this.precovenda = precovenda;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
    }

    public Produto(Long id, String sku, String nome, BigDecimal precocusto, BigDecimal precovenda, List<String> tamanho,
            List<String> quantidade) {
        this.id = id;
        this.sku = sku;
        this.nome = nome;
        this.precocusto = precocusto;
        this.precovenda = precovenda;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
    }

}
