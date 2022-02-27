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


import isi.tn.worldcup.entities.User;
import isi.tn.worldcup.repository.userRepository;





@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	userRepository userv;
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		List<User> pro = userv.findAll();
        return pro;
	    
	}

	@PostMapping("/adduser")
	public User createUser(@Valid @RequestBody User user) {
	    return userv.save(user);
	}

	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable(value = "id") Long Id) {
	    return userv.findById(Id).orElseThrow(null);
	           // .orElseThrow(() -> new ResourceNotFoundException("User", "id", Id));
	}
	@DeleteMapping("/user/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable(value = "id") Long userId) {
	    User user = userv.findById(userId).orElseThrow(null);
	            //.orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));

	   // userRepository.deleteById(userId);
	    userv.delete(user);

	    return ResponseEntity.ok().build();
	}
	
	@PutMapping("/user/{id}")
	public User updateUser(@PathVariable(value = "id") Long Id,
	                                        @Valid @RequestBody User userDetails) {

	    User user = userv.findById(Id).orElseThrow(null);
	    
	   
	    user.setEmail(userDetails.getEmail());
	    user.setPwd(userDetails.getPwd());
	    user.setFname(userDetails.getFname());
	    user.setLname(userDetails.getLname());

	    User updatedUser = userv.save(user);
	    return updatedUser;
	}
	
	
	
	
}
