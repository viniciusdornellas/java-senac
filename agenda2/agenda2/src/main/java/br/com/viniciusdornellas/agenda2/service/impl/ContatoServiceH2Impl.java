package br.com.viniciusdornellas.agenda2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.viniciusdornellas.agenda2.dto.ContatoDTO;
import br.com.viniciusdornellas.agenda2.entity.ContatoEntity;
import br.com.viniciusdornellas.agenda2.repository.ContatoRepository;
import br.com.viniciusdornellas.agenda2.service.IContatoService;


@Service
@Qualifier("H2")
public class ContatoServiceH2Impl implements IContatoService{
	
	@Autowired
	private ContatoRepository repository;
	
	@Override
	public void salvar(ContatoDTO contato) {
		//mapear ContatoDTO em ContatoEntity
		ContatoEntity entidade = new ContatoEntity();
		entidade.setNome(contato.getNome());
		entidade.setAltura(contato.getAltura());
		entidade.setIdade(contato.getIdade());
		repository.save(entidade);
	}

	@Override
	public List<ContatoDTO> obterTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContatoDTO obter(String nome) {
		// TODO Auto-generated method stub
		var entidade = repository.findById()
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
