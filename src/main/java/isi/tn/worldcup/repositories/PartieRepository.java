package isi.tn.worldcup.repositories;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import isi.tn.worldcup.entities.Partie;

@Repository
public interface PartieRepository extends JpaRepository <Partie, Long>{

	List<Partie> findByDatePartie(String datePartie);

}
