package me.pedroeugenio.mercadinho.apiusuarios.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.pedroeugenio.mercadinho.apiusuarios.entities.Usuario;
import me.pedroeugenio.mercadinho.apiusuarios.entities.UsuarioFuncao;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    private Long id;
    @CPF
    @NotNull
    private String cpf;
    @NotNull
    private String nome;
    @Email
    @NotNull
    private String email;
    @NotNull
    @Min(value = 5)
    private String senha;
    @NotNull
    private UsuarioEnderecoDTO endereco;
    private Set<String> funcoes = new HashSet<>();

    public UsuarioDTO(Usuario usuario) {
        this.id = usuario.getId();
        this.cpf = usuario.getCpf();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.senha = usuario.getSenha();
        this.endereco = new UsuarioEnderecoDTO(usuario.getEndereco());
        this.funcoes = usuario.getRoles().stream().map(UsuarioFuncao::getRoleName).collect(Collectors.toSet());
    }
}
