package br.com.magna.buymedicine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.magna.buymedicine.VO.CompradorVO;
import br.com.magna.buymedicine.model.Comprador;
import br.com.magna.buymedicine.repository.CompradorRepository;

@RestController
public class CompradorController {
	
	@Autowired
	CompradorRepository compradorRepository;
	
	@GetMapping(value = "/compradores")
	public List<CompradorVO>  unidadePorComprador(){
		
		List<Comprador> compradores = compradorRepository.findAll();
		return CompradorVO.converter(compradores);
		
	}

}
