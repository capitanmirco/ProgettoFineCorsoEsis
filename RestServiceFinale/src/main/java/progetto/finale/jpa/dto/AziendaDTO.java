package progetto.finale.jpa.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class AziendaDTO implements Serializable{
	
	
	private static final long serialVersionUID = -8349586575695637212L;
	private int partitaIva;
	private String nome,descrizione;
	
	
	
	
}
