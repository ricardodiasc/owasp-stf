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

import br.jus.stf.model.Usuario;
import br.jus.stf.repository.UsuarioRepository;

@RestController
@RequestMapping("/rest")
public class UsuarioController {
	
	@Autowired
	public UsuarioRepository usuarioRepository;

	@RequestMapping(value="/usuario", method = RequestMethod.POST)
	public void incluirUsuario(@RequestBody @Valid Usuario usuario){
		usuarioRepository.save(usuario);
	}
	
	@RequestMapping(value="/usuario/{id}", method = RequestMethod.DELETE)
	public void excluirUsuario(@PathVariable Integer id){
		usuarioRepository.delete(id);
	}
	
	@RequestMapping(value="/usuario/{id}", method = RequestMethod.GET)
	public Usuario recuperarUsuario(@PathVariable Integer id){
		Usuario usuario = usuarioRepository.findOne(id);
		return usuario;
	}
	
	@RequestMapping(value="/usuario/", method = RequestMethod.GET)
	public List<Usuario> listaUsuarios(){
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		Iterable<Usuario> it = usuarioRepository.findAll();
		for (Usuario usuario : it) {
			listaUsuarios.add(usuario);
		}
		return listaUsuarios;
	} 

}
