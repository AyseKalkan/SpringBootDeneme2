package com.example.Deneme2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class Deneme2Application {

	public static void main(String[] args) {
		SpringApplication.run(Deneme2Application.class, args);
	}

}
