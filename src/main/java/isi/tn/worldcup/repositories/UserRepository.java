package isi.tn.worldcup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import isi.tn.worldcup.entities.User;

@Repository
public interface UserRepository extends JpaRepository <User, Long>{

}