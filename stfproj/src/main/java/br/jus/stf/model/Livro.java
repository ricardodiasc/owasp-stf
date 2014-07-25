/**
 * 
 */
package br.jus.stf.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author Ricardo Dias Cavalcante
 *
 */
@Entity
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nome;
	private String descricao;
	private String isbn;
	private Double preco;
	@OneToMany(mappedBy="livro")
	private List<Comentario> listaComentarios;

	
	public Livro(){
		
	}
	public Livro(Integer id){
		this.id = id;
	}
	
	/**
	 * @param id
	 * @param nome
	 * @param descricao
	 * @param isbn
	 * @param preco
	 */
	public Livro(Integer id, String nome, String descricao, String isbn,
			Double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.isbn = isbn;
		this.preco = preco;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public List<Comentario> getListaComentarios() {
		return listaComentarios;
	}
	public void setListaComentarios(List<Comentario> listaComentarios) {
		this.listaComentarios = listaComentarios;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Livro other = (Livro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
