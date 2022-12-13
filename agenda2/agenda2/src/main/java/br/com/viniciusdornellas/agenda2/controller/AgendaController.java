package br.com.viniciusdornellas.agenda2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.viniciusdornellas.agenda2.dto.ContatoDTO;
import br.com.viniciusdornellas.agenda2.dto.ContatoResponseDTO;
import br.com.viniciusdornellas.agenda2.negocio.Estatistica;

@Controller
@RequestMapping(path = "/agenda")
public class AgendaController {
	
	@Autowired
	private Estatistica est;

	@ResponseBody 
	@RequestMapping( method = RequestMethod.POST, path = "/cadastrar" ) 
	public ContatoResponseDTO cadastrar( @RequestBody ContatoDTO request) {
		
		System.out.println(request.getNome());
		
		ContatoResponseDTO resposta = new ContatoResponseDTO();
		resposta.setMensagem("Cadastrado com sucesso!");
		return resposta;
	}

	@RequestMapping (method = RequestMethod.GET, path = "/pesquisar")
	public ContatoResponseDTO procurar() {
		ContatoResponseDTO resposta = new ContatoResponseDTO();
		resposta.setMensagem("Cadastrado com sucesso!");
		return resposta;
	}
	
	@ResponseBody
	@RequestMapping (method = RequestMethod.POST, path = "/estatistica/resumida")
	public ContatoResponseDTO resumir ( @RequestBody ContatoDTO request) {
		
		ContatoResponseDTO resposta = new ContatoResponseDTO();
		resposta.setCaracteres(request.getNome().length());
		StringBuilder strb = new StringBuilder(request.getNome());
		String nome = request.getNome();
		resposta.setNome_invertido(nome = strb.reverse().toString());
		return resposta;
		
	}
	
	@ResponseBody
	@RequestMapping (method = RequestMethod.POST, path = "/estatistica/completa")
	public ContatoResponseDTO completo ( @RequestBody ContatoDTO request) {
		

		ContatoResponseDTO resposta = new ContatoResponseDTO();
		resposta.setCaracteres(request.getNome().length());
		resposta.setNome_invertido(est.reverse(request.getNome()));
		resposta.setDias_vivivos(request.getIdade()*365);
		return resposta;
		
	}
}
