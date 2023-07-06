package com.certicom.carrito.controller;

import com.certicom.carrito.entity.Cliente;
import com.certicom.carrito.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/vi/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> getAllCliente(){
        return clienteService.getClientes();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> getCliente(@PathVariable("id") Long id){
        return clienteService.getCliente(id);
    }

    @PostMapping
    public void saveOrUpdateCliente(@RequestBody Cliente cliente){
        clienteService.saveOrUpdateCliente(cliente);
    }

    @DeleteMapping("/{id}")
    public void saveOrUpdateCliente(@PathVariable("id") Long id){
        clienteService.deleteCliente(id);
    }
}
