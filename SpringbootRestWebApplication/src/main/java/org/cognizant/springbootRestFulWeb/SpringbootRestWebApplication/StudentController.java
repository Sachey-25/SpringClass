package org.cognizant.springbootRestFulWeb.SpringbootRestWebApplication;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Sachin","Techmasters");
	}
	
	@GetMapping("/Students")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student("Rahul","Dravid"));
		students.add(new Student("Sourav","Ganguly"));
		students.add(new Student("Yuvraj","Singh"));
		students.add(new Student("Virendra","Sehwag"));
		students.add(new Student("VVS","Laxman"));
		return students;
	}
	//http://localhost:8080/student
	@GetMapping("/students/{firstname}/{lastname}")  //<----- URI template variable
	public Student studentPathVariable(@PathVariable("firstname") String firstname,
			@PathVariable("lastname") String lastname) {
		return new Student (firstname, lastname);
	}
	
	
	
	
	
	
	
	
	
	

}
