package com.cognizantSpringTutorials;
public class HelloWorld {
	//Encapsulation
	private String message;
	
	public void setMessage(String message) {
		this.message=message;
		}
	public void getMessage() {
		System.out.println("Spring says :" + message);	}

}
