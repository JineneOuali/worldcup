package isi.tn.worldcup.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import isi.tn.worldcup.services.IUserService;
import isi.tn.worldcup.entities.User;
import isi.tn.worldcup.repository.userRepository;

@Service
public class ImpUserService implements IUserService{
	
	@Autowired
	userRepository urepos;
    
	@Override
	public User saveUser(User user) {
		return urepos.save(user);
	}

	@Override
	public List<User> findAllUsers() {
		return urepos.findAll();
	}
}

