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
	@Column(name="id_appuntamento")
	private Integer idAppuntamento;

	@Column(name="costo_visita")
	private Integer costoVisita;

	@Temporal(TemporalType.DATE)
	@Column(name="data_inizio")
	private Date dataInizio;

	//bi-directional many-to-one association to Clienti
	@ManyToOne
	@JoinColumn(name="codice_fiscale")
	private Clienti clienti;

	//bi-directional many-to-one association to Dipendenti
	@ManyToOne
	@JoinColumn(name="matricola")
	private Dipendenti dipendenti;

	//bi-directional many-to-one association to Sede
	@ManyToOne
	@JoinColumn(name="id_sede")
	private Sede sede;

	public Appuntamenti() {
	}

	public Integer getIdAppuntamento() {
		return this.idAppuntamento;
	}

	public void setIdAppuntamento(Integer idAppuntamento) {
		this.idAppuntamento = idAppuntamento;
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

	public Sede getSede() {
		return this.sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

}