package isi.tn.worldcup.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import isi.tn.worldcup.entities.Billet;
import isi.tn.worldcup.repositories.BilletRepository;

public class ImpBilletService implements IBilletService {

	@Autowired
	BilletRepository bipos;  

	@Override
	public Billet saveBillet(Billet billet) {
		return bipos.save(billet);
	}

	@Override
	public List<Billet> findAllBillet() {
		// TODO Auto-generated method stub
		return bipos.findAll();
	}

}

