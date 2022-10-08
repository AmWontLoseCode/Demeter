package com.stratahealth.Demeter.exceptions;

public class ClientNotFoundException extends RuntimeException {

    public ClientNotFoundException(String name) {
        super("Could not find client " + name);
    }
}