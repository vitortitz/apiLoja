// package io.github.vitortitz.vendasapi.model;

// import java.math.BigDecimal;
// import java.util.List;

// import javax.persistence.Column;
// import javax.persistence.ElementCollection;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.Table;

// import org.hibernate.annotations.TypeDef;

// import lombok.Data;

// @Entity
// @Table(name = "tb_produto")
// @Data
// @TypeDef(
// name = "list-array",
// typeClass = ListArrayType.class)
// public class Produto {
// @Id
// @GeneratedValue(strategy = GenerationType.IDENTITY)
// private Long id;
// @Column(name = "sku", length = 30)
// private String sku;
// @Column(name = "nome", length = 60)
// private String nome;
// @Column(name = "precoCusto", precision = 3, scale = 2)
// private BigDecimal precoCusto;
// @Column(name = "precoVenda", precision = 3, scale = 2)
// private BigDecimal precoVenda;
// @ElementCollection

// private List<String> tamanhos;
// @ElementCollection

// private List<Integer> quantidades;

// public Produto(String sku, String nome, BigDecimal precoCusto, BigDecimal
// precoVenda, List<String> tamanhos,
// List<Integer> quantidades) {
// this.sku = sku;
// this.nome = nome;
// this.precoCusto = precoCusto;
// this.precoVenda = precoVenda;
// this.tamanhos = tamanhos;
// this.quantidades = quantidades;
// }

// public Produto() {
// super();
// }

// }
