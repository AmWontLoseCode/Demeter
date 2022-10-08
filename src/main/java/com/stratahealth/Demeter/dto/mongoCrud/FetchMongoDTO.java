package com.stratahealth.Demeter.dto.mongoCrud;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class FetchMongoDTO {

    private final String collection;
    private final JsonNode query;

    @JsonCreator
    /**https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsoncreator.htm**/
    public FetchMongoDTO(@JsonProperty("collection") String collection,
                         @JsonProperty("query") JsonNode query) {
        this.collection = collection;
        this.query = query;
    }

    public String getCollection() {
        return collection;
    }

    public JsonNode getQuery() {
        return query;
    }
}
