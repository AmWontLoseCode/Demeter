package com.stratahealth.Demeter.controller;

import com.mongodb.client.result.InsertOneResult;
import com.stratahealth.Demeter.dto.mongoCrud.FetchMongoDTO;
import com.stratahealth.Demeter.dto.mongoCrud.InsertMongoDTO;
import com.stratahealth.Demeter.services.MongoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Example;
import io.swagger.annotations.ExampleProperty;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MongoController {


    @Autowired
    private MongoService mongoService;


    @ApiOperation(
            value = "Insert new document",
            notes = "Insert a new Document",
            tags = {"Insert"}
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns the inserted response", response = InsertMongoDTO.class),
            @ApiResponse(code = 500, message = "If there is issues with connecting to the database", response = String.class)})

    @PostMapping("/{database}/insert")
    public InsertOneResult insertIntoMongo(@ApiParam(name = "database", value = "database to be used", examples = @Example(value = @ExampleProperty(value = "database test"))) @PathVariable String database,
                                           @RequestBody InsertMongoDTO payloadToMongo) {
        return mongoService.insertIntoCollection(database, payloadToMongo);
    }

    @GetMapping("/{database}/fetch")
    public Document fetchFromMongo(@ApiParam(name = "database", value = "database to be used", examples = @Example(value = @ExampleProperty(value = "database test"))) @PathVariable String database,
                                   @RequestBody FetchMongoDTO fetchMongoDTO) {
        return mongoService.getFromCollection(database, fetchMongoDTO);
    }


}
