package br.com.viagem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agenciaviagem.main.Viagem;
import br.com.repositories.AgenciaRepository;

@Service
public class DBService {
	
	@Autowired
	private AgenciaRepository repo;
	
		public void iniciaizadorBancoDados() {
			Viagem viagem = new Viagem(null,"São Paulo","Natal","Salvador");
			repo.save(viagem);
		}
	

}
