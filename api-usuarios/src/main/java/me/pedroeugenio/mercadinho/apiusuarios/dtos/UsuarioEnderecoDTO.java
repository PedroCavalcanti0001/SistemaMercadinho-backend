package me.pedroeugenio.mercadinho.apiusuarios.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.pedroeugenio.mercadinho.apiusuarios.entities.UsuarioEndereco;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioEnderecoDTO {

    @NotNull
    private String cep;
    @NotNull
    private String rua;
    @NotNull
    private String bairro;
    @NotNull
    private String uf;
    private Integer numero;


    public UsuarioEnderecoDTO(UsuarioEndereco usuarioEndereco) {
        this.cep = usuarioEndereco.getCep();
        this.rua = usuarioEndereco.getRua();
        this.bairro = usuarioEndereco.getBairro();
        this.uf = usuarioEndereco.getUf();
        this.numero = usuarioEndereco.getNumero();
    }

}
