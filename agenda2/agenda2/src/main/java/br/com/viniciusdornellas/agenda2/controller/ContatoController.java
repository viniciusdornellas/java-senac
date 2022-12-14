package br.com.viniciusdornellas.agenda2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import br.com.viniciusdornellas.agenda2.dto.ContatoDTO;
import br.com.viniciusdornellas.agenda2.dto.ContatoResponseDTO;
import br.com.viniciusdornellas.agenda2.service.IContatoService;

@RestController
@RequestMapping("/contato")
public class ContatoController {
	
	private final IContatoService service;
	
	@Autowired
	public ContatoController(@Qualifier("ContatoServiceImpl") IContatoService service) {
		this.service = service;
	}

	@PostMapping("/cadastrar")
	public ResponseEntity<ContatoResponseDTO> cadastrar (@RequestBody ContatoDTO request) {
		
		service.salvar(request);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
}