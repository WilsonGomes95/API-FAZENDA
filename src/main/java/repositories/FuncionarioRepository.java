package repositories;

import org.springframework.data.repository.CrudRepository;

import entities.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer>{

}
