package br.com.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.agenciaviagem.main.Viagem;

@Repository

public interface AgenciaRepository extends JpaRepository<Viagem, Integer> {

}
