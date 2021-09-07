package com.SpringBootApplication.SpringBootProject;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages="com.SpringBootApplication.SpringBootProject")
@Controller
public class helloworldcontroller {
	
	@RequestMapping("/hello")
	@Bean
	public String hello() {
		return "Hello SpringBoot";
	}
	@RequestMapping("/check")
	public String check() {
		return "This is jus an example";
	}
}
