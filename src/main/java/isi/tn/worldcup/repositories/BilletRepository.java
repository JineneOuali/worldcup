package isi.tn.worldcup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import isi.tn.worldcup.entities.Billet;

@Repository
public interface BilletRepository extends JpaRepository<Billet,Long> {

}

