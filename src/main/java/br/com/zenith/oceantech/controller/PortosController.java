package br.com.zenith.oceantech.controller;

import java.util.List;

import br.com.zenith.oceantech.domain.Relatorio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zenith.oceantech.domain.Porto;
import br.com.zenith.oceantech.repository.PortoRepository;

@RestController
@RequestMapping("/portos")
public class PortosController {
	
	private PortoRepository portoRepository;

	public PortosController(PortoRepository portoRepository) {
		super();
		this.portoRepository = portoRepository;
	}
	
	@GetMapping("/lista")
	public ResponseEntity<List<Porto>> getPortos() {
		List<Porto> portos = (List<Porto>) portoRepository.findAll();
		
		return new ResponseEntity<>(portos, HttpStatus.OK);
	}

}
