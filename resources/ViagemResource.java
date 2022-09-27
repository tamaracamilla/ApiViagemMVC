package br.com.viagem.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agenciaviagem.main.Viagem;
import br.com.viagem.service.ViagemService;

@RestController
@RequestMapping(value = "/viagem")
@CrossOrigin("*")
public class ViagemResource {
	
	@Autowired
	private ViagemService service;
	
	@GetMapping(value = "{id}")
	public ResponseEntity<Viagem>findById(@PathVariable Integer id){
		Viagem viagem = service.findById(id);
		return ResponseEntity.ok().body(viagem);
	}
	
	@GetMapping
	public ResponseEntity<List<Viagem>> findAll(){
		List<Viagem> viagem = service.findAll();
		return ResponseEntity.ok().body(viagem);
		
	} 
	
	public ResponseEntity<Viagem> save(@RequestBody Viagem viagem){
		Viagem obj = service.save(viagem);
		return ResponseEntity.ok().body(obj);
	}
	public ResponseEntity<Viagem> update(@RequestBody Viagem viagem){
		Viagem obj = service.update(viagem);
		return ResponseEntity.ok().body(obj);
	}
	
	@DeleteMapping (value = "{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}
