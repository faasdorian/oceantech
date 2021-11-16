package br.com.zenith.oceantech.repository;

import br.com.zenith.oceantech.domain.Relatorio;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RelatorioRepository extends CrudRepository<Relatorio, Integer> {

    public List<Relatorio> findAllByIdPorto(Integer porto);

    public List<Relatorio> findAllByIdPortoAndData(Integer idPorto, String data);

}
