package one.digitalinnovation.dioviagens.repository;

import one.digitalinnovation.dioviagens.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
  
}
