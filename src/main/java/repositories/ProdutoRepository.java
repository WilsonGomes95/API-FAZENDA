package repositories;

import org.springframework.data.repository.CrudRepository;

import entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

}
