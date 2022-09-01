package me.pedroeugenio.apiclientes.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.pedroeugenio.apiclientes.dtos.ClienteDTO;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    @OneToOne
    @PrimaryKeyJoinColumn
    private ClienteEndereco endereco;
    private Float limiteCompras;
    private LocalDate dataCadastro;


    public Cliente(ClienteDTO clienteDTO) {
        this.id = clienteDTO.getId();
        this.nome = clienteDTO.getNome();
        this.cpf = clienteDTO.getCpf();
        this.endereco = new ClienteEndereco(this.id, clienteDTO.getEndereco());
        this.limiteCompras = clienteDTO.getLimiteCompras();
        this.dataCadastro = clienteDTO.getDataCadastro();
    }


}

