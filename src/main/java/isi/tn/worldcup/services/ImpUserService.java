package isi.tn.worldcup.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import isi.tn.worldcup.entities.User;
import isi.tn.worldcup.repositories.UserRepository;

@Service
public class ImpUserService implements IUserService{

	@Autowired
	UserRepository urepos;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return urepos.save(user);
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return urepos.findAll();
	}
	
}
