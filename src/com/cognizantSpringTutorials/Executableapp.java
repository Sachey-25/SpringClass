package com.cognizantSpringTutorials;
//Spring Framework --> Build or imported into this JavaClass.
//Download some Spring Jar files...

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executableapp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext
				("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("HelloWorld");
		obj.getMessage();

	}

}
