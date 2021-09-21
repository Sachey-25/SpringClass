package com.cognizant.springbootsurveyProject.Springboot.WelcomeService;

import org.springframework.stereotype.Component;

@Component
public class WelcomeSerivce {
	
	public String retrieveWelcomeMessage() {
		
		return "Good AfterNoon, I am Welcome Service" ;
	}

}
