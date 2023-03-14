package com.example.eureka.image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
public class ImageServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ImageServiceApp.class, args);
    }
}
