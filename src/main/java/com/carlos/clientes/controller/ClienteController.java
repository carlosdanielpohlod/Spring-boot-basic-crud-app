package com.carlos.clientes.controller;

import com.carlos.clientes.model.Cliente;
import com.carlos.clientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository cLienteRepository;

    @GetMapping
    public List<Cliente> listar(){
        return cLienteRepository.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionar(@RequestBody Cliente cliente){
        return cLienteRepository.save(cliente);
    }
}
