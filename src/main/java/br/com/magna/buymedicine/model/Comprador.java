package br.com.magna.buymedicine.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "comprador")
public class Comprador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@OneToMany(mappedBy = "comprador")
	private List<Unidade> unidade;
	
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	
	public List<Unidade> getUnidade() {
		return unidade;
	}	

}
