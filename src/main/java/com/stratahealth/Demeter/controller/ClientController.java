package com.stratahealth.Demeter.controller;


import com.stratahealth.Demeter.dto.clientDTO.ClientDTOV0;
import com.stratahealth.Demeter.exceptions.ClientNotFoundException;
import com.stratahealth.Demeter.repository.ClientRepository;
import com.stratahealth.Demeter.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientRepository smartRepository;

    @Autowired
    private ClientService clientService;

    @GetMapping(value = "/client", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ClientDTOV0> fetchAll() {
        List<ClientDTOV0> smartDTOs = smartRepository.findAll();
        if (smartDTOs.size() > 0) {
            return smartDTOs;
        } else {
            throw new ClientNotFoundException("ALL");
        }
    }

    @GetMapping(value= "/client/{clientIx}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ClientDTOV0 fetchByIx(@PathVariable String clientIx) {
        return clientService.fetchByIx(clientIx);
    }
 
    @PutMapping(value = "/client", produces = MediaType.APPLICATION_JSON_VALUE)
    public ClientDTOV0 createClient(@RequestBody ClientDTOV0 ClientDTOV0) throws Exception {
        try {
            return smartRepository.save(ClientDTOV0);
        } catch (DataAccessException e) {
            throw new Exception("Can't create client");
        }
    }

    @DeleteMapping(value = "/client/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    void deleteClient(@PathVariable String id) {
        smartRepository.deleteById(id);
    }
}
