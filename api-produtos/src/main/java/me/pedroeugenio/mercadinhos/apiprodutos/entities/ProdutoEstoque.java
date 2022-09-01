package me.pedroeugenio.mercadinhos.apiprodutos.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_produtos_estoque")
@Data
@AllArgsConstructor
@NoArgsConstructor
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
}
