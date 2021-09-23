package org.cognizant.springbootRestApi.SpringbootRestApi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.cognizant.springbootRestApi.SpringbootRestApi.entities.Course;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService{
	
	List<Course>list;
	
	public CourseServiceImpl() {
		
		list = new ArrayList<>();
		list.add(new Course(101, "Java Core Course","Learn something new with java programming"));
		list.add(new Course(102, "Springboot Course","Learn Springboot Rest Api programming"));
		list.add(new Course(103, "Springboot MVC Course","Learn SpringBoot MVC with controller model view"));
		list.add(new Course(104, "Java8 Course ","Learn something new with java8 programming"));
		
	}
	@Override
	public List<Course> getCourses() {
		return list;
	}
	@Override
	public Course getCourse(long courseId) {
		
		Course id_info = null;
		for(Course course : list) //101,102,103,104 ---> ++
		{
			if(course.getId() == courseId) {
				id_info = course;
				break;
			}
			
		}
		return id_info;
	}
	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}
	@Override
	public Course updateCourse(Course course) {
		list.forEach(e -> {
			if(e.getId() == course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});
		return course;
	}
	@Override
	public Course deleteCourse(long parseLong) {
		list=this.list.stream()
				.filter(e -> e.getId()!=parseLong)
						.collect(Collectors.toList());
		return null;
		
	}

}
