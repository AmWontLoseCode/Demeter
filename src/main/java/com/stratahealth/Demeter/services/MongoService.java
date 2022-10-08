package com.stratahealth.Demeter.services;

import com.mongodb.client.result.InsertOneResult;
import com.stratahealth.Demeter.dto.mongoCrud.FetchMongoDTO;
import com.stratahealth.Demeter.dto.mongoCrud.InsertMongoDTO;
import org.bson.Document;


public interface MongoService {
    InsertOneResult insertIntoCollection(String databaseName, InsertMongoDTO payloadToMongo);

    Document getFromCollection(String databaseName, FetchMongoDTO fetchMongoD);
}
