package com.redmorf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.redmorf.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
