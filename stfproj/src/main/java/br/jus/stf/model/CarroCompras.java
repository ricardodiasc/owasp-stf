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
import javax.persistence.OneToOne;

/**
 * @author Ricardo Dias Cavalcante
 *
 */
@Entity
public class CarroCompras {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@OneToOne
	private Usuario usuario;
	@OneToMany
	private List<Livro> listaLivros;
	private String cupomDesconto;
	private Double total;

	public Integer getId() {
		return id;
	}

	public int getIdentificador() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Livro> getListaLivros() {
		return listaLivros;
	}

	public void setListaLivros(List<Livro> listaLivros) {
		this.listaLivros = listaLivros;
	}

	public String getCupomDesconto() {
		return cupomDesconto;
	}

	public void setCupomDesconto(String cupomDesconto) {
		this.cupomDesconto = cupomDesconto;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

}
