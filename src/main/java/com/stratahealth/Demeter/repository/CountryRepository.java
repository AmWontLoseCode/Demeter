package com.stratahealth.Demeter.repository;

import com.stratahealth.Demeter.dto.clientDTO.CountryDTOV0;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CountryRepository extends MongoRepository<CountryDTOV0, String> {
}
