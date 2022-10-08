package com.stratahealth.Demeter.repository;

import com.stratahealth.Demeter.dto.clientDTO.ClientDTOV0;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ClientRepository extends MongoRepository<ClientDTOV0, String> {

    List<ClientDTOV0> findByFirstName(String firstName);
    List<ClientDTOV0> findByLastName(String lastName);
    List<ClientDTOV0> findByNationalIdentifier(String nationalIdentifier);
    List<ClientDTOV0> findById(Long id);
}
