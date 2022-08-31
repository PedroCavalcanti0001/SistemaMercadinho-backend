package me.pedroeugenio.mercadinhos.apiprodutos.dtos;

import me.pedroeugenio.mercadinhos.apiprodutos.entities.Produto;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ProdutoEstoqueDTO getEstoque() {
        return estoque;
    }

    public void setEstoque(ProdutoEstoqueDTO estoque) {
        this.estoque = estoque;
    }
}
