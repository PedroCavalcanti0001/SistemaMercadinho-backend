package me.pedroeugenio.mercadinhos.apiprodutos.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_produtos_estoque")
public class ProdutoEstoque {

    @Id
    @Column(name = "produto_id")
    private Long produtoId;
    private LocalDate dataAlteracao;
    private String usuario;
    private Integer quantidade;
    @OneToOne
    @MapsId
    @JoinColumn(name = "produto_id")
    private Produto produto;


    public Long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Long produtoId) {
        this.produtoId = produtoId;
    }

    public LocalDate getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(LocalDate dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
