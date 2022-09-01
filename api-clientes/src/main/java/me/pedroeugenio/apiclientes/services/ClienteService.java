package me.pedroeugenio.apiclientes.services;

import me.pedroeugenio.apiclientes.dtos.ClienteDTO;
import me.pedroeugenio.apiclientes.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public Optional<ClienteDTO> findByCpf(String cpf) {
        return repository.findByCpf(cpf).map(ClienteDTO::new);
    }
}
