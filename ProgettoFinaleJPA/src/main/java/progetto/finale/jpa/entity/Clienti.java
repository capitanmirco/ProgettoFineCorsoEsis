package progetto.finale.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the clienti database table.
 * 
 */
@Entity
@NamedQuery(name="Clienti.findAll", query="SELECT c FROM Clienti c")
public class Clienti implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="codice_fiscale")
	private String codiceFiscale;

	private String citta;

	private String cognome;

	@Temporal(TemporalType.DATE)
	@Column(name="data_nascita")
	private Date dataNascita;

	private String email;

	private String indirizzo;

	private String nome;

	private String password;

	private Integer telefono;

	private String validato;

	//bi-directional many-to-one association to Appuntamenti
	@OneToMany(mappedBy="clienti")
	private List<Appuntamenti> appuntamentis;

	public Clienti() {
	}

	public String getCodiceFiscale() {
		return this.codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getCitta() {
		return this.citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date getDataNascita() {
		return this.dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIndirizzo() {
		return this.indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
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

	public Integer getTelefono() {
		return this.telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
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
		appuntamenti.setClienti(this);

		return appuntamenti;
	}

	public Appuntamenti removeAppuntamenti(Appuntamenti appuntamenti) {
		getAppuntamentis().remove(appuntamenti);
		appuntamenti.setClienti(null);

		return appuntamenti;
	}

}