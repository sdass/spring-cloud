package com.subra.hystrixcircuitbreaker;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class StudentServiceDelegate {

	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="callStudentServiceAndGetData_Fallback")
	public String callStudentServiceAndGetData(String schoolname) {
		System.out.println("Getting School details for " + schoolname);
		String url = "http://localhost:8080/getStudentDetailsForSchool/{schoolname}"; //AAschool 
		String response = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
		}, schoolname).getBody();
		System.out.println("Response Received as " + response + " -  " + LocalDateTime.now());
		return "NORMAL FLOW !!! - School Name -  " + schoolname + " :::  " +
        " Student Details " + response + " -  " + LocalDateTime.now();

	}
	
	// @SuppressWarnings("unused")
    private String callStudentServiceAndGetData_Fallback(String schoolname) {
 
        System.out.println("Student Service is down!!! fallback route enabled...");
 
        return "CIRCUIT BREAKER ENABLED!!! No Response From Student Service at this moment. " +
                    " Service will be back shortly - " + LocalDateTime.now();
    }
	 


}
