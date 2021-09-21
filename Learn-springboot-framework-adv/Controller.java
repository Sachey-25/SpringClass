package com.congnizant.Learnspringbootframeworkadv.sample.enterprise.flow;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
//Business Logic
@Component
class BusinessService {
	
	@Autowired
	private DataService dataService; 
	
	public long calculateSum() {
		//return dataservice.retriveData();
		List<Integer> data = dataService.retriveData();
		return data.stream().reduce(Integer :: sum).get();
	}
}
//Getting Data
@Component
class DataService {
	public List<Integer> retriveData(){
		return Arrays.asList(12,24,36,48,60,72);
	}
}







