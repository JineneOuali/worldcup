package isi.tn.worldcup.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import isi.tn.worldcup.entities.Partie;
import isi.tn.worldcup.repositories.PartieRepository;

@Service
public class ImpPartieService implements IPartieService{

	
	@Autowired
	PartieRepository prepos;
	
	
	@Override
	public Partie savePartie(Partie partie) {
		// TODO Auto-generated method stub
		return prepos.save(partie);
	}

	@Override
	public List<Partie> findAllParties() {
		// TODO Auto-generated method stub
		return prepos.findAll();
	}


	@Override
	public List<Partie> findByDatePartie(String datePartie) {
		// TODO Auto-generated method stub
		List<Partie> partie = prepos.findByDatePartie(datePartie);
        return partie;
	}

	@Override
	public void delete(Partie partie) {
		prepos.delete(partie);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Partie findById(Long partieId) {
		// TODO Auto-generated method stub
		Partie partie = prepos.findById(partieId).orElse(null);
        return partie;
	}
}
