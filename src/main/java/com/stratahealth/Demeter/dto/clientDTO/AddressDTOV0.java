package com.stratahealth.Demeter.dto.clientDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "address")

public class AddressDTOV0 {

    @Id
    private String id;
    private String cityName;
    private String cellPhone;
    private String postalCode;
    private String streetAddress;
    private String countryName;
    private String provinceName;
    private CountryDTOV0 country;
    private ProvinceDTOV0 province;
    private List<PhoneNumberDTOV0> phoneNumbers;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public CountryDTOV0 getCountry() {
        return country;
    }

    public void setCountry(CountryDTOV0 country) {
        this.country = country;
    }

    public ProvinceDTOV0 getProvince() {
        return province;
    }

    public void setProvince(ProvinceDTOV0 province) {
        this.province = province;
    }

    public List<PhoneNumberDTOV0> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumberDTOV0> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
