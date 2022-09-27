package br.com.viagem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import br.com.agenciaviagem.main.Viagem;
import br.com.repositories.AgenciaRepository;
import br.com.service.exeption.ObjectNotFoundExeption;


@Service


public class ViagemService {
	
	@Autowired
	private AgenciaRepository repo;
	
	public Viagem findById (Integer id) {
		Optional<Viagem> viagem = repo.findById(id); 
		if(viagem.isEmpty()) { 
			throw new ObjectNotFoundExeption("Objeto Não encontrado Id: " + id + "Tipo" + Viagem.class.getName());
			
		}
		return viagem.get(); }
	
	public List <Viagem>  findAll(){
		return repo.findAll();
		
	}
	
	public Viagem save(Viagem viagem){
		viagem.setId(null);
		return repo.save(viagem);
		
	}
	
	public Viagem update(Viagem viagem) {
		Viagem newViagem = findById(viagem.getId());
		newViagem.setIdPacote(viagem.getIdPacote());
		newViagem.setIdPassageiro(viagem.getIdPassageiro());
		newViagem.setIdReserva(viagem.getIdReserva());
		newViagem.setIdUsuario(viagem.getIdUsuario());
		return repo.save(newViagem);
	}

	public void delete(Integer id) {
		
		
	}
	  
	

}
