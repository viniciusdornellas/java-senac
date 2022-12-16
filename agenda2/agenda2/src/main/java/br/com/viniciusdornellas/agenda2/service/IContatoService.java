package br.com.viniciusdornellas.agenda2.service;

import java.util.List;

import br.com.viniciusdornellas.agenda2.dto.ContatoDTO;

public interface IContatoService {
	
		 void salvar(ContatoDTO contato);	
		 List<ContatoDTO> obterTodos();
		 ContatoDTO obter(String nome);
		 void atualizar(ContatoDTO contato);
		 void excluir(ContatoDTO contato);
}
