package com.subra.ribboneurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RibbonEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonEurekaServerApplication.class, args);
	}

}
