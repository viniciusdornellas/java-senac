package br.com.viniciusdornellas.agenda2.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.viniciusdornellas.agenda2.dto.ContatoDTO;
import br.com.viniciusdornellas.agenda2.service.IContatoService;

@Service
public class ContatoServiceImpl implements IContatoService{

	@Override
	public void salvar(ContatoDTO contato) {
		// TODO Auto-generated method stub
		System.out.println("Cadastrado com sucesso!");
	}

}
