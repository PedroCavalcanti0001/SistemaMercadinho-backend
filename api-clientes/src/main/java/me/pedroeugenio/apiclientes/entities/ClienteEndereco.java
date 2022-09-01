package me.pedroeugenio.apiclientes.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.pedroeugenio.apiclientes.dtos.ClienteEnderecoDTO;

import javax.persistence.*;

@Entity
@Table(name = "tb_endereco")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteEndereco {

    @Id
    @Column(name = "cliente_id")
    private Long usuarioId;
    private String cep;
    private String rua;
    private String bairro;
    private String uf;
    private Integer numero;
    @OneToOne
    @MapsId
    @JoinColumn(name = "cliente_id")
    private Cliente usuario;

    public ClienteEndereco(Long usuarioId, ClienteEnderecoDTO endereco) {
        this.usuarioId = usuarioId;
        this.cep = endereco.getCep();
        this.rua = endereco.getRua();
        this.bairro = endereco.getBairro();
        this.uf = endereco.getUf();
        this.numero = endereco.getNumero();
    }
}
