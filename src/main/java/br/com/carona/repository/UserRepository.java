package br.com.carona.repository;

import br.com.carona.entity.User;


import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	/**
	 * Cria uma lista de usuários identificados por email.
	 * @param user
	 * @return
	 */
	List<User> findByEmail(User user);
	
	
}
