package progetto.finale.jpa.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import progetto.finale.jpa.entity.Clienti;


@Repository
public interface ClientiRepository extends JpaRepository<Clienti,Integer> {

}
