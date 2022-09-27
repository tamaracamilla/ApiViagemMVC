package br.com.agenciaviagem.main;


import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Viagem implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private @Id @GeneratedValue Integer id;
	private String IdReserva;
	private String IdPassageiro;
	private String IdPacote;
	private String IdUsuario;
	
	public Viagem() {}

	public Viagem(String IdReserva, String IdPassageiro, String IdPacote, String IdUsuario) {

	    this.setIdReserva(IdReserva);
	    this.setIdPassageiro(IdPassageiro);
	    this.setIdPacote(IdPacote);
	    this.setIdUsuario(IdUsuario);
	  }

	  public Integer getId() {
	    return this.id;
	  }

	public String getIdReserva() {
		return IdReserva;
	}

	public void setIdReserva(String idReserva) {
		IdReserva = idReserva;
	}

	public String getIdPassageiro() {
		return IdPassageiro;
	}

	public void setIdPassageiro(String idPassageiro) {
		IdPassageiro = idPassageiro;
	}

	public String getIdPacote() {
		return IdPacote;
	}

	public void setIdPacote(String idPacote) {
		IdPacote = idPacote;
	}

	public String getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		IdUsuario = idUsuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Viagem other = (Viagem) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "ProjetoViagemMvcApplication [id=" + id + ", IdReserva=" + IdReserva + ", IdPassageiro=" + IdPassageiro
				+ ", IdPacote=" + IdPacote + ", IdUsuario=" + IdUsuario + "]";
	}

	public void setId(Object object) {
		 
	}

	
}

