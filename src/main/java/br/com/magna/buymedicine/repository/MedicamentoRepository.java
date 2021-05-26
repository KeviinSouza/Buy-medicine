package br.com.magna.buymedicine.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.magna.buymedicine.model.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long>{

	List<Medicamento> findByUnidadeNome(String nomeDaUnidade);

}
