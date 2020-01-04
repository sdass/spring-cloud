package com.subra;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.subra.model.UserResponse;

//https://jsonplaceholder.typicode.com/users
@FeignClient(url = "https://jsonplaceholder.typicode.com", name="USR-CLIENT")
public interface FeignUserClient {

	@GetMapping("/users")
	List<UserResponse> getUsersDetail();
		

	//for other endpoints add more method signation with mapping below
	
}
