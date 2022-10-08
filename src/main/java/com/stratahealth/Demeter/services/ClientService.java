package com.stratahealth.Demeter.services;

import com.stratahealth.Demeter.dto.clientDTO.ClientDTOV0;


public interface ClientService {
    ClientDTOV0 fetchByIx(String clientIx);
}
