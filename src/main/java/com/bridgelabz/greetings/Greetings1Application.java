package com.bridgelabz.greetings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.bridgelabz.greetings")
public class Greetings1Application {

	public static void main(String[] args) {
		SpringApplication.run(Greetings1Application.class, args);
	}

}
