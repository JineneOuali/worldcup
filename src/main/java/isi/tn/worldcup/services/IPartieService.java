package isi.tn.worldcup.services;


import java.util.List;

import isi.tn.worldcup.entities.Partie;

public interface IPartieService {

	  
		Partie savePartie(Partie partie);

		List<Partie> findAllParties();

		Partie findById(Long partieId);

		List<Partie> findByDatePartie(String datePartie);

		void delete(Partie partie);
}
