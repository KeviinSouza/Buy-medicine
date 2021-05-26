package br.com.magna.buymedicine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.magna.buymedicine.model.Comprador;

public interface CompradorRepository extends JpaRepository<Comprador, Long> {

	CompradorRepository findByUnidadeNome(Integer idComprador);

}
