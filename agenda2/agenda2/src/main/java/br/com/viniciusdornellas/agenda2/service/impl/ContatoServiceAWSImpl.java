package br.com.viniciusdornellas.agenda2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.viniciusdornellas.agenda2.dto.ContatoDTO;
import br.com.viniciusdornellas.agenda2.service.IContatoService;

@Service
@Qualifier("ContatoServiceAWSImpl")
public class ContatoServiceAWSImpl implements IContatoService{

	@Override
	public void salvar(ContatoDTO contato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ContatoDTO> obterTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContatoDTO obter(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(ContatoDTO contato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(ContatoDTO contato) {
		// TODO Auto-generated method stub
		
	}

}
