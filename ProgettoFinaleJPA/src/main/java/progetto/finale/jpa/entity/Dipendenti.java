package progetto.finale.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the dipendenti database table.
 * 
 */
@Entity
@NamedQuery(name="Dipendenti.findAll", query="SELECT d FROM Dipendenti d")
public class Dipendenti implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_dipendenti")
	private Integer idDipendenti;

	@Column(name="codice_fiscale")
	private String codiceFiscale;

	private String cognome;

	private String email;

	private String nome;

	private String password;

	private String ruolo;

	private Integer stipendio;

	private String validato;

	//bi-directional many-to-one association to Appuntamenti
	@OneToMany(mappedBy="dipendenti")
	private List<Appuntamenti> appuntamentis;

	//bi-directional many-to-one association to Sede
	@ManyToOne
	@JoinColumn(name="id_sede")
	private Sede sede;

	public Dipendenti() {
	}

	public Integer getIdDipendenti() {
		return this.idDipendenti;
	}

	public void setIdDipendenti(Integer idDipendenti) {
		this.idDipendenti = idDipendenti;
	}

	public String getCodiceFiscale() {
		return this.codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRuolo() {
		return this.ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public Integer getStipendio() {
		return this.stipendio;
	}

	public void setStipendio(Integer stipendio) {
		this.stipendio = stipendio;
	}

	public String getValidato() {
		return this.validato;
	}

	public void setValidato(String validato) {
		this.validato = validato;
	}

	public List<Appuntamenti> getAppuntamentis() {
		return this.appuntamentis;
	}

	public void setAppuntamentis(List<Appuntamenti> appuntamentis) {
		this.appuntamentis = appuntamentis;
	}

	public Appuntamenti addAppuntamenti(Appuntamenti appuntamenti) {
		getAppuntamentis().add(appuntamenti);
		appuntamenti.setDipendenti(this);

		return appuntamenti;
	}

	public Appuntamenti removeAppuntamenti(Appuntamenti appuntamenti) {
		getAppuntamentis().remove(appuntamenti);
		appuntamenti.setDipendenti(null);

		return appuntamenti;
	}

	public Sede getSede() {
		return this.sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

}