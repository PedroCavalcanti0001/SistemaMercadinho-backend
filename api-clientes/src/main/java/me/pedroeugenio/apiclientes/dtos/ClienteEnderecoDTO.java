package me.pedroeugenio.apiclientes.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.pedroeugenio.apiclientes.resources.entities.ClienteEndereco;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteEnderecoDTO {
    private String cep;
    private String rua;
    private String bairro;
    private String uf;
    private Integer numero;

    public ClienteEnderecoDTO(ClienteEndereco endereco) {
        this.cep = endereco.getCep();
        this.rua = endereco.getRua();
        this.bairro = endereco.getBairro();
        this.uf = endereco.getUf();
        this.numero = endereco.getNumero();
    }
}
