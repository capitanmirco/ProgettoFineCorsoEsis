package progetto.finale.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the appuntamenti database table.
 * 
 */
@Entity
@NamedQuery(name="Appuntamenti.findAll", query="SELECT a FROM Appuntamenti a")
public class Appuntamenti implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_appuntamenti")
	private Integer idAppuntamenti;

	@Column(name="costo_visita")
	private Integer costoVisita;

	@Temporal(TemporalType.DATE)
	@Column(name="data_inizio")
	private Date dataInizio;

	//bi-directional many-to-one association to Clienti
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Clienti clienti;

	//bi-directional many-to-one association to Dipendenti
	@ManyToOne
	@JoinColumn(name="id_dipendente")
	private Dipendenti dipendenti;

	public Appuntamenti() {
	}

	public Integer getIdAppuntamenti() {
		return this.idAppuntamenti;
	}

	public void setIdAppuntamenti(Integer idAppuntamenti) {
		this.idAppuntamenti = idAppuntamenti;
	}

	public Integer getCostoVisita() {
		return this.costoVisita;
	}

	public void setCostoVisita(Integer costoVisita) {
		this.costoVisita = costoVisita;
	}

	public Date getDataInizio() {
		return this.dataInizio;
	}

	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}

	public Clienti getClienti() {
		return this.clienti;
	}

	public void setClienti(Clienti clienti) {
		this.clienti = clienti;
	}

	public Dipendenti getDipendenti() {
		return this.dipendenti;
	}

	public void setDipendenti(Dipendenti dipendenti) {
		this.dipendenti = dipendenti;
	}

}