package isi.tn.worldcup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import isi.tn.worldcup.entities.Billet;
import isi.tn.worldcup.repositories.BilletRepository;
import isi.tn.worldcup.repositories.UserRepository;

@RestController
@RequestMapping("/api")
public class BilletController {
	
	@Autowired
	UserRepository userv;  
	
	@Autowired
	BilletRepository bserv;
	
	
	
	@GetMapping("/billets")
	public List<Billet> getAllBillets() {
		List<Billet> bi = bserv.findAll();
        return (List<Billet>) bi;
	    
	}

	@PostMapping("/addbillet")
	public Billet createUser(@Validated @RequestBody Billet billet) {
	    return bserv.save(billet);
	}

	
	@GetMapping("/billet/{id}")
	public Billet getBilletById(@PathVariable(value = "id") Long Id) {
	    return bserv.findById(Id).orElseThrow(null);
	           // .orElseThrow(() -> new ResourceNotFoundException("Billet", "id", Id));
	}
	@DeleteMapping("/billet/{id}")
	public ResponseEntity<?> deleteBillet(@PathVariable(value = "id") Long billetId) {
	    Billet billet = bserv.findById(billetId).orElseThrow(null);
	            //.orElseThrow(() -> new ResourceNotFoundException("Billet", "id", billetId));

	   // billetRepository.deleteById(billetId);
	    bserv.delete(billet);

	    return ResponseEntity.ok().build();
	}
	
	@PutMapping("/billet/{id}")
	public Billet updateBillet(@PathVariable(value = "id") Long Id,
	                                        @Validated @RequestBody Billet billetDetails) {

	    Billet billet = bserv.findById(Id).orElseThrow(null);
	    
	   
	    billet.seteventTime(billetDetails.geteventTime());
	    billet.seteventSpace(billetDetails.geteventSpace());
	    billet.seteventPrice(billetDetails.geteventPrice());

	    Billet updatedBillet = bserv.save(billet);
	    return updatedBillet;
	}
	
	

	@PutMapping("/affecter/{uid}/{pid}")
	public void affecterUser(@PathVariable(value = "uid") Long Id,
			@PathVariable(value = "pid") Long Idp ) {

	 

	}
	
	
	
	
	
}