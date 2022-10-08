package com.stratahealth.Demeter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DemeterApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(DemeterApplication.class, args);
    }
}
