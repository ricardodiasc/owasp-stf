/**
 * 
 */
package br.jus.stf.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.jus.stf.model.Livro;
import br.jus.stf.repository.LivroRepository;

/**
 * 
 * 
 * @author Ricardo Dias Cavalcante
 *
 */
@RestController
@RequestMapping("/rest")
public class LivroController {
	
	@Autowired
	public LivroRepository livroRepository;

	@RequestMapping(value="/livro", method = RequestMethod.GET)
	public List<Livro> listaLivros(){
		List<Livro> listaLivros = new ArrayList<Livro>();
		Iterable<Livro> it = livroRepository.findAll();
		for (Livro livro : it) {
			listaLivros.add(livro);
		}
		return listaLivros;
	} 

	@RequestMapping(value="/livro", method = RequestMethod.POST)
	public void incluirLivro(@RequestBody @Valid Livro livro){
		livroRepository.save(livro);
	}
	
	@RequestMapping(value="/livro/{id}", method = RequestMethod.DELETE)
	public void excluirLivro(@PathVariable Integer id){
		livroRepository.delete(id);
	}
	
	@RequestMapping(value="/livro/{id}", method = RequestMethod.GET)
	public Livro recuperarLivro(@PathVariable Integer id){
		Livro livro = livroRepository.findOne(id);
		return livro;
	}
	

}