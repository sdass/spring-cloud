package com.subra;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subra.model.UserResponse;

@SpringBootApplication
@EnableFeignClients
public class FeignSpringclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignSpringclientApplication.class, args);
	}

}

@RestController
class Usercontroller{
	
	@Autowired 
	FeignUserClient feignClient;
	
	@GetMapping("/findAllUsers")
	public List<UserResponse> getAllUsers(){
		System.out.println("getAllUsers()...");
		return feignClient.getUsersDetail();
	}
	
	
}
