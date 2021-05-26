package br.com.magna.buymedicine.VO;

import java.util.List;
import java.util.stream.Collectors;

import br.com.magna.buymedicine.model.Comprador;

public class CompradorVO {
	
	private String nome;
	
	public CompradorVO(Comprador comprador) {
		nome = comprador.getNome();
	}

	public static List<CompradorVO> converter(List<Comprador> compradores) {
		
		return compradores.stream().map(CompradorVO::new).collect(Collectors.toList());
	}

}
