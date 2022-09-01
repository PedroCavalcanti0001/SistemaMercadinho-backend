package me.pedroeugenio.mercadinhos.apiprodutos.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.pedroeugenio.mercadinhos.apiprodutos.entities.Produto;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDTO {

    private long id;
    private String nome;
    private String cor;
    private String descricao;
    private ProdutoEstoqueDTO estoque;


    public ProdutoDTO(Produto produto) {
        this.id = produto.getId();
        this.nome = produto.getNome();
        this.cor = produto.getCor();
        this.descricao = produto.getDescricao();
        this.estoque = new ProdutoEstoqueDTO(produto.getEstoque());
    }
}
