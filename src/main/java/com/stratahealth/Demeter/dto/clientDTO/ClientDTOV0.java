package com.stratahealth.Demeter.dto.clientDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "client")
public class ClientDTOV0 {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String gender;
    private String preferredFirstName;
    private String preferredLastName;
    private String prefix;
    private String suffix;
    private Date currentDate;
    private String typeOfAct;
    private String act;
    private String unit;
    private AddressDTOV0 address;
    private Date deceasedDate;
    private Date birthDate;
    private Date creationDate;
    private String religion;
    private String maritalStatus;
    private String nationalIdentifier;
    private PrintAttachmentDTOV0 printAttachmentDTOV0;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPreferredFirstName() {
        return preferredFirstName;
    }

    public void setPreferredFirstName(String preferredFirstName) {
        this.preferredFirstName = preferredFirstName;
    }

    public String getPreferredLastName() {
        return preferredLastName;
    }

    public void setPreferredLastName(String preferredLastName) {
        this.preferredLastName = preferredLastName;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public String getTypeOfAct() {
        return typeOfAct;
    }

    public void setTypeOfAct(String typeOfAct) {
        this.typeOfAct = typeOfAct;
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public AddressDTOV0 getAddress() {
        return address;
    }

    public void setAddress(AddressDTOV0 address) {
        this.address = address;
    }

    public Date getDeceasedDate() {
        return deceasedDate;
    }

    public void setDeceasedDate(Date deceasedDate) {
        this.deceasedDate = deceasedDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getNationalIdentifier() {
        return nationalIdentifier;
    }

    public void setNationalIdentifier(String nationalIdentifier) {
        this.nationalIdentifier = nationalIdentifier;
    }

    public PrintAttachmentDTOV0 getPrintAttachmentDTOV0() {
        return printAttachmentDTOV0;
    }

    public void setPrintAttachmentDTOV0(PrintAttachmentDTOV0 printAttachmentDTOV0) {
        this.printAttachmentDTOV0 = printAttachmentDTOV0;
    }
}