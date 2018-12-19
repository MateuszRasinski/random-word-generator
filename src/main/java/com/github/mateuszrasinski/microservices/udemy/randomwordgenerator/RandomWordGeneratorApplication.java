package com.github.mateuszrasinski.microservices.udemy.randomwordgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RandomWordGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(RandomWordGeneratorApplication.class, args);
    }

}

