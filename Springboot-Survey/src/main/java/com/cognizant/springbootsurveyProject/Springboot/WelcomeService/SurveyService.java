package com.cognizant.springbootsurveyProject.Springboot.WelcomeService;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.cognizant.springbootsurveyProject.Springboot.Questions.Question;
import com.cognizant.springbootsurveyProject.Springboot.Survey.Survey;

@Component
public class SurveyService {
	
	private static List<Survey> surveys = new ArrayList();
	static {
		Question question1 = new Question("Question 1",
				"Largest Country in the world","Russia", Arrays.asList(
						"India","Russia","USA","Paris"));
		
		Question question2 = new Question("Question 2",
				"Highest GDP in the World","China", Arrays.asList(
						"India","Russia","USA","Paris"));
		
		Question question3 = new Question("Question 3",
				"Second Largest english speaking country","India", Arrays.asList(
						"India","Russia","USA","Paris"));
		
		Question question4 = new Question("Question 4",
				"MOst Popu;at Country in the World","USA", Arrays.asList(
						"India","Russia","USA","Paris"));
		
		List<Question> questions = new ArrayList<>(Arrays.asList(question1, question2, question3,question4));
		
		Survey survey = new Survey("Survey1", "My fevorite Survey","Decription of the Survey",questions);
		
		surveys.add(survey);			
	}
	
	public List<Survey> retrieveAllSurveys() {
		return surveys;
	}
	//Checking for available survey in the business logic, if not found returning to null;
	public Survey retrieveSurvey(String surveyId) {
		for (Survey survey : surveys ) {
			if(survey.getId().equals(surveyId)) {
				return survey;
			}
		}
		return null;
	}
	//Checking and mapping the survey id with qustion id so that both are inter linked.
	public Question retriveQuestion(String surveyId, String questionId) {
		Survey survey = retrieveSurvey(surveyId);
		if(survey == null) {
			return null;
		}
		for (Question question : survey.getQuestions()) {
			if(question.getId().equals(questionId)) {
				return question;
			}
		}
		return null;
	}
	
	private SecureRandom random = new SecureRandom();
	
	public Question addQuestion(String surveyId, Question question) {
		Survey survey = retrieveSurvey(surveyId);
		if(survey == null) {
			return null;
		}
		String randomId = new BigInteger(130, random).toString(32);
		question.setId(randomId);
		
		survey.getQuestions().add(question);
		return question;
	}
	
	
}
