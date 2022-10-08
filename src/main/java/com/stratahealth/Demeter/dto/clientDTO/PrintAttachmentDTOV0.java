package com.stratahealth.Demeter.dto.clientDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "printAttachment")
public class PrintAttachmentDTOV0 {

    @Id
    private Long id;
    private UUID uuid;
    private Date creationDate;
    private String fileName;
    private String fileType;
    private PrintAttachmentDataDTOV0 printAttachmentData;
    private String additionalContext;
    private Boolean deleted;
    @JsonIgnore
    private String uploadingUserEmail;
    @JsonIgnore private String uploadingUserName;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public PrintAttachmentDataDTOV0 getPrintAttachmentData() {
        return printAttachmentData;
    }

    public void setPrintAttachmentData(PrintAttachmentDataDTOV0 printAttachmentData) {
        this.printAttachmentData = printAttachmentData;
    }

    public String getAdditionalContext() {
        return additionalContext;
    }

    public void setAdditionalContext(String additionalContext) {
        this.additionalContext = additionalContext;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getUploadingUserEmail() {
        return uploadingUserEmail;
    }

    public void setUploadingUserEmail(String uploadingUserEmail) {
        this.uploadingUserEmail = uploadingUserEmail;
    }

    public String getUploadingUserName() {
        return uploadingUserName;
    }

    public void setUploadingUserName(String uploadingUserName) {
        this.uploadingUserName = uploadingUserName;
    }
}
