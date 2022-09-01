package me.pedroeugenio.mercadinho.apiusuarios.repositories;

import me.pedroeugenio.mercadinho.apiusuarios.dtos.UsuarioDTO;
import me.pedroeugenio.mercadinho.apiusuarios.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);

    Optional<Usuario> findByCpf(String cpf);
}
