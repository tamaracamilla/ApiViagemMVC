package br.com.viagem.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.viagem.service.DBService;

@Configuration
@Profile("dev")
public class TesteConfig {
	
	@Autowired
	private DBService service;
	
	@Bean
	public void inicializar(){
		service.iniciaizadorBancoDados();
		
	}

}
