package isi.tn.worldcup.services;

import java.util.List;
import isi.tn.worldcup.entities.User;

public interface IUserService {

	User saveUser(User user);
	List<User> findAllUsers();
}
