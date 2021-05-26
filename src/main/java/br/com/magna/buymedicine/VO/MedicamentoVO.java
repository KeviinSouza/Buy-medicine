package br.com.magna.buymedicine.VO;

import java.util.List;
import java.util.stream.Collectors;

import br.com.magna.buymedicine.model.Medicamento;

public class MedicamentoVO {
	
	private String nome;
	private String tipo;
	private Integer quantidadeEmEstoque;
	
	public MedicamentoVO(Medicamento medicamento){
		nome = medicamento.getNome();
		tipo = medicamento.getTipo();
		quantidadeEmEstoque = medicamento.getQuantidadeEstoque();
	}
	
	public static List<MedicamentoVO> converter(List<Medicamento> medicamentos){
		
		return medicamentos.stream().map(MedicamentoVO::new).collect(Collectors.toList());	
	}
	
	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

	public Integer getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}

}
