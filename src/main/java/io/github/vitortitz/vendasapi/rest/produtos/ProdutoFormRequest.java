package io.github.vitortitz.vendasapi.rest.produtos;

import java.math.BigDecimal;
import java.util.List;

import io.github.vitortitz.vendasapi.model.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoFormRequest {
    private Long id;
    private String sku, nome;
    private BigDecimal precocusto, precovenda;
    private List<String> tamanhos;
    private List<String> quantidades;

    public Produto toModel() {
        return new Produto(id, sku, nome, precocusto, precovenda, tamanhos, quantidades);
    }

    public static ProdutoFormRequest fromModel(Produto produto) {
        return new ProdutoFormRequest(produto.getId(), produto.getSku(), produto.getNome(), produto.getPrecocusto(),
                produto.getPrecovenda(), produto.getTamanho(), produto.getQuantidade());
    }

}
