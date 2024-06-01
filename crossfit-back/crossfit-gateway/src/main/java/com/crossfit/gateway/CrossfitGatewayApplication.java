package com.crossfit.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CrossfitGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrossfitGatewayApplication.class, args);
    }

}
