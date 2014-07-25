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

import br.jus.stf.model.CarroCompras;
import br.jus.stf.model.Livro;
import br.jus.stf.repository.CarroComprasRepository;
import br.jus.stf.repository.LivroRepository;

@RestController
@RequestMapping(value = "/rest")
public class CarroComprasController {

	public List<Livro> listaLivros = new ArrayList<Livro>();

	@Autowired
	public CarroComprasRepository carroComprasRepository;

	@Autowired
	public LivroRepository LivroRepository;

	/**
	 * Adiciona livro a coleçao
	 * 
	 * @param id
	 */
	@RequestMapping(value="/carroCompras/livro/{id}", method = RequestMethod.POST)
	public void adicionarLivro(@PathVariable Integer id){
		this.listaLivros.add(LivroRepository.findOne(id));
	}

	@RequestMapping(value = "/carroCompras/livro/{id}", method = RequestMethod.DELETE)
	public void removerLivro(@PathVariable Integer id) {
		this.listaLivros.remove(new Livro(id));
	}

	@RequestMapping(value="/carroCompras/", method= RequestMethod.POST)
	public void realizarCompra(@RequestBody @Valid CarroCompras carroCompras) {
		this.carroComprasRepository.save(carroCompras);
	}

}
