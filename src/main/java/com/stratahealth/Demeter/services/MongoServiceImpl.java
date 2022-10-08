package com.stratahealth.Demeter.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.MapType;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.InsertOneResult;
import com.stratahealth.Demeter.dto.mongoCrud.FetchMongoDTO;
import com.stratahealth.Demeter.dto.mongoCrud.InsertMongoDTO;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;
import java.util.logging.Logger;

import static com.mongodb.client.model.Filters.eq;

@Service
public class MongoServiceImpl implements MongoService {

    private final Logger logger = Logger.getLogger(MongoServiceImpl.class.getName());

    private final MongoClient mongoClient;
    private final ObjectMapper mapper;

    @Value("${spring.data.mongodb.database}")
    private String databaseName;

    @Autowired
    public MongoServiceImpl(MongoClient mongoClient, ObjectMapper mapper) {
        this.mongoClient = mongoClient;
        this.mapper = mapper;
    }

    public InsertOneResult insertIntoCollection(String databaseName, InsertMongoDTO payloadToMongo) {
        MongoDatabase database = mongoClient.getDatabase(databaseName);
        try {
            final Document parse = Document.parse(removeNulls(payloadToMongo.getData()));

            final MongoCollection<org.bson.Document> referral = database.getCollection(payloadToMongo.getCollection());

            return referral.insertOne(parse);
        } catch (JsonProcessingException e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);
        }
    }

    @Override
    public Document getFromCollection(String databaseName, FetchMongoDTO fetchMongoDB) {
        MongoDatabase database = mongoClient.getDatabase(databaseName);
        try {
            final Document query = Document.parse(removeNulls(fetchMongoDB.getQuery()));
            final MongoCollection<org.bson.Document> collection = database.getCollection(fetchMongoDB.getCollection());
            //BasicDBObject whereQuery = new BasicDBObject();
            //whereQuery.put("firstName", "amadou");
            //BasicDBObject allQuery = new BasicDBObject();
            Document doc = collection.find().first();
            Document myDoc = collection.find(eq("firstName", "amadouv")).first();
            myDoc = collection.find(query).first();
            return myDoc;
        } catch (JsonProcessingException e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);
        }
    }

    private String removeNulls(JsonNode node) throws JsonProcessingException {
        final ObjectMapper mapper = new ObjectMapper();
        ArrayType arrayType = mapper.getTypeFactory().constructArrayType(Object[].class);
        MapType mapType = mapper.getTypeFactory().constructMapType(Map.class, String.class, Object.class);
        Object mapValue;
        if (node.isArray()) {
            mapValue = mapper.convertValue(node, arrayType);
        } else {
            mapValue = mapper.convertValue(node, mapType);
        }
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(mapValue);
    }


}