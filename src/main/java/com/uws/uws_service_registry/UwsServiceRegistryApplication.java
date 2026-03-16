package com.uws.uws_service_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UwsServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(UwsServiceRegistryApplication.class, args);
	}

}
