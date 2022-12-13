package br.com.viniciusdornellas.agenda2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import br.com.viniciusdornellas.agenda2.negocio.Estatistica;

@Configuration
public class Config {
	
	@Primary
	@Bean
	public Estatistica getEstatistica() {
		
		return new Estatistica();
	}
}
