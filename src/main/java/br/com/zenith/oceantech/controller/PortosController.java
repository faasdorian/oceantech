package br.com.zenith.oceantech.controller;

import java.util.List;

import br.com.zenith.oceantech.domain.Relatorio;
import br.com.zenith.oceantech.service.PortoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.zenith.oceantech.domain.Porto;
import br.com.zenith.oceantech.repository.PortoRepository;

import javax.validation.Valid;

@RestController
@RequestMapping("/portos")
public class PortosController {
	
	private PortoService portoService;

	public PortosController(PortoService portoService) {
		this.portoService = portoService;
	}

	@PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity addPorto(@Valid @RequestBody Porto porto) {
		portoService.addPorto(porto);
		return ResponseEntity.ok("Porto válido.");
	}

	@GetMapping("/lista")
	public ResponseEntity<List<Porto>> getPortos() {
		List<Porto> portos = portoService.getAllPortos();
		return new ResponseEntity<>(portos, HttpStatus.OK);
	}

}
