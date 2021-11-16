package br.com.zenith.oceantech.service;

import br.com.zenith.oceantech.domain.Indicador;
import br.com.zenith.oceantech.repository.IndicadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndicadorService {

    private IndicadorRepository indicadorRepository;

    public IndicadorService(IndicadorRepository indicadorRepository) {
        this.indicadorRepository = indicadorRepository;
    }

    public List<Indicador> getIndicadoresByIdRelatorio(Integer idRelatorio) {
        List<Indicador> indicadores = indicadorRepository.findAllByIdRelatorio(idRelatorio);
        return indicadores;
    }

}
