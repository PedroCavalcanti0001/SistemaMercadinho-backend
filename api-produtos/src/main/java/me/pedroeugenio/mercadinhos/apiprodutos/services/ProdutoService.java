package me.pedroeugenio.mercadinhos.apiprodutos.services;

import me.pedroeugenio.mercadinhos.apiprodutos.dtos.ProdutoDTO;
import me.pedroeugenio.mercadinhos.apiprodutos.entities.Produto;
import me.pedroeugenio.mercadinhos.apiprodutos.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public Optional<ProdutoDTO> findById(Long id) {
        Optional<Produto> produto =  produtoRepository.findById(id);
        return produto.map(ProdutoDTO::new);
    }
}
