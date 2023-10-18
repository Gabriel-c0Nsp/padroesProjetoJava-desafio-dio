package one.digitalinnovation.dioviagens.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.dioviagens.model.Cliente;
import one.digitalinnovation.dioviagens.repository.ClienteRepository;

@Service
public class ClienteService implements ClienteServiceInterface {
  @Autowired
  private ClienteRepository clienteRepository;

  @Override
  public Iterable<Cliente> buscarTodos() {
    return clienteRepository.findAll();
  }

  @Override
  public Cliente buscarPorId(Long id) {
    Optional<Cliente> cliente = clienteRepository.findById(id);
    return cliente.get();
  }

  @Override
  public void inserir(Cliente cliente) {
    // TODO: iniciar cliente com nome, telefone, destino e descricao
    clienteRepository.save(cliente);
  }

}
