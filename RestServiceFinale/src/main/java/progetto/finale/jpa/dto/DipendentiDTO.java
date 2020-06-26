package progetto.finale.jpa.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class DipendentiDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5608274133244910784L;

	private Integer matricola;

	private String cognome;

	private String email;

	private String nome;

	private String password;

	private String ruolo;

	private Integer stipendio;

	private String validato;

	

}