package progetto.finale.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the azienda database table.
 * 
 */
@Entity
@NamedQuery(name="Azienda.findAll", query="SELECT a FROM Azienda a")
public class Azienda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="partita_iva")
	private Integer partitaIva;

	private String descrizione;

	private String nome;

	//bi-directional many-to-one association to Sede
	@OneToMany(mappedBy="azienda")
	private List<Sede> sedes;

	public Azienda() {
	}

	public Integer getPartitaIva() {
		return this.partitaIva;
	}

	public void setPartitaIva(Integer partitaIva) {
		this.partitaIva = partitaIva;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Sede> getSedes() {
		return this.sedes;
	}

	public void setSedes(List<Sede> sedes) {
		this.sedes = sedes;
	}

	public Sede addSede(Sede sede) {
		getSedes().add(sede);
		sede.setAzienda(this);

		return sede;
	}

	public Sede removeSede(Sede sede) {
		getSedes().remove(sede);
		sede.setAzienda(null);

		return sede;
	}

}