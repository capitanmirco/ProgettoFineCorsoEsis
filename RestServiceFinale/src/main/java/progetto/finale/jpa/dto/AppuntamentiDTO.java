package progetto.finale.jpa.dto;

import java.io.Serializable;
import java.nio.charset.CodingErrorAction;
import java.util.Date;

import lombok.Data;
@Data
public class AppuntamentiDTO implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 7935817938742077206L;


	private int idAppuntamento;

	
	private int costoVisita;

	
	private Date dataInizio;
	
	private String codiceFiscale;
	
	private int matricola;
	
	private int idSede;


}