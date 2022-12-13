package br.com.viniciusdornellas.agenda2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.viniciusdornellas.agenda2.dto.ContatoDTO;
import br.com.viniciusdornellas.agenda2.dto.ContatoResponseDTO;
import br.com.viniciusdornellas.agenda2.service.IContatoService;

@RestController
@RequestMapping("/contato")
public class ContatoController {
	
	private final IContatoService service;
	
	@Autowired
	public ContatoController(@Qualifier("ContatoServiceAWSImpl") IContatoService service) {
		this.service = service;
	}

	@PostMapping("/cadastrar")
	public ContatoResponseDTO cadastrar (@RequestBody ContatoDTO request) {
		
		service.salvar(request);
		return null;
	}
	
}