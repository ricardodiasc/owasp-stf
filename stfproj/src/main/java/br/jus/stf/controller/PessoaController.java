/**
 * 
 */
package br.jus.stf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.jus.stf.model.Usuario;
import br.jus.stf.repository.UsuarioRepository;

/**
 * 
 * 
 * @author Ricardo Dias Cavalcante
 *
 */
@RestController
@EnableAutoConfiguration
public class PessoaController {

	@Autowired
	public UsuarioRepository usuarioRepository;

	@RequestMapping("/pesquisarPessoas")
	@ResponseBody
	public String pesquisarPessoas() {
		return "Teste Sucesso.";
	}

	@RequestMapping("/pessoa")
	@ResponseBody
	public Usuario pesquisarPessoa(
			@RequestParam(value = "id", required = true) Integer id) {
		Usuario usuario = new Usuario();
		usuario.setNome("Ricardo Dias Cavalcante");
		usuario.setEmail("ricardodc@gmail.com");
		usuario.setNumeroCartao("9999999999");
		usuario.setUsuario("ricardodc " + id);
		return usuario;
	}

	@RequestMapping("/listaUsuarios")
	@ResponseBody
	public List<Usuario> listaUsuarios() {

		Usuario usuario1 = new Usuario(1, "usuario1", "Usuario um",
				"usuario1@stf.jus.br", "11111111111");
		Usuario usuario2 = new Usuario(2, "usuario2", "Usuario um",
				"usuario2@stf.jus.br", "22222222222");
		Usuario usuario3 = new Usuario(3, "usuario3", "Usuario um",
				"usuario3@stf.jus.br", "33333333333");
		Usuario usuario4 = new Usuario(4, "usuario4", "Usuario um",
				"usuario4@stf.jus.br", "44444444444");
		Usuario usuario5 = new Usuario(5, "usuario5", "Usuario um",
				"usuario5@stf.jus.br", "55555555555");

		usuarioRepository.save(usuario1);
		usuarioRepository.save(usuario2);
		usuarioRepository.save(usuario3);
		usuarioRepository.save(usuario4);
		usuarioRepository.save(usuario5);

		ArrayList<Usuario> listaUsu = new ArrayList<Usuario>();
		listaUsu.add(usuario1);
		listaUsu.add(usuario2);
		listaUsu.add(usuario3);

		System.out.println("passa por aqui");
		return listaUsu;
	}

	@RequestMapping("/pessoa/{nomeUsuario}")
	public List<Usuario> recuperaUsuario(@PathVariable String nomeUsuario) {
		List<Usuario> listaUsuario = usuarioRepository
				.findByUsuario(nomeUsuario);

		return listaUsuario;

	}

	@RequestMapping("/pessoas")
	public List<Usuario> recuperaTodos() {
		List<Usuario> listaUsuario = new ArrayList<Usuario>();
		Iterable<Usuario> it = usuarioRepository.findAll();

		for (Usuario usuarioVO : it) {
			listaUsuario.add(usuarioVO);
		}

		return listaUsuario;
	}

}
