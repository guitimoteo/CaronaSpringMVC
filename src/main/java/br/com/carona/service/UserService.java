/**
 * 
 */
package br.com.carona.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.carona.entity.User;
import br.com.carona.exception.UserExistException;
import br.com.carona.repository.UserRepository;

/**
 * 
 * Regras de negócio do usuário.
 * @author guitimoteo
 *
 */
@Service
public class UserService {
	
	@Autowired
	UserRepository users;
	
	PasswordEncoder encoder = new BCryptPasswordEncoder();
	
	public void add(User user) throws UserExistException{
		if(!users.findByEmail(user).isEmpty()){;
			throw new UserExistException("Usuário já existente");
		}
		else{
			user.setPassword(encoder.encode((user.getPassword())));
			users.save(user);	
		}
	}
	
	public Boolean login(User user) {
		User userLogin = users.findByEmail(user).get(0);
		
		if(userLogin == null){
			throw new UsernameNotFoundException("Usuário ou senha inválidos");
		}
		if(!encoder.matches(user.getPassword(), userLogin.getPassword())){
			throw new UsernameNotFoundException("Usuário ou senha inválidos");
		}
		
		return true;
	}

}
