package com.subra.cloudcentralconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudCentralConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudCentralConfigserverApplication.class, args);
	}

}
