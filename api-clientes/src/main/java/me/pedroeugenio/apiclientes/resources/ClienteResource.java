package me.pedroeugenio.apiclientes.resources;

import me.pedroeugenio.apiclientes.dtos.ClienteDTO;
import me.pedroeugenio.apiclientes.resources.dtos.ClienteDto;
import me.pedroeugenio.apiclientes.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService service;

    @GetMapping("/cpf/{cpf}")
    private ResponseEntity<ClienteDTO> getByCpf(@PathVariable String cpf){
        Optional<ClienteDTO> optionalCliente = service.findByCpf(cpf);
        return optionalCliente.map(clienteDTO -> ResponseEntity.ok().body(clienteDTO))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
