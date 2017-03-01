package br.com.carona.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.carona.entity.Pedido;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Long> {

}
