package com.crossfit.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CrossfitDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrossfitDiscoveryApplication.class, args);
	}

}
