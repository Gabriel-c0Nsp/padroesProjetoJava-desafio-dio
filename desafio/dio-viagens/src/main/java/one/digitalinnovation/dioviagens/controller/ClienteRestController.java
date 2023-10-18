package one.digitalinnovation.dioviagens.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.dioviagens.model.Cliente;
import one.digitalinnovation.dioviagens.service.ClienteServiceInterface;

@RestController
@RequestMapping("clientes")
public class ClienteRestController {

  @Autowired
  private ClienteServiceInterface clienteServiceInterface;

  @GetMapping
  public ResponseEntity<Iterable<Cliente>> buscarTodos() {
    return ResponseEntity.ok(clienteServiceInterface.buscarTodos());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
    return ResponseEntity.ok(clienteServiceInterface.buscarPorId(id));
  }

  @PostMapping
  public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente) {
    clienteServiceInterface.inserir(cliente);
    return ResponseEntity.ok(cliente);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
    clienteServiceInterface.atualizar(id, cliente);
    return ResponseEntity.ok(cliente);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deletar(@PathVariable Long id) {
    clienteServiceInterface.deletar(id);
    return ResponseEntity.ok().build();
  }

}
