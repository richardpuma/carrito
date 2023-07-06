package com.certicom.carrito.controller;

import com.certicom.carrito.entity.Cliente;
import com.certicom.carrito.service.ClienteService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/cliente")
@Tag(name = "Cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> getAllCliente(){

        return clienteService.getClientes();
    }

    @GetMapping("/{idCliente}")
    public Optional<Cliente> getCliente(@PathVariable("idCliente") Long idCliente){
        return clienteService.getCliente(idCliente);
    }

    @PostMapping
    public void saveOrUpdateCliente(@RequestBody Cliente cliente){
        clienteService.saveOrUpdateCliente(cliente);
    }

    @DeleteMapping("/{idCliente}")
    public void saveOrUpdateCliente(@PathVariable("idCliente") Long idCliente){
        clienteService.deleteCliente(idCliente);
    }
}
