package isi.tn.worldcup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import isi.tn.worldcup.entities.User;
@Repository
public interface userRepository extends JpaRepository<User,Long>{


}
