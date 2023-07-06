package com.certicom.carrito.service;

import com.certicom.carrito.entity.Cliente;
import com.certicom.carrito.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public List<Cliente> getClientes(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> getCliente(Long id){
        return clienteRepository.findById(id);
    }

    public void saveOrUpdateCliente(Cliente cliente){
        clienteRepository.save(cliente);
    }

    public void deleteCliente(Long id){
        clienteRepository.deleteById(id);
    }
}
