package com.example.eureka.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MessageServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(MessageServiceApp.class, args);
    }
}


