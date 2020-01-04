package com.subra.zuulapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

//step 2(2) Next, we make this application a reverse proxy so that it can forward the requests to other microservices.
@SpringBootApplication
@EnableEurekaClient //diference?
//@EnableDiscoveryClient
@EnableZuulProxy
public class ZuulApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApigatewayApplication.class, args);
	}

	@Bean
	public SimpleFilter simpleFilter(){
		return new SimpleFilter(); 
	}
}
