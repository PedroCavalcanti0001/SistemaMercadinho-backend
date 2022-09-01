package me.pedroeugenio.mercadinhos.apiprodutos.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.pedroeugenio.mercadinhos.apiprodutos.entities.ProdutoEstoque;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoEstoqueDTO {
    private LocalDate dataAlteracao;
    private String usuario;
    private Integer quantidade;

    public ProdutoEstoqueDTO(ProdutoEstoque quantidade) {
        this.dataAlteracao = quantidade.getDataAlteracao();
        this.usuario = quantidade.getUsuario();
        this.quantidade = quantidade.getQuantidade();
    }
}
