package br.com.zenith.oceantech.controller;

import br.com.zenith.oceantech.domain.Indicador;
import br.com.zenith.oceantech.service.IndicadorService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/indicadores")
public class IndicadorController {

    private IndicadorService indicadorService;

    public IndicadorController(IndicadorService indicadorService) {
        this.indicadorService = indicadorService;
    }

    @PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addIndicador(@Valid @RequestBody Indicador indicador) {
        indicadorService.addIndicador(indicador);
        return ResponseEntity.ok("Indicador válido.");
    }
}
