package org.BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunnableClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloBean beanObject = (HelloBean) context.getBean("helloWorld");
		
		// I wanted to create a prototype --> Spring new bean each time
		beanObject.setText("I am object of bean");
		beanObject.getText();
		
		//Another bean is going to create
		HelloBean beanObj = (HelloBean) context.getBean("helloWorld");
		beanObj.getText();
		((AbstractApplicationContext) context).registerShutdownHook();
	}
}
