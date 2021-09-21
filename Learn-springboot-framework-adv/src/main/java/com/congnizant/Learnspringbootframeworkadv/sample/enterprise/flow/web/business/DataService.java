package com.congnizant.Learnspringbootframeworkadv.sample.enterprise.flow.web.business;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DataService {
	public List<Integer> retriveData(){
		return Arrays.asList(12,24,36,48,60,72);
	}
}
