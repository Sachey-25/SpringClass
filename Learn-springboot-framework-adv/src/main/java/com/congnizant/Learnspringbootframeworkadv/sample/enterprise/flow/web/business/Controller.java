package com.congnizant.Learnspringbootframeworkadv.sample.enterprise.flow.web.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.congnizant.Learnspringbootframeworkadv.sample.enterprise.flow.web.business.BusinessService;

//Sending response in the right format
@RestController
public class Controller {	
	@Autowired
	private BusinessService businessservice;
	
	@GetMapping("/sum")
	public long displaySum() {
		return businessservice.calculateSum();
	}	
}







