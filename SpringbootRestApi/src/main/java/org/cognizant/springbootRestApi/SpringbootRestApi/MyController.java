package org.cognizant.springbootRestApi.SpringbootRestApi;

import java.util.List;

import org.cognizant.springbootRestApi.SpringbootRestApi.entities.Course;
import org.cognizant.springbootRestApi.SpringbootRestApi.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Autowired
	private CourseService courseService;

	//http://localhost:8080/home
	@GetMapping("/home")
	public String home() {
		return " This is Home Page";
	}
	//get the courses
	//http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.courseService.getCourses();
	}
	
	//to get the course ID
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) 
	{
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	
	//to add new courses to the list
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) //request from the user side <-- requestbody
	{
		return this.courseService.addCourse(course);
	}
	
	//update using the put request
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.updateCourse(course);
	}
	//delete the course
	
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String CourseId){
		try {
			this.courseService.deleteCourse(Long.parseLong(CourseId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	
	
}
