package org.cognizant.springbootRestFulWeb.SpringbootRestWebApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorlController {
	
	//localhost:8080/studentinfo
	@GetMapping("/studentinfo")
	public String helloworld() {
		return "Hello World";
	}
}
