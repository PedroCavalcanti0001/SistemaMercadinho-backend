package me.pedroeugenio.mercadinhos.apiprodutos.resources;

import me.pedroeugenio.mercadinhos.apiprodutos.dtos.ProdutoDTO;
import me.pedroeugenio.mercadinhos.apiprodutos.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("id/{id}")
    private ResponseEntity<ProdutoDTO> getById(@PathVariable Long id) {
        Optional<ProdutoDTO> optionalProduto = produtoService.findById(id);
        return optionalProduto.map(produtoDTO -> ResponseEntity.ok().body(produtoDTO))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
