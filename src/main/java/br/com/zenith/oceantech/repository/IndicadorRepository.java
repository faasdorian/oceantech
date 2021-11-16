package br.com.zenith.oceantech.repository;

import br.com.zenith.oceantech.domain.Indicador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndicadorRepository extends CrudRepository<Indicador, Integer> {

    public List<Indicador> findAllByIdRelatorio (Integer idRelatorio);

}
