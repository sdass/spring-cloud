package com.subra.eurekaserverspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerSpringbootApplication.class, args);
	}

}
