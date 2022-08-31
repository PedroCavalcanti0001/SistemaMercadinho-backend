package me.pedroeugenio.mercadinhos.apiprodutos.repositories;

import me.pedroeugenio.mercadinhos.apiprodutos.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
