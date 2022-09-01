package me.pedroeugenio.mercadinho.apiusuarios.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.pedroeugenio.mercadinho.apiusuarios.dtos.UsuarioDTO;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Table(name = "tb_usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private String nome;
    private String email;
    private String senha;
    @OneToOne
    @PrimaryKeyJoinColumn
    private UsuarioEndereco endereco;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "tb_usuario_funcao",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<UsuarioFuncao> roles = new HashSet<>();

    public Usuario(UsuarioDTO usuarioDTO) {
        this.id = usuarioDTO.getId();
        this.cpf = usuarioDTO.getCpf();
        this.nome = usuarioDTO.getNome();
        this.email = usuarioDTO.getEmail();
        this.senha = usuarioDTO.getSenha();
        this.endereco = new UsuarioEndereco(this.id, usuarioDTO.getEndereco());
        this.roles = usuarioDTO.getFuncoes().stream().map(UsuarioFuncao::new).collect(Collectors.toSet());
    }

}
