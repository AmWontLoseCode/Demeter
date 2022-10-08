package com.stratahealth.Demeter.dto.clientDTO;


import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Document(collection = "country")
public class CountryDTOV0 {
    @Id
    private String id;
    private String name;
    @JsonIgnore private Set<String> provinceNames;
    @JsonIgnore private Set<ProvinceDTOV0> provinces;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getProvinceNames() {
        return provinceNames;
    }

    public void setProvinceNames(Set<String> provinceNames) {
        this.provinceNames = provinceNames;
    }

    public Set<ProvinceDTOV0> getProvinces() {
        return provinces;
    }

    public void setProvinces(Set<ProvinceDTOV0> provinces) {
        this.provinces = provinces;
    }
}
