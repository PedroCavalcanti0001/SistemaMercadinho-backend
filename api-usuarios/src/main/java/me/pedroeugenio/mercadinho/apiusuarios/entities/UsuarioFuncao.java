package me.pedroeugenio.mercadinho.apiusuarios.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_funcao")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioFuncao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roleName;

    public UsuarioFuncao(String roleName){
        this.roleName = roleName;
    }
}
