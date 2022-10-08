package com.stratahealth.Demeter.repository;

import com.stratahealth.Demeter.dto.clientDTO.ProvinceDTOV0;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProvinceRepository extends MongoRepository<ProvinceDTOV0, String> {
}
