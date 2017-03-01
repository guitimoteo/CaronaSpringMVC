package br.com.carona.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.carona.entity.Carona;

@Repository
public interface CaronaRepository extends CrudRepository<Carona, Long> {

}
