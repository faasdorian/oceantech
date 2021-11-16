package br.com.zenith.oceantech.controller;

import br.com.zenith.oceantech.domain.Indicador;
import br.com.zenith.oceantech.domain.Relatorio;
import br.com.zenith.oceantech.repository.PortoRepository;
import br.com.zenith.oceantech.service.IndicadorService;
import br.com.zenith.oceantech.service.RelatorioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/relatorios")
public class RelatoriosController {

    private RelatorioService relatorioService;
    private IndicadorService indicadorService;

    public RelatoriosController(RelatorioService relatorioService, IndicadorService indicadorService) {
        this.relatorioService = relatorioService;
        this.indicadorService = indicadorService;
    }

    @GetMapping("/lista/{idPorto}")
    public ResponseEntity<List<Relatorio>> getAllRelatoriosByPorto(@PathVariable Integer idPorto) {
        List<Relatorio> relatorios = relatorioService.getRelatoriosByIdPorto(idPorto);
        return new ResponseEntity<>(relatorios, HttpStatus.OK);
    }

    @GetMapping("/lista/{idPorto}/{ano}/{mes}/{dia}")
    public ResponseEntity<List<Relatorio>> getRelatorios(@PathVariable Integer idPorto, @PathVariable Integer ano, @PathVariable Integer mes, @PathVariable Integer dia) throws ParseException {
        List<Relatorio> relatorios = relatorioService.getRelatoriosByIdPortoAndData(idPorto, ano, mes, dia);
        return new ResponseEntity<>(relatorios, HttpStatus.OK);
    }

    @GetMapping("/{idRelatorio}")
    public ResponseEntity<List<Indicador>> getRelatorioWithIndicador(@PathVariable Integer idRelatorio) {
        List<Indicador> indicadores = indicadorService.getIndicadoresByIdRelatorio(idRelatorio);
        return new ResponseEntity<>(indicadores, HttpStatus.OK);
    }

}
