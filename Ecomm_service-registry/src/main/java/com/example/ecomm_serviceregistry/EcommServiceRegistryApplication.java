package com.example.ecomm_serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EcommServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommServiceRegistryApplication.class, args);
    }

}
