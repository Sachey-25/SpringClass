package com.cognizant.springbootsurveyProject.Springboot.Survey;

import java.util.List;

import com.cognizant.springbootsurveyProject.Springboot.Questions.Question;

public class Survey {
	
	private String id;
	private String title;
	private String description;
	private List<Question> questions;
	public Survey(String id, String title, String description, List<Question> question) {
		super();
		this.id=id;
		this.title=title;
		this.description=description;
		this.questions=question;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;	
	}
	@Override
	public String toString() {
		return "Survey [id=" + id + ", title=" + title + ", description=" + description + ", questions=" + questions
				+ "]";
	}
	
}


