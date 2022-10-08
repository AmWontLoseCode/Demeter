package com.stratahealth.Demeter.dto.mongoCrud;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class InsertMongoDTO {

    private final String collection;
    private final JsonNode data;

    @JsonCreator
    /**https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsoncreator.htm**/
    public InsertMongoDTO(@JsonProperty("collection") String collection,
                          @JsonProperty("data") JsonNode data) {
        this.collection = collection;
        this.data = data;
    }

    public String getCollection() {
        return collection;
    }

    public JsonNode getData() {
        return data;
    }
}
