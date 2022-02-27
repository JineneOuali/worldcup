package isi.tn.worldcup.services;

import java.util.List;

import isi.tn.worldcup.entities.Billet;

public interface IBilletService {

	Billet saveBillet(Billet billet);  

	List<Billet> findAllBillet(); 

}
