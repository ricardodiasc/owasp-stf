/**
 * 
 */
package br.jus.stf.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import br.jus.stf.model.Livro;

/**
 * @author Ricardo Dias Cavalcante
 *
 */
@Component
public interface LivroRepository extends CrudRepository<Livro, Integer> {

	List<Livro> findByNome(String nome);

}
