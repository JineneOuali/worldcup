package isi.tn.worldcup.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import isi.tn.worldcup.entities.Partie;
import isi.tn.worldcup.services.IPartieService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class PartieController {
	
	@Autowired
	IPartieService partiev;

	
	@PostMapping("/addpartie")
	public Partie createPartie(@Valid @RequestBody Partie partie) {
	    return partiev.savePartie(partie);
	}
	
	@GetMapping("/parties")
    public List<Partie> findAll() {
        return partiev.findAllParties();
    }
	
	
	@GetMapping("/partie/{id}")
	public Partie getPartieById(@PathVariable(value = "id") Long Id) {
	    return partiev.findById(Id);
	           // .orElseThrow(() -> new ResourceNotFoundException("User", "id", Id));
	}
	
	@GetMapping("/partied/{datePartie}")
	public List<Partie> getPartieByDatePartie(@PathVariable(value = "datePartie") String DatePartie) {
	    return partiev.findByDatePartie(DatePartie);
	           // .orElseThrow(() -> new ResourceNotFoundException("User", "id", Id));
	}
	
	@DeleteMapping("/partie/{id}")
	public ResponseEntity<?> deletePartie(@PathVariable(value = "id") Long PartieId) {
	    Partie partie = partiev.findById(PartieId);
	            //.orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));

	   // userRepository.deleteById(userId);
	    partiev.delete(partie);
	    
	    return ResponseEntity.ok().build();
	}
	
	@PutMapping("/partie/{id}")
	public Partie updatePartie(@PathVariable(value = "id") Long Id, @Valid @RequestBody Partie partieDetails) {

	    Partie partie = partiev.findById(Id);
	    
	   
	    partie.setEquipe1(partieDetails.getEquipe1());
	    partie.setEquipe1(partieDetails.getEquipe2());
	    partie.setStade(partieDetails.getStade());
	    partie.setDatePartie(partieDetails.getDatePartie());

	    Partie updatedPartie = partiev.savePartie(partie);
	    return updatedPartie;
	}
	

}
