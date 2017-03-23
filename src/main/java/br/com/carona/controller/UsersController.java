package br.com.carona.controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import br.com.carona.entity.User;
import br.com.carona.repository.UserRepository;
import br.com.carona.view.View;
import br.com.carona.entity.Message;

@RestController
@RequestMapping(value = "/api/users/") 
public class UsersController {
	@Autowired
	UserRepository users;
	
	@JsonView(View.Summary.class)
	@RequestMapping(value = "login", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public User login(@RequestParam(value = "name") String name, @RequestParam("password") String password){
		User user = new User();
		
		user.setName(name);
		user.setPassword(password);
		user.setEmail("email@email");
		users.save(user);
		return user; 
	}
	
	@JsonView(View.Summary.class)
	@RequestMapping(value="add",method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Message<?> create(@RequestBody User user){
			
		return new Message("200","success",null);
		
	}
	
	@JsonView(View.Summary.class)
	@RequestMapping(value="edit",method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Message<?> edit(@RequestBody User user){
			
		return new Message("200","success",null);
		
	}
	
	@JsonView(View.Summary.class)
	@RequestMapping(value="delete",method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Message<?> delete(@RequestBody User user){
			
		return new Message("200","success",null);
		
	}
}
