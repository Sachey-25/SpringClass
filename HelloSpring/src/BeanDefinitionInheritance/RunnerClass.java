package BeanDefinitionInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunnerClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Class_One instance_one = (Class_One) context.getBean("helloWorld");
		instance_one.getMessage_one();
		instance_one.getMessage_two();
		
		CLass_Two instance_two = (CLass_Two) context.getBean("Spring");
		instance_two.getMessage_one();
		instance_two.getMessage_two();
		instance_two.getMessage_three();


	}

}
