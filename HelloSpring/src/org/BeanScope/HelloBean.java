package org.BeanScope;

public class HelloBean {
	private String message;
	
	public void setText(String message) {
		this.message = message;
	}
	public void getText() {
		System.out.println("Text entered is : " + message);
	}
	//We are going to initialize method for bean
	public void init() {
		System.out.println("Bean is going through init");
	}
	// We are going to destroy the bean
	// In order to power destroy method - registerShutdownHook()
	public void destroy() {
		System.out.println("Bean will desroy now");
	}
}
