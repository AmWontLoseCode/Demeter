package com.stratahealth.Demeter.repository;

import com.stratahealth.Demeter.dto.clientDTO.AddressDTOV0;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository<AddressDTOV0, String> {
}
