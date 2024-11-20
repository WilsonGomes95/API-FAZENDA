package repositories;

import org.springframework.data.repository.CrudRepository;

import entities.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
	

}
