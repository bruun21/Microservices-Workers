package bruun1.hruser.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import bruun1.hruser.entities.User;
import bruun1.hruser.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	
	
	public User findById(Long id){		
		Optional<User> userFound = repository.findById(id);
		return userFound.get();
	}
	
	public User findByEmail(String email){		
		User userFound = repository.findByEmail(email);
		return userFound;
	}

}
