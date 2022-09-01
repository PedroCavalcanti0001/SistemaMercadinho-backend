package me.pedroeugenio.mercadinho.apiusuarios.resources;

import me.pedroeugenio.mercadinho.apiusuarios.dtos.UsuarioDTO;
import me.pedroeugenio.mercadinho.apiusuarios.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioResource {

    @Autowired
    private UsuarioService service;

    @GetMapping("/email/{email}")
    private ResponseEntity<UsuarioDTO> getByEmail(@PathVariable String email) {
        Optional<UsuarioDTO> optional = service.getByEmail(email);
        return optional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/cpf/{cpf}")
    private ResponseEntity<UsuarioDTO> getByCpf(@PathVariable String cpf) {
        Optional<UsuarioDTO> optional = service.getByCpf(cpf);
        return optional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
