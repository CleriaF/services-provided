package com.cleriasty.clientes.rest;

import com.cleriasty.clientes.model.entity.Cliente;
import com.cleriasty.clientes.model.repository.ClienteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private ClienteRepository repository;

    public ClienteController(ClienteRepository repository){
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvar(@RequestBody Cliente cliente) {
        return repository.save(cliente);
    }

}
