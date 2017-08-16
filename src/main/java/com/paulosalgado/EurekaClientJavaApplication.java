package com.paulosalgado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@SpringBootApplication
public class EurekaClientJavaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientJavaApplication.class, args);
	}
	
	@RequestMapping("/greeting")
	public String greeting() {
		return "Hello from EurekaClient!";
	}
	
}
