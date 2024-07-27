package com.Splitwise.SplitwiseApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class SplitwiseAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SplitwiseAppApplication.class, args);
	}

}
