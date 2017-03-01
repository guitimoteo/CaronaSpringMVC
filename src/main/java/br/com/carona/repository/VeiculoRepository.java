package br.com.carona.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.carona.entity.Veiculo;

@Repository
public interface VeiculoRepository extends CrudRepository<Veiculo, Long> {

}
