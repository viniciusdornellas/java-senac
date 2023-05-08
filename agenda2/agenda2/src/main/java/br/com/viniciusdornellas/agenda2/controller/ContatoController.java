package br.com.viniciusdornellas.agenda2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.viniciusdornellas.agenda2.dto.ContatoDTO;
import br.com.viniciusdornellas.agenda2.dto.ContatoResponseDTO;
import br.com.viniciusdornellas.agenda2.dto.EnderecoIBGEDTO;
import br.com.viniciusdornellas.agenda2.service.IContatoService;

@RestController
@RequestMapping("/contato")
public class ContatoController {
	
	private final IContatoService service;
	private final RestTemplate template;
	
	@Autowired
	public ContatoController(@Qualifier("H2") IContatoService service, RestTemplate template) {
		this.service = service;
		this.template = template;
	}

	@PostMapping("/cadastrar")
	public ResponseEntity<ContatoResponseDTO> cadastrar (@RequestBody ContatoDTO request) {
		
		var cep = request.getEndereco().getCep();
		var url = "viacep.com.br/ws/"+ cep +"/json/";
		var response = template.getForEntity(url, EnderecoIBGEDTO.class);
		if(response.hasBody()) {
			var body = response.getBody();
			System.out.println(body);
		}
		service.salvar(request);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@GetMapping("/pesquisar")
	public ResponseEntity<List<ContatoDTO>> listarTodos() {
		var resultado = service.obterTodos();
		return ResponseEntity.ok(resultado);
	}
	
	@GetMapping("/pesquisar/{nome}")
	public ResponseEntity<ContatoDTO> listar(@PathVariable String nome) {
		var resultado = service.obter(nome);
		return ResponseEntity.ok(resultado);
	}
}