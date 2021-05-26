package br.com.magna.buymedicine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "medicamento")
public class Medicamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String tipo;
	private Integer quantidadeEstoque;
	private String unidadeDeMedida;
	@ManyToOne
	@JoinColumn(name = "unidade_medicamento")
	private Unidade unidade;
	
	
	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getTipo() {
		return tipo;
	}
	public String getUnidadeDeMedida() {
		return unidadeDeMedida;
	}
	

}
