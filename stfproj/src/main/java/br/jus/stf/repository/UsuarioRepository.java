/**
 * 
 */
package br.jus.stf.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import br.jus.stf.model.Usuario;

/**
 * @author Ricardo Dias Cavalcante
 *
 */
@Component
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
	
	List<Usuario> findByUsuario(String usuario);

}
