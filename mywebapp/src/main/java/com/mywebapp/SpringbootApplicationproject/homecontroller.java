package com.mywebapp.SpringbootApplicationproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class homecontroller {
	
	@RequestMapping("home")
	public String home() {
		System.out.println("hi"); //Accepting request
		return "home.jsp";
	}

}
