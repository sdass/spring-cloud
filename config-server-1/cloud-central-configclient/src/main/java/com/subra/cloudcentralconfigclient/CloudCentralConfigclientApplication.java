package com.subra.cloudcentralconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CloudCentralConfigclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudCentralConfigclientApplication.class, args);
	}

}

@RestController
@RefreshScope
class MessageController{
	
	@Value("${message: default-hello1}")
	private String message;
	
	  @RequestMapping("/message")
	  String getMessage() {
	    return this.message;
	  }
	
}
