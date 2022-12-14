package br.com.viniciusdornellas.agenda2.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.viniciusdornellas.agenda2.dto.ContatoDTO;
import br.com.viniciusdornellas.agenda2.service.IContatoService;

@Service
@Qualifier("ContatoServiceImpl")
public class ContatoServiceImpl implements IContatoService{

	
	private List<ContatoDTO> contatos;
	
	
	
	public ContatoServiceImpl() {
		this.contatos = new ArrayList<ContatoDTO>();
	}

	@Override
	public void salvar(ContatoDTO contato) {
		// TODO Auto-generated method stub
		System.out.println("Cadastrado com sucesso!");
		this.contatos.add(contato);
		System.out.println(contatos);
	}

}
