package isi.tn.worldcup.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import isi.tn.worldcup.entities.User;
import isi.tn.worldcup.repositories.UserRepository;
import isi.tn.worldcup.services.IUserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class UserController {
	
	
	@Autowired
	IUserService userv;

	
	@PostMapping("/addusert")
	public User createUser(@Valid @RequestBody User user) {
	    return userv.saveUser(user);
	}
}
