package com.example.gtdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GtDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtDemoApplication.class, args);
	}

	@GetMapping("/hi")
	public String greeting(){
		return "Hello world";
	}
}
