package com.subra.ribbonclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyClienSideController {

	@LoadBalanced
	@Bean
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/client/frontend/{id}")
	public String hi(@PathVariable String id) {
		System.out.println(" receivedId=" + id);
		String randomString = this.restTemplate.getForObject("http://server5/backend", String.class);
		System.out.println(" randomString=" + randomString);
		return randomString;
	}
}
