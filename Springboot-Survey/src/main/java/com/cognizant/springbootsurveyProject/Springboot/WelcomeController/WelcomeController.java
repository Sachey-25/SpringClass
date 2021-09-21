package com.cognizant.springbootsurveyProject.Springboot.WelcomeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springbootsurveyProject.Springboot.WelcomeService.WelcomeSerivce;

/* Controller should be RestController and it should be dependency injected*/

@RestController
public class WelcomeController {
	
	@Autowired
	private WelcomeSerivce service;	
	
	@RequestMapping("/welcome")
	public String welcome() {
		return service.retrieveWelcomeMessage();
		//return "Hello, Welcome";	
	}
}
