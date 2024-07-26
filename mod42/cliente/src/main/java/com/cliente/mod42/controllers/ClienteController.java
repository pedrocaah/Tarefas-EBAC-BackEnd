package com.cliente.mod42.controllers;

import com.cliente.mod42.model.ClienteModel;
import com.cliente.mod42.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping("/clientes")
    public ResponseEntity<ClienteModel> salvarCliente(@RequestBody ClienteModel cliente) {
        var clienteModel = new ClienteModel();
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteRepository.save(cliente));
    }

    @GetMapping("/clientes")
    public ResponseEntity<List<ClienteModel>> listarClientes() {
        List<ClienteModel> clientes = clienteRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(clientes);
    }

    @GetMapping("/clientes/{id}")
    public ResponseEntity<ClienteModel> getCliente(@PathVariable(value = "id") UUID id) {
        Optional<ClienteModel> cliente = clienteRepository.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(cliente.get());
    }

    @PutMapping("/clientes/{id}")
    public ResponseEntity<Object> updateCliente(@PathVariable(value = "id") UUID id,
                                                @RequestBody ClienteModel clienteModel) {
        Optional<ClienteModel> cliente = clienteRepository.findById(id);
        var clienteModelAtual = cliente.get();
        return ResponseEntity.status(HttpStatus.OK).body("Cliente alterado com sucesso");
    }

    @DeleteMapping("/clientes/{id}")
    public ResponseEntity<Object> deleteCliente(@PathVariable(value = "id") UUID id) {
        Optional<ClienteModel> cliente = clienteRepository.findById(id);
        clienteRepository.delete(cliente.get());
        return ResponseEntity.status(HttpStatus.OK).body("Cliente deletado com sucesso");
    }
}
