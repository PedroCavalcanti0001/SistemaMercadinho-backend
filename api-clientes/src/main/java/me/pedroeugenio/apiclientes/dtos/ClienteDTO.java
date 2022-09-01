package me.pedroeugenio.apiclientes.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.pedroeugenio.apiclientes.entities.Cliente;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {

    private Long id;
    private String nome;
    private String cpf;
    private Float limiteCompras;
    private LocalDate dataCadastro;
    private ClienteEnderecoDTO endereco;

    public ClienteDTO(Cliente cliente){
        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.cpf = cliente.getCpf();
        this.limiteCompras = cliente.getLimiteCompras();
        this.dataCadastro = cliente.getDataCadastro();
        this.endereco = new ClienteEnderecoDTO(cliente.getEndereco());
    }
}
