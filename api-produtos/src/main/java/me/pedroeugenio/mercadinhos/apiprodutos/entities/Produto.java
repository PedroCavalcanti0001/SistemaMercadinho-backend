package me.pedroeugenio.mercadinhos.apiprodutos.entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String cor;
    private String descricao;

    @OneToOne(mappedBy = "produto", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private ProdutoEstoque estoque;

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

    public ProdutoEstoque getEstoque() {
        return estoque;
    }

    public void setEstoque(ProdutoEstoque quantidade) {
        this.estoque = quantidade;
    }
}
