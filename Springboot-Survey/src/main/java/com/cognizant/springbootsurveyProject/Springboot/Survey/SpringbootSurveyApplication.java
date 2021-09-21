package com.cognizant.springbootsurveyProject.Springboot.Survey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootSurveyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSurveyApplication.class, args);
		System.out.println("I am receiving an input");
	}

}
