package progetto.finale.jpa.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import progetto.finale.jpa.entity.Appuntamenti;




@Repository
public interface AppuntamentiRepository extends JpaRepository<Appuntamenti,Integer> {
	

	
}
