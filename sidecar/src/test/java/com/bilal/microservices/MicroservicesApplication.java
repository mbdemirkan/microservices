package com.bilal.microservices;

import org.springframework.boot.SpringApplication;

public class MicroservicesApplication extends MicroservicesSidecar {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesApplication.class, args);
	}
}
