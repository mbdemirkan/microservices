package com.bilal.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public abstract class MicroservicesSidecar {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesSidecar.class, args);
	}
}
