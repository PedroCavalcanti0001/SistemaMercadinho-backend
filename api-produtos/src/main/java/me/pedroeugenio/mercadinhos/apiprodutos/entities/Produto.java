package me.pedroeugenio.mercadinhos.apiprodutos.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_produtos")
@Data
@AllArgsConstructor
@NoArgsConstructor
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
}
