package me.pedroeugenio.mercadinho.apiusuarios.services;

import me.pedroeugenio.mercadinho.apiusuarios.dtos.UsuarioDTO;
import me.pedroeugenio.mercadinho.apiusuarios.entities.Usuario;
import me.pedroeugenio.mercadinho.apiusuarios.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Optional<UsuarioDTO> getByEmail(String email) {
        Optional<Usuario> find = repository.findByEmail(email);
        return find.map(UsuarioDTO::new);
    }

    public Optional<UsuarioDTO> getByCpf(String cpf) {
        return repository.findByCpf(cpf).map(UsuarioDTO::new);
    }
}
