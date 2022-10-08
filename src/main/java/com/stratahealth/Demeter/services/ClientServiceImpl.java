package com.stratahealth.Demeter.services;

import com.stratahealth.Demeter.dto.clientDTO.ClientDTOV0;
import com.stratahealth.Demeter.exceptions.ClientNotFoundException;
import com.stratahealth.Demeter.repository.ClientRepository;
import com.sun.tools.internal.ws.processor.model.ModelException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    String ID = "id";
    String FIRSTNAME = "firstName";
    String SSN = "nationalIdentifier";


    @Autowired
    private ClientRepository smartRepository;

    @Override
    public ClientDTOV0 fetchByIx(String clientIx) {
        ClientDTOV0 clientDTOV0 = null;
        List<ClientDTOV0> clientDTOV0s = new ArrayList<>();
        String[] parts = clientIx.split(":");
        String method = parts[1];
        String value = parts[2];
        if (method.equals(ID)) {
            clientDTOV0s = smartRepository.findById(Long.parseLong(value));
        } else if (method.equals(FIRSTNAME)) {
            clientDTOV0s = smartRepository.findByFirstName(value);
        } else if (method.equals(SSN)) {
            clientDTOV0s = smartRepository.findByNationalIdentifier(value);
        }
        clientDTOV0s.size();
        if (clientDTOV0s.size() > 1) {
            throw new ModelException("Multiple clients found for " + clientIx);
        } else if (clientDTOV0s.size() == 0) {
            throw new ClientNotFoundException(clientIx);
        }
        clientDTOV0 = clientDTOV0s.get(0);
        return clientDTOV0;
    }


}