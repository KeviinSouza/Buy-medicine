package br.com.magna.buymedicine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.magna.buymedicine.VO.MedicamentoVO;
import br.com.magna.buymedicine.model.Medicamento;
import br.com.magna.buymedicine.repository.MedicamentoRepository;

@RestController
public class MedicamentoController {
	
	@Autowired
	public MedicamentoRepository medicamentoReposotory;
	
	@GetMapping(value = "/listar")
	public List<MedicamentoVO> ListaMedicamentos(String nomeDaUnidade){
		if(nomeDaUnidade != null) {
			List<Medicamento> medicamentos = medicamentoReposotory.findByUnidadeNome(nomeDaUnidade);
			return MedicamentoVO.converter(medicamentos);
		}
		List<Medicamento> medicamentos = medicamentoReposotory.findAll();
		return MedicamentoVO.converter(medicamentos);
	}

}
