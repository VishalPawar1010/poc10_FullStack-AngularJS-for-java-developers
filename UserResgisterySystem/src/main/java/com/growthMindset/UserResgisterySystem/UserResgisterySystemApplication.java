package com.growthMindset.UserResgisterySystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UserResgisterySystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserResgisterySystemApplication.class, args);
	}


}
