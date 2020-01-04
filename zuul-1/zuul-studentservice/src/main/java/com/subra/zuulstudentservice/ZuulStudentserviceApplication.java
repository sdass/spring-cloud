package com.subra.zuulstudentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
public class ZuulStudentserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulStudentserviceApplication.class, args);
	}

}

@RestController
class StudentController{
	@RequestMapping("/hi")
	public String sendData(){
		System.out.println("sendData(). . . . hits");
		return "A student Hello!";
	}
}
