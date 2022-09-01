package me.pedroeugenio.mercadinho.apiusuarios.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.pedroeugenio.mercadinho.apiusuarios.dtos.UsuarioEnderecoDTO;

import javax.persistence.*;

@Entity
@Table(name = "tb_endereco")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioEndereco {

    @Id
    @Column(name = "usuario_id")
    private Long usuarioId;
    private String cep;
    private String rua;
    private String bairro;
    private String uf;
    private Integer numero;
    @OneToOne
    @MapsId
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public UsuarioEndereco(Long usuarioId, UsuarioEnderecoDTO usuarioEnderecoDTO){
        this.usuarioId = usuarioId;
        this.cep = usuarioEnderecoDTO.getCep();
        this.rua = usuarioEnderecoDTO.getRua();
        this.bairro = usuarioEnderecoDTO.getBairro();
        this.uf = usuarioEnderecoDTO.getUf();
        this.numero = usuarioEnderecoDTO.getNumero();
    }

}
