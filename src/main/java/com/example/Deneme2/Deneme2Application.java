package com.example.Deneme2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
//import org.springframework.context.annotation.Bean;

//import com.example.Deneme2.dto.UserCreateDTO;
//import com.example.Deneme2.service.UserService;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class Deneme2Application {

	public static void main(String[] args) {
		SpringApplication.run(Deneme2Application.class, args);
	}
/*
	@Bean
	CommandLineRunner createInitialUsers(UserService userService) {
		return (args) -> {
			UserCreateDTO user = new UserCreateDTO();
			user.setUserName("User1");
			user.setFirstName("Mehmet");
			user.setLastName("Pekdemir");
			
			userService.createUser(user);
			
			
			UserCreateDTO user2 = new UserCreateDTO();
			user.setUserName("User2");
			user.setFirstName("Mehmet2");
			user.setLastName("Pekdemir2");
			
			userService.createUser(user2);
			
			
			UserCreateDTO user3 = new UserCreateDTO();
			user.setUserName("User3");
			user.setFirstName("Mehmet3");
			user.setLastName("Pekdemir3");
			
			userService.createUser(user3);
			

			
			
		};*/
	}

