package progetto.finale.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import progetto.finale.jpa.entity.Azienda;



@Repository
public interface AziendaRepository extends JpaRepository<Azienda,Integer> {

	
	
}
