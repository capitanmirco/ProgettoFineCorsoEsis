package progetto.finale.jpa.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
@Data
public class ClientiDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6712902255862559935L;

	private String codiceFiscale;

	private String citta;

	private String cognome;

	
	private Date dataNascita;

	private String email;

	private String indirizzo;

	private String nome;

	private String password;

	private Integer telefono;

	private String validato;

	
}