package br.com.viniciusdornellas.agenda2.negocio;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Estatistica implements iEstatistica {

	public Estatistica() {
		System.out.println("Construiu estatistica");
	}
	
	public String reverse (String input) {
		return new StringBuilder(input).reverse().toString();
	}
}
