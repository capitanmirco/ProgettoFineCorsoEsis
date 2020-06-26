package progetto.finale.jpa.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class SedeDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3679119352174911246L;
	
	private int idSede; 

	private String citta; 

	private String descrizione; 

	private String indirizzo; 

	private String nome;

	
}
