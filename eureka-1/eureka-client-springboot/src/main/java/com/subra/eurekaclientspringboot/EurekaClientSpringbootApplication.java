package com.subra.eurekaclientspringboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.netflix.discovery.DiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientSpringbootApplication.class, args);
	}

}
	@RestController
	class ServiceInstanceRestController {
		
		@Autowired
		private DiscoveryClient discoveryClient;
		
		
		//test url on chrome: http://localhost:8080/serviceinstance/eureka-regstd-server
		@RequestMapping("/serviceinstance/{appname}")
		public List<ServiceInstance> serviceInstancesByAppname(@PathVariable String appname){
			System.out.println("In serviceInstancesByAppname() . . .");
			List<ServiceInstance> serviceInstances = this.discoveryClient.getInstances(appname);
			return serviceInstances;
		}
		
		
		@RequestMapping("/hi")
		public String getHI(){
			System.out.println("In getHI() . . .");
			return "Did not I tell you";
		}		
	}
	

