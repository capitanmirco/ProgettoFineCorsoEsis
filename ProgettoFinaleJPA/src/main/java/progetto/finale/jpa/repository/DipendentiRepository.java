package progetto.finale.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DipendentiRepository extends JpaRepository<Dipendente,Integer> {

	//public Dipendente findByidDipendente(int idDipendenti);
	
}
