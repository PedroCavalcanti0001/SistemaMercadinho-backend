package me.pedroeugenio.mercadinhos.apiprodutos.dtos;

import me.pedroeugenio.mercadinhos.apiprodutos.entities.ProdutoEstoque;

import java.time.LocalDate;

public class ProdutoEstoqueDTO {
    private LocalDate dataAlteracao;
    private String usuario;
    private Integer quantidade;


    public ProdutoEstoqueDTO(ProdutoEstoque quantidade) {
        this.dataAlteracao = quantidade.getDataAlteracao();
        this.usuario = quantidade.getUsuario();
        this.quantidade = quantidade.getQuantidade();
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
