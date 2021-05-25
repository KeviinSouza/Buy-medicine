package br.com.magna.buymedicine.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.boot.context.properties.bind.Name;

@Entity
@Table(name = "unidade")
public class Unidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@OneToMany(mappedBy = "unidade")
	private List<Medicamento> medicamento;
	@OneToOne
	@JoinColumn(name = "comprador_unidade")
	private Comprador comprador;
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return nome;
	}
	
	public Comprador getComprador() {
		return comprador;
	}
	
	public List<Medicamento> getMedicine(){
		return medicamento;
	}

}
