package org.cognizant.springbootRestFulWeb.SpringbootRestWebApplication;

public class Student {
	private String FirstName;
	private String Lastname;
	
	public Student(String firstName, String lastname) {
		super();
		FirstName = firstName;
		Lastname = lastname;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
}
