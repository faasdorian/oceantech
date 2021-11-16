package br.com.zenith.oceantech.service;

import br.com.zenith.oceantech.domain.Relatorio;
import br.com.zenith.oceantech.repository.RelatorioRepository;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class RelatorioService {

    private RelatorioRepository relatorioRepository;

    public RelatorioService(RelatorioRepository relatorioRepository) {
        this.relatorioRepository = relatorioRepository;
    }

    public List<Relatorio> getRelatoriosByIdPortoAndData(Integer idPorto, Integer ano, Integer mes, Integer dia) throws ParseException {
        String data = (dia + "/" + mes + "/" + ano);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");

        Date aux = dateFormat.parse(data);
        data = dateFormat.format(aux);

        List<Relatorio> relatorios = relatorioRepository.findAllByIdPortoAndData(idPorto, data);

        return relatorios;
    }

    public List<Relatorio> getRelatoriosByIdPorto(Integer idPorto) {
        return relatorioRepository.findAllByIdPorto(idPorto);
    }
}
