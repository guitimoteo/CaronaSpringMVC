package br.com.carona.repository;

import br.com.carona.entity.User;


import org.springframework.stereotype.Repository;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	
}
