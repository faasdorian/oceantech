package br.com.zenith.oceantech.repository;

import br.com.zenith.oceantech.domain.Relatorio;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface RelatorioRepository extends CrudRepository<Relatorio, Integer> {

    public List<Relatorio> findAllByIdPorto(Integer porto);

    public List<Relatorio> findAllByIdPortoAndData(Integer idPorto, String data);

}
