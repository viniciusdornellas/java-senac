package br.com.viniciusdornellas.agenda2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

import br.com.viniciusdornellas.agenda2.negocio.Estatistica;

@Configuration
public class Config {
	
	@Primary
	@Bean
	public RestTemplate getRestTemplate() {
		
		return new RestTemplate();
	}
}
