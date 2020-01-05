package com.subra.eurekaconsumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumeController {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	DiscoveryClient discoveryClient;
	
	@RequestMapping("/index")
	public String index(){
		System.out.println("in index()");
		return "at index..";
	}
	@RequestMapping("/consume")
	public String consume(){
		//String url = "http://localhost:8080/hi";
		String other_service_name = "eureka-regstd-server";
		List<ServiceInstance>  services = discoveryClient.getInstances(other_service_name);
		ServiceInstance service = services.get(0); //we know only one is running
		String url = "http://" + service.getHost()+":" + service.getPort() + "/" + "hi";
		System.out.println("invoking GET on url=" + url);
		
		String retStr = restTemplate.getForObject(url, String.class );
		System.out.println("in consume ()" + retStr);
		return retStr + " consumed";
	}	
	
}
