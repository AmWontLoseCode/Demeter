package com.stratahealth.Demeter.dto.clientDTO;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stratahealth.Demeter.enums.PhoneNumberLabels;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "phoneNumber")
public class PhoneNumberDTOV0 {
    @Id
    private String id;
    private String extension;
    private String countryCode;
    private String localNumber;
    private PhoneNumberLabels label;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLocalNumber() {
        return localNumber;
    }

    public void setLocalNumber(String localNumber) {
        this.localNumber = localNumber;
    }

    public PhoneNumberLabels getLabel() {
        return label;
    }

    public void setLabel(PhoneNumberLabels label) {
        this.label = label;
    }
}
