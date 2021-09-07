package com.SpringBootApplication.SpringBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@EnableAutoConfiguration , @ComponentScan and @Configuration
@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
		System.out.println("Hello World! Welcome to springboot");
		System.out.println("I havemade few change to my spring" + 
				"with few annotations as well");
	}

}
