package com.congnizant.Learnspringbootframeworkadv.sample.enterprise.flow.web.business;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.congnizant.Learnspringbootframeworkadv.sample.enterprise.flow.web.business.DataService;

//Business Logic
@Component
public class BusinessService {
	
	@Autowired
	private DataService dataService; 
	
	public long calculateSum() {
		//return dataservice.retriveData();
		List<Integer> data = dataService.retriveData();
		return data.stream().reduce(Integer :: sum).get();
	}
}
