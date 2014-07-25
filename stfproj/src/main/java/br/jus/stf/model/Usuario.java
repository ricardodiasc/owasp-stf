/**
 * 
 */
package br.jus.stf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Ricardo Dias Cavalcante
 *
 */
@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String usuario;
	private String nome;
	private String email;
	private String numeroCartao;

	/**
	 * 
	 */
	public Usuario() {

	}

	/**
	 * 
	 * @param id
	 */
	public Usuario(Integer id) {
		super();
		this.id = id;
	}

	/**
	 * @param id
	 * @param usuario
	 * @param nome
	 * @param email
	 * @param numeroCartao
	 */
	public Usuario(Integer id, String usuario, String nome, String email,
			String numeroCartao) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.nome = nome;
		this.email = email;
		this.numeroCartao = numeroCartao;
	}

	public Integer getId() {
		return id;
	}

	public int getIdentificador() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	@Override
	public String toString() {
		return "UsuarioVO [id=" + id + ", usuario=" + usuario + ", nome="
				+ nome + ", email=" + email + ", numeroCartao=" + numeroCartao
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((numeroCartao == null) ? 0 : numeroCartao.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroCartao == null) {
			if (other.numeroCartao != null)
				return false;
		} else if (!numeroCartao.equals(other.numeroCartao))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

}
