package progetto.finale.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import progetto.finale.jpa.entity.Dipendenti;



@Repository
public interface DipendentiRepository extends JpaRepository<Dipendenti,Integer> {

	//public Dipendente findByidDipendente(int idDipendenti);
	
}
