package com.cognizant.webapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
	
	@RequestMapping("/home")
	@ResponseBody
	public String hello(HttpServletRequest req) {
		HttpSession session = req.getSession();
		String name= req.getParameter("name");
		System.out.println("HI," + name);
		session.setAttribute("name", name);
		return "name";
		
	}
}
